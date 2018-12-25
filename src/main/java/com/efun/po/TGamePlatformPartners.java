package com.efun.po;

/**
 * TGamePlatformPartners entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePlatformPartners implements java.io.Serializable {
	private static final long serialVersionUID = 582027580379740724L;

	// Fields

	private Integer id;
	private Integer pfid;
	private String pfCode;
	private Integer gpid;
	private String gpCode;
	private String flag;

	// Constructors

	/** default constructor */
	public TGamePlatformPartners() {
	}

	/** full constructor */
	public TGamePlatformPartners(Integer pfid, String pfCode, Integer gpid,
			String gpCode, String flag) {
		this.pfid = pfid;
		this.pfCode = pfCode;
		this.gpid = gpid;
		this.gpCode = gpCode;
		this.flag = flag;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPfid() {
		return this.pfid;
	}

	public void setPfid(Integer pfid) {
		this.pfid = pfid;
	}

	public String getPfCode() {
		return this.pfCode;
	}

	public void setPfCode(String pfCode) {
		this.pfCode = pfCode;
	}

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getGpCode() {
		return this.gpCode;
	}

	public void setGpCode(String gpCode) {
		this.gpCode = gpCode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

}