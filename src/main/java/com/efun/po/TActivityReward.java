package com.efun.po;

import java.util.Date;

/**
 * TActivityReward entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TActivityReward implements java.io.Serializable {
	private static final long serialVersionUID = -254966387921312600L;

	// Fields

	private Integer id;
	private String activityCode;
	private String fbId;
	private Long userid;
	private Integer rewardId;
	private String reward;
	private Date rewardTime;
	private String serial;
	private Integer isReceive;
	private Date receiveTime;
	private String serverCode;
	private String serverName;
	private String gameCode;
	private String rewardCode;

	// Constructors

	/** default constructor */
	public TActivityReward() {
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getFbId() {
		return this.fbId;
	}

	public void setFbId(String fbId) {
		this.fbId = fbId;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getRewardId() {
		return this.rewardId;
	}

	public void setRewardId(Integer rewardId) {
		this.rewardId = rewardId;
	}

	public String getReward() {
		return this.reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Date getRewardTime() {
		return this.rewardTime;
	}

	public void setRewardTime(Date rewardTime) {
		this.rewardTime = rewardTime;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public Integer getIsReceive() {
		return this.isReceive;
	}

	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}

	public Date getReceiveTime() {
		return this.receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getRewardCode() {
		return rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}
}