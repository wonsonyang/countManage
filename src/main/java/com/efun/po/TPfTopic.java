package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfTopic entity. @author MyEclipse Persistence Tools
 */

public class TPfTopic implements java.io.Serializable {
	private static final long serialVersionUID = 4677458756483787858L;

	// Fields

	private Long id;
	private Timestamp createdTime;
	private Timestamp lastModifiedTime;
	private Long uid;
	private String title;
	private String content;
	private String photos;
	private String video;
	private String type;
	private String gameCode;
	private Integer deleted;
	private Integer tag;
	private String icon;
	private String userName;
	private  Integer star;
	private String email;
	private String auditStatus;
	private String typeId;

	// Constructors

	/** default constructor */
	public TPfTopic() {
	}

	/** minimal constructor */
	public TPfTopic(Timestamp createdTime, Timestamp lastModifiedTime,
			Long uid, String title, String content, Integer tag) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.tag = tag;
	}

	/** full constructor */
	public TPfTopic(Timestamp createdTime, Timestamp lastModifiedTime,
			Long uid, String title, String content, String photos,
			String video, String type, String gameCode, Integer deleted,
			Integer tag, String icon, String userName,Integer star,String email) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.uid = uid;
		this.title = title;
		this.content = content;
		this.photos = photos;
		this.video = video;
		this.type = type;
		this.gameCode = gameCode;
		this.deleted = deleted;
		this.tag = tag;
		this.icon = icon;
		this.userName = userName;
		this.star=star;
		this.email = email;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getLastModifiedTime() {
		return this.lastModifiedTime;
	}

	public void setLastModifiedTime(Timestamp lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPhotos() {
		return this.photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getTag() {
		return this.tag;
	}

	public void setTag(Integer tag) {
		this.tag = tag;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getStar() {
		return star;
	}

	public void setStar(Integer star) {
		this.star = star;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuditStatus() {
		return auditStatus;
	}

	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	public String getTypeId() {
		return typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
}