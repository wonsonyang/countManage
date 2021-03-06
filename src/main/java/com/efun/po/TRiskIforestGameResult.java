package com.efun.po;
// Generated 2018-9-26 10:46:14 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * TRiskIforestGameResult generated by hbm2java
 */
public class TRiskIforestGameResult implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long userId;
	private String userName;
	private String ip;
	private String gameCode;
	private String password;
	private String advertisingId;
	private String eid;
	private String androidId;
	private String adId;
	private String imei;
	private String mac;
	private String idfa;
	private String triggerReason;
	private Boolean banIp;
	private Boolean banAccount;
	private Boolean banDevice;
	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;
	private boolean deleted;
	private String comment;

	public TRiskIforestGameResult() {
	}

	public TRiskIforestGameResult(Date createdTime, Date modifiedTime, String createdUser, String modifiedUser,
			boolean deleted) {
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdUser = createdUser;
		this.modifiedUser = modifiedUser;
		this.deleted = deleted;
	}

	public TRiskIforestGameResult(Long userId, String userName, String ip, String gameCode, String password,
			String advertisingId, String eid, String androidId, String adId, String imei, String mac, String idfa,
			String triggerReason, Boolean banIp, Boolean banAccount, Boolean banDevice, Date createdTime,
			Date modifiedTime, String createdUser, String modifiedUser, boolean deleted, String comment) {
		this.userId = userId;
		this.userName = userName;
		this.ip = ip;
		this.gameCode = gameCode;
		this.password = password;
		this.advertisingId = advertisingId;
		this.eid = eid;
		this.androidId = androidId;
		this.adId = adId;
		this.imei = imei;
		this.mac = mac;
		this.idfa = idfa;
		this.triggerReason = triggerReason;
		this.banIp = banIp;
		this.banAccount = banAccount;
		this.banDevice = banDevice;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdUser = createdUser;
		this.modifiedUser = modifiedUser;
		this.deleted = deleted;
		this.comment = comment;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdvertisingId() {
		return this.advertisingId;
	}

	public void setAdvertisingId(String advertisingId) {
		this.advertisingId = advertisingId;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getAndroidId() {
		return this.androidId;
	}

	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}

	public String getAdId() {
		return this.adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIdfa() {
		return this.idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getTriggerReason() {
		return this.triggerReason;
	}

	public void setTriggerReason(String triggerReason) {
		this.triggerReason = triggerReason;
	}

	public Boolean getBanIp() {
		return this.banIp;
	}

	public void setBanIp(Boolean banIp) {
		this.banIp = banIp;
	}

	public Boolean getBanAccount() {
		return this.banAccount;
	}

	public void setBanAccount(Boolean banAccount) {
		this.banAccount = banAccount;
	}

	public Boolean getBanDevice() {
		return this.banDevice;
	}

	public void setBanDevice(Boolean banDevice) {
		this.banDevice = banDevice;
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

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getModifiedUser() {
		return this.modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public boolean isDeleted() {
		return this.deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
