package com.efun.po;

import java.sql.Timestamp;


/**
 * TActivityMycardGashSet entity. @author MyEclipse Persistence Tools
 */

public class TActivityMycardGashSet implements java.io.Serializable {
	private static final long serialVersionUID = 8827457637987018421L;

	// Fields

	private Long id;
	private String gameCode;
	private String activityCode;
	private String rewardCode;
	private String rewardName;
	private String rewardContent;
	private String channelName;
	private String gameName;
	private String paid;
	private String point;
	private String rewardId;
	private Timestamp startTime;
	private Timestamp endTime;
	private String remark;
	private String deleted;

	// Constructors

	/** default constructor */
	public TActivityMycardGashSet() {
	}

	/** full constructor */
	public TActivityMycardGashSet(String gameCode, String activityCode,
			String rewardCode, String rewardName, String rewardContent,
			String channelName, String gameName, String paid, String point,
			String rewardId, Timestamp startTime, Timestamp endTime,
			String remark, String deleted) {
		this.gameCode = gameCode;
		this.activityCode = activityCode;
		this.rewardCode = rewardCode;
		this.rewardName = rewardName;
		this.rewardContent = rewardContent;
		this.channelName = channelName;
		this.gameName = gameName;
		this.paid = paid;
		this.point = point;
		this.rewardId = rewardId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.remark = remark;
		this.deleted = deleted;
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

	public String getRewardCode() {
		return this.rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getRewardName() {
		return this.rewardName;
	}

	public void setRewardName(String rewardName) {
		this.rewardName = rewardName;
	}

	public String getRewardContent() {
		return this.rewardContent;
	}

	public void setRewardContent(String rewardContent) {
		this.rewardContent = rewardContent;
	}

	public String getChannelName() {
		return this.channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPoint() {
		return this.point;
	}

	public void setPoint(String point) {
		this.point = point;
	}

	public String getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(String rewardId) {
		this.rewardId = rewardId;
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

}