package com.efun.po;

import java.util.Date;

/**
 * TGameMoreRatePaytype entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreRatePaytype implements java.io.Serializable {
	private static final long serialVersionUID = -5774438667642229504L;

	// Fields

	private Long id;
	private String datasource;
	private String paytype;
	private Date createdTime;
	private String deleted;
	private String operator;
	private String info;

	// Constructors

	/** default constructor */
	public TGameMoreRatePaytype() {
	}

	/** full constructor */
	public TGameMoreRatePaytype(String datasource, String paytype,
			Date createdTime, String deleted, String operator, String info
			) {
		this.datasource = datasource;
		this.paytype = paytype;
		this.createdTime = createdTime;
		this.deleted = deleted;
		this.operator = operator;
		this.info = info;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDatasource() {
		return this.datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}


}