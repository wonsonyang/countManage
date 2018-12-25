package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameResourceFlow entity. @author MyEclipse Persistence Tools
 */

public class TGameResourceFlow implements java.io.Serializable {
	private static final long serialVersionUID = 5420774988461613907L;

	// Fields

	private Long id;
	
	private String resourceType;
	private Long userid;
	private Float point;
	private Float freePoint;
	private String efunOrderId;
	private Integer serialNum;
	private Float amount;
	private Timestamp timeLimit;
	private String creator;
	private String auditor;
	private String batchNumber;
	private String submitStatus;
	private String auditRemark;
	private Timestamp createdTime;
	private Timestamp modifytime;
	private String flag="1";
	private String remark;
	
	
	
	// Constructors

	/** default constructor */
	public TGameResourceFlow() {
	}



	public TGameResourceFlow(Long id, String resourceType, Long userid,
			Float point, Float freePoint, String efunOrderId,
			Integer serialNum, Float amount, Timestamp timeLimit,
			String creator, String auditor, String batchNumber,
			String submitStatus, String auditRemark, Timestamp createdTime,
			Timestamp modifytime, String flag, String remark) {
		super();
		this.id = id;
		this.resourceType = resourceType;
		this.userid = userid;
		this.point = point;
		this.freePoint = freePoint;
		this.efunOrderId = efunOrderId;
		this.serialNum = serialNum;
		this.amount = amount;
		this.timeLimit = timeLimit;
		this.creator = creator;
		this.auditor = auditor;
		this.batchNumber = batchNumber;
		this.submitStatus = submitStatus;
		this.auditRemark = auditRemark;
		this.createdTime = createdTime;
		this.modifytime = modifytime;
		this.flag = flag;
		this.remark = remark;
	}















	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getResourceType() {
		return resourceType;
	}



	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}



	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Float getPoint() {
		return this.point;
	}

	public void setPoint(Float point) {
		this.point = point;
	}

	public Float getFreePoint() {
		return this.freePoint;
	}

	public void setFreePoint(Float freePoint) {
		this.freePoint = freePoint;
	}

	public Integer getSerialNum() {
		return this.serialNum;
	}

	public void setSerialNum(Integer serialNum) {
		this.serialNum = serialNum;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Timestamp getTimeLimit() {
		return this.timeLimit;
	}

	public void setTimeLimit(Timestamp timeLimit) {
		this.timeLimit = timeLimit;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getSubmitStatus() {
		return this.submitStatus;
	}

	public void setSubmitStatus(String submitStatus) {
		this.submitStatus = submitStatus;
	}

	public String getAuditRemark() {
		return this.auditRemark;
	}

	public void setAuditRemark(String auditRemark) {
		this.auditRemark = auditRemark;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}


	public String getEfunOrderId() {
		return efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}





	public String getRemark() {
		return remark;
	}





	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}