package com.efun.po;

import java.sql.Timestamp;

/**
 * TUserFunction entity. @author MyEclipse Persistence Tools
 */

public class TUserFunction implements java.io.Serializable {
	private static final long serialVersionUID = -4351697969221461659L;

	// Fields

	private Long functionid;
	private String name;
	private String remark;
	private String url;
	private String button;
	private Long type;
	private Long status;
	private Long roodid;
	private Timestamp createtime;
	private String createby;
	private Timestamp modifytime;
	private String modifyby;
	private Long systemid;
	private Long flag;
	private String deleted;

	// Constructors

	/** default constructor */
	public TUserFunction() {
	}

	/** full constructor */
	public TUserFunction(String name, String remark, String url, String button, Long type, Long status, Long roodid, Timestamp createtime, String createby, Timestamp modifytime, String modifyby, Long systemid, Long flag, String deleted) {
		this.name = name;
		this.remark = remark;
		this.url = url;
		this.button = button;
		this.type = type;
		this.status = status;
		this.roodid = roodid;
		this.createtime = createtime;
		this.createby = createby;
		this.modifytime = modifytime;
		this.modifyby = modifyby;
		this.systemid = systemid;
		this.flag = flag;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getFunctionid() {
		return this.functionid;
	}

	public void setFunctionid(Long functionid) {
		this.functionid = functionid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getButton() {
		return this.button;
	}

	public void setButton(String button) {
		this.button = button;
	}

	public Long getType() {
		return this.type;
	}

	public void setType(Long type) {
		this.type = type;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getRoodid() {
		return this.roodid;
	}

	public void setRoodid(Long roodid) {
		this.roodid = roodid;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getCreateby() {
		return this.createby;
	}

	public void setCreateby(String createby) {
		this.createby = createby;
	}

	public Timestamp getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Timestamp modifytime) {
		this.modifytime = modifytime;
	}

	public String getModifyby() {
		return this.modifyby;
	}

	public void setModifyby(String modifyby) {
		this.modifyby = modifyby;
	}

	public Long getSystemid() {
		return this.systemid;
	}

	public void setSystemid(Long systemid) {
		this.systemid = systemid;
	}

	public Long getFlag() {
		return this.flag;
	}

	public void setFlag(Long flag) {
		this.flag = flag;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}