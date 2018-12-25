package com.efun.po;

import java.util.Date;

/**
 * TGameServers entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameServers implements java.io.Serializable {
	private static final long serialVersionUID = 6713411680487293426L;

	// Fields

	private Integer gsid;
	private String gameCode;
	private Integer gid;
	private String serverName;
	private String serverCode;
	private String originalServerCode;

	private Date openTime;
	private String info;
	private String loginAllow;
	private String payAllow;
	private String loginDomain;
	private String payDomain;
	private String loginKey;
	private String payKey;
	private String flag;
	private String remark;
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Integer level;
	private String packageVersion;
	private String serverPrefix;
	private String expand;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGameServers() {
	}

	public TGameServers(Integer gsid, String gameCode, Integer gid, String serverName, String serverCode,
			String originalServerCode, Date openTime, String info, String loginAllow, String payAllow,
			String loginDomain, String payDomain, String loginKey, String payKey, String flag, String remark,
			String createdBy, Date createdTime, String modifiedBy, Date modifiedTime, Integer level,
			String packageVersion, String serverPrefix, String expand, String deleted) {
		super();
		this.gsid = gsid;
		this.gameCode = gameCode;
		this.gid = gid;
		this.serverName = serverName;
		this.serverCode = serverCode;
		this.originalServerCode = originalServerCode;
		this.openTime = openTime;
		this.info = info;
		this.loginAllow = loginAllow;
		this.payAllow = payAllow;
		this.loginDomain = loginDomain;
		this.payDomain = payDomain;
		this.loginKey = loginKey;
		this.payKey = payKey;
		this.flag = flag;
		this.remark = remark;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.level = level;
		this.packageVersion = packageVersion;
		this.serverPrefix = serverPrefix;
		this.expand = expand;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getServerName() {
		return this.serverName;
	}

	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getOriginalServerCode() {
		return originalServerCode;
	}

	public void setOriginalServerCode(String originalServerCode) {
		this.originalServerCode = originalServerCode;
	}

	public Date getOpenTime() {
		return this.openTime;
	}

	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getLoginAllow() {
		return this.loginAllow;
	}

	public void setLoginAllow(String loginAllow) {
		this.loginAllow = loginAllow;
	}

	public String getPayAllow() {
		return this.payAllow;
	}

	public void setPayAllow(String payAllow) {
		this.payAllow = payAllow;
	}

	public String getLoginDomain() {
		return this.loginDomain;
	}

	public void setLoginDomain(String loginDomain) {
		this.loginDomain = loginDomain;
	}

	public String getPayDomain() {
		return this.payDomain;
	}

	public void setPayDomain(String payDomain) {
		this.payDomain = payDomain;
	}

	public String getLoginKey() {
		return this.loginKey;
	}

	public void setLoginKey(String loginKey) {
		this.loginKey = loginKey;
	}

	public String getPayKey() {
		return this.payKey;
	}

	public void setPayKey(String payKey) {
		this.payKey = payKey;
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

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getPackageVersion() {
		return this.packageVersion;
	}

	public void setPackageVersion(String packageVersion) {
		this.packageVersion = packageVersion;
	}

	public String getServerPrefix() {
		return this.serverPrefix;
	}

	public void setServerPrefix(String serverPrefix) {
		this.serverPrefix = serverPrefix;
	}

	public String getExpand() {
		return expand;
	}

	public void setExpand(String expand) {
		this.expand = expand;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}