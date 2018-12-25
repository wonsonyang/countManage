package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyIos entity. @author MyEclipse Persistence Tools
 */

public class TGameMoneyIos implements java.io.Serializable {
	private static final long serialVersionUID = 2L;

	// Fields

	private Long id;
	private Long gsid;
	private Long uid;
	private String playerid;
	private String roleLevel;
	private Float amount;
	private Integer stone;
	private String serverCode;
	private String gameCode;
	private String paystatus;
	private String efunOrderId;
	private String transactionId;
	private Integer quantity;
	private String purchaseDate;
	private String purchaseDatePst;
	private String productId;
	private String uniqueIdentifier;
	private Date createdTime;
	private Date modifiedTime;
	private Float twcoin;
	private Float usd;
	private String payFrom;
	private String remark;
	private String isTest;
	private String remark1;
	private String flag;
	private String packageName;
	private String country;

	// Constructors

	/** default constructor */
	public TGameMoneyIos() {
	}

	
	
	public TGameMoneyIos(Long id, Long gsid, Long uid, String playerid,
			String roleLevel, Float amount, Integer stone, String serverCode,
			String gameCode, String paystatus, String efunOrderId,
			String transactionId, Integer quantity, String purchaseDate,
			String purchaseDatePst, String productId, String uniqueIdentifier,
			Date createdTime, Date modifiedTime, Float twcoin, Float usd,
			String payFrom, String remark, String isTest, String remark1,
			String flag, String packageName, String country) {
		super();
		this.id = id;
		this.gsid = gsid;
		this.uid = uid;
		this.playerid = playerid;
		this.roleLevel = roleLevel;
		this.amount = amount;
		this.stone = stone;
		this.serverCode = serverCode;
		this.gameCode = gameCode;
		this.paystatus = paystatus;
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
		this.purchaseDatePst = purchaseDatePst;
		this.productId = productId;
		this.uniqueIdentifier = uniqueIdentifier;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.twcoin = twcoin;
		this.usd = usd;
		this.payFrom = payFrom;
		this.remark = remark;
		this.isTest = isTest;
		this.remark1 = remark1;
		this.flag = flag;
		this.packageName = packageName;
		this.country = country;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGsid() {
		return gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	public String getRoleLevel() {
		return roleLevel;
	}

	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getStone() {
		return stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}

	public String getEfunOrderId() {
		return efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseDatePst() {
		return purchaseDatePst;
	}

	public void setPurchaseDatePst(String purchaseDatePst) {
		this.purchaseDatePst = purchaseDatePst;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUniqueIdentifier() {
		return uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
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

	public Float getTwcoin() {
		return twcoin;
	}

	public void setTwcoin(Float twcoin) {
		this.twcoin = twcoin;
	}

	public Float getUsd() {
		return usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getPayFrom() {
		return payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsTest() {
		return isTest;
	}

	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

}