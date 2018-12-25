package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * t_money_large_value
 */
public class TMoneyLargeValue implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * tlvid 编号
	 */
	private Long tlvid;

	/**
	 * u_id uid
	 */
	private Long u_id;

	/**
	 * roleid 角色ID
	 */
	private String roleid;

	/**
	 * roleName 玩家角色名
	 */
	private String roleName;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * serverName 游戏服名称
	 */
	private String serverName;

	/**
	 * serverCode 游戏服代码
	 */
	private String serverCode;

	/**
	 * email 玩家邮箱
	 */
	private String email;

	/**
	 * phone 联系电话
	 */
	private String phone;

	/**
	 * palayName 玩家姓名
	 */
	private String palayName;

	/**
	 * remittanceNum 汇款金额
	 */
	private Float remittanceNum;

	/**
	 * remittanceTime 银行汇款时间
	 */
	private Date remittanceTime;

	/**
	 * imgVoucher
	 */
	private String imgVoucher;

	/**
	 * currency 币种
	 */
	private String currency;

	/**
	 * twd 台币
	 */
	private Double twd;

	/**
	 * firstValue 是否首储
	 */
	private Integer firstValue;

	/**
	 * playerStone 玩家实际应得钻石数
	 */
	private Float playerStone;

	/**
	 * systemStone 系统实际发放钻石数
	 */
	private Float systemStone;

	/**
	 * operateStone 运行补发钻石数
	 */
	private Float operateStone;

	/**
	 * remitOrderId 汇款订单号
	 */
	private String remitOrderId;

	/**
	 * efunOrderId efun储值订单编号
	 */
	private String efunOrderId;

	/**
	 * cusServiceState 客服是否确认
	 */
	private Integer cusServiceState;

	/**
	 * operateState 运营是否确认
	 */
	private Integer operateState;

	/**
	 * financeState 财务是否审核
	 */
	private Integer financeState;

	/**
	 * replacementState 是否补发钻石
	 */
	private Integer replacementState;

	/**
	 * createdTime 创建时间
	 */
	private Date createdTime;

	/**
	 * modifiedTime 修改时间
	 */
	private Date modifiedTime;

	/**
	 * item1 预留字段1 是否首储
	 */
	private String item1;

	/**
	 * item2 预留字段2 注意事项
	 */
	private String item2;

	/**
	 * item3 玩家信息确认
	 */
	private String item3;

	/**
	 * item4 预留字段4 玩家会员类型(藍鑽+紅鑽)
	 */
	private String item4;

	/**
	 * item5 预留字段5 二次汇款
	 */
	private String item5;

	/**
	 * item6 预留字段6 item6 标示该订单是否废除 0废除 1不废除
	 */
	private String item6;

	/**
	 * item7 预留字段7 。0 ：审核中 1：游戏币已发 2：审核失败
	 */
	private String item7;

	/**
	 * lastFiveNum 银行账号后五位
	 */
	private String lastFiveNum;

	/**
	 * receiptNeed 是否索取发票
	 */
	private String receiptNeed;

	/**
	 * receiptAddr 发票地址
	 */
	private String receiptAddr;

	/**
	 * backup 玩家填写汇款备注信息
	 */
	private String backup;

	/**
	 * gameName 游戏名称
	 */
	private String gameName;

	/**
	 * remitOrderIdType 订单类型，0 为后台添加订单，1为玩家从PC端添加订单，2为玩家从客户端添加订单
	 */
	private Integer remitOrderIdType;

	// 收款账号
	private String beneficiaryAccount;

	/**
	 * 汇款类型
	 * 1：卡转账；2：现金转账；3：其他；
	 */
	private Integer remittanceType;

	private String awardProject;    //125810-汇款奖励配置主键

	private String awardContent;    //发奖励配置内容json

	private Date sendStoneTime;     //游戏币发放成功时间

	private Integer isSendAward;    //是否发送奖励成功 0:否,1:是

	private Integer autoSendAward;  //是否自动发送奖励 0:否,1:是

	private Integer bonusStone;     //赠送游戏币

	private String operator;        //最后操作人


	public Long getTlvid() {
		return tlvid;
	}

	public void setTlvid(Long tlvid) {
		this.tlvid = tlvid;
	}

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerName() {
		return serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPalayName() {
		return palayName;
	}

	public void setPalayName(String palayName) {
		this.palayName = palayName;
	}

	public Float getRemittanceNum() {
		return remittanceNum;
	}

	public void setRemittanceNum(Float remittanceNum) {
		this.remittanceNum = remittanceNum;
	}

	public String getImgVoucher() {
		return imgVoucher;
	}

	public void setImgVoucher(String imgVoucher) {
		this.imgVoucher = imgVoucher;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getTwd() {
		return twd;
	}

	public void setTwd(Double twd) {
		this.twd = twd;
	}

	public Integer getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(Integer firstValue) {
		this.firstValue = firstValue;
	}

	public Float getPlayerStone() {
		return playerStone;
	}

	public void setPlayerStone(Float playerStone) {
		this.playerStone = playerStone;
	}

	public Float getSystemStone() {
		return systemStone;
	}

	public void setSystemStone(Float systemStone) {
		this.systemStone = systemStone;
	}

	public Float getOperateStone() {
		return operateStone;
	}

	public void setOperateStone(Float operateStone) {
		this.operateStone = operateStone;
	}

	public String getRemitOrderId() {
		return remitOrderId;
	}

	public void setRemitOrderId(String remitOrderId) {
		this.remitOrderId = remitOrderId;
	}

	public String getEfunOrderId() {
		return efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public Integer getCusServiceState() {
		return cusServiceState;
	}

	public void setCusServiceState(Integer cusServiceState) {
		this.cusServiceState = cusServiceState;
	}

	public Integer getOperateState() {
		return operateState;
	}

	public void setOperateState(Integer operateState) {
		this.operateState = operateState;
	}

	public Integer getFinanceState() {
		return financeState;
	}

	public void setFinanceState(Integer financeState) {
		this.financeState = financeState;
	}

	public Integer getReplacementState() {
		return replacementState;
	}

	public void setReplacementState(Integer replacementState) {
		this.replacementState = replacementState;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public String getItem7() {
		return item7;
	}

	public void setItem7(String item7) {
		this.item7 = item7;
	}

	public String getLastFiveNum() {
		return lastFiveNum;
	}

	public void setLastFiveNum(String lastFiveNum) {
		this.lastFiveNum = lastFiveNum;
	}

	public String getReceiptNeed() {
		return receiptNeed;
	}

	public void setReceiptNeed(String receiptNeed) {
		this.receiptNeed = receiptNeed;
	}

	public String getReceiptAddr() {
		return receiptAddr;
	}

	public void setReceiptAddr(String receiptAddr) {
		this.receiptAddr = receiptAddr;
	}

	public String getBackup() {
		return backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Integer getRemitOrderIdType() {
		return remitOrderIdType;
	}

	public void setRemitOrderIdType(Integer remitOrderIdType) {
		this.remitOrderIdType = remitOrderIdType;
	}

	public Date getRemittanceTime() {
		return remittanceTime;
	}

	public void setRemittanceTime(Date remittanceTime) {
		this.remittanceTime = remittanceTime;
	}

	public String getBeneficiaryAccount() {
		return beneficiaryAccount;
	}

	public void setBeneficiaryAccount(String beneficiaryAccount) {
		this.beneficiaryAccount = beneficiaryAccount;
	}

	public Integer getRemittanceType() {
		return remittanceType;
	}

	public void setRemittanceType(Integer remittanceType) {
		this.remittanceType = remittanceType;
	}

	public String getAwardProject() {
		return awardProject;
	}

	public void setAwardProject(String awardProject) {
		this.awardProject = awardProject;
	}

	public String getAwardContent() {
		return awardContent;
	}

	public void setAwardContent(String awardContent) {
		this.awardContent = awardContent;
	}

	public Date getSendStoneTime() {
		return sendStoneTime;
	}

	public void setSendStoneTime(Date sendStoneTime) {
		this.sendStoneTime = sendStoneTime;
	}

	public Integer getIsSendAward() {
		return isSendAward;
	}

	public void setIsSendAward(Integer isSendAward) {
		this.isSendAward = isSendAward;
	}

	public Integer getAutoSendAward() {
		return autoSendAward;
	}

	public void setAutoSendAward(Integer autoSendAward) {
		this.autoSendAward = autoSendAward;
	}

	public Integer getBonusStone() {
		return bonusStone;
	}

	public void setBonusStone(Integer bonusStone) {
		this.bonusStone = bonusStone;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "TMoneyLargeValue{" +
				"tlvid=" + tlvid +
				", u_id=" + u_id +
				", roleid='" + roleid + '\'' +
				", roleName='" + roleName + '\'' +
				", gameCode='" + gameCode + '\'' +
				", serverName='" + serverName + '\'' +
				", serverCode='" + serverCode + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", palayName='" + palayName + '\'' +
				", remittanceNum=" + remittanceNum +
				", remittanceTime=" + remittanceTime +
				", imgVoucher='" + imgVoucher + '\'' +
				", currency='" + currency + '\'' +
				", twd=" + twd +
				", firstValue=" + firstValue +
				", playerStone=" + playerStone +
				", systemStone=" + systemStone +
				", operateStone=" + operateStone +
				", remitOrderId='" + remitOrderId + '\'' +
				", efunOrderId='" + efunOrderId + '\'' +
				", cusServiceState=" + cusServiceState +
				", operateState=" + operateState +
				", financeState=" + financeState +
				", replacementState=" + replacementState +
				", createdTime=" + createdTime +
				", modifiedTime=" + modifiedTime +
				", item1='" + item1 + '\'' +
				", item2='" + item2 + '\'' +
				", item3='" + item3 + '\'' +
				", item4='" + item4 + '\'' +
				", item5='" + item5 + '\'' +
				", item6='" + item6 + '\'' +
				", item7='" + item7 + '\'' +
				", lastFiveNum='" + lastFiveNum + '\'' +
				", receiptNeed='" + receiptNeed + '\'' +
				", receiptAddr='" + receiptAddr + '\'' +
				", backup='" + backup + '\'' +
				", gameName='" + gameName + '\'' +
				", remitOrderIdType=" + remitOrderIdType +
				", beneficiaryAccount='" + beneficiaryAccount + '\'' +
				", remittanceType=" + remittanceType +
				", awardProject='" + awardProject + '\'' +
				", awardContent='" + awardContent + '\'' +
				", sendStoneTime=" + sendStoneTime +
				", isSendAward=" + isSendAward +
				", autoSendAward=" + autoSendAward +
				", bonusStone=" + bonusStone +
				", operator='" + operator + '\'' +
				'}';
	}
}