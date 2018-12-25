package com.efun.po;

import java.util.Date;

/**
 * TGamePropellingSet entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePropellingSet implements java.io.Serializable {
	private static final long serialVersionUID = 690237670060400757L;

	// Fields

	private Integer id;
	private String pushCode;
	private String gameCode;
	private String title;
	private String content;
	private Date startTime;
	private Date endTime;
	private Date disableTime;
	private Date firstTime;
	private Date addTime;
	private String addUser;
	private Integer cycle;
	private Integer defer;
	private Integer total;
	private Integer priority;
	private String type;
	private Integer status;
	private Integer flag;
	private Integer isTest;
	private String packageName;
	private String remark1;

	// Constructors

	/** default constructor */
	public TGamePropellingSet() {
	}

	/** full constructor */
	public TGamePropellingSet(String pushCode, String gameCode, String title,
			String content, Date startTime, Date endTime, Date disableTime,
			Date firstTime, Date addTime, String addUser, Integer cycle,
			Integer defer, Integer total, Integer priority, String type,
			Integer status, Integer flag, Integer isTest, String packageName,
			String remark1) {
		this.pushCode = pushCode;
		this.gameCode = gameCode;
		this.title = title;
		this.content = content;
		this.startTime = startTime;
		this.endTime = endTime;
		this.disableTime = disableTime;
		this.firstTime = firstTime;
		this.addTime = addTime;
		this.addUser = addUser;
		this.cycle = cycle;
		this.defer = defer;
		this.total = total;
		this.priority = priority;
		this.type = type;
		this.status = status;
		this.flag = flag;
		this.isTest = isTest;
		this.packageName = packageName;
		this.remark1 = remark1;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPushCode() {
		return this.pushCode;
	}

	public void setPushCode(String pushCode) {
		this.pushCode = pushCode;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
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

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getDisableTime() {
		return this.disableTime;
	}

	public void setDisableTime(Date disableTime) {
		this.disableTime = disableTime;
	}

	public Date getFirstTime() {
		return this.firstTime;
	}

	public void setFirstTime(Date firstTime) {
		this.firstTime = firstTime;
	}

	public Date getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getAddUser() {
		return this.addUser;
	}

	public void setAddUser(String addUser) {
		this.addUser = addUser;
	}

	public Integer getCycle() {
		return this.cycle;
	}

	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}

	public Integer getDefer() {
		return this.defer;
	}

	public void setDefer(Integer defer) {
		this.defer = defer;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getIsTest() {
		return this.isTest;
	}

	public void setIsTest(Integer isTest) {
		this.isTest = isTest;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getRemark1() {
		return this.remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}

}