package com.efun.po;

import java.util.Date;

/**
 * TPayRateConfig entity. @author MyEclipse Persistence Tools
 */

public class TPayRateConfig implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Long id;
	private long topicid;
	private Integer isVipUser;
	private Integer sendType;
	private Integer rateType;
	private Integer rateRule;
	private String gameCodes;
	private String payFlag;
	private String rateContent;
	private Date createdTime;
	private Date modifiedTime;
	private String emailTitle;
	private String emailContent;
	private String flag;
	private Integer deleted;
	private String operator;
	private String str1;
	private String str2;
	private String productId;
	private String content;

	// Constructors

	/** default constructor */
	public TPayRateConfig() {
	}

	/** minimal constructor */
	public TPayRateConfig(long topicid, Integer isVipUser, Integer sendType, Integer rateType,
			Integer rateRule, String gameCodes, String rateContent, Date createdTime,
			Date modifiedTime) {
		this.topicid = topicid;
		this.isVipUser = isVipUser;
		this.sendType = sendType;
		this.rateType = rateType;
		this.rateRule = rateRule;
		this.gameCodes = gameCodes;
		this.rateContent = rateContent;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPayRateConfig(long topicid, Integer isVipUser, Integer sendType, Integer rateType,
			Integer rateRule, String gameCodes, String payFlag, String rateContent,
			Date createdTime, Date modifiedTime, String emailTitle, String emailContent,
			String flag, Integer deleted, String operator, String str1, String str2, 
			String productId, String content) {
		this.topicid = topicid;
		this.isVipUser = isVipUser;
		this.sendType = sendType;
		this.rateType = rateType;
		this.rateRule = rateRule;
		this.gameCodes = gameCodes;
		this.payFlag = payFlag;
		this.rateContent = rateContent;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.emailTitle = emailTitle;
		this.emailContent = emailContent;
		this.flag = flag;
		this.deleted = deleted;
		this.operator = operator;
		this.str1 = str1;
		this.str2 = str2;
		this.productId = productId;
		this.content = content;
	}

	// Property accessors

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public long getTopicid() {
		return this.topicid;
	}

	public void setTopicid(long topicid) {
		this.topicid = topicid;
	}

	public Integer getIsVipUser() {
		return this.isVipUser;
	}

	public void setIsVipUser(Integer isVipUser) {
		this.isVipUser = isVipUser;
	}

	public Integer getSendType() {
		return this.sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}

	public Integer getRateType() {
		return this.rateType;
	}

	public void setRateType(Integer rateType) {
		this.rateType = rateType;
	}

	public Integer getRateRule() {
		return this.rateRule;
	}

	public void setRateRule(Integer rateRule) {
		this.rateRule = rateRule;
	}

	public String getGameCodes() {
		return this.gameCodes;
	}

	public void setGameCodes(String gameCodes) {
		this.gameCodes = gameCodes;
	}

	public String getPayFlag() {
		return this.payFlag;
	}

	public void setPayFlag(String payFlag) {
		this.payFlag = payFlag;
	}

	public String getRateContent() {
		return this.rateContent;
	}

	public void setRateContent(String rateContent) {
		this.rateContent = rateContent;
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

	public String getEmailTitle() {
		return this.emailTitle;
	}

	public void setEmailTitle(String emailTitle) {
		this.emailTitle = emailTitle;
	}

	public String getEmailContent() {
		return this.emailContent;
	}

	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getStr1() {
		return this.str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return this.str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}