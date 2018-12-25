package com.efun.po;

import java.io.Serializable;

/**
 * payssion渠道储值表 t_pay_payssion
 */
public class TPayPayssion implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 主键id
	 */
	private Long id;

	/**
	 * userId efun用户id
	 */
	private String userId;

	/**
	 * gameCode 游戏编码
	 */
	private String gameCode;

	/**
	 * serverCode 游戏服编码
	 */
	private String serverCode;

	/**
	 * creditId
	 */
	private String creditId;

	/**
	 * efunLevel 玩家角色等级
	 */
	private Integer efunLevel;

	/**
	 * gamePoint 支付点卡点数，仅限点卡支付使用
	 */
	private java.math.BigDecimal gamePoint;

	/**
	 * amount 支付原币种额度
	 */
	private java.math.BigDecimal amount;

	/**
	 * areaAmount 地区金额，比如港台地址台币金额，韩国地址韩币金额
	 */
	private java.math.BigDecimal areaAmount;

	/**
	 * usd
	 */
	private java.math.BigDecimal usd;

	/**
	 * stone 游戏币数量
	 */
	private Integer stone;

	/**
	 * currency 币种
	 */
	private String currency;

	/**
	 * flag 金流类型，如果没有子类型的可直接填定大类标识，如PAYPAL；有子类则写子类标识，如MyCard有WEBATM则填写WEBATM
	 */
	private String flag;

	/**
	 * paid 子金流类型，可空，如MyCard的WEBATM有子类则填写子类标识，如BNK80801
	 */
	private String paid;

	/**
	 * payFrom 储值来源，比如efun，vip
	 */
	private String payFrom;

	/**
	 * payType 支付来源类型，主要区别各平台来源
	 */
	private String payType;

	/**
	 * productId 商品项id/月卡
	 */
	private String productId;

	/**
	 * payStatus 支付状态
	 */
	private String payStatus;

	/**
	 * efunOrderId efun订单号
	 */
	private String efunOrderId;

	/**
	 * transactionId 金流商订单号
	 */
	private String transactionId;

	/**
	 * createdTime 创建时间
	 */
	private java.util.Date createdTime;

	/**
	 * modifiedTime 修改时间
	 */
	private java.util.Date modifiedTime;

	/**
	 * country 国家代号
	 */
	private String country;

	/**
	 * reSend 补发标识；0（正常），1（手工补发）；2（自动补发）；3（客户端补发）
	 */
	private Integer reSend;

	/**
	 * isTest 是否测试；0（正常），1（测试账号，真钱支付），2（测试，非真钱），3（模拟数据测试）
	 */
	private Integer isTest;

	/**
	 * resultCode 金流商返回标识
	 */
	private String resultCode;

	/**
	 * ip IP
	 */
	private String ip;

	/**
	 * menuId 菜单id
	 */
	private String menuId;

	/**
	 * itemId 商品项id
	 */
	private String itemId;

	/**
	 * activityStone 返利/赠送游戏币数量
	 */
	private Integer activityStone;

	/**
	 * packageName 包名
	 */
	private String packageName;

	/**
	 * areaTime 地区时间
	 */
	private java.util.Date areaTime;

	/**
	 * remark remark，厂商透传参数
	 */
	private String remark;

	/**
	 * efunToken efun透传参数
	 */
	private String efunToken;

	/**
	 * paymentToken 金流商透传参数
	 */
	private String paymentToken;

	/**
	 * backup 备注，截取支付详情
	 */
	private String backup;

	/**
	 * advertisingid android广告id
	 */
	private String advertisingid;

	/**
	 * deviceType 设备类型
	 */
	private String deviceType;

	/**
	 * systemVersion 手机系统版本
	 */
	private String systemVersion;

	/**
	 * mac Mac地址
	 */
	private String mac;

	/**
	 * imei 设备号
	 */
	private String imei;

	/**
	 * versionCode 游戏包版本
	 */
	private String versionCode;

	/**
	 * gameVersion 游戏版本
	 */
	private String gameVersion;

	/**
	 * idfa ios广告id
	 */
	private String idfa;

	/**
	 * cfuuid ios设备号
	 */
	private String cfuuid;

	/**
	 * androidid Android设备号
	 */
	private String androidid;

	/**
	 * efunFundAccount efun收款账号
	 */
	private String efunFundAccount;

	/**
	 * isTort 是否侵权；0（不区分侵权与非侵权），1（侵权），2（非侵权）
	 */
	private Integer isTort;

	/**
	 * str1 备用参数1,如appstore的uniqueIdentifier
	 */
	private String str1;

	/**
	 * str2 备用参数2
	 */
	private String str2;

	/**
	 * str3 备用参数3
	 */
	private String str3;

	/**
	 * str4 备用参数4
	 */
	private String str4;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getCreditId() {
		return creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public Integer getEfunLevel() {
		return efunLevel;
	}

	public void setEfunLevel(Integer efunLevel) {
		this.efunLevel = efunLevel;
	}

	public java.math.BigDecimal getGamePoint() {
		return gamePoint;
	}

	public void setGamePoint(java.math.BigDecimal gamePoint) {
		this.gamePoint = gamePoint;
	}

	public java.math.BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(java.math.BigDecimal amount) {
		this.amount = amount;
	}

	public java.math.BigDecimal getAreaAmount() {
		return areaAmount;
	}

	public void setAreaAmount(java.math.BigDecimal areaAmount) {
		this.areaAmount = areaAmount;
	}

	public java.math.BigDecimal getUsd() {
		return usd;
	}

	public void setUsd(java.math.BigDecimal usd) {
		this.usd = usd;
	}

	public Integer getStone() {
		return stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPayFrom() {
		return payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
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

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getReSend() {
		return reSend;
	}

	public void setReSend(Integer reSend) {
		this.reSend = reSend;
	}

	public Integer getIsTest() {
		return isTest;
	}

	public void setIsTest(Integer isTest) {
		this.isTest = isTest;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Integer getActivityStone() {
		return activityStone;
	}

	public void setActivityStone(Integer activityStone) {
		this.activityStone = activityStone;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public java.util.Date getAreaTime() {
		return areaTime;
	}

	public void setAreaTime(java.util.Date areaTime) {
		this.areaTime = areaTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getEfunToken() {
		return efunToken;
	}

	public void setEfunToken(String efunToken) {
		this.efunToken = efunToken;
	}

	public String getPaymentToken() {
		return paymentToken;
	}

	public void setPaymentToken(String paymentToken) {
		this.paymentToken = paymentToken;
	}

	public String getBackup() {
		return backup;
	}

	public void setBackup(String backup) {
		this.backup = backup;
	}

	public String getAdvertisingid() {
		return advertisingid;
	}

	public void setAdvertisingid(String advertisingid) {
		this.advertisingid = advertisingid;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getGameVersion() {
		return gameVersion;
	}

	public void setGameVersion(String gameVersion) {
		this.gameVersion = gameVersion;
	}

	public String getIdfa() {
		return idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getCfuuid() {
		return cfuuid;
	}

	public void setCfuuid(String cfuuid) {
		this.cfuuid = cfuuid;
	}

	public String getAndroidid() {
		return androidid;
	}

	public void setAndroidid(String androidid) {
		this.androidid = androidid;
	}

	public String getEfunFundAccount() {
		return efunFundAccount;
	}

	public void setEfunFundAccount(String efunFundAccount) {
		this.efunFundAccount = efunFundAccount;
	}

	public Integer getIsTort() {
		return isTort;
	}

	public void setIsTort(Integer isTort) {
		this.isTort = isTort;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getStr3() {
		return str3;
	}

	public void setStr3(String str3) {
		this.str3 = str3;
	}

	public String getStr4() {
		return str4;
	}

	public void setStr4(String str4) {
		this.str4 = str4;
	}

}