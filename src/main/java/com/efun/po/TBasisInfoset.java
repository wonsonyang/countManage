package com.efun.po;

import java.util.Date;

/**
 * TBasisInfoset entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TBasisInfoset implements java.io.Serializable {
	private static final long serialVersionUID = 3591682254154340576L;

	// Fields

	private Integer id;
	private String code;
	private String gameCode;
	private String flag;
	private String status;
	private Date createdTime;
	private String remark;
	private String item1;
	private String version;
	private String telOperator;
	private String isByLoginTimes;
	private Integer loginTimes;
	private String isByOnlineTime;
	private Integer onlineTime;
	private String isByStore;
	private Integer storeTimes;
	private Integer roleLevel;
	private Integer roleLevelabs;
	private String isByRoleLevel;
	private String isByTelOperator;
	private String payFrom;
	private String isByPayFrom;
	private String isOpenStat;
	private Date lastUpdateTime;
	private String fullHidden;
	private String forbiddenArea;
	private String osVersion;
	private String isByOsVersion;

	// Constructors

	/** default constructor */
	public TBasisInfoset() {
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getTelOperator() {
		return this.telOperator;
	}

	public void setTelOperator(String telOperator) {
		this.telOperator = telOperator;
	}

	public String getIsByLoginTimes() {
		return this.isByLoginTimes;
	}

	public void setIsByLoginTimes(String isByLoginTimes) {
		this.isByLoginTimes = isByLoginTimes;
	}

	public Integer getLoginTimes() {
		return this.loginTimes;
	}

	public void setLoginTimes(Integer loginTimes) {
		this.loginTimes = loginTimes;
	}

	public String getIsByOnlineTime() {
		return this.isByOnlineTime;
	}

	public void setIsByOnlineTime(String isByOnlineTime) {
		this.isByOnlineTime = isByOnlineTime;
	}

	public Integer getOnlineTime() {
		return this.onlineTime;
	}

	public void setOnlineTime(Integer onlineTime) {
		this.onlineTime = onlineTime;
	}

	public String getIsByStore() {
		return this.isByStore;
	}

	public void setIsByStore(String isByStore) {
		this.isByStore = isByStore;
	}

	public Integer getStoreTimes() {
		return this.storeTimes;
	}

	public void setStoreTimes(Integer storeTimes) {
		this.storeTimes = storeTimes;
	}

	public Integer getRoleLevel() {
		return this.roleLevel;
	}

	public void setRoleLevel(Integer roleLevel) {
		this.roleLevel = roleLevel;
	}

	public Integer getRoleLevelabs() {
		return this.roleLevelabs;
	}

	public void setRoleLevelabs(Integer roleLevelabs) {
		this.roleLevelabs = roleLevelabs;
	}

	public String getIsByRoleLevel() {
		return this.isByRoleLevel;
	}

	public void setIsByRoleLevel(String isByRoleLevel) {
		this.isByRoleLevel = isByRoleLevel;
	}

	public String getIsByTelOperator() {
		return this.isByTelOperator;
	}

	public void setIsByTelOperator(String isByTelOperator) {
		this.isByTelOperator = isByTelOperator;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getIsByPayFrom() {
		return this.isByPayFrom;
	}

	public void setIsByPayFrom(String isByPayFrom) {
		this.isByPayFrom = isByPayFrom;
	}

	public String getIsOpenStat() {
		return this.isOpenStat;
	}

	public void setIsOpenStat(String isOpenStat) {
		this.isOpenStat = isOpenStat;
	}

	public Date getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public String getFullHidden() {
		return fullHidden;
	}

	public void setFullHidden(String fullHidden) {
		this.fullHidden = fullHidden;
	}

	public String getForbiddenArea() {
		return forbiddenArea;
	}

	public void setForbiddenArea(String forbiddenArea) {
		this.forbiddenArea = forbiddenArea;
	}

	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public String getIsByOsVersion() {
		return isByOsVersion;
	}

	public void setIsByOsVersion(String isByOsVersion) {
		this.isByOsVersion = isByOsVersion;
	}
}