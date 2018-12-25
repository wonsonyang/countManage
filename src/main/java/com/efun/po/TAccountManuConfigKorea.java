package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountManuConfigKorea entity. @author MyEclipse Persistence Tools
 */

public class TAccountManuConfigKorea implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String month;
	private Integer pid;
	private String model;
	private Double divideRatio;
	private String cashflows;
	private String status;
	private Timestamp createdTime;
	private String deleted;
	private String gameCashflowFiles; // 允许合作商可见文件,中间用"-"分隔

	// Constructors

	/** default constructor */
	public TAccountManuConfigKorea() {
	}

	/** full constructor */
	public TAccountManuConfigKorea(String month, Integer pid, String model, Double divideRatio,
			String cashflows, String status, Timestamp createdTime, String deleted) {
		this.month = month;
		this.pid = pid;
		this.model = model;
		this.divideRatio = divideRatio;
		this.cashflows = cashflows;
		this.status = status;
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

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getDivideRatio() {
		return this.divideRatio;
	}

	public void setDivideRatio(Double divideRatio) {
		this.divideRatio = divideRatio;
	}

	public String getCashflows() {
		return this.cashflows;
	}

	public void setCashflows(String cashflows) {
		this.cashflows = cashflows;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getGameCashflowFiles() {
		return gameCashflowFiles;
	}

	public void setGameCashflowFiles(String gameCashflowFiles) {
		this.gameCashflowFiles = gameCashflowFiles;
	}

}