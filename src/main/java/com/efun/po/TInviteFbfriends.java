package com.efun.po;

import java.util.Date;

/**
 * TInviteFbfriends entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TInviteFbfriends implements java.io.Serializable {
	private static final long serialVersionUID = 2816065717265181242L;

	// Fields

	private Long id;
	private Long userid;
	private String roleid;
	private String invitefbid;
	private String friendfbid;
	private String gameCode;
	private String serverCode;
	private Date createTime;
	private String plateForm;

	// Constructors

	/** default constructor */
	public TInviteFbfriends() {
	}

	/** full constructor */
	public TInviteFbfriends(Long userid, String roleid, String invitefbid,
			String friendfbid, String gameCode, String serverCode,
			Date createTime, String plateForm) {
		this.userid = userid;
		this.roleid = roleid;
		this.invitefbid = invitefbid;
		this.friendfbid = friendfbid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.createTime = createTime;
		this.plateForm = plateForm;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getRoleid() {
		return this.roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getInvitefbid() {
		return this.invitefbid;
	}

	public void setInvitefbid(String invitefbid) {
		this.invitefbid = invitefbid;
	}

	public String getFriendfbid() {
		return this.friendfbid;
	}

	public void setFriendfbid(String friendfbid) {
		this.friendfbid = friendfbid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getPlateForm() {
		return this.plateForm;
	}

	public void setPlateForm(String plateForm) {
		this.plateForm = plateForm;
	}

}