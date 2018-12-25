package com.efun.po;

import java.sql.Timestamp;

/**
 * TBasisType entity. @author MyEclipse Persistence Tools
 */

public class TBasisType implements java.io.Serializable {
	private static final long serialVersionUID = -7972711713690319821L;

	// Fields

	private Integer id;
	private String code;
	private String name;
	private String type;
	private String dataSource;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private String modifyBy;
	private String isControl;
	private String isOnline;
	private Integer sequence;
	private String remark;
	private String flag;
	private String deleted;

	// Constructors

	/** default constructor */
	public TBasisType() {
	}

	/** minimal constructor */
	public TBasisType(String code, String type) {
		this.code = code;
		this.type = type;
	}

	/** full constructor */
	public TBasisType(String code, String name, String type, String dataSource, Timestamp createTime,
			Timestamp modifyTime, String modifyBy, String isControl, String isOnline, Integer sequence, String remark,
			String flag, String deleted) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.dataSource = dataSource;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.modifyBy = modifyBy;
		this.isControl = isControl;
		this.isOnline = isOnline;
		this.sequence = sequence;
		this.remark = remark;
		this.flag = flag;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return this.modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	public String getIsControl() {
		return this.isControl;
	}

	public void setIsControl(String isControl) {
		this.isControl = isControl;
	}

	public String getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getSequence() {
		return this.sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}