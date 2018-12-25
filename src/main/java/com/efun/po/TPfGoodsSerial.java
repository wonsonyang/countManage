package com.efun.po;

import java.util.Date;

/**
 * TPfGoodsSerial entity. @author MyEclipse Persistence Tools
 */

public class TPfGoodsSerial implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private String id;
	private String goodsId;
	private Long uid;
	private String phone;
	private String serial;
	private String secretCode;
	private String hasUse;
	private String isNew;
	private String gameCode;
	private String goodsType;
	private Date createdTime;
	private Date modifiedTime;
	private String platform;
	private String goodsName;

	// Constructors

	/** default constructor */
	public TPfGoodsSerial() {
	}

	/** minimal constructor */
	public TPfGoodsSerial(String id, String goodsId, String serial, Date createdTime,
			Date modifiedTime) {
		this.id = id;
		this.goodsId = goodsId;
		this.serial = serial;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfGoodsSerial(String id, String goodsId, Long uid, String phone, String serial,
			String secretCode, String hasUse, String isNew, String gameCode, String goodsType,
			Date createdTime, Date modifiedTime, String platform, String goodsName) {
		this.id = id;
		this.goodsId = goodsId;
		this.uid = uid;
		this.phone = phone;
		this.serial = serial;
		this.secretCode = secretCode;
		this.hasUse = hasUse;
		this.isNew = isNew;
		this.gameCode = gameCode;
		this.goodsType = goodsType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.platform = platform;
		this.goodsName = goodsName;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSecretCode() {
		return this.secretCode;
	}

	public void setSecretCode(String secretCode) {
		this.secretCode = secretCode;
	}

	public String getHasUse() {
		return this.hasUse;
	}

	public void setHasUse(String hasUse) {
		this.hasUse = hasUse;
	}

	public String getIsNew() {
		return this.isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
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

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}



}