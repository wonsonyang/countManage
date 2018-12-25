package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountCashflowStatistics entity. @author MyEclipse Persistence Tools
 */

public class TIpInfo implements java.io.Serializable {
	private static final long serialVersionUID = -4726215492523702133L;

	// Fields

	private Integer id;
	private Integer companyId;
	private String ipAddr;
	private String email;
	private Timestamp createdTime;
	private Timestamp lastViewTime;
	private Integer isDeleted;

	public TIpInfo() {}

	public TIpInfo(Integer id, Integer companyId, String ipAddr, String email, Timestamp createdTime, Timestamp lastViewTime, Integer isDeleted) {
		this.id = id;
		this.companyId = companyId;
		this.ipAddr = ipAddr;
		this.email = email;
		this.createdTime = createdTime;
		this.lastViewTime = lastViewTime;
		this.isDeleted = isDeleted;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getLastViewTime() {
		return lastViewTime;
	}

	public void setLastViewTime(Timestamp lastViewTime) {
		this.lastViewTime = lastViewTime;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}