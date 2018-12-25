package com.efun.po;

import java.sql.Timestamp;

/**
 * TTasks entity. @author MyEclipse Persistence Tools
 */

public class TTasks implements java.io.Serializable {
	private static final long serialVersionUID = -3273566540937252000L;

	// Fields

	private Long id;
	private String gameCode;
	private String activityCode;
	private String specifiedservercode;
	private String flag;
	private String conditions;
	private String taskcode;
	private String rewardCode;
	private String description;
	private String methodName;
	private String roderid;
	private String rewardName;
	private String rewardNum;
	private Long parentId;
	private String taskTitle;
	private String taskUrl;
	private String deleted;
	private Timestamp createTime;

	// Constructors

	/** default constructor */
	public TTasks() {
	}

	/** minimal constructor */
	public TTasks(String flag) {
		this.flag = flag;
	}

	/** full constructor */
	public TTasks(String gameCode, String activityCode,
			String specifiedservercode, String flag, String conditions,
			String taskcode, String rewardCode, String description,
			String methodName, String roderid, String rewardName,
			String rewardNum, Long parentId, String taskTitle, String taskUrl,
			String deleted, Timestamp createTime) {
		this.gameCode = gameCode;
		this.activityCode = activityCode;
		this.specifiedservercode = specifiedservercode;
		this.flag = flag;
		this.conditions = conditions;
		this.taskcode = taskcode;
		this.rewardCode = rewardCode;
		this.description = description;
		this.methodName = methodName;
		this.roderid = roderid;
		this.rewardName = rewardName;
		this.rewardNum = rewardNum;
		this.parentId = parentId;
		this.taskTitle = taskTitle;
		this.taskUrl = taskUrl;
		this.deleted = deleted;
		this.createTime = createTime;
	}

	// Property accessors

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

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getSpecifiedservercode() {
		return this.specifiedservercode;
	}

	public void setSpecifiedservercode(String specifiedservercode) {
		this.specifiedservercode = specifiedservercode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getConditions() {
		return this.conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getTaskcode() {
		return this.taskcode;
	}

	public void setTaskcode(String taskcode) {
		this.taskcode = taskcode;
	}

	public String getRewardCode() {
		return this.rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getRoderid() {
		return this.roderid;
	}

	public void setRoderid(String roderid) {
		this.roderid = roderid;
	}

	public String getRewardName() {
		return this.rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public String getRewardNum() {
		return this.rewardNum;
	}

	public void setRewardNum(String rewardNum) {
		this.rewardNum = rewardNum;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTaskTitle() {
		return this.taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public String getTaskUrl() {
		return this.taskUrl;
	}

	public void setTaskUrl(String taskUrl) {
		this.taskUrl = taskUrl;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

}