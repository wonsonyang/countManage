package com.efun.po;

import java.sql.Timestamp;

/**
 * TGwDomainApply entity. @author MyEclipse Persistence Tools
 */

public class TGwDomainApply implements java.io.Serializable {
	private static final long serialVersionUID = 7001385384205737188L;

	// Fields

	private Integer id;
	private String gameCode;
	private String dataSrouce;
	private String applicantEmail;
	private String auditorEmail;
	private String serverIp;
	private Timestamp createdTime;
	private Timestamp modifyTime;
	private String proposer;
	private String auditor;
	private String status;
	private String remark;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGwDomainApply() {
	}

	/** full constructor */
	public TGwDomainApply(String gameCode, String dataSrouce,
			String applicantEmail, String auditorEmail, String serverIp,
			Timestamp createdTime, Timestamp modifyTime, String proposer,
			String auditor, String status, String remark, String deleted) {
		this.gameCode = gameCode;
		this.dataSrouce = dataSrouce;
		this.applicantEmail = applicantEmail;
		this.auditorEmail = auditorEmail;
		this.serverIp = serverIp;
		this.createdTime = createdTime;
		this.modifyTime = modifyTime;
		this.proposer = proposer;
		this.auditor = auditor;
		this.status = status;
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

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getDataSrouce() {
		return this.dataSrouce;
	}

	public void setDataSrouce(String dataSrouce) {
		this.dataSrouce = dataSrouce;
	}

	public String getApplicantEmail() {
		return this.applicantEmail;
	}

	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}

	public String getAuditorEmail() {
		return this.auditorEmail;
	}

	public void setAuditorEmail(String auditorEmail) {
		this.auditorEmail = auditorEmail;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getProposer() {
		return this.proposer;
	}

	public void setProposer(String proposer) {
		this.proposer = proposer;
	}

	public String getAuditor() {
		return this.auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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