package com.efun.sevsecury.core;

import com.efun.po.TDepartmentGame;
import com.efun.po.TEfunuser;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * 登陆账号的信息
 * 
 * @author 甘谊勇
 *
 */
public class UserContainer {

	public static String USER_KEY = "usersessionkey";

	public static String USER_ID_KEY = "useridsessionkey";

	public static String USER_NAME_KEY = "usernamesessionkey";

	public static String USER_DEPART_KEY = "userdepartkey";

	public static String USER_DEPART_OBJECT = "userdepart";

	public static String USER_ROLE_KEY = "roidkey";

	public static String USER_ROLE_NAME = "role__";

	public static Map<String, HttpSession> USER_HASHMAP = new HashMap<String, HttpSession>();

	public static boolean addUserSession(String userid, HttpSession currsession) {
		return true;
	}

	public static boolean updateSessionUser(String userid, Object newobj) {
		return true;
	}

	public static HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}

	public static Object getCurrLoginUser() {
		try {
			return getRequest().getSession().getAttribute(USER_NAME_KEY);
		} catch (Exception e) {
			return null;
		}
	}

	public static Integer getCurrLoginUserId() {
		return Integer.valueOf(getUserInfoFromSession(USER_ID_KEY).toString());
	}

	public static Object getUserInfoFromSession(String key) {
		return getRequest().getSession().getAttribute(key);
	}

	public static TEfunuser getCurrUserEntity() {
		return (TEfunuser) getRequest().getSession().getAttribute(USER_KEY);
	}

	public static String getCurrUserInfo(String userid) {
		return String.valueOf(getRequest().getSession().getAttribute(userid));
	}

	public static String getArea(TEfunuser user, TDepartmentGame[] departArrays) {
		if (user.getDeptid() == 1L) {
			String area = "";
			for (TDepartmentGame depart : departArrays) {
				if (depart != null) {
					area += "," + depart.getDataSource();
				}
			}
			return "".equals(area) ? "" : area.substring(1);
		} else {
			return "all";
		}
	}
	
}
