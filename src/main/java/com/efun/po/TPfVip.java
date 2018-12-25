package com.efun.po;

import java.util.Date;

/**
 * TPfVip entity. @author MyEclipse Persistence Tools
 */

public class TPfVip implements java.io.Serializable {
	private static final long serialVersionUID = 7324830843601620762L;

	// Fields

	private String id;
	private Long uid;
	private String name;
	private String gameCode;
	private String serverCode;
	private String creditId;
	private String creditName;
	private Integer experienceValue;
	private String vipLevel;
	private Integer vipType;
	private Date trialTime;
	private String sex;
	private Date birthday;
	private String idCard;
	private String address;
	private String phoneNo;
	private String line;
	private String skype;
	private String wechat;
	private String email;
	private String importType;
	private String isAccepted;
	private String remark;
	private String deleted;
	private Date createdTime;
	private Date modifiedTime;
	private String platform;

	// Constructors

	/** default constructor */
	public TPfVip() {
	}

	/** minimal constructor */
	public TPfVip(String id, Long uid, Integer experienceValue,
			String vipLevel, Integer vipType, Date createdTime,
			Date modifiedTime, String platform) {
		this.id = id;
		this.uid = uid;
		this.experienceValue = experienceValue;
		this.vipLevel = vipLevel;
		this.vipType = vipType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.platform = platform;
	}

	/** full constructor */
	public TPfVip(String id, Long uid, String name, String gameCode,
			String serverCode, String creditId, String creditName,
			Integer experienceValue, String vipLevel, Integer vipType,
			Date trialTime, String sex, Date birthday, String idCard,
			String address, String phoneNo, String line, String skype,
			String wechat, String email, String importType, String isAccepted,
			String remark, String deleted, Date createdTime, Date modifiedTime,
			String platform) {
		this.id = id;
		this.uid = uid;
		this.name = name;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.creditId = creditId;
		this.creditName = creditName;
		this.experienceValue = experienceValue;
		this.vipLevel = vipLevel;
		this.vipType = vipType;
		this.trialTime = trialTime;
		this.sex = sex;
		this.birthday = birthday;
		this.idCard = idCard;
		this.address = address;
		this.phoneNo = phoneNo;
		this.line = line;
		this.skype = skype;
		this.wechat = wechat;
		this.email = email;
		this.importType = importType;
		this.isAccepted = isAccepted;
		this.remark = remark;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.platform = platform;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCreditName() {
		return this.creditName;
	}

	public void setCreditName(String creditName) {
		this.creditName = creditName;
	}

	public Integer getExperienceValue() {
		return this.experienceValue;
	}

	public void setExperienceValue(Integer experienceValue) {
		this.experienceValue = experienceValue;
	}

	public String getVipLevel() {
		return this.vipLevel;
	}

	public void setVipLevel(String vipLevel) {
		this.vipLevel = vipLevel;
	}

	public Integer getVipType() {
		return this.vipType;
	}

	public void setVipType(Integer vipType) {
		this.vipType = vipType;
	}

	public Date getTrialTime() {
		return this.trialTime;
	}

	public void setTrialTime(Date trialTime) {
		this.trialTime = trialTime;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return this.phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getLine() {
		return this.line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getWechat() {
		return this.wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImportType() {
		return this.importType;
	}

	public void setImportType(String importType) {
		this.importType = importType;
	}

	public String getIsAccepted() {
		return this.isAccepted;
	}

	public void setIsAccepted(String isAccepted) {
		this.isAccepted = isAccepted;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}