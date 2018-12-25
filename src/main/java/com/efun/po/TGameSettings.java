package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameSettings entity. @author MyEclipse Persistence Tools
 */

public class TGameSettings implements java.io.Serializable {
	private static final long serialVersionUID = 8942211673114820971L;

	// Fields

	private Integer id;
	private String settingstype;
	private String gameCode;
	private String versionCode;
	private String mainDomain;
	private String parkedDomain;
	private String fileName;
	private String fileFormat;
	private String fileNameCn;
	private String fileDescribe;
	private String content;
	private String dataSource;
	private String createdUser;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGameSettings() {
	}

	/** full constructor */
	public TGameSettings(String settingstype, String gameCode,
			String versionCode, String mainDomain, String parkedDomain,
			String fileName, String fileFormat, String fileNameCn,
			String fileDescribe, String content, String dataSource,
			String createdUser, Timestamp createdTime, Timestamp modifiedTime,
			String deleted) {
		this.settingstype = settingstype;
		this.gameCode = gameCode;
		this.versionCode = versionCode;
		this.mainDomain = mainDomain;
		this.parkedDomain = parkedDomain;
		this.fileName = fileName;
		this.fileFormat = fileFormat;
		this.fileNameCn = fileNameCn;
		this.fileDescribe = fileDescribe;
		this.content = content;
		this.dataSource = dataSource;
		this.createdUser = createdUser;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSettingstype() {
		return this.settingstype;
	}

	public void setSettingstype(String settingstype) {
		this.settingstype = settingstype;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
	}

	public String getMainDomain() {
		return this.mainDomain;
	}

	public void setMainDomain(String mainDomain) {
		this.mainDomain = mainDomain;
	}

	public String getParkedDomain() {
		return this.parkedDomain;
	}

	public void setParkedDomain(String parkedDomain) {
		this.parkedDomain = parkedDomain;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileFormat() {
		return this.fileFormat;
	}

	public void setFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileNameCn() {
		return this.fileNameCn;
	}

	public void setFileNameCn(String fileNameCn) {
		this.fileNameCn = fileNameCn;
	}

	public String getFileDescribe() {
		return this.fileDescribe;
	}

	public void setFileDescribe(String fileDescribe) {
		this.fileDescribe = fileDescribe;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getCreatedUser() {
		return this.createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}