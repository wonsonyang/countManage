package com.efun.custom;

import com.alibaba.fastjson.JSONObject;
import com.efun.po.TGamePointTransaction;
import com.efun.rpc.service.support.PayRpcService;
import com.efun.sevsecury.action.ToolAction;
import com.efun.sevsecury.core.UserAuthority;
import com.efun.sevsecury.core.UserContainer;
import com.efun.tools.*;
import com.efun.util.service.UniversallyService;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.sql.Timestamp;

/**
 * 点数交易的操作
 * 
 * 项目名称：manager <br>
 * 类名称：PointAction <br>
 * 类描述： <br>
 * 创建人：lengchengzhen <br>
 * 创建时间：2015-3-4 下午06:34:00 <br>
 * 修改人：lengchengzhen <br>
 * 修改时间：2015-3-4 下午06:34:00 <br>
 * 修改备注： <br>
 * 
 * @version
 *
 */
public class PointAction extends ToolAction<TGamePointTransaction> {

	private static final long serialVersionUID = 8552155652155228522L;

	private static final Logger logger = Logger.getLogger(PointAction.class);

	private static final String POINT_KEY = "135d0d1b-fb27-4476-8570-43bb64c279fb";

	/**
	 * 动态数据操作(該类操作主库)
	 */
	private UniversallyService dynamicUniverService;
	
	@Resource
    private PayRpcService payRpcService;

	/**
	 * 页面内容显示
	 */
	public String list() {
		return "list";
	}

	/**
	 * 获取查询使用的hql语句
	 * 
	 * @return
	 */
	public String getWhereSql() {
		// 交易时间
		String startTime = request.getParameter("sstartTime");
		String endTime = request.getParameter("sendTime");
		// 撤销时间
		String bstartTime = request.getParameter("bsstartTime");
		String bendTime = request.getParameter("bsendTime");
		String uid = request.getParameter("search_uid");
		// 交易ID(操作的交易ID,撤銷的交易ID)
		String transactionId = request.getParameter("stransactionId");
		String isSuccess = request.getParameter("sisSuccess");
		String isBackout = request.getParameter("sisBackout");
		// 交易类型
		String transactionType = request.getParameter("stransactionType");
		// 交易来源
		String transactionFrom = request.getParameter("stransactionFrom");
		String gameCode = request.getParameter("gameCode");

		String sql = "";
		if (!StringUtil.isEmpty(uid)) {
			sql += " and (f.useridOut = '" + uid + "' or  f.useridIn='" + uid + "' ) ";
		}
		if (!StringUtil.isEmpty(transactionId)) {
			sql += " and (f.transactionId = '" + transactionId + "' or  f.transactionIdBackout='" + transactionId
					+ "' ) ";
		}
		// 交易來源
		if (!StringUtil.isEmpty(transactionFrom)) {
			if (transactionFrom.equalsIgnoreCase("manager")) {
				sql += " and f.transactionFrom='manager' ";
			} else if (transactionFrom.equalsIgnoreCase("paytw")) {
				sql += " and ( f.transactionFrom='paytw') ";
			} else {
				sql += " and ( f.transactionFrom!='manager' and f.transactionFrom!='paytw'  ) ";
			}
		}
		// 操作交易状态
		if (!StringUtil.isEmpty(isSuccess)) {
			sql += " and f.isSuccess='" + isSuccess + "' ";
		}
		// 撤销交易状态
		if (!StringUtil.isEmpty(isBackout)) {
			sql += " and f.isBackout='" + isBackout + "' ";
		}
		// 交易类型
		if (!StringUtil.isEmpty(transactionType)) {
			sql += " and f.transactionType='" + transactionType + "' ";
		}
		// 交易時間
		if (!StringUtil.isEmpty(startTime)) {
			sql += " AND DATE(f.createdTime)>='" + startTime + "'";
		}
		if (!StringUtil.isEmpty(endTime)) {
			sql += " AND DATE(f.createdTime)<='" + endTime + " 23:59:59'";
		}
		// 撤销时间
		if (!StringUtil.isEmpty(bstartTime)) {
			sql += " AND DATE(f.backoutTime)>=DATE('" + bstartTime + "')";
		}
		if (!StringUtil.isEmpty(bendTime)) {
			sql += " AND DATE(f.backoutTime)<DATE('" + bendTime + "')";
		}
		if (!StringUtil.isEmpty(gameCode)) {
			sql += " AND f.gameCode='" + gameCode + "'";
		}
		sql += " order by f.createdTime desc";
		return sql;
	}

