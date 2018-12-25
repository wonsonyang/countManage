package com.efun.po;

/**
 * TAccountEmail entity. @author MyEclipse Persistence Tools
 */

public class TAccountEmail implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String gcode;
	private String module;
	private Short department;
	private String replyemail;
	private String receivemail;
	private String ccemail;
	private String title;
	private String content;
	private String type;
	private String item;
	private String deleted;
	/**
	 * 厂商数量,用于解决一个游戏有多个厂商分成的问题
	 */
	private Integer manuNumber;

	public TAccountEmail() {
	}

	/** full constructor */
	public TAccountEmail(String gcode, String module, Short department, String replyemail, String receivemail, String ccemail, String title, String content, String type, String item, String deleted) {
		this.gcode = gcode;
		this.module = module;
		this.department = department;
		this.replyemail = replyemail;
		this.receivemail = receivemail;
		this.ccemail = ccemail;
		this.title = title;
		this.content = content;
		this.type = type;
		this.item = item;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGcode() {
		return this.gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public Short getDepartment() {
		return this.department;
	}

	public void setDepartment(Short department) {
		this.department = department;
	}

	public String getReplyemail() {
		return this.replyemail;
	}

	public void setReplyemail(String replyemail) {
		this.replyemail = replyemail;
	}

	public String getReceivemail() {
		return this.receivemail;
	}

	public void setReceivemail(String receivemail) {
		this.receivemail = receivemail;
	}

	public String getCcemail() {
		return this.ccemail;
	}

	public void setCcemail(String ccemail) {
		this.ccemail = ccemail;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Integer getManuNumber() {
		return manuNumber;
	}

	public void setManuNumber(Integer manuNumber) {
		this.manuNumber = manuNumber;
	}
}