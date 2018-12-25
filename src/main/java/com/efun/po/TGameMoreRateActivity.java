package com.efun.po;

import java.util.Date;

/**
 * TGameMoreRateActivity entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreRateActivity implements java.io.Serializable {
	private static final long serialVersionUID = 7930620225715122680L;

	// Fields

	private Long id;
	private long topicid;
	private String gameCode;
	private double rate;
	private Date createdTime;
	private Date modifiedTime;
	private String ratetype;
	private String raterule;
	private String paytype;
	private String flag;
	
	private String deleted;
	private String operator;
	private String rateCategory;

	// Constructors

	/** default constructor */
	public TGameMoreRateActivity() {
	}

	/** full constructor */
	public TGameMoreRateActivity(long topicid, String gameCode, double rate,
			Date createdTime, Date modifiedTime, String ratetype,
			String raterule, String paytype, String flag,
			String deleted, String operator,String rateCategory) {
		this.topicid = topicid;
		this.gameCode = gameCode;
		this.rate = rate;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.ratetype = ratetype;
		this.raterule = raterule;
		this.paytype = paytype;
		this.flag = flag;
		this.deleted = deleted;
		this.operator = operator;
		this.rateCategory=rateCategory;
	}

	// Property accessors

	

	public long getTopicid() {
		return this.topicid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTopicid(long topicid) {
		this.topicid = topicid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public double getRate() {
		return this.rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
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

	public String getRatetype() {
		return this.ratetype;
	}

	public void setRatetype(String ratetype) {
		this.ratetype = ratetype;
	}

	public String getRaterule() {
		return this.raterule;
	}

	public void setRaterule(String raterule) {
		this.raterule = raterule;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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

	public String getRateCategory() {
		return rateCategory;
	}

	public void setRateCategory(String rateCategory) {
		this.rateCategory = rateCategory;
	}
	
}