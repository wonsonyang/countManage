package com.efun.po;

import java.util.Date;

/**
 * TPfReportRecord entity. @author MyEclipse Persistence Tools
 */

public class TPfReportRecord implements java.io.Serializable {
	private static final long serialVersionUID = 1722823674155390398L;

	// Fields

	private long id;
	private Date createdTime;
	private Date lastModifiedTime;
	private long reportId;
	private long uid;
	private String type;

	// Constructors

	/** default constructor */
	public TPfReportRecord() {
	}

	/** full constructor */
	public TPfReportRecord(Date createdTime, Date lastModifiedTime,
			long reportId, long uid, String type) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.reportId = reportId;
		this.uid = uid;
		this.type = type;
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

	public long getReportId() {
		return this.reportId;
	}

	public void setReportId(long reportId) {
		this.reportId = reportId;
	}

	public long getUid() {
		return this.uid;
	}

	public void setUid(long uid) {
		this.uid = uid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}