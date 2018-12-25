package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfMemberAward entity. @author MyEclipse Persistence Tools
 */

public class TPfMemberAward implements java.io.Serializable {
	private static final long serialVersionUID = 5942114486986889232L;

	// Fields

	private String id;
	private Long uid;
	private Double cpoints;
	private Double tpoints;
	private String awardStatus;
	private String gameCode;
	private String awardType;
	private String type;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String sourceType;

	// Constructors

	/** default constructor */
	public TPfMemberAward() {
	}

	/** minimal constructor */
	public TPfMemberAward(String id, Long uid, Timestamp createdTime, Timestamp modifiedTime) {
		this.id = id;
		this.uid = uid;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfMemberAward(String id, Long uid, Double cpoints, Double tpoints, String awardStatus,
			String gameCode, String awardType, String type, Timestamp createdTime,
			Timestamp modifiedTime, String sourceType) {
		this.id = id;
		this.uid = uid;
		this.cpoints = cpoints;
		this.tpoints = tpoints;
		this.awardStatus = awardStatus;
		this.gameCode = gameCode;
		this.awardType = awardType;
		this.type = type;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.sourceType = sourceType;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Double getCpoints() {
		return this.cpoints;
	}

	public void setCpoints(Double cpoints) {
		this.cpoints = cpoints;
	}

	public Double getTpoints() {
		return this.tpoints;
	}

	public void setTpoints(Double tpoints) {
		this.tpoints = tpoints;
	}

	public String getAwardStatus() {
		return this.awardStatus;
	}

	public void setAwardStatus(String awardStatus) {
		this.awardStatus = awardStatus;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getAwardType() {
		return this.awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

}