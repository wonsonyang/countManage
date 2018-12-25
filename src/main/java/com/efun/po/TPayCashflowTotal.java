package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 金流储值总表结构	t_pay_cashflow_total
 * Created by peterpeng on 2017/12/25.
 */
public class TPayCashflowTotal implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;                  //主键id

	private Long userId;            //efun用户id

	private String gameCode;          //游戏编码

	private String serverCode;        //游戏服编码

	private String creditId;          //玩家角色id

	private Integer efunLevel;       //玩家角色等级

	private Double gamePoint;        //支付点卡点数，仅限点卡支付使用

	private Double amount;           //定价面额数值

	private Double areaAmount;       //地区金额，比如港台地址台币金额，韩国地址韩币金额

	private Double usd;              //美金金额

	private Integer stone;           //游戏币数量

	private String currency;         //定价币种

	private String flag;             //金流类型，如果没有子类型的可直接填定大类标识，如PAYPAL；有子类则写子类标识，如MyCard有WEBATM则填写WEBATM

	private String paid;             //子金流类型，可空，如MyCard的WEBATM有子类则填写子类标识，如BNK80801

	private String payFrom;          //储值来源，比如efun，vip

	private String payType;          //支付来源类型，主要区别各平台来源

	private String productId;        //商品项id/月卡

	private String payStatus;        //支付状态

	private String efunOrderId;      //efun订单号

	private String transactionId;    //金流商订单号

	private Integer deleted;         //删除标识

	private Date createdTime;        //创建时间

	private Date modifiedTime;       //修改时间

	private String country;          //国家代号

	private Integer reSend;          //补发标识；0（正常），1（手工补发）；2（自动补发）；3（客户端补发）

	private Integer isTest;          //是否测试；0（正常），1（测试账号，真钱支付），2（测试，非真钱），3（模拟数据测试）

	private String resultCode;       //金流商返回标识

	private String ip;               //ip

	private String menuId;           //菜单id

	private String itemId;           //商品项id

	private Integer activityStone;   //返利/赠送游戏币数量

	private String packageName;      //包名

	private Date areaTime;           //地区时间

	private String remark;           //remark，厂商透传参数

	private String efunToken;        //efun透传参数

	private String paymentToken;     //金流商透传参数

	private String backup;           //备注，截取支付详情

	private String advertisingid;    //android广告id

	private String deviceType;        //设备类型

	private String systemVersion;     //手机系统版本

	private String mac;               //Mac地址

	private String imei;              //设备号

	private String versionCode;       //游戏包版本

	private String gameVersion;       //游戏版本

	private String idfa;              //ios广告id

	private String cfuuid;            //ios设备号

	private String androidid;         //Android设备号

	private String efunFundAccount;   //efun收款账号

	private Integer isTort;           //是否侵权；0（不区分侵权与非侵权），1（侵权），2（非侵权）

	private String str1;  			  //备用参数1,如appstore的uniqueIdentifier

	private String str2; 			  //备用参数2

	private String str3;              //备用参数3

	private String str4;              //备用参数4

	private Double receivedAmount;    //实际收款数值

	private String receiveCurrency;   //实际收款币种

	private Date refundTime;          //退款时间

	private String accountName;       //账号名称

	private String accountState;      //账号状态,0：被封；1：解封

	private String handleCause;       //封号原因

	public TPayCashflowTotal() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
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

	public Double getGamePoint() {
		return gamePoint;
	}

	public void setGamePoint(Double gamePoint) {
		this.gamePoint = gamePoint;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAreaAmount() {
		return areaAmount;
	}

	public void setAreaAmount(Double areaAmount) {
		this.areaAmount = areaAmount;
	}

	public Double getUsd() {
		return usd;
	}

	public void setUsd(Double usd) {
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

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
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

	public Date getAreaTime() {
		return areaTime;
	}

	public void setAreaTime(Date areaTime) {
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

	public Double getReceivedAmount() {
		return receivedAmount;
	}

	public void setReceivedAmount(Double receivedAmount) {
		this.receivedAmount = receivedAmount;
	}

	public String getReceiveCurrency() {
		return receiveCurrency;
	}

	public void setReceiveCurrency(String receiveCurrency) {
		this.receiveCurrency = receiveCurrency;
	}

	public Date getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Date refundTime) {
		this.refundTime = refundTime;
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

	public String getHandleCause() {
		return handleCause;
	}

	public void setHandleCause(String handleCause) {
		this.handleCause = handleCause;
	}

	@Override
	public String toString() {
		return "TPayCashflowTotal{" +
				"id=" + id +
				", userId=" + userId +
				", gameCode='" + gameCode + '\'' +
				", serverCode='" + serverCode + '\'' +
				", creditId='" + creditId + '\'' +
				", efunLevel=" + efunLevel +
				", gamePoint=" + gamePoint +
				", amount=" + amount +
				", areaAmount=" + areaAmount +
				", usd=" + usd +
				", stone=" + stone +
				", currency='" + currency + '\'' +
				", flag='" + flag + '\'' +
				", paid='" + paid + '\'' +
				", payFrom='" + payFrom + '\'' +
				", payType='" + payType + '\'' +
				", productId='" + productId + '\'' +
				", payStatus='" + payStatus + '\'' +
				", efunOrderId='" + efunOrderId + '\'' +
				", transactionId='" + transactionId + '\'' +
				", deleted=" + deleted +
				", createdTime=" + createdTime +
				", modifiedTime=" + modifiedTime +
				", country='" + country + '\'' +
				", reSend=" + reSend +
				", isTest=" + isTest +
				", resultCode='" + resultCode + '\'' +
				", ip='" + ip + '\'' +
				", menuId='" + menuId + '\'' +
				", itemId='" + itemId + '\'' +
				", activityStone=" + activityStone +
				", packageName='" + packageName + '\'' +
				", areaTime=" + areaTime +
				", remark='" + remark + '\'' +
				", efunToken='" + efunToken + '\'' +
				", paymentToken='" + paymentToken + '\'' +
				", backup='" + backup + '\'' +
				", advertisingid='" + advertisingid + '\'' +
				", deviceType='" + deviceType + '\'' +
				", systemVersion='" + systemVersion + '\'' +
				", mac='" + mac + '\'' +
				", imei='" + imei + '\'' +
				", versionCode='" + versionCode + '\'' +
				", gameVersion='" + gameVersion + '\'' +
				", idfa='" + idfa + '\'' +
				", cfuuid='" + cfuuid + '\'' +
				", androidid='" + androidid + '\'' +
				", efunFundAccount='" + efunFundAccount + '\'' +
				", isTort=" + isTort +
				", str1='" + str1 + '\'' +
				", str2='" + str2 + '\'' +
				", str3='" + str3 + '\'' +
				", str4='" + str4 + '\'' +
				", receivedAmount=" + receivedAmount +
				", receiveCurrency='" + receiveCurrency + '\'' +
				", refundTime=" + refundTime +
				'}';
	}
}
