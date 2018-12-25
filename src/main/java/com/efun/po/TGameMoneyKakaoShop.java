package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyKakaoShop entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyKakaoShop implements java.io.Serializable {
	private static final long serialVersionUID = 2193904077415866043L;

	// Fields

	private Long id;
	private String gameCode;
	private String serverCode;
	private String creditId;
	private String payStatus;
	private Long uid;
	private String efunOrderId;
	private String transactionId;
	private String moneyType;
	private String payFrom;
	private String payType;
	private String efunLevel;
	private String efunRole;
	private Float gamePay;
	private Float stone;
	private String productId;
	private Float twCoin;
	private Float usd;
	private String flag;
	private String remark;
	private String packageName;
	private String country;
	private Date createdTime;
	private Date modifiedTime;
	private String orderToken;

	// Constructors

	/** default constructor */
	public TGameMoneyKakaoShop() {
	}

	/** minimal constructor */
	public TGameMoneyKakaoShop(Long uid) {
		this.uid = uid;
	}

	/** full constructor */
	public TGameMoneyKakaoShop(String gameCode, String serverCode,
			String creditId, String payStatus, Long uid, String efunOrderId,
			String transactionId, String moneyType, String payFrom,
			String payType, String efunLevel, String efunRole, Float gamePay,
			Float stone, String productId, Float twCoin, Float usd,
			String flag, String remark, String packageName, String country,
			Date createdTime, Date modifiedTime, String orderToken) {
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.creditId = creditId;
		this.payStatus = payStatus;
		this.uid = uid;
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.moneyType = moneyType;
		this.payFrom = payFrom;
		this.payType = payType;
		this.efunLevel = efunLevel;
		this.efunRole = efunRole;
		this.gamePay = gamePay;
		this.stone = stone;
		this.productId = productId;
		this.twCoin = twCoin;
		this.usd = usd;
		this.flag = flag;
		this.remark = remark;
		this.packageName = packageName;
		this.country = country;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.orderToken = orderToken;
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

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
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

	public String getEfunLevel() {
		return this.efunLevel;
	}

	public void setEfunLevel(String efunLevel) {
		this.efunLevel = efunLevel;
	}

	public String getEfunRole() {
		return this.efunRole;
	}

	public void setEfunRole(String efunRole) {
		this.efunRole = efunRole;
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

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Float getTwCoin() {
		return this.twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
	}

	public Float getUsd() {
		return this.usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
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

	public String getOrderToken() {
		return this.orderToken;
	}

	public void setOrderToken(String orderToken) {
		this.orderToken = orderToken;
	}

}