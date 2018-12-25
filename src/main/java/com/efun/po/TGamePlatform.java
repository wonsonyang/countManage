package com.efun.po;

import java.util.Date;

/**
 * TGamePlatform entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePlatform implements java.io.Serializable {
	private static final long serialVersionUID = -7171383913897449703L;

	// Fields

	private Integer pfid;
	private String platformCode;
	private String platformName;
	private String webUrl;
	private Date createTime;
	private String flag;
	private String remark;
	private String isCashFlow;

	// Constructors

	/** default constructor */
	public TGamePlatform() {
	}

	/** full constructor */
	public TGamePlatform(String platformCode, String platformName,
			String webUrl, Date createTime, String flag, String remark,
			String isCashFlow) {
		this.platformCode = platformCode;
		this.platformName = platformName;
		this.webUrl = webUrl;
		this.createTime = createTime;
		this.flag = flag;
		this.remark = remark;
		this.isCashFlow = isCashFlow;
	}

	// Property accessors

	public Integer getPfid() {
		return this.pfid;
	}

	public void setPfid(Integer pfid) {
		this.pfid = pfid;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}

	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getPlatformName() {
		return this.platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getIsCashFlow() {
		return this.isCashFlow;
	}

	public void setIsCashFlow(String isCashFlow) {
		this.isCashFlow = isCashFlow;
	}

}