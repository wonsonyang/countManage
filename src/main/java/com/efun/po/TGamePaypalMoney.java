package com.efun.po;

import java.util.Date;

/**
 * TGamePaypalMoney entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePaypalMoney implements java.io.Serializable {
	private static final long serialVersionUID = -5841878674566400901L;

	// Fields

	private Long gpmid;
	private Integer gsid;
	private String gameCode;
	private String serverCode;
	private String moneyType;
	private String payFrom;
	private Long uid;
	private Float gamePoint;
	private Float gamePay;
	private Integer stone;
	private String resultCode;
	private String payStatus;
	private String efunOrderId;
	private String transactionId;
	private String creditId;
	private String token;
	private String payType;
	private Date createdTime;
	private Date modifiedTime;
	private String flag;
	private String remark;
	private Float twCoin;
	private Float usd;

	// Constructors

	/** default constructor */
	public TGamePaypalMoney() {
	}

	/** full constructor */
	public TGamePaypalMoney(Integer gsid, String gameCode, String serverCode,
			String moneyType, String payFrom, Long uid, Float gamePoint,
			Float gamePay, Integer stone, String resultCode, String payStatus,
			String efunOrderId, String transactionId, String creditId,
			String token, String payType, Date createdTime, Date modifiedTime,
			String flag, String remark,Float twCoin,Float usd) {
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
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.creditId = creditId;
		this.token = token;
		this.payType = payType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.flag = flag;
		this.remark = remark;
		this.twCoin=twCoin;
		this.usd = usd;
	}

	// Property accessors

	public Long getGpmid() {
		return this.gpmid;
	}

	public void setGpmid(Long gpmid) {
		this.gpmid = gpmid;
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

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
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

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
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
}