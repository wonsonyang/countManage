package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountManuBillData entity. @author MyEclipse Persistence Tools
 */

public class TAccountManuBillData implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer pid;
	private String cashflow;
	private String billTime;
	private String data;
	private Timestamp createdTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAccountManuBillData() {
	}

	/** full constructor */
	public TAccountManuBillData(Integer pid, String cashflow, String billTime, String data, Timestamp createdTime, String deleted) {
		this.pid = pid;
		this.cashflow = cashflow;
		this.billTime = billTime;
		this.data = data;
		this.createdTime = createdTime;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getCashflow() {
		return this.cashflow;
	}

	public void setCashflow(String cashflow) {
		this.cashflow = cashflow;
	}

	public String getBillTime() {
		return this.billTime;
	}

	public void setBillTime(String billTime) {
		this.billTime = billTime;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}