package com.efun.po;
// Generated 2018-7-16 16:37:48 by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * TPayProductCategory generated by hbm2java
 */
public class TPayProductCategory implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	private Long id;
	private String categoryName;
	private String categoryId;
	private String gameCode;
	private String categoryNameDisplay;
	private int orderNum;
	private Date createdTime;
	private Date modifiedTime;
	private Boolean deleted;
	private String info;

	public TPayProductCategory() {
	}

	public TPayProductCategory(String categoryName, String categoryId, String gameCode, String categoryNameDisplay,
			int orderNum) {
		this.categoryName = categoryName;
		this.categoryId = categoryId;
		this.gameCode = gameCode;
		this.categoryNameDisplay = categoryNameDisplay;
		this.orderNum = orderNum;
	}

	public TPayProductCategory(String categoryName, String categoryId, String gameCode, String categoryNameDisplay,
			int orderNum, Date createdTime, Date modifiedTime, Boolean deleted) {
		this.categoryName = categoryName;
		this.categoryId = categoryId;
		this.gameCode = gameCode;
		this.categoryNameDisplay = categoryNameDisplay;
		this.orderNum = orderNum;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getCategoryNameDisplay() {
		return this.categoryNameDisplay;
	}

	public void setCategoryNameDisplay(String categoryNameDisplay) {
		this.categoryNameDisplay = categoryNameDisplay;
	}

	public int getOrderNum() {
		return this.orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
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

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
