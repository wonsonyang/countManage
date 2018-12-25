package com.efun.po;

import java.util.Date;

/**
 * TActivityRewardSet entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TactivityRewardSet implements java.io.Serializable {
	private static final long serialVersionUID = 2417103591078270347L;

	// Fields

	private Integer id;
	private String activityCode;
	private String rewardCode;
	private String reward;
	private Float probability;
	private Integer quantity;
	private Integer minNum;
	private Integer cycle;
	private Integer status;
	private Date createdTime;
	private Integer defaultReward;
	private Integer isSerail;
	private String remark;
	private String img;
	private Integer orderno;
	private Integer storeAmount;
	private Integer lotteryType;
	private String weightFactor;
	private String relatedRewards;

	// Constructors

	/** default constructor */
	public TactivityRewardSet() {
	}

	/** full constructor */
	public TactivityRewardSet(String activityCode, String rewardCode,
			String reward, Float probability, Integer quantity, Integer minNum,
			Integer cycle, Integer status, Date createdTime,
			Integer defaultReward, Integer isSerail, String remark, String img,
			Integer orderno, Integer storeAmount, Integer lotteryType,
			String weightFactor, String relatedRewards) {
		this.activityCode = activityCode;
		this.rewardCode = rewardCode;
		this.reward = reward;
		this.probability = probability;
		this.quantity = quantity;
		this.minNum = minNum;
		this.cycle = cycle;
		this.status = status;
		this.createdTime = createdTime;
		this.defaultReward = defaultReward;
		this.isSerail = isSerail;
		this.remark = remark;
		this.img = img;
		this.orderno = orderno;
		this.storeAmount = storeAmount;
		this.lotteryType = lotteryType;
		this.weightFactor = weightFactor;
		this.relatedRewards = relatedRewards;
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

	public String getRewardCode() {
		return this.rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getReward() {
		return this.reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public Float getProbability() {
		return this.probability;
	}

	public void setProbability(Float probability) {
		this.probability = probability;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getMinNum() {
		return this.minNum;
	}

	public void setMinNum(Integer minNum) {
		this.minNum = minNum;
	}

	public Integer getCycle() {
		return this.cycle;
	}

	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getDefaultReward() {
		return this.defaultReward;
	}

	public void setDefaultReward(Integer defaultReward) {
		this.defaultReward = defaultReward;
	}

	public Integer getIsSerail() {
		return this.isSerail;
	}

	public void setIsSerail(Integer isSerail) {
		this.isSerail = isSerail;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Integer getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public Integer getStoreAmount() {
		return this.storeAmount;
	}

	public void setStoreAmount(Integer storeAmount) {
		this.storeAmount = storeAmount;
	}

	public Integer getLotteryType() {
		return this.lotteryType;
	}

	public void setLotteryType(Integer lotteryType) {
		this.lotteryType = lotteryType;
	}

	public String getWeightFactor() {
		return this.weightFactor;
	}

	public void setWeightFactor(String weightFactor) {
		this.weightFactor = weightFactor;
	}

	public String getRelatedRewards() {
		return this.relatedRewards;
	}

	public void setRelatedRewards(String relatedRewards) {
		this.relatedRewards = relatedRewards;
	}

}