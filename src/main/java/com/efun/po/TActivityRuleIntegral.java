package com.efun.po;

import java.io.Serializable;

/**
 *  t_activity_rule_integral
 */
public class TActivityRuleIntegral implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 主键
	 */
	private Long id;

	/**
	 * config 积分配置
	 */
	private String config;

	/**
	 * modifiedTime 修改时间
	 */
	private java.util.Date modifiedTime;

	/**
	 * createdTime 创建时间
	 */
	private java.util.Date createdTime;

	/**
	 * activityCode 活动代码
	 */
	private String activityCode;

	/**
	 * deleted 是否删除
	 */
	private String deleted;

	/**
	 * createBy 记录添加人
	 */
	private String createBy;

	/**
	 * modifyBy 记录修改人
	 */
	private String modifyBy;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConfig() {
		return config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
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

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

}