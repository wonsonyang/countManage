package com.efun.po;

/**
 * TGwDomain entity. @author MyEclipse Persistence Tools
 */

public class TGwDomain implements java.io.Serializable {
	private static final long serialVersionUID = 5017121489086580654L;

	// Fields

	private Integer id;
	private Integer pid;
	private String domainType;
	private String domain;
	private String localPath;
	private String serverPath;
	private String status;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGwDomain() {
	}

	/** full constructor */
	public TGwDomain(Integer pid, String domainType, String domain,
			String localPath, String serverPath, String status, String deleted) {
		this.pid = pid;
		this.domainType = domainType;
		this.domain = domain;
		this.localPath = localPath;
		this.serverPath = serverPath;
		this.status = status;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getDomainType() {
		return this.domainType;
	}

	public void setDomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocalPath() {
		return this.localPath;
	}

	public void setLocalPath(String localPath) {
		this.localPath = localPath;
	}

	public String getServerPath() {
		return this.serverPath;
	}

	public void setServerPath(String serverPath) {
		this.serverPath = serverPath;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}