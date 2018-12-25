package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountManuBill entity. @author MyEclipse Persistence Tools
 */

public class TAccountManuBill implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String month;
	private String title;
	private String gameCode;
	private String companyName;
	private String manuName;
	private String gameName;
	private String model;
	private Timestamp createdTime;
	private String billType;
	private String remark;
	private String advancePayment;
	private String deleted;
	private Integer status;
	private Integer snkId;

	// Constructors

	/** default constructor */
	public TAccountManuBill() {
	}

	/** full constructor */
	public TAccountManuBill(String month, String title, String gameCode, String companyName, String manuName, String gameName, String model, Timestamp createdTime, String billType, String remark, String advancePayment, String deleted) {
		this.month = month;
		this.title = title;
		this.gameCode = gameCode;
		this.companyName = companyName;
		this.manuName = manuName;
		this.gameName = gameName;
		this.model = model;
		this.createdTime = createdTime;
		this.billType = billType;
		this.remark = remark;
		this.advancePayment = advancePayment;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getManuName() {
		return this.manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getBillType() {
		return this.billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAdvancePayment() {
		return this.advancePayment;
	}

	public void setAdvancePayment(String advancePayment) {
		this.advancePayment = advancePayment;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSnkId() {
		return snkId;
	}

	public void setSnkId(Integer snkId) {
		this.snkId = snkId;
	}
}