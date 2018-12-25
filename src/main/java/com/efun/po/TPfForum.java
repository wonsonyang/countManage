package com.efun.po;

import java.util.Date;

/**
 * TPfForum entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TPfForum implements java.io.Serializable {
	private static final long serialVersionUID = 564972857793826296L;

	// Fields

	private String id;
	private String pid;
	private Long uid;
	private String userName;
	private String content;
	private String gameCode;
	private String forumType;
	private String deleted;
	private String fbcmid;
	private String refUrl;
	private Date createdTime;
	private Date modifiedTime;
	private Integer audited;

	// Constructors

	/** default constructor */
	public TPfForum() {
	}

	/** minimal constructor */
	public TPfForum(String userName, String content, String gameCode,
			String forumType, Date createdTime, Date modifiedTime) {
		this.userName = userName;
		this.content = content;
		this.gameCode = gameCode;
		this.forumType = forumType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfForum(String pid, Long uid, String userName, String content,
			String gameCode, String forumType, String deleted, String fbcmid,
			String refUrl, Date createdTime, Date modifiedTime, Integer audited) {
		this.pid = pid;
		this.uid = uid;
		this.userName = userName;
		this.content = content;
		this.gameCode = gameCode;
		this.forumType = forumType;
		this.deleted = deleted;
		this.fbcmid = fbcmid;
		this.refUrl = refUrl;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.audited = audited;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPid() {
		return this.pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getForumType() {
		return this.forumType;
	}

	public void setForumType(String forumType) {
		this.forumType = forumType;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getFbcmid() {
		return this.fbcmid;
	}

	public void setFbcmid(String fbcmid) {
		this.fbcmid = fbcmid;
	}

	public String getRefUrl() {
		return this.refUrl;
	}

	public void setRefUrl(String refUrl) {
		this.refUrl = refUrl;
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

	public Integer getAudited() {
		return audited;
	}

	public void setAudited(Integer audited) {
		this.audited = audited;
	}

}