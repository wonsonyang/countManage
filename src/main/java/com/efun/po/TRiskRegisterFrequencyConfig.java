package com.efun.po;

// Generated 2018-7-10 11:35:24 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * TRiskRegisterFrequencyConfig generated by hbm2java
 */
public class TRiskRegisterFrequencyConfig implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String gameCode;
	private String gameName;
	private String registerRule;
	private String ipWhiteList;
	private Date createdTime;
	private Date modifiedTime;
	private String createdUser;
	private String modifiedUser;
	private String deleted;
	private String comment;

	public TRiskRegisterFrequencyConfig() {
	}

	public TRiskRegisterFrequencyConfig(String gameCode, String registerRule, Date createdTime, Date modifiedTime,
			String createdUser, String modifiedUser, String deleted) {
		this.gameCode = gameCode;
		this.registerRule = registerRule;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdUser = createdUser;
		this.modifiedUser = modifiedUser;
		this.deleted = deleted;
	}

	public TRiskRegisterFrequencyConfig(String gameCode, String gameName, String registerRule, String ipWhiteList,
			Date createdTime, Date modifiedTime, String createdUser, String modifiedUser, String deleted,
			String comment) {
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.registerRule = registerRule;
		this.ipWhiteList = ipWhiteList;
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

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getRegisterRule() {
		return this.registerRule;
	}

	public void setRegisterRule(String registerRule) {
		this.registerRule = registerRule;
	}

	public String getIpWhiteList() {
		return this.ipWhiteList;
	}

	public void setIpWhiteList(String ipWhiteList) {
		this.ipWhiteList = ipWhiteList;
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

}
