package com.efun.po;

import java.util.Date;

/**
 * TPfReport entity. @author MyEclipse Persistence Tools
 */

public class TPfReport implements java.io.Serializable {
	private static final long serialVersionUID = 1300662185639818466L;

	// Fields

	private long id;
	private Date createdTime;
	private Date lastModifiedTime;
	private String module;
	private long parentId;
	private int status;

	// Constructors

	/** default constructor */
	public TPfReport() {
	}

	/** minimal constructor */
	public TPfReport(Date createdTime, Date lastModifiedTime, String module,
			long parentId) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.module = module;
		this.parentId = parentId;
	}

	/** full constructor */
	public TPfReport(Date createdTime, Date lastModifiedTime, String module,
			long parentId, int status) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.module = module;
		this.parentId = parentId;
		this.status = status;
	}

	// Property accessors

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public long getParentId() {
		return this.parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}