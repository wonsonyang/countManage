package com.efun.po;

import java.util.Date;

/**
 * TGameGoogleplayMoney entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameGoogleplayMoney implements java.io.Serializable {
	private static final long serialVersionUID = 573301500072449984L;

	// Fields

	private Long ggmid;
	private Integer gsid;
	private String gameCode;
	private String serverCode;
	private String moneyType;
	private String payFrom;
	private Long uid;
	private Float gamePoint;
	private Float gamePay;
	private Float stone;
	private String resultCode;
	private String payStatus;
	private String productId;
	private String efunOrderId;
	private String creditId;
	private String googleOrderId;
	private String payType;
	private Date createdTime;
	private Date modifiedTime;
	private String flag;
	private String remark;
	private Float twCoin;
	private Float usd;
	private Date voidedTime;      //退款时间
	private String accountName;   //账号名称
	private String accountState;  //账号状态,0：被封；1：解封
	private String handleCause;  //封号原因

	// Constructors

	/** default constructor */
	public TGameGoogleplayMoney() {
	}

	/** full constructor */
	public TGameGoogleplayMoney(Integer gsid, String gameCode,
			String serverCode, String moneyType, String payFrom, Long uid,
			Float gamePoint, Float gamePay, Float stone, String resultCode,
			String payStatus, String efunOrderId, String productId, String creditId,
			String googleOrderId, String payType, Date createdTime,
			Date modifiedTime, String flag, String remark,Float twCoin,Float usd) {
		this.gsid = gsid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.moneyType = moneyType;
		this.payFrom = payFrom;
		this.uid = uid;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.stone = stone;
		this.resultCode = resultCode;
		this.payStatus = payStatus;
		this.productId = productId;
		this.efunOrderId = efunOrderId;
		this.creditId = creditId;
		this.googleOrderId = googleOrderId;
		this.payType = payType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.flag = flag;
		this.remark = remark;
		this.twCoin=twCoin;
		this.usd = usd;
	}

	// Property accessors

	public Long getGgmid() {
		return this.ggmid;
	}

	public void setGgmid(Long ggmid) {
		this.ggmid = ggmid;
	}

	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Float getGamePoint() {
		return this.gamePoint;
	}

	public void setGamePoint(Float gamePoint) {
		this.gamePoint = gamePoint;
	}

	public Float getGamePay() {
		return this.gamePay;
	}

	public void setGamePay(Float gamePay) {
		this.gamePay = gamePay;
	}

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getGoogleOrderId() {
		return this.googleOrderId;
	}

	public void setGoogleOrderId(String googleOrderId) {
		this.googleOrderId = googleOrderId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getTwCoin() {
		return twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
	}

	public Float getUsd() {
		return usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public Date getVoidedTime() {
		return voidedTime;
	}

	public void setVoidedTime(Date voidedTime) {
		this.voidedTime = voidedTime;
	}

	public String getHandleCause() {
		return handleCause;
	}

	public void setHandleCause(String handleCause) {
		this.handleCause = handleCause;
	}
}