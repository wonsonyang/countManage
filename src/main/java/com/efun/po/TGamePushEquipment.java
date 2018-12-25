package com.efun.po;

import java.util.Date;

/**
 * TGamePushEquipment entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePushEquipment implements java.io.Serializable {
	private static final long serialVersionUID = -5281790483850762358L;

	// Fields

	private Integer id;
	private String gameCode;
	private String versionCode;
	private String token;
	private String orgUuid;
	private String mac;
	private String imei;
	private String deviceType;
	private String packageName;
	private Date firstOpenTime;
	private Integer isTestDevice;
	private String payFrom;
	private Integer flag;
	private String remark1;

	// Constructors

	/** default constructor */
	public TGamePushEquipment() {
	}

	/** full constructor */
	public TGamePushEquipment(String gameCode, String versionCode,
			String token, String orgUuid, String mac, String imei,
			String deviceType, String packageName, Date firstOpenTime,
			Integer isTestDevice, String payFrom, Integer flag, String remark1) {
		this.gameCode = gameCode;
		this.versionCode = versionCode;
		this.token = token;
		this.orgUuid = orgUuid;
		this.mac = mac;
		this.imei = imei;
		this.deviceType = deviceType;
		this.packageName = packageName;
		this.firstOpenTime = firstOpenTime;
		this.isTestDevice = isTestDevice;
		this.payFrom = payFrom;
		this.flag = flag;
		this.remark1 = remark1;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getOrgUuid() {
		return this.orgUuid;
	}

	public void setOrgUuid(String orgUuid) {
		this.orgUuid = orgUuid;
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

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Date getFirstOpenTime() {
		return this.firstOpenTime;
	}

	public void setFirstOpenTime(Date firstOpenTime) {
		this.firstOpenTime = firstOpenTime;
	}

	public Integer getIsTestDevice() {
		return this.isTestDevice;
	}

	public void setIsTestDevice(Integer isTestDevice) {
		this.isTestDevice = isTestDevice;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

}