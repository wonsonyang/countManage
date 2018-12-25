package com.efun.po;

/**
 * TCashflowUnconfirmed generated by hbm2java
 */
public class TCashflowUnconfirmed implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String month;
	private String packageId;
	private String cashflow;
	private String remark;
	private String deleted;

	public TCashflowUnconfirmed() {
	}

	public TCashflowUnconfirmed(String month, String packageId, String cashflow, String remark, String deleted) {
		this.month = month;
		this.packageId = packageId;
		this.cashflow = cashflow;
		this.remark = remark;
		this.deleted = deleted;
	}

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

	public String getPackageId() {
		return this.packageId;
	}

	public void setPackageId(String packageId) {
		this.packageId = packageId;
	}

	public String getCashflow() {
		return this.cashflow;
	}

	public void setCashflow(String cashflow) {
		this.cashflow = cashflow;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}