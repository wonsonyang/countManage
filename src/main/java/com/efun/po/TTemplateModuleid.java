package com.efun.po;

import java.util.Date;

/**
 * TTemplateModuleid entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TTemplateModuleid implements java.io.Serializable {
	private static final long serialVersionUID = -2974161720247586266L;

	// Fields

	private Long id;
	private Long moduleid;
	private String gameCode;
	private String gameName;
	private Long flag=0L;		//1代表删除
	private Date createdTime;
	private String createdBy;

	// Constructors

	/** default constructor */
	public TTemplateModuleid() {
	}

	/** full constructor */
	public TTemplateModuleid(Long moduleid, String gameCode, String gameName,
			Long flag, Date createdTime, String createdBy) {
		this.moduleid = moduleid;
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.flag = flag;
		this.createdTime = createdTime;
		this.createdBy = createdBy;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(Long moduleid) {
		this.moduleid = moduleid;
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

	public Long getFlag() {
		return this.flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}