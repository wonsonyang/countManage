package com.efun.po;

/**
 * TUserRight entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserRight implements java.io.Serializable {
	private static final long serialVersionUID = 1969371228241039354L;

	// Fields

	private Long id;
	private Long roleid;
	private Long functionid;
	private Long canhavefuction;
	private String deleted;

	// Constructors

	/** default constructor */
	public TUserRight() {
	}

	/** full constructor */ 
	public TUserRight(Long roleid, Long functionid, Long canhavefuction,
			String deleted) {
		this.roleid = roleid;
		this.functionid = functionid;
		this.canhavefuction = canhavefuction;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public Long getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(Long functionid) {
		this.functionid = functionid;
	}

	public Long getCanhavefuction() {
		return this.canhavefuction;
	}

	public void setCanhavefuction(Long canhavefuction) {
		this.canhavefuction = canhavefuction;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}