package com.efun.po;

/**
 * TDepartmentGame entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TDepartmentGame implements java.io.Serializable {
	private static final long serialVersionUID = 4511449692826939476L;

	// Fields

	private Long tdid;
	private String departName;
	private String departCode;
	private String admin;
	private String dataSource;
	private String remark;
	private String flag;

	// Constructors

	/** default constructor */
	public TDepartmentGame() {
	}

	/** full constructor */
	public TDepartmentGame(String departName, String departCode, String admin,
			String dataSource, String remark, String flag) {
		this.departName = departName;
		this.departCode = departCode;
		this.admin = admin;
		this.dataSource = dataSource;
		this.remark = remark;
		this.flag = flag;
	}

	// Property accessors

	public Long getTdid() {
		return this.tdid;
	}

	public void setTdid(Long tdid) {
		this.tdid = tdid;
	}

	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	public String getDepartCode() {
		return this.departCode;
	}

	public void setDepartCode(String departCode) {
		this.departCode = departCode;
	}

	public String getAdmin() {
		return this.admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
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

}