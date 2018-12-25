package com.efun.po;

import java.util.Date;

/**
 * TGameSerial entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameSerial implements java.io.Serializable {
	private static final long serialVersionUID = -3408425817793250602L;

	// Fields

	private Integer id;
	private String serial;
	private String serial2;
	private String serial3;
	private String password;
	private Long userid;
	private String gameCode;
	private String activityCode;
	private String serverCode;
	private String mac;
	private String ip;
	private Date createTime;
	private Date modifyTime;
	private String flag;
	private String rewardCode;

	// Constructors

	/** default constructor */
	public TGameSerial() {
	}

	/** full constructor */
	public TGameSerial(String serial, String serial2, String serial3,
			String password, Long userid, String gameCode, String activityCode,
			String serverCode, String mac, String ip, Date createTime,
			Date modifyTime, String flag, String rewardCode) {
		this.serial = serial;
		this.serial2 = serial2;
		this.serial3 = serial3;
		this.password = password;
		this.userid = userid;
		this.gameCode = gameCode;
		this.activityCode = activityCode;
		this.serverCode = serverCode;
		this.mac = mac;
		this.ip = ip;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.flag = flag;
		this.rewardCode = rewardCode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerial() {
		return this.serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getSerial2() {
		return this.serial2;
	}

	public void setSerial2(String serial2) {
		this.serial2 = serial2;
	}

	public String getSerial3() {
		return this.serial3;
	}

	public void setSerial3(String serial3) {
		this.serial3 = serial3;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRewardCode() {
		return this.rewardCode;
	}

	public void setRewardCode(String rewardCode) {
		this.rewardCode = rewardCode;
	}

}