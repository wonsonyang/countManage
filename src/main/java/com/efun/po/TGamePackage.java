package com.efun.po;

import java.sql.Timestamp;

/**
 * TGamePackage entity. @author MyEclipse Persistence Tools
 */

public class TGamePackage implements java.io.Serializable {
	private static final long serialVersionUID = -5673657229367820592L;

	// Fields

	private Integer gpkid;
	private String packageVersion;
	private Integer gid;
	private String gameCode;
	private String downloadUrl;
	private String remark;
	private Timestamp createdTime;
	private String createdBy;
	private Timestamp modifiedTime;
	private String modifiedBy;
	private String isforce;
	private Short isTemplate;
	private String buttonControlJson;
	private String flag;
	private String updatec;
	private String correctc;
	private String otherLoginWays;
	private Integer audited;
	private String versionName;
	private String disabled;

	// Constructors

	/** default constructor */
	public TGamePackage() {
	}

	/** minimal constructor */
	public TGamePackage(Short isTemplate) {
		this.isTemplate = isTemplate;
	}

	/** full constructor */
	public TGamePackage(String packageVersion, Integer gid, String gameCode,
			 String downloadUrl, String remark,
			Timestamp createdTime, String createdBy, Timestamp modifiedTime,
			String modifiedBy, String isforce, Short isTemplate,
			String buttonControlJson, String flag, String updatec,
			String correctc, String otherLoginWays, Integer audited,
			String versionName, String disabled) {
		this.packageVersion = packageVersion;
		this.gid = gid;
		this.gameCode = gameCode;
		this.downloadUrl = downloadUrl;
		this.remark = remark;
		this.createdTime = createdTime;
		this.createdBy = createdBy;
		this.modifiedTime = modifiedTime;
		this.modifiedBy = modifiedBy;
		this.isforce = isforce;
		this.isTemplate = isTemplate;
		this.buttonControlJson = buttonControlJson;
		this.flag = flag;
		this.updatec = updatec;
		this.correctc = correctc;
		this.otherLoginWays = otherLoginWays;
		this.audited = audited;
		this.versionName = versionName;
		this.disabled = disabled;
	}

	// Property accessors

	public Integer getGpkid() {
		return this.gpkid;
	}

	public void setGpkid(Integer gpkid) {
		this.gpkid = gpkid;
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public String getIsforce() {
		return this.isforce;
	}

	public void setIsforce(String isforce) {
		this.isforce = isforce;
	}

	public Short getIsTemplate() {
		return this.isTemplate;
	}

	public void setIsTemplate(Short isTemplate) {
		this.isTemplate = isTemplate;
	}

	public String getButtonControlJson() {
		return this.buttonControlJson;
	}

	public void setButtonControlJson(String buttonControlJson) {
		this.buttonControlJson = buttonControlJson;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUpdatec() {
		return this.updatec;
	}

	public void setUpdatec(String updatec) {
		this.updatec = updatec;
	}

	public String getCorrectc() {
		return this.correctc;
	}

	public void setCorrectc(String correctc) {
		this.correctc = correctc;
	}

	public String getOtherLoginWays() {
		return this.otherLoginWays;
	}

	public void setOtherLoginWays(String otherLoginWays) {
		this.otherLoginWays = otherLoginWays;
	}

	public Integer getAudited() {
		return this.audited;
	}

	public void setAudited(Integer audited) {
		this.audited = audited;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public String getDisabled() {
		return this.disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

}