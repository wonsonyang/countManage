package com.efun.po;

import java.sql.Timestamp;

/**
 * TWarningJobsSet entity. @author MyEclipse Persistence Tools
 */

public class TWarningJobsSet implements java.io.Serializable {
	private static final long serialVersionUID = 2048297934066191141L;

	// Fields

	private Integer jobsetId;
	private Integer jobId;
	private String gameCode;
	private String warnType;
	private String warnExpression;
	private String params;
	private String defaultValue;
	private String status;
	private String notifyMode;
	private String notifyAddress;
	private String title;
	private String conent;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TWarningJobsSet() {
	}

	/** full constructor */
	public TWarningJobsSet(Integer jobId, String gameCode, String warnType,
			String warnExpression, String params, String defaultValue,
			String status, String notifyMode, String notifyAddress,
			String title, String conent, Timestamp createdTime,
			Timestamp modifiedTime, String deleted) {
		this.jobId = jobId;
		this.gameCode = gameCode;
		this.warnType = warnType;
		this.warnExpression = warnExpression;
		this.params = params;
		this.defaultValue = defaultValue;
		this.status = status;
		this.notifyMode = notifyMode;
		this.notifyAddress = notifyAddress;
		this.title = title;
		this.conent = conent;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getJobsetId() {
		return this.jobsetId;
	}

	public void setJobsetId(Integer jobsetId) {
		this.jobsetId = jobsetId;
	}

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getWarnType() {
		return this.warnType;
	}

	public void setWarnType(String warnType) {
		this.warnType = warnType;
	}

	public String getWarnExpression() {
		return this.warnExpression;
	}

	public void setWarnExpression(String warnExpression) {
		this.warnExpression = warnExpression;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNotifyMode() {
		return this.notifyMode;
	}

	public void setNotifyMode(String notifyMode) {
		this.notifyMode = notifyMode;
	}

	public String getNotifyAddress() {
		return this.notifyAddress;
	}

	public void setNotifyAddress(String notifyAddress) {
		this.notifyAddress = notifyAddress;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getConent() {
		return this.conent;
	}

	public void setConent(String conent) {
		this.conent = conent;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}