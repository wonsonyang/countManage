package com.efun.po;

import java.util.Date;

/**
 * TAtctivityJurisdiction entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TAtctivityJurisdiction implements java.io.Serializable {
	private static final long serialVersionUID = 3536325475491801425L;

	// Fields

	private Integer id;
	private String activityCode;
	private String gameCode;
	private Integer userId;
	private Integer roleId;
	private String roleName;
	private Date createTime;
	private String flag;
	private String type;
	private String email;
	private String rewardCode;
	private String serverCode;

	// Constructors

	/** default constructor */
	public TAtctivityJurisdiction() {
	}

	/** full constructor */
	public TAtctivityJurisdiction(String activityCode, String gameCode,
			Integer userId, Integer roleId, String roleName, Date createTime,
			String flag, String type, String email, String rewardCode,
			String serverCode) {
		this.activityCode = activityCode;
		this.gameCode = gameCode;
		this.userId = userId;
		this.roleId = roleId;
		this.roleName = roleName;
		this.createTime = createTime;
		this.flag = flag;
		this.type = type;
		this.email = email;
		this.rewardCode = rewardCode;
		this.serverCode = serverCode;
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

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRewardCode() {
		return this.rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

}