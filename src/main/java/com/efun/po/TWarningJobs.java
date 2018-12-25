package com.efun.po;

import java.sql.Timestamp;

/**
 * TWarningJobs entity. @author MyEclipse Persistence Tools
 */

public class TWarningJobs implements java.io.Serializable {
	private static final long serialVersionUID = -3797123422075852288L;

	// Fields

	private Integer jobId;
	private String jobName;
	private String jobGroup;
	private String status;
	private String warnType;
	private String cronExpression;
	private String warnExpression;
	private String useParamsView;
	private String description;
	private String dataSource;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TWarningJobs() {
	}

	/** full constructor */
	public TWarningJobs(String jobName, String jobGroup, String status,
			String warnType, String cronExpression, String warnExpression,
			String useParamsView, String description, Timestamp createdTime,
			Timestamp modifiedTime, String deleted, String dataSource) {
		this.jobName = jobName;
		this.jobGroup = jobGroup;
		this.status = status;
		this.warnType = warnType;
		this.cronExpression = cronExpression;
		this.warnExpression = warnExpression;
		this.useParamsView = useParamsView;
		this.description = description;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
		this.dataSource = dataSource;
	}

	// Property accessors

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWarnType() {
		return this.warnType;
	}

	public void setWarnType(String warnType) {
		this.warnType = warnType;
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getWarnExpression() {
		return this.warnExpression;
	}

	public void setWarnExpression(String warnExpression) {
		this.warnExpression = warnExpression;
	}

	public String getUseParamsView() {
		return this.useParamsView;
	}

	public void setUseParamsView(String useParamsView) {
		this.useParamsView = useParamsView;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

}