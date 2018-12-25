package com.efun.po;

import java.sql.Timestamp;

/**
 * TActivityIntegral entity. @author MyEclipse Persistence Tools
 */

public class TActivityIntegral implements java.io.Serializable {
	private static final long serialVersionUID = 2669253257701023736L;

	// Fields

	private Integer id;
	private String activityCode;
	private String gameCode;
	private String fbId;
	private Long userid;
	private String serverCode;
	private String serverName;
	private String roleId;
	private String roleName;
	private String source;
	private String calcIntegral;
	private String type;
	private String result;
	private String team;
	private Integer playNum;
	private Integer integral;
	private String status;
	private String updateStatus;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private String remark;
	private String content;

	// Constructors

	/** default constructor */
	public TActivityIntegral() {
	}

	/** full constructor */
	public TActivityIntegral(String activityCode, String gameCode, String fbId,
			Long userid, String serverCode, String serverName, String roleId,
			String roleName, String source, String calcIntegral, String type,
			String result, String team, Integer playNum, Integer integral,
			String status, String updateStatus, Timestamp createTime,
			Timestamp modifyTime, String remark) {
		this.activityCode = activityCode;
		this.gameCode = gameCode;
		this.fbId = fbId;
		this.userid = userid;
		this.serverCode = serverCode;
		this.serverName = serverName;
		this.roleId = roleId;
		this.roleName = roleName;
		this.source = source;
		this.calcIntegral = calcIntegral;
		this.type = type;
		this.result = result;
		this.team = team;
		this.playNum = playNum;
		this.integral = integral;
		this.status = status;
		this.updateStatus = updateStatus;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.remark = remark;
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

	public String getFbId() {
		return this.fbId;
	}

	public void setFbId(String fbId) {
		this.fbId = fbId;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
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

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCalcIntegral() {
		return this.calcIntegral;
	}

	public void setCalcIntegral(String calcIntegral) {
		this.calcIntegral = calcIntegral;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTeam() {
		return this.team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getPlayNum() {
		return this.playNum;
	}

	public void setPlayNum(Integer playNum) {
		this.playNum = playNum;
	}

	public Integer getIntegral() {
		return this.integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}