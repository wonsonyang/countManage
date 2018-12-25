package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfComment entity. @author MyEclipse Persistence Tools
 */

public class TPfComment implements java.io.Serializable {
	private static final long serialVersionUID = -3097421267148998622L;

	// Fields

	private String id;
	private Timestamp createdTime;
	private Timestamp lastModifiedTime;
	private String module;
	private Long parentId;
	private Long uid;
	private String content;
	private Integer deleted;
	private Integer commentOrder;
	private String targetUid;

	// Constructors

	/** default constructor */
	public TPfComment() {
	}

	/** minimal constructor */
	public TPfComment(Timestamp createdTime, Timestamp lastModifiedTime,
			Long parentId, String content, Integer deleted) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.parentId = parentId;
		this.content = content;
		this.deleted = deleted;
	}

	/** full constructor */
	public TPfComment(Timestamp createdTime, Timestamp lastModifiedTime,
			String module, Long parentId, Long uid, String content,
			Integer deleted,Integer commentOrder,String targetUid) {
		this.createdTime = createdTime;
		this.lastModifiedTime = lastModifiedTime;
		this.module = module;
		this.parentId = parentId;
		this.uid = uid;
		this.content = content;
		this.deleted = deleted;
		this.commentOrder=commentOrder;
		this.targetUid=targetUid;
	}

	// Property accessors

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Long getParentId() {
		return this.parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getCommentOrder() {
		return commentOrder;
	}

	public void setCommentOrder(Integer commentOrder) {
		this.commentOrder = commentOrder;
	}

	public String getTargetUid() {
		return targetUid;
	}

	public void setTargetUid(String targetUid) {
		this.targetUid = targetUid;
	}

	
	
}