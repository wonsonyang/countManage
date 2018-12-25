package com.efun.sevsecury.core;

import com.efun.po.TDepartmentGame;
import com.efun.po.TEfunuser;
import com.efun.po.TGames;
import com.efun.po.TUserAuthority;
import com.efun.tools.CacheUtil;
import com.efun.tools.StringUtil;
import com.efun.util.dao.BaseDao;
import com.efun.util.dao.SpringContextUtil;
import com.efun.util.du.AreaUtil;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.efun.sevsecury.core.UserContainer.getCurrUserEntity;

public class UserAuthority {

    public static final String AUTH_ADV = "adv";
    public static final String AUTH_GAME = "game";
    public static final String AUTH_DEPART = "depart";

    private static BaseDao managerBaseDao = (BaseDao) SpringContextUtil.getBean("managerBaseDao");
    private static BaseDao gatherBaseDao = (BaseDao) SpringContextUtil.getBean("gatherBaseDao");

    public static String getUserAdvAuthority(Long userid) {
        return getUserAuthority(userid, AUTH_ADV);
    }

    public static String getUserGameAuthority(Long userid) {
        return getUserAuthority(userid, AUTH_GAME);
    }

    public static String getUserDepartAuthority(Long userid) {
        return getUserAuthority(userid, AUTH_DEPART);
    }

    public static String getCurrentLoginUserAuthority(String authType) {
        TEfunuser user = getCurrUserEntity();
        if ((AUTH_GAME.equals(authType) && user.getGameLimit().equals("0"))
                || (AUTH_ADV.equals(authType) && user.getAdvLimit().equals("0"))
                || (AUTH_DEPART.equals(authType) && user.getDeptid() == 0L)) {
            return "ALL";
        }
        return getUserAuthority(user.getUserid(), authType);
    }

    /**
     * 获取用户的权限（包括：type: [adv=广告]，[game=游戏]，[depart=部门]）
     *
     * @param userid
     * @return
     */
    private static String getUserAuthority(Long userid, String type) {
        String sql = "From TUserAuthority t where t.deleted = 0 and t.flag = '" + type + "' and t.userid = " + userid;
        List<TUserAuthority> lists = managerBaseDao.getByHql(sql);

        String str = "";
        for (TUserAuthority authority : lists) {
            if (AUTH_GAME.equals(type)) {
                str += ",'" + authority.getGameCode() + "'";
            } else if (AUTH_ADV.equals(type)) {
                str += ",'" + authority.getAdvertiser() + "'";
            } else {
                str += ",'" + authority.getDepartId() + "'";
            }
        }

        return "".equals(str) ? str : str.substring(1);
    }

    /**
     * 获取韩国联运的游戏权限
     *
     * @param userid
     * @return
     */
    public static List<TUserAuthority> getChaselGame(Long userid) {
        String sql = "From TUserAuthority t where t.deleted = 0 and t.departId = 1 and t.flag = '" + AUTH_GAME + "' and t.userid = " + userid;
        return managerBaseDao.getByHql(sql);
    }

    @SuppressWarnings("unchecked")
    public static List<TGames> getAllAreaGame() {
        List<TGames> gameList = (List<TGames>) CacheUtil.getCacheByKey(Constants.GAME_KEY_PREFIX, List.class);
        if (gameList == null) {
            gameList = getGameFormDB();
        }
        return gameList;
    }

    public static Map<String, TGames> getGameMaps() {
        List<TGames> lists = getAllAreaGame();
        Map<String, TGames> maps = new HashMap<String, TGames>();
        for (TGames game : lists) {
            maps.put(game.getGameCode(), game);
        }
        return maps;
    }

    public static Map<String, TGames> getGameMaps(String area) {
        List<TGames> lists = getGameAllByArea(area);
        Map<String, TGames> maps = new HashMap<String, TGames>();
        for (TGames game : lists) {
            maps.put(game.getGameCode(), game);
        }
        return maps;
    }

    /**
     * 根据部门或者
     *
     * @param area
     */
    public static List<TGames> getCurrentUserGameAuthority(String area) {
        HttpServletRequest request = UserContainer.getRequest();
        String type = request.getParameter("gameType");
        TEfunuser user = (TEfunuser) getCurrUserEntity();

        List<TGames> lists = null;
        if ("admin".equals(user.getUsername()) || "0".equals(user.getGameLimit())) {
            lists = getGameAllByArea(area);// 获取所有游戏
            lists = gameLimit(lists, type);
        } else {
            lists = getGameByUser(user.getUserid(), area); // 获取个人用户的游戏权限
        }

        return lists;
    }

    /**
     * 根据地区获取游戏列表
     *
     * @return
     */
    public static List<TGames> getGameAllByArea(String area) {
        List<?> gameList = getGameFormDB();

        CacheUtil.deleteCache(Constants.GAME_KEY_PREFIX, List.class);
        CacheUtil.addCache(Constants.GAME_KEY_PREFIX, gameList, List.class, 60 * 60 * 24 * 5);

        List<TGames> currAreaGames = new ArrayList<TGames>();
        String depart = areaToDepartment(area);

        for (Object obj : gameList) {
            TGames game = (TGames) obj;

            if (depart.contains(game.getDepartment() + ",")) {
                currAreaGames.add(game);
            }
        }

        return currAreaGames;
    }

    /**
     * 根据指定的游戏范围，限制游戏范围（比如是否在线，是否是游戏）
     *
     * @param gameList
     * @param type     (nolimit_nolimit,online_nolimit,nolimit_isgame,online_isgame)
     * @return
     */
    private static List<TGames> gameLimit(List<TGames> gameList, String type) {
        List<TGames> newList = new ArrayList<TGames>();

        if (StringUtil.isEmpty(type) || !type.contains("_") || "_".equals(type)) {
            type = "nolimit_nolimit";
        }
        type = type.toLowerCase();
        for (TGames game : gameList) {
            String isGame = game.getIsGame();
            String isOnline = game.getIsOnline();

            String[] typeArr = type.split("_");
            String strIsOnline = typeArr[0];
            String strIsGame = typeArr[1];

            boolean flag = true;
            if (strIsOnline.equals("nounline") && "已下架".equals(isOnline)) {
                flag = false;
            } else if (strIsOnline.equals("online") && !"是".equals(isOnline)) {
                flag = false;
            }
            if (flag) {
                if (strIsGame.equals("isgame") && !"是".equals(isGame)) {
                    flag = false;
                }
                if (flag) {
                    newList.add(game);
                }
            }
        }

        return newList;
    }

    /**
     * 获取用户的游戏权限
     *
     * @param userid
     * @return
     */
    public static List<TGames> getGameByUser(Long userid, String area) {
        String key = Constants.GAME_KEY_PREFIX + userid;
        CacheManagerTools<String> cacheManagerTools = new CacheManagerTools<String>();

        List<TGames> gameList = getGameAllByArea(area);// 获取所有游戏

        // 不限制游戏,则返回所有游戏
        if ("0".equals(getCurrUserEntity().getGameLimit())) {
            return gameList;
        }
        String userGameAuthority = null;
        if (userGameAuthority == null) {
            userGameAuthority = getUserGameAuthority(userid);
            cacheManagerTools.addStringToCache(key, userGameAuthority);
        }
        List<TGames> newList = new ArrayList<TGames>();
        for (TGames game : gameList) {
            if (userGameAuthority.contains("'" + game.getGameCode() + "'")) {
                newList.add(game);
            }
        }

        return newList;
    }

    /**
     * 获取用户的部门
     *
     * @param userid
     * @return
     */
    public static TDepartmentGame[] getCurrentUserDepart(Long userid, Long departLimit) {
        TDepartmentGame[] departArray = getDepartArray();

        if (departLimit == 1L) {
            String depart = getUserDepartAuthority(userid);
            TDepartmentGame[] userDepartment = new TDepartmentGame[depart.split(",").length];

            int k = 0;
            for (TDepartmentGame departGame : departArray) {
                String departid = departGame.getTdid().toString();
                if (depart != null && depart.contains("'" + departid + "'")) {
                    userDepartment[k++] = departGame;
                }
            }
            return userDepartment;
        } else {
            return departArray;
        }
    }

    public static String getGameSQL(String area, String alias) {
        String key = Constants.GAME_SQL_KEY_PREFIX + UserContainer.getCurrLoginUserId();
        String sql = CacheUtil.getCacheByKey(key);

        if (StringUtil.isEmpty(sql)) {
            sql = "";

            if (StringUtil.isNotEmpty(alias)) {
                alias += ".";
            } else {
                alias = "";
            }

            List<TGames> temp = getCurrentUserGameAuthority(area);
            if (temp != null && temp.size() > 0) {
                sql += " and " + alias + "gameCode in (";
                for (TGames game : temp) {
                    sql += "'" + game.getGameCode() + "',";
                }
                if (sql.endsWith(",")) {
                    sql = sql.substring(0, sql.length() - 1) + ")";
                }
            }

            CacheUtil.addCache(key, sql, 30);
        }

        return sql;
    }

    public static TDepartmentGame[] getDepartArray() {
        List<TDepartmentGame> departList = managerBaseDao
                .getByHql("From TDepartmentGame g where g.flag = '是' and dataSource is not null order by id");
        return departList.toArray(new TDepartmentGame[0]);
    }

    private static String areaToDepartment(String area) {
        area = AreaUtil.getBaseArea(area, true);

        String depart = "";
        for (TDepartmentGame entity : getDepartArray()) {
            String deptCode = "";
            if (StringUtils.isNotEmpty(entity.getDepartCode())) {
                deptCode = AreaUtil.getBaseArea(entity.getDepartCode(), true);
            }
            String dataSource = "";
            if (StringUtils.isNotEmpty(entity.getDataSource())) {
                dataSource = AreaUtil.getBaseArea(entity.getDataSource(), true);
            }
            if (area.equals(deptCode) || area.equals(dataSource) || ("taiwan".equals(deptCode) && area.contains("taiwan"))) {
                depart += entity.getTdid() + ",";
            }
        }
        return depart;
    }

    private static List<TGames> getGameFormDB() {
        return gatherBaseDao.getByHql("From TGames g where g.flag='是' and g.gameLogo='是' ");
    }

}
