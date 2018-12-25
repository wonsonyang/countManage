package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameMoneyIosReissue entity. @author MyEclipse Persistence Tools
 */

public class TGameMoneyIosReissue implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 418541251L;
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
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private Float twcoin;
	private Float usd;
	private String payFrom;
	private String remark;
	private String isTest;
	private String remark1;
	private String flag;
	private String country;
	private String packageName;
	private String errorCode;
	private String errorMessage;
	private String receiptData;
	private String reissueCode;
	private String reissueMessage;
	private String reissueEfunOrderId;
	private Integer supplyTimes;
	private String resultCode;
	private String environment;
	// Constructors

	/** default constructor */
	public TGameMoneyIosReissue() {
	}

	

	// Property accessors

	public TGameMoneyIosReissue(Long id, Long gsid, Long uid, String playerid,
			String roleLevel, Float amount, Integer stone, String serverCode,
			String gameCode, String paystatus, String efunOrderId,
			String transactionId, Integer quantity, String purchaseDate,
			String purchaseDatePst, String productId, String uniqueIdentifier,
			Timestamp createdTime, Timestamp modifiedTime, Float twcoin,
			Float usd, String payFrom, String remark, String isTest,
			String remark1, String flag, String country, String packageName,
			String errorCode, String errorMessage, String receiptData,
			String reissueCode, String reissueMessage,
			String reissueEfunOrderId, Integer supplyTimes, String resultCode,
			String environment) {
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
		this.country = country;
		this.packageName = packageName;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.receiptData = receiptData;
		this.reissueCode = reissueCode;
		this.reissueMessage = reissueMessage;
		this.reissueEfunOrderId = reissueEfunOrderId;
		this.supplyTimes = supplyTimes;
		this.resultCode = resultCode;
		this.environment = environment;
	}



	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGsid() {
		return this.gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPlayerid() {
		return this.playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}

	public String getRoleLevel() {
		return this.roleLevel;
	}

	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPaystatus() {
		return this.paystatus;
	}

	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
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

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getPurchaseDatePst() {
		return this.purchaseDatePst;
	}

	public void setPurchaseDatePst(String purchaseDatePst) {
		this.purchaseDatePst = purchaseDatePst;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUniqueIdentifier() {
		return this.uniqueIdentifier;
	}

	public void setUniqueIdentifier(String uniqueIdentifier) {
		this.uniqueIdentifier = uniqueIdentifier;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Float getTwcoin() {
		return this.twcoin;
	}

	public void setTwcoin(Float twcoin) {
		this.twcoin = twcoin;
	}

	public Float getUsd() {
		return this.usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getIsTest() {
		return this.isTest;
	}

	public void setIsTest(String isTest) {
		this.isTest = isTest;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getReceiptData() {
		return this.receiptData;
	}

	public void setReceiptData(String receiptData) {
		this.receiptData = receiptData;
	}

	public String getReissueCode() {
		return this.reissueCode;
	}

	public void setReissueCode(String reissueCode) {
		this.reissueCode = reissueCode;
	}

	public String getReissueMessage() {
		return this.reissueMessage;
	}

	public void setReissueMessage(String reissueMessage) {
		this.reissueMessage = reissueMessage;
	}

	public String getReissueEfunOrderId() {
		return this.reissueEfunOrderId;
	}

	public void setReissueEfunOrderId(String reissueEfunOrderId) {
		this.reissueEfunOrderId = reissueEfunOrderId;
	}

	public Integer getSupplyTimes() {
		return supplyTimes;
	}

	public void setSupplyTimes(Integer supplyTimes) {
		this.supplyTimes = supplyTimes;
	}
	
	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	/**
	 * 由于这个动作三个状态设置比较常用,所以封装
	 * @param reissueCode
	 * @param reissueMessage
	 * @param reissueEfunOrderId
	 */
	public void setReissueContent(String reissueCode,String reissueMessage,String reissueEfunOrderId){
		this.reissueCode=reissueCode;
		this.reissueMessage=reissueMessage;
		this.reissueEfunOrderId=reissueEfunOrderId;
		
	}

}