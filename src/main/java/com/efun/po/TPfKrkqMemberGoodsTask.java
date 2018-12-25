package com.efun.po;
// Generated 2018-9-13 15:25:20 by Hibernate Tools 5.2.3.Final

import java.sql.Timestamp;

/**
 * TPfKrkqMemberGoodsTask generated by hbm2java
 */
public class TPfKrkqMemberGoodsTask implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String gameCode;
	private String taskName;
	private String isTestData;
	private Timestamp createTime;
	private String deleted;
	private Timestamp activityStartTime;
	private Timestamp activityEndTime;
	private Integer orderNo;
	private Long goodsAutoIncrId;

	public TPfKrkqMemberGoodsTask() {
	}

	public TPfKrkqMemberGoodsTask(String gameCode, String taskName, String isTestData, Timestamp createTime, String deleted,
			Timestamp activityStartTime, Timestamp activityEndTime, Integer orderNo, Long goodsAutoIncrId) {
		this.gameCode = gameCode;
		this.taskName = taskName;
		this.isTestData = isTestData;
		this.createTime = createTime;
		this.deleted = deleted;
		this.activityStartTime = activityStartTime;
		this.activityEndTime = activityEndTime;
		this.orderNo = orderNo;
		this.goodsAutoIncrId = goodsAutoIncrId;
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

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getIsTestData() {
		return this.isTestData;
	}

	public void setIsTestData(String isTestData) {
		this.isTestData = isTestData;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Timestamp getActivityStartTime() {
		return this.activityStartTime;
	}

	public void setActivityStartTime(Timestamp activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	public Timestamp getActivityEndTime() {
		return this.activityEndTime;
	}

	public void setActivityEndTime(Timestamp activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public Integer getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public Long getGoodsAutoIncrId() {
		return this.goodsAutoIncrId;
	}

	public void setGoodsAutoIncrId(Long goodsAutoIncrId) {
		this.goodsAutoIncrId = goodsAutoIncrId;
	}

}