	public String search() {
		String sql = "select id, useridOut, gameCode, useridIn, point, freePoint, transactionType, transactionId, "
				+ "isSuccess, transactionTime, transactionIdBackout, isBackout, backoutTime, transactionFrom, remark "
				+ "From t_game_point_transaction f where 1=1 " + getWhereSql();
		dynamicUniverService.findBySql(sql, request);
		request.setAttribute("gameMaps", UserAuthority.getGameMaps());
		return "childlist";
	}

	public void exportExcel() {
		String columnSQL = "select f.id as 'ID',g.gameName as '游戏',f.useridOut as '转出账号',f.useridIn as '转入账号',f.point as '平台点',f.freePoint as '免费点',"
				+ " case when f.transactionType = 11 then '入点(储值)' when f.transactionType = 12 then '入点(活动)' when f.transactionType = 13 then '入点(申请)' when f.transactionType = 21 then '出点(转游戏币)' when f.transactionType = 22 then '出点(扣除)' when f.transactionType = 31 then '点转移(点数转移)' end as '交易类型',"
				+ " f.transactionId as '交易ID',f.efunOrderIdOut as '转出订单号',f.efunOrderIdIn as '转入订单号',f.createdTime as '交易创建时间',f.transactionTime as '交易時間',"
				+ " case when f.isSuccess = 1 then '交易成功' else '交易失败' end as '交易状态',f.transactionIdBackout as '交易ID(撤销)',f.efunOrderIdOutBackout as '转出订单号(撤銷)',"
				+ " f.efunOrderIdInBackout as '转入订单号(撤銷)',f.backoutTime as '撤销时间',case when f.isBackout = 1 then '撤销成功' when f.isBackout = 0 then '撤销失败' end as '撤销状态',"
				+ " f.remark as '备注' From t_game_point_transaction f left join t_games g on f.gameCode=g.gameCode where 1=1 ";
		try {
			String sql = columnSQL + getWhereSql();

			String[] titles = { "ID", "游戏", "转出账号", "转入账号", "平台点", "免费点", "交易类型", "交易ID", "转出订单号", "转入订单号", "交易创建时间",
					"交易時間", "交易状态", "交易ID(撤销)", "转出订单号(撤銷)", "转入订单号(撤銷)", "撤销时间", "撤销状态", "备注" };

			ReportExcel.reportExcel(request, response, "downloadfile_" + TimeFormator.getToday("yyyyMMddHHmmss"), "1",
					titles, dynamicUniverService.getBySql(sql));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 點转移
	 */
	public void trans() {
		if (ObjectUtil.haveNULLObject(entity, entity.getUseridIn(), entity.getUseridOut(), entity.getPoint())) {
			ajaxPri(JSONObjectUtil.getJSONObject("1003", "参数不能为空"));
			return;
		}

		String gameCode = "PFTW";
		String userIdIn = entity.getUseridIn() + "";
		String userIdOut = entity.getUseridOut() + "";
		entity.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		entity.setTransactionFrom("manager");
		entity.setTransactionType(31);
		Object userName = UserContainer.getCurrLoginUser();
		if (null != userName) {
			entity.setOperator(userName + "");
		}
		entity.setFlag("1");
		String transactionId = EfunOrderUtil.generateTransactionId();
		entity.setTransactionId(transactionId);
		String efunOrderIdOut = EfunOrderUtil.generateOrderId(gameCode, userIdOut);
		entity.setEfunOrderIdOut(efunOrderIdOut);
		String efunOrderIdIn = EfunOrderUtil.generateOrderId(gameCode, userIdIn);
		entity.setEfunOrderIdIn(efunOrderIdIn);

		JSONObject json = null;
		try {
			float point = entity.getPoint();
			json = pointTransaction(userIdOut, efunOrderIdOut, userIdIn, efunOrderIdIn, point);
			if (null != json && json.getString("code").equals("0000")) {
				entity.setIsSuccess("1");
				entity.setTransactionTime(new Timestamp(System.currentTimeMillis()));
				payRpcService.save(entity);
				ajaxPri(JSONObjectUtil.getJSONObject("1000", "点数转移成功"));
			} else {
				entity.setIsSuccess("0");
				entity.setTransactionTime(new Timestamp(System.currentTimeMillis()));
				payRpcService.save(entity);
				ajaxPri(JSONObjectUtil.getJSONObject("1004", "点数转移失败"));
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}

	/**
	 * 扣除平台点
	 */
	public void deductPoint() {
		if (ObjectUtil.haveNULLObject(entity, entity.getUseridOut(), entity.getPoint())) {
			ajaxPri(JSONObjectUtil.getJSONObject("1003", "参数不能为空"));
			return;
		}

		String gameCode = "PFTW";
		String userIdOut = entity.getUseridOut() + "";
		entity.setCreatedTime(new Timestamp(System.currentTimeMillis()));
		entity.setTransactionFrom("manager");
		Object userName = UserContainer.getCurrLoginUser();
		if (null != userName) {
			entity.setOperator(userName + "");
		}
		entity.setFlag("1");
		entity.setTransactionType(22);
		String transactionId = EfunOrderUtil.generateTransactionId();
		entity.setTransactionId(transactionId);
		String efunOrderIdOut = EfunOrderUtil.generateOrderId(gameCode, userIdOut);
		entity.setEfunOrderIdOut(efunOrderIdOut);

		JSONObject json = null;
		try {
			float point = entity.getPoint();
			json = pointDeduct(userIdOut, efunOrderIdOut, point);
			if (null != json && json.getString("code").equals("0000")) {
				entity.setIsSuccess("1");
				entity.setTransactionTime(new Timestamp(System.currentTimeMillis()));
				payRpcService.save(entity);
				ajaxPri(JSONObjectUtil.getJSONObject("1000", "点数扣除成功"));
			} else {
				entity.setIsSuccess("0");
				entity.setTransactionTime(new Timestamp(System.currentTimeMillis()));
				payRpcService.save(entity);
				ajaxPri(JSONObjectUtil.getJSONObject("1004", "点数扣除失败"));
			}
		} catch (Exception e) {
			logger.error(e);
		}
	}

	/**
	 * 点数扣除
	 * 
	 * @param userIdOut
	 * @param efunOrderIdOut
	 * @param point
	 * @return
	 */
	private JSONObject pointDeduct(String userIdOut, String efunOrderIdOut, float point) {
		String url = PropertiesUtils.getDomain("pay_" + getArea())+"point_efunChange.shtml?";
		String params = "orderId=" + efunOrderIdOut + "&uid=" + userIdOut + "&point=" + point;
		logger.info("pointDeduct  -->" + url);
		url = url + params;
		String jsonStr = HttpUtil.sendGetString(url);
		if (StringUtil.isEmpty(jsonStr) || jsonStr.indexOf("0000") == -1) {
			return JSONObjectUtil.getJSONObject("1100", "点数扣除失败");
		} else {
			return JSONObjectUtil.getJSONObject("0000", "点数扣除成功");
		}
	}

	/**
	 * 点数转移方法
	 * 
	 * @param userIdOut
	 * @param efunOrderIdOut
	 * @param userIdIn
	 * @param efunOrderIdIn
	 * @param point
	 * @return
	 */
	private JSONObject pointTransaction(String userIdOut, String efunOrderIdOut, String userIdIn,
                                        String efunOrderIdIn, float point) {
		String url = PropertiesUtils.getDomain("pay_" + getArea()) + "point_adjust.shtml?";
		String params = "consumeOrderId=" + efunOrderIdOut + "&consumeUid=" + userIdOut + "&payOrderId=" + efunOrderIdIn
				+ "&payUid=" + userIdIn + "&point=" + point + "&key=" + POINT_KEY;
		String sign = Md5.toMd5(params);
		url = url + params + "&sign=" + sign;
		logger.info("pointTransaction  -->" + url);
		String jsonStr = HttpUtil.sendGetString(url);
		JSONObject json = JSONObject.parseObject(jsonStr);
		return json;
	}

	public UniversallyService getDynamicUniverService() {
		return dynamicUniverService;
	}

	public void setDynamicUniverService(UniversallyService dynamicUniverService) {
		this.dynamicUniverService = dynamicUniverService;
	}

	public PayRpcService getPayRpcService() {
		return payRpcService;
	}

	public void setPayRpcService(PayRpcService payRpcService) {
		this.payRpcService = payRpcService;
	}

}
