package com.efun.po;

import java.util.Date;

/**
 * TPfLinks entity. @author MyEclipse Persistence Tools
 */

public class TPfLinks implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String gameCode;
	private String platform;
	private String device;
	private String linkName;
	private String linkCode;
	private String auditUrl;
	private String defaultUrl;
	private String item1;
	private String item2;
	private Date createdTime;
	private Date modifiedTime;

	private short deleted;
	// Constructors

	/** default constructor */
	public TPfLinks() {
	}

	/** minimal constructor */
	public TPfLinks(String id, String gameCode, String platform, String device,
			String linkName, String linkCode, String defaultUrl,
			Date createdTime, Date modifiedTime) {
		this.id = id;
		this.gameCode = gameCode;
		this.platform = platform;
		this.device = device;
		this.linkName = linkName;
		this.linkCode = linkCode;
		this.defaultUrl = defaultUrl;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}



	// Property accessors

	

	public String getId() {
		return this.id;
	}

	public TPfLinks(String id, String gameCode, String platform, String device,
			String linkName, String linkCode, String auditUrl,
			String defaultUrl, String item1, String item2, Date createdTime,
			Date modifiedTime, short deleted) {
		super();
		this.id = id;
		this.gameCode = gameCode;
		this.platform = platform;
		this.device = device;
		this.linkName = linkName;
		this.linkCode = linkCode;
		this.auditUrl = auditUrl;
		this.defaultUrl = defaultUrl;
		this.item1 = item1;
		this.item2 = item2;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getDevice() {
		return this.device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkCode() {
		return this.linkCode;
	}

	public void setLinkCode(String linkCode) {
		this.linkCode = linkCode;
	}

	public String getAuditUrl() {
		return this.auditUrl;
	}

	public void setAuditUrl(String auditUrl) {
		this.auditUrl = auditUrl;
	}

	public String getDefaultUrl() {
		return this.defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
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

	public short getDeleted() {
		return deleted;
	}

	public void setDeleted(short deleted) {
		this.deleted = deleted;
	}

	

}