package com.efun.po;

import java.sql.Timestamp;

/**
 * TManagerMontiorWebUrl entity. @author MyEclipse Persistence Tools
 */

public class TManagerMontiorWebUrl implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String gameCode;
	private String dataSource;
	private String gameName;
	private String webUrl;
	private String usagePosition;
	private String remark;
	private Integer monitorLevel;
	private String mail;
	private String receiverName;
	private String useStatus;
	private String updateUser;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private Integer deleted;

	// Constructors

	/** default constructor */
	public TManagerMontiorWebUrl() {
	}

	/** full constructor */
	public TManagerMontiorWebUrl(String gameCode,String dataSource,String gameName, String webUrl, String usagePosition,
			String remark, Integer monitorLevel, String mail, String receiverName,
			String useStatus, String updateUser, Timestamp createdTime, Timestamp modifiedTime,
			Integer deleted) {
		this.dataSource=dataSource;
		this.gameCode=gameCode;
		this.gameName = gameName;
		this.webUrl = webUrl;
		this.usagePosition = usagePosition;
		this.remark = remark;
		this.monitorLevel = monitorLevel;
		this.mail = mail;
		this.receiverName = receiverName;
		this.useStatus = useStatus;
		this.updateUser = updateUser;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}
	
	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getWebUrl() {
		return this.webUrl;
	}

	public void setWebUrl(String webUrl) {
		this.webUrl = webUrl;
	}

	public String getUsagePosition() {
		return this.usagePosition;
	}

	public void setUsagePosition(String usagePosition) {
		this.usagePosition = usagePosition;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getMonitorLevel() {
		return this.monitorLevel;
	}

	public void setMonitorLevel(Integer monitorLevel) {
		this.monitorLevel = monitorLevel;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getReceiverName() {
		return this.receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getUseStatus() {
		return this.useStatus;
	}

	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public String getUpdateUser() {
		return this.updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}