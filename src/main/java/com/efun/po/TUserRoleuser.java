package com.efun.po;

/**
 * TUserRoleuser entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserRoleuser implements java.io.Serializable {
	private static final long serialVersionUID = 9092341439420954165L;

	// Fields

	private Long id;
	private Long userid;
	private Long roleid;
	private String deleted;

	// Constructors

	/** default constructor */
	public TUserRoleuser() {
	}

	/** full constructor */
	public TUserRoleuser(Long userid, Long roleid, String deleted) {
		this.userid = userid;
		this.roleid = roleid;
		this.deleted = deleted;
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

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}