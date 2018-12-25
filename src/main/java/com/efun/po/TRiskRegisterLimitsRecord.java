package com.efun.po;

// Generated 2018-7-10 11:35:24 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * TRiskRegisterLimitsRecord generated by hbm2java
 */
public class TRiskRegisterLimitsRecord implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String gameCode;
	private String limitsRule;
	private String areaName;
	private String ip;
	private String userIds;
	private Integer triggerCount;
	private String mailNotice;
	private String noticeUser;
	private String ipLimited;
	private String accountLimited;
	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;
	private String deleted;
	private String comment;

	public TRiskRegisterLimitsRecord() {
	}

	public TRiskRegisterLimitsRecord(String gameCode, String limitsRule, Date createdTime, Date modifiedTime,
			String createdUser, String modifiedUser, String deleted) {
		this.gameCode = gameCode;
		this.limitsRule = limitsRule;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdUser = createdUser;
		this.modifiedUser = modifiedUser;
		this.deleted = deleted;
	}

	public TRiskRegisterLimitsRecord(String gameCode, String limitsRule, String areaName, String ip, String userIds,
			Integer triggerCount, String mailNotice, String noticeUser, String ipLimited, String accountLimited,
			Date createdTime, Date modifiedTime, String createdUser, String modifiedUser, String deleted,
			String comment) {
		this.gameCode = gameCode;
		this.limitsRule = limitsRule;
		this.areaName = areaName;
		this.ip = ip;
		this.userIds = userIds;
		this.triggerCount = triggerCount;
		this.mailNotice = mailNotice;
		this.noticeUser = noticeUser;
		this.ipLimited = ipLimited;
		this.accountLimited = accountLimited;
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

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getLimitsRule() {
		return this.limitsRule;
	}

	public void setLimitsRule(String limitsRule) {
		this.limitsRule = limitsRule;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUserIds() {
		return this.userIds;
	}

	public void setUserIds(String userIds) {
		this.userIds = userIds;
	}

	public Integer getTriggerCount() {
		return this.triggerCount;
	}

	public void setTriggerCount(Integer triggerCount) {
		this.triggerCount = triggerCount;
	}

	public String getMailNotice() {
		return this.mailNotice;
	}

	public void setMailNotice(String mailNotice) {
		this.mailNotice = mailNotice;
	}

	public String getIpLimited() {
		return this.ipLimited;
	}

	public void setIpLimited(String ipLimited) {
		this.ipLimited = ipLimited;
	}

	public String getAccountLimited() {
		return this.accountLimited;
	}

	public void setAccountLimited(String accountLimited) {
		this.accountLimited = accountLimited;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getNoticeUser() {
		return noticeUser;
	}

	public void setNoticeUser(String noticeUser) {
		this.noticeUser = noticeUser;
	}

}