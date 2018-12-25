package com.efun.po;

import java.util.Date;

/**
 * TGamePartners entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePartners implements java.io.Serializable {
	private static final long serialVersionUID = 5007632748045465993L;

	// Fields

	private Integer gpid;
	private String partnerName;
	private String siteCode;
	private String webUrl;
	private String gameKey;
	private String ipaddr;
	private String flag="是";
	private String remark;
	private String payKey;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public TGamePartners() {
	}

	/** full constructor */
	public TGamePartners(String partnerName, String siteCode, String webUrl,
			String gameKey, String ipaddr, String flag, String remark,
			String payKey, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime) {
		this.partnerName = partnerName;
		this.siteCode = siteCode;
		this.webUrl = webUrl;
		this.gameKey = gameKey;
		this.ipaddr = ipaddr;
		this.flag = flag;
		this.remark = remark;
		this.payKey = payKey;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getPartnerName() {
		return this.partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getGameKey() {
		return this.gameKey;
	}

	public void setGameKey(String gameKey) {
		this.gameKey = gameKey;
	}

	public String getIpaddr() {
		return this.ipaddr;
	}

	public void setIpaddr(String ipaddr) {
		this.ipaddr = ipaddr;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPayKey() {
		return this.payKey;
	}

	public void setPayKey(String payKey) {
		this.payKey = payKey;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}