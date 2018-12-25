package com.efun.po;

/**
 * TemplateLabelType entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TemplateLabelType implements java.io.Serializable {
	private static final long serialVersionUID = 4294794402543233866L;

	// Fields

	private Integer id;
	private String ps;

	// Constructors

	/** default constructor */
	public TemplateLabelType() {
	}

	/** full constructor */
	public TemplateLabelType(String ps) {
		this.ps = ps;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPs() {
		return this.ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

}