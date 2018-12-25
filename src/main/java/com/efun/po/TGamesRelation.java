package com.efun.po;

import java.util.Date;

/**
 * TGamesRelation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamesRelation implements java.io.Serializable {
	private static final long serialVersionUID = -7596602659636996731L;

	// Fields

	private Integer id;
	private String gameCode;
	private String gameName;
	private String parentGameCode;
	private String type;
	private String deptId;
	private Date createdTime;
	private Date modifiedTime;
	private String createdBy;
	private String modifiedBy;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGamesRelation() {
	}

	/** full constructor */
	public TGamesRelation(String gameCode, String gameName,
			String parentGameCode, String type, String deptId,
			Date createdTime, Date modifiedTime, String createdBy,
			String modifiedBy, String deleted) {
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.parentGameCode = parentGameCode;
		this.type = type;
		this.deptId = deptId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getParentGameCode() {
		return this.parentGameCode;
	}

	public void setParentGameCode(String parentGameCode) {
		this.parentGameCode = parentGameCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDeptId() {
		return this.deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}