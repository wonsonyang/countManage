package com.efun.po;

import java.util.Date;

/**
 * TPfVipPrivilege entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TPfVipPrivilege implements java.io.Serializable {
	private static final long serialVersionUID = -6114689250257124819L;

	// Fields

	private Long id;
	private String gameCode;
	private String privilege;
	private String pcDescription;
	private String mbDescription;
	private int deleted;
	private Date createdTime;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public TPfVipPrivilege() {
	}

	public TPfVipPrivilege(Long id, String gameCode, String privilege,
			String pcDescription, String mbDescription, int deleted,
			Date createdTime, Date modifiedTime) {
		super();
		this.id = id;
		this.gameCode = gameCode;
		this.privilege = privilege;
		this.pcDescription = pcDescription;
		this.mbDescription = mbDescription;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public String getPcDescription() {
		return pcDescription;
	}

	public void setPcDescription(String pcDescription) {
		this.pcDescription = pcDescription;
	}

	public String getMbDescription() {
		return mbDescription;
	}

	public void setMbDescription(String mbDescription) {
		this.mbDescription = mbDescription;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	 

}