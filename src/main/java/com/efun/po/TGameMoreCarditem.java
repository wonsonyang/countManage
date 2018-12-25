package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameMoreCarditem entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreCarditem implements java.io.Serializable {
	private static final long serialVersionUID = 2856273325041576169L;

	// Fields

	private Integer id;
	private String gameCode;
	private String productId;
	private String productName;
	private String type;
	private String desc;
	private String isvalid;
	private String createdBy;
	private Timestamp createdTime;
	private String modifiedBy;
	private Timestamp modifiedTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGameMoreCarditem() {
	}

	/** minimal constructor */
	public TGameMoreCarditem(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TGameMoreCarditem(Integer id, String gameCode, String productId,
			String productName, String type, String desc, String isvalid,
			String createdBy, Timestamp createdTime, String modifiedBy,
			Timestamp modifiedTime, String deleted) {
		this.id = id;
		this.gameCode = gameCode;
		this.productId = productId;
		this.productName = productName;
		this.type = type;
		this.desc = desc;
		this.isvalid = isvalid;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
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

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getIsvalid() {
		return this.isvalid;
	}

	public void setIsvalid(String isvalid) {
		this.isvalid = isvalid;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
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