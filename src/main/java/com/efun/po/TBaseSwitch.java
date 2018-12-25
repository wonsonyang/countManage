package com.efun.po;

import java.sql.Timestamp;

/**
 * TBaseSwitch entity. @author MyEclipse Persistence Tools
 */

public class TBaseSwitch implements java.io.Serializable {
	private static final long serialVersionUID = -7135842667465759401L;

	// Fields

	private Integer id;
	private String gameCode;
	private String typeName;
	private String language;
	private Timestamp startTime;
	private Timestamp endTime;
	private String activityCode;
	private String regionCode;
	private String version;
	private String appPlatform;
	private String packageName;
	private String whiteListIp;
	private String data;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String modifiedBy;
	private String deleted;
	private String extendDababase;

	// Constructors

	/** default constructor */
	public TBaseSwitch() {
	}

	/** full constructor */
	public TBaseSwitch(String gameCode, String typeName, String language,
			Timestamp startTime, Timestamp endTime, String activityCode,
			String regionCode, String version, String appPlatform,
			String packageName, String whiteListIp, String data,
			Timestamp createdTime, Timestamp modifiedTime, String modifiedBy,
			String deleted) {
		this.gameCode = gameCode;
		this.typeName = typeName;
		this.language = language;
		this.startTime = startTime;
		this.endTime = endTime;
		this.activityCode = activityCode;
		this.regionCode = regionCode;
		this.version = version;
		this.appPlatform = appPlatform;
		this.packageName = packageName;
		this.whiteListIp = whiteListIp;
		this.data = data;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.modifiedBy = modifiedBy;
		this.deleted = deleted;
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

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getRegionCode() {
		return this.regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getAppPlatform() {
		return this.appPlatform;
	}

	public void setAppPlatform(String appPlatform) {
		this.appPlatform = appPlatform;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getWhiteListIp() {
		return this.whiteListIp;
	}

	public void setWhiteListIp(String whiteListIp) {
		this.whiteListIp = whiteListIp;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
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

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getExtendDababase() {
		return extendDababase;
	}

	public void setExtendDababase(String extendDababase) {
		this.extendDababase = extendDababase;
	}

}