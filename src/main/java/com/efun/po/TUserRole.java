package com.efun.po;

import java.util.Date;

/**
 * TUserRole entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserRole implements java.io.Serializable {
	private static final long serialVersionUID = 1298871575317315738L;

	// Fields

	private Long roleid;
	private String name;
	private String remark;
	private Long type;
	private Long status;
	private Date createime;
	private String createdby;
	private Date modifytime;
	private String modifyby;
	private String deleted;

	// Constructors

	/** default constructor */
	public TUserRole() {
	}

	/** minimal constructor */
	public TUserRole(Date createime, Date modifytime) {
		this.createime = createime;
		this.modifytime = modifytime;
	}

	/** full constructor */
	public TUserRole(String name, String remark, Long type, Long status,
			Date createime, String createdby, Date modifytime, String modifyby,
			String deleted) {
		this.name = name;
		this.remark = remark;
		this.type = type;
		this.status = status;
		this.createime = createime;
		this.createdby = createdby;
		this.modifytime = modifytime;
		this.modifyby = modifyby;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getRoleid() {
		return this.roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getCreateime() {
		return this.createime;
	}

	public void setCreateime(Date createime) {
		this.createime = createime;
	}

	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	public String getModifyby() {
		return this.modifyby;
	}

	public void setModifyby(String modifyby) {
		this.modifyby = modifyby;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}