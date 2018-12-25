package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfClause entity. @author MyEclipse Persistence Tools
 */

public class TPfClause implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String content;
	private String gameCode;
	private Integer clauseType;
	private String htmlpathurl;
	private String createUser;
	private Timestamp createTime;
	private Timestamp modifiedTime;
	private Integer deleted;
	private String dataSource;
	private String title;
	// Constructors

	/** default constructor */
	public TPfClause() {
	}

	/** full constructor */
	public TPfClause(String content, String gameCode, Integer clauseType, String htmlpathurl,
			String createUser, Timestamp createTime, Timestamp modifiedTime, Integer deleted) {
		this.content = content;
		this.gameCode = gameCode;
		this.clauseType = clauseType;
		this.htmlpathurl = htmlpathurl;
		this.createUser = createUser;
		this.createTime = createTime;
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getClauseType() {
		return this.clauseType;
	}

	public void setClauseType(Integer clauseType) {
		this.clauseType = clauseType;
	}

	public String getHtmlpathurl() {
		return htmlpathurl;
	}

	public void setHtmlpathurl(String htmlpathurl) {
		this.htmlpathurl = htmlpathurl;
	}

	public String getCreateUser() {
		return this.createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}