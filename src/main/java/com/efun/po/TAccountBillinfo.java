package com.efun.po;

import java.util.HashSet;
import java.util.Set;

/**
 * TAccountBillinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TAccountBillinfo implements java.io.Serializable {
	private static final long serialVersionUID = 1297075153339361595L;

	// Fields

	private Integer id;
	private String month;
	private String gcode;
	private String billItem;
	private String title;
	private String dateScope;
	private String manuName;
	private String cycle;
	private String remark;
	private String standby;
	private String deleted;
	private Set<TAccountBillmoney> TAccountBillmoneies = new HashSet<TAccountBillmoney>(0);

	// Constructors

	/** default constructor */
	public TAccountBillinfo() {
	}

	/** full constructor */
	public TAccountBillinfo(String month, String gcode, String billItem,
			String title, String dateScope, String manuName, String cycle,
			String remark, String standby, String deleted,
			Set<TAccountBillmoney> TAccountBillmoneies) {
		this.month = month;
		this.gcode = gcode;
		this.billItem = billItem;
		this.title = title;
		this.dateScope = dateScope;
		this.manuName = manuName;
		this.cycle = cycle;
		this.remark = remark;
		this.standby = standby;
		this.deleted = deleted;
		this.TAccountBillmoneies = TAccountBillmoneies;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getGcode() {
		return this.gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}

	public String getBillItem() {
		return this.billItem;
	}

	public void setBillItem(String billItem) {
		this.billItem = billItem;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateScope() {
		return this.dateScope;
	}

	public void setDateScope(String dateScope) {
		this.dateScope = dateScope;
	}

	public String getManuName() {
		return this.manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getStandby() {
		return this.standby;
	}

	public void setStandby(String standby) {
		this.standby = standby;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Set<TAccountBillmoney> getTAccountBillmoneies() {
		return this.TAccountBillmoneies;
	}

	public void setTAccountBillmoneies(Set<TAccountBillmoney> TAccountBillmoneies) {
		this.TAccountBillmoneies = TAccountBillmoneies;
	}

}