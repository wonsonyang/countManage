package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountCashflowStatistics entity. @author MyEclipse Persistence Tools
 */

public class TCompanyInfo implements java.io.Serializable {
	private static final long serialVersionUID = -4726215492523702333L;

	public static final int TYPE_MEDIA = 1;
	public static final int TYPE_ORIGINAL = 2;
	public static final int TYPE_ADVERTISER = 3;
	public static final int TYPE_EFUN = 4;

	// Fields

	private Integer id;
	private String companyName;
	private Integer companyType;
	private Timestamp createdTime;
	private Integer isDeleted;

	public TCompanyInfo() {}

	public TCompanyInfo(Integer id, String companyName, Integer companyType, Timestamp createdTime, Integer isDeleted) {
		this.id = id;
		this.companyName = companyName;
		this.companyType = companyType;
		this.createdTime = createdTime;
		this.isDeleted = isDeleted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getCompanyType() {
		return companyType;
	}

	public void setCompanyType(Integer companyType) {
		this.companyType = companyType;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}