package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountCashflowStatistics entity. @author MyEclipse Persistence Tools
 */

public class TAccountCashflowStatistics implements java.io.Serializable {
	private static final long serialVersionUID = -4726215492523702401L;

	// Fields

	private Integer id;
	private String area;
	private String month;
	private String cashflow;
	private String parentFile;
	private String childFile;
	private String billTime;
	private String currency;
	private String header;
	private Integer imgId;
	private Timestamp createdTime;
	private String remark;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAccountCashflowStatistics() {
	}

	/** full constructor */
	public TAccountCashflowStatistics(String area, String month, String cashflow, String parentFile, String childFile, String billTime, String currency, String header, Integer imgId, Timestamp createdTime, String remark, String deleted) {
		this.area = area;
		this.month = month;
		this.cashflow = cashflow;
		this.parentFile = parentFile;
		this.childFile = childFile;
		this.billTime = billTime;
		this.currency = currency;
		this.header = header;
		this.imgId = imgId;
		this.createdTime = createdTime;
		this.remark = remark;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getCashflow() {
		return this.cashflow;
	}

	public void setCashflow(String cashflow) {
		this.cashflow = cashflow;
	}

	public String getParentFile() {
		return this.parentFile;
	}

	public void setParentFile(String parentFile) {
		this.parentFile = parentFile;
	}

	public String getChildFile() {
		return this.childFile;
	}

	public void setChildFile(String childFile) {
		this.childFile = childFile;
	}

	public String getBillTime() {
		return this.billTime;
	}

	public void setBillTime(String billTime) {
		this.billTime = billTime;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getHeader() {
		return this.header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public Integer getImgId() {
		return this.imgId;
	}

	public void setImgId(Integer imgId) {
		this.imgId = imgId;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}