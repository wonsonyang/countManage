package com.efun.po;

import java.sql.Timestamp;

/**
 * TManagerFileInfo entity. @author MyEclipse Persistence Tools
 */

public class TManagerFileInfo implements java.io.Serializable {
	private static final long serialVersionUID = 127269844517180439L;

	// Fields

	private Integer id;
	private Integer pid;
	private String area;
	private String module;
	private String fileType;
	private String path;
	private String fileName;
	private Timestamp createdTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TManagerFileInfo() {
	}

	/** full constructor */
	public TManagerFileInfo(Integer pid, String area, String module, String fileType, String path, String fileName,
			Timestamp createdTime, String deleted) {
		this.pid = pid;
		this.area = area;
		this.module = module;
		this.fileType = fileType;
		this.path = path;
		this.fileName = fileName;
		this.createdTime = createdTime;
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

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getFileType() {
		return this.fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}