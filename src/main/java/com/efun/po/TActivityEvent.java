package com.efun.po;

import java.io.Serializable;

/**
 *  t_activity_event
 */
public class TActivityEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 
	 */
	private Long id;

	/**
	 * scope
	 */
	private String scope;

	/**
	 * eventName
	 */
	private String eventName;

	/**
	 * deleted 是否删除 0正常、1删除
	 */
	private String deleted;

	/**
	 * createTime 记录添加时间
	 */
	private java.util.Date createTime;

	/**
	 * modifyTime 记录修改时间
	 */
	private java.util.Date modifyTime;

	/**
	 * createBy 记录添加人
	 */
	private String createBy;

	/**
	 * modifyBy 记录修改人
	 */
	private String modifyBy;

	/**
	 * activityCode
	 */
	private String activityCode;

	/**
	 * gameCode
	 */
	private String gameCode;

	/**
	 * module 模块
	 */
	private String module;

	//时差
	private String forgeRewards;

	//伪造数量
	private Integer forgeCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(java.util.Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Integer getForgeCount() {
		return forgeCount;
	}

	public void setForgeCount(Integer forgeCount) {
		this.forgeCount = forgeCount;
	}

	public String getForgeRewards() {
		return forgeRewards;
	}

	public void setForgeRewards(String forgeRewards) {
		this.forgeRewards = forgeRewards;
	}

}