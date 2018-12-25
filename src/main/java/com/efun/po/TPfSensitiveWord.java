package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfSensitiveWord entity. @author MyEclipse Persistence Tools
 */

public class TPfSensitiveWord implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Long id;
	private String gameCode;
	private String platform;
	private String word;
	private String module;
	private Short deleted;
	private String creator;
	private Timestamp createdTime;
	private Timestamp modifiedTime;

	// Constructors

	/** default constructor */
	public TPfSensitiveWord() {
	}

	/** minimal constructor */
	public TPfSensitiveWord(String platform, String word, String module, Short deleted,
			Timestamp createdTime, Timestamp modifiedTime) {
		this.platform = platform;
		this.word = word;
		this.module = module;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfSensitiveWord(String gameCode, String platform, String word, String module,
			Short deleted, String creator, Timestamp createdTime, Timestamp modifiedTime) {
		this.gameCode = gameCode;
		this.platform = platform;
		this.word = word;
		this.module = module;
		this.deleted = deleted;
		this.creator = creator;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
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

	public String getWord() {
		return this.word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Short getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Short deleted) {
		this.deleted = deleted;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}