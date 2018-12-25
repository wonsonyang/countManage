package com.efun.po;

import java.util.Date;

/**
 * TemplateParams entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TemplateParams implements java.io.Serializable {
	private static final long serialVersionUID = -4619567753206537880L;

	// Fields

	private Integer id;
	private String pname;
	private String pvalue;
	private String pexplain;
	private Date createtime;
	private Date modifytime;
	private String operator;
	private Integer deleted;

	// Constructors

	/** default constructor */
	public TemplateParams() {
	}

	/** minimal constructor */
	public TemplateParams(String pname) {
		this.pname = pname;
	}

	/** full constructor */
	public TemplateParams(String pname, String pvalue, String pexplain,
			Date createtime, Date modifytime, String operator, Integer deleted) {
		this.pname = pname;
		this.pvalue = pvalue;
		this.pexplain = pexplain;
		this.createtime = createtime;
		this.modifytime = modifytime;
		this.operator = operator;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPvalue() {
		return this.pvalue;
	}

	public void setPvalue(String pvalue) {
		this.pvalue = pvalue;
	}

	public String getPexplain() {
		return this.pexplain;
	}

	public void setPexplain(String pexplain) {
		this.pexplain = pexplain;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getModifytime() {
		return this.modifytime;
	}

	public void setModifytime(Date modifytime) {
		this.modifytime = modifytime;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}