package com.efun.po;

import java.util.Date;

public class TActivityAwardConfig implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String gameCode;
	private String activityCode;
	private String pid;
	private String name;
	private String deleted;
	private String parentType;
	private String sonType;
	private String rewardId;
	private String rewardCode;
	private String rewardTitle;
	private String rewardContent;
	private String probability;
	private String isLimited;
	private String num;
	private String defaultDBId;
	private String picture;
	private String remark;
	private String comment;
	private String rewardCondition;
	private String modifyPeople;
	private Date modifyTime;
	private Date startedTime;
	private Date endTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getParentType() {
		return parentType;
	}

	public void setParentType(String parentType) {
		this.parentType = parentType;
	}

	public String getSonType() {
		return sonType;
	}

	public void setSonType(String sonType) {
		this.sonType = sonType;
	}

	public String getRewardId() {
		return rewardId;
	}

	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
	}

	public String getRewardCode() {
		return rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getRewardTitle() {
		return rewardTitle;
	}

	public void setRewardTitle(String rewardTitle) {
		this.rewardTitle = rewardTitle;
	}

	public String getRewardContent() {
		return rewardContent;
	}

	public void setRewardContent(String rewardContent) {
		this.rewardContent = rewardContent;
	}

	public String getProbability() {
		return probability;
	}

	public void setProbability(String probability) {
		this.probability = probability;
	}

	public String getIsLimited() {
		return isLimited;
	}

	public void setIsLimited(String isLimited) {
		this.isLimited = isLimited;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getDefaultDBId() {
		return defaultDBId;
	}

	public void setDefaultDBId(String defaultDBId) {
		this.defaultDBId = defaultDBId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getRewardCondition() {
		return rewardCondition;
	}

	public void setRewardCondition(String rewardCondition) {
		this.rewardCondition = rewardCondition;
	}

	public String getModifyPeople() {
		return modifyPeople;
	}

	public void setModifyPeople(String modifyPeople) {
		this.modifyPeople = modifyPeople;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getStartedTime() {
		return startedTime;
	}

	public void setStartedTime(Date startedTime) {
		this.startedTime = startedTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}