package com.efun.po;

import java.sql.Timestamp;

/**
 * TPayAlipay entity. @author MyEclipse Persistence Tools
 */

public class TPayAlipay implements java.io.Serializable {
	private static final long serialVersionUID = 3161919259668472808L;

	// Fields

	private Long id;
	private String userId;
	private String gameCode;
	private String serverCode;
	private String creditId;
	private Integer efunLevel;
	private Double gamePoint;
	private Double amount;
	private Double areaAmount;
	private Double usd;
	private Integer stone;
	private String currency;
	private String flag;
	private String paid;
	private String payFrom;
	private String payType;
	private String productId;
	private String payStatus;
	private String efunOrderId;
	private String transactionId;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String country;
	private Short reSend;
	private Short isTest;
	private String resultCode;
	private String ip;
	private String menuId;
	private String itemId;
	private Integer activityStone;
	private String packageName;
	private Timestamp areaTime;
	private String remark;
	private String efunToken;
	private String paymentToken;
	private String backup;
	private String advertisingid;
	private String deviceType;
	private String systemVersion;
	private String mac;
	private String imei;
	private String versionCode;
	private String gameVersion;
	private String idfa;
	private String cfuuid;
	private String androidid;
	private String efunFundAccount;
	private Short isTort;
	private String str1;
	private String str2;
	private String str3;
	private String str4;

	// Constructors

	/** default constructor */
	public TPayAlipay() {
	}

	/** minimal constructor */
	public TPayAlipay(String userId, String gameCode, String serverCode, String creditId, Double usd, String currency,
			String flag, String payFrom, String payType, String payStatus, String efunOrderId, String transactionId,
			Timestamp createdTime, Timestamp modifiedTime, Timestamp areaTime) {
		this.userId = userId;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.creditId = creditId;
		this.usd = usd;
		this.currency = currency;
		this.flag = flag;
		this.payFrom = payFrom;
		this.payType = payType;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.areaTime = areaTime;
	}

	/** full constructor */
	public TPayAlipay(String userId, String gameCode, String serverCode, String creditId, Integer efunLevel,
			Double gamePoint, Double amount, Double areaAmount, Double usd, Integer stone, String currency, String flag,
			String paid, String payFrom, String payType, String productId, String payStatus, String efunOrderId,
			String transactionId, Timestamp createdTime, Timestamp modifiedTime, String country, Short reSend,
			Short isTest, String resultCode, String ip, String menuId, String itemId, Integer activityStone,
			String packageName, Timestamp areaTime, String remark, String efunToken, String paymentToken, String backup,
			String advertisingid, String deviceType, String systemVersion, String mac, String imei, String versionCode,
			String gameVersion, String idfa, String cfuuid, String androidid, String efunFundAccount, Short isTort,
			String str1, String str2, String str3, String str4) {
		this.userId = userId;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.creditId = creditId;
		this.efunLevel = efunLevel;
		this.gamePoint = gamePoint;
		this.amount = amount;
		this.areaAmount = areaAmount;
		this.usd = usd;
		this.stone = stone;
		this.currency = currency;
		this.flag = flag;
		this.paid = paid;
		this.payFrom = payFrom;
		this.payType = payType;
		this.productId = productId;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.transactionId = transactionId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.country = country;
		this.reSend = reSend;
		this.isTest = isTest;
		this.resultCode = resultCode;
		this.ip = ip;
		this.menuId = menuId;
		this.itemId = itemId;
		this.activityStone = activityStone;
		this.packageName = packageName;
		this.areaTime = areaTime;
		this.remark = remark;
		this.efunToken = efunToken;
		this.paymentToken = paymentToken;
		this.backup = backup;
		this.advertisingid = advertisingid;
		this.deviceType = deviceType;
		this.systemVersion = systemVersion;
		this.mac = mac;
		this.imei = imei;
		this.versionCode = versionCode;
		this.gameVersion = gameVersion;
		this.idfa = idfa;
		this.cfuuid = cfuuid;
		this.androidid = androidid;
		this.efunFundAccount = efunFundAccount;
		this.isTort = isTort;
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.str4 = str4;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public Integer getEfunLevel() {
		return this.efunLevel;
	}

	public void setEfunLevel(Integer efunLevel) {
		this.efunLevel = efunLevel;
	}

	public Double getGamePoint() {
		return this.gamePoint;
	}

	public void setGamePoint(Double gamePoint) {
		this.gamePoint = gamePoint;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAreaAmount() {
		return this.areaAmount;
	}

	public void setAreaAmount(Double areaAmount) {
		this.areaAmount = areaAmount;
	}

	public Double getUsd() {
		return this.usd;
	}

	public void setUsd(Double usd) {
		this.usd = usd;
	}

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
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

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
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

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Short getReSend() {
		return this.reSend;
	}

	public void setReSend(Short reSend) {
		this.reSend = reSend;
	}

	public Short getIsTest() {
		return this.isTest;
	}

	public void setIsTest(Short isTest) {
		this.isTest = isTest;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getActivityStone() {
		return this.activityStone;
	}

	public void setActivityStone(Integer activityStone) {
		this.activityStone = activityStone;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Timestamp getAreaTime() {
		return this.areaTime;
	}

	public void setAreaTime(Timestamp areaTime) {
		this.areaTime = areaTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEfunToken() {
		return this.efunToken;
	}

	public void setEfunToken(String efunToken) {
		this.efunToken = efunToken;
	}

	public String getPaymentToken() {
		return this.paymentToken;
	}

	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}

	public String getBackup() {
		return this.backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public String getAdvertisingid() {
		return this.advertisingid;
	}

	public void setAdvertisingid(String advertisingid) {
		this.advertisingid = advertisingid;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getSystemVersion() {
		return this.systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getGameVersion() {
		return this.gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public String getIdfa() {
		return this.idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getCfuuid() {
		return this.cfuuid;
	}

	public void setCfuuid(String cfuuid) {
		this.cfuuid = cfuuid;
	}

	public String getAndroidid() {
		return this.androidid;
	}

	public void setAndroidid(String androidid) {
		this.androidid = androidid;
	}

	public String getEfunFundAccount() {
		return this.efunFundAccount;
	}

	public void setEfunFundAccount(String efunFundAccount) {
		this.efunFundAccount = efunFundAccount;
	}

	public Short getIsTort() {
		return this.isTort;
	}

	public void setIsTort(Short isTort) {
		this.isTort = isTort;
	}

	public String getStr1() {
		return this.str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return this.str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return this.str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return this.str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

}