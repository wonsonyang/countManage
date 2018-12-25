package com.efun.po;

import java.util.Date;

/**
 * TActivityInvitationcode entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TActivityInvitationcode implements java.io.Serializable {
	private static final long serialVersionUID = -7372034191180331919L;

	// Fields

	private Long id;
	private String activityCode;
	private String fbId;
	private Long userId;
	private String roleId;
	private String roleName;
	private String invitationCode;
	private String serverCode;
	private String gameCode;
	private Date bindTime;
	private String email;
	private String phone;
	private String address;

	// Constructors

	/** default constructor */
	public TActivityInvitationcode() {
	}

	/** full constructor */
	public TActivityInvitationcode(String activityCode, String fbId,
			String roleName, String invitationCode, String serverCode,
			String gameCode, Date bindTime, String email, String phone,
			String address) {
		this.activityCode = activityCode;
		this.fbId = fbId;
		this.roleName = roleName;
		this.invitationCode = invitationCode;
		this.serverCode = serverCode;
		this.gameCode = gameCode;
		this.bindTime = bindTime;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getInvitationCode() {
		return this.invitationCode;
	}

	public void setInvitationCode(String invitationCode) {
		this.invitationCode = invitationCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Date getBindTime() {
		return this.bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}