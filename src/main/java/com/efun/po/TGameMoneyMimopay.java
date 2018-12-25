package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyMimopay entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyMimopay implements java.io.Serializable {
	private static final long serialVersionUID = -7631074640087623903L;

	// Fields

	private Long id;
	private String gameCode;
	private String serverCode;
	private Long uid;
	private String creditId;
	private String payStatus;
	private String resultCode;
	private String efunOrderId;
	private String transactionId;
	private String moneyType;
	private String payFrom;
	private String payType;
	private Float gamePay;
	private Float stone;
	private Float usd;
	private Float twCoin;
	private Date createdTime;
	private Date modifiedTime;
	private String efunLevel;
	private String flag;
	private String remark;
	private String paid;
	private String channel;
	private String packageName;
	private String country;

	// Constructors

	/** default constructor */
	public TGameMoneyMimopay() {
	}

	/** full constructor */
	public TGameMoneyMimopay(String gameCode, String serverCode, Long uid,
			String creditId, String payStatus, String resultCode,
			String efunOrderId, String transactionId, String moneyType,
			String payFrom, String payType, Float gamePay, Float stone,
			Float usd, Float twCoin, Date createdTime, Date modifiedTime,
			String efunLevel, String flag, String remark, String paid,
			String channel, String packageName, String country) {
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.uid = uid;
		this.creditId = creditId;
		this.payStatus = payStatus;
		this.resultCode = resultCode;
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.moneyType = moneyType;
		this.payFrom = payFrom;
		this.payType = payType;
		this.gamePay = gamePay;
		this.stone = stone;
		this.usd = usd;
		this.twCoin = twCoin;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.efunLevel = efunLevel;
		this.flag = flag;
		this.remark = remark;
		this.paid = paid;
		this.channel = channel;
		this.packageName = packageName;
		this.country = country;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
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

	public Float getUsd() {
		return this.usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public Float getTwCoin() {
		return this.twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
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

	public String getEfunLevel() {
		return this.efunLevel;
	}

	public void setEfunLevel(String efunLevel) {
		this.efunLevel = efunLevel;
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

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}