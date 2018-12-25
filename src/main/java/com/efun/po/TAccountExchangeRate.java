package com.efun.po;

import java.util.Date;

/**
 * TAccountExchangeRate entity. @author MyEclipse Persistence Tools
 */

public class TAccountExchangeRate implements java.io.Serializable {
	private static final long serialVersionUID = 228860457758265970L;

	// Fields

	private Integer id;
	private String month;
	private String gameCode;
	private String cashflow;
	private Date createdTime;
	private String srcCurrency;
	private String arithmetic;
	private String destCurrency;
	private Double rate;
	private String operator;
	private String deleted;

	//部门（韩国：kr,港台亚欧：tw或者null）
	private String department;
	// Constructors

	/** default constructor */
	public TAccountExchangeRate() {
	}

	/** full constructor */
	public TAccountExchangeRate(String month, String gameCode, String cashflow, Date createdTime, String srcCurrency, String arithmetic, String destCurrency, Double rate, String operator, String deleted) {
		this.month = month;
		this.gameCode = gameCode;
		this.cashflow = cashflow;
		this.createdTime = createdTime;
		this.srcCurrency = srcCurrency;
		this.arithmetic = arithmetic;
		this.destCurrency = destCurrency;
		this.rate = rate;
		this.operator = operator;
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

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getCashflow() {
		return this.cashflow;
	}

	public void setCashflow(String cashflow) {
		this.cashflow = cashflow;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getSrcCurrency() {
		return this.srcCurrency;
	}

	public void setSrcCurrency(String srcCurrency) {
		this.srcCurrency = srcCurrency;
	}

	public String getArithmetic() {
		return this.arithmetic;
	}

	public void setArithmetic(String arithmetic) {
		this.arithmetic = arithmetic;
	}

	public String getDestCurrency() {
		return this.destCurrency;
	}

	public void setDestCurrency(String destCurrency) {
		this.destCurrency = destCurrency;
	}

	public Double getRate() {
		return this.rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}