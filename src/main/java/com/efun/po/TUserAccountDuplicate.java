package com.efun.po;

import java.util.Date;

/**
 * TUserAccountDuplicate entity. @author MyEclipse Persistence Tools
 */

public class TUserAccountDuplicate implements java.io.Serializable {
	private static final long serialVersionUID = -3329374182800962635L;

	// Fields

	private Integer tuadId;
	private Long uid;
	private Long userId;
	private String gameCode;
	private String accountName;
	private String deleted;
	private String createdBy;
	private String modifiedBy;
	private Date createdTime;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public TUserAccountDuplicate() {
	}

	/** full constructor */
	public TUserAccountDuplicate(Long uid, Long userId, String gameCode,
			String accountName, String deleted) {
		this.uid = uid;
		this.userId = userId;
		this.gameCode = gameCode;
		this.accountName = accountName;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getTuadId() {
		return this.tuadId;
	}

	public void setTuadId(Integer tuadId) {
		this.tuadId = tuadId;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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