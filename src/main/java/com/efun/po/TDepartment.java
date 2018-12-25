package com.efun.po;

import java.util.Date;

/**
 * TDepartment entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TDepartment implements java.io.Serializable {
	private static final long serialVersionUID = 2455016910283410751L;

	// Fields

	private Integer did;
	private String departmentName;
	private String flag;
	private Date createdTime;
	private Date modifiedTime;
	private String createdBy;
	private String modifiedBy;

	// Constructors

	/** default constructor */
	public TDepartment() {
	}

	/** full constructor */
	public TDepartment(String departmentName, String flag, Date createdTime,
			Date modifiedTime, String createdBy, String modifiedBy) {
		this.departmentName = departmentName;
		this.flag = flag;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}