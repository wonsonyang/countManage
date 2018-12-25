package com.efun.po;

import java.io.Serializable;

/**
 *  t_activity_rule_config
 */
public class TActivityRuleConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 自增ID
	 */
	private Long id;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * activityCode 活动代码
	 */
	private String activityCode;

	/**
	 * eventCode 子活动代码
	 */
	private String eventCode;

	/**
	 * ruleConfig 活动规则
	 */
	private String ruleConfig;

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
	 * scope 配置作用域
	 */
	//private java.lang.String scope;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getRuleConfig() {
		return ruleConfig;
	}

	public void setRuleConfig(String ruleConfig) {
		this.ruleConfig = ruleConfig;
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

}