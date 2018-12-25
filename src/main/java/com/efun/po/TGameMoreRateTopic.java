package com.efun.po;

import java.util.Date;

/**
 * TGameMoreRateTopic entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreRateTopic implements java.io.Serializable {
	private static final long serialVersionUID = 4872008379178818671L;

	// Fields

	private Long id;
	private String title;
	private String content;
	private Date startTime;
	private Date endTime;
	private Date createdTime;
	private Date modifiedTime;
	private String testuids;
	private String gameCodes;
	private String flag;
	private String isTest;
	private String deleted;
	private String operator;
	private Integer rateType;
	private Float minAmount;
	// Constructors

	/** default constructor */
	public TGameMoreRateTopic() {
	}

	/** full constructor */
	public TGameMoreRateTopic(String title, String content, Date startTime, Date endTime,
			Date createdTime, Date modifiedTime, String testuids, String gameCodes, String flag,
			String isTest, String deleted, String operator, Integer rateType) {
		this.title = title;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.testuids = testuids;
		this.gameCodes = gameCodes;
		this.flag = flag;
		this.isTest = isTest;
		this.deleted = deleted;
		this.operator = operator;
		this.rateType = rateType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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

	public String getTestuids() {
		return this.testuids;
	}

	public void setTestuids(String testuids) {
		this.testuids = testuids;
	}

	public String getGameCodes() {
		return this.gameCodes;
	}

	public void setGameCodes(String gameCodes) {
		this.gameCodes = gameCodes;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getIsTest() {
		return this.isTest;
	}

	public void setIsTest(String isTest) {
		this.isTest = isTest;
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

	public Integer getRateType() {
		return this.rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}

	public Float getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(Float minAmount) {
		this.minAmount = minAmount;
	}
}