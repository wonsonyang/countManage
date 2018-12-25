package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfMessage entity. @author MyEclipse Persistence Tools
 */

public class TPfMessage implements java.io.Serializable {
	private static final long serialVersionUID = -8351555354596952068L;

	// Fields

	private Long id;
	private Long sendId;
	private String author;
	private String messageTitle;
	private String messageText;
	private String type;
	private Long groupId;
	private Timestamp startTime;
	private Timestamp endTime;
	private String sendGames;
	private String recIds;
	private Float storeAmount;
	private String storeGame;
	private String config;
	private Boolean deleted;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	
	private String areaDesc;
	private String language;
	

	// Constructors

	/** default constructor */
	public TPfMessage() {
	}

	/** minimal constructor */
	public TPfMessage(Long sendId, String author, String messageTitle,
			String messageText, String type, Long groupId, Timestamp startTime,
			Boolean deleted, Timestamp createdTime, Timestamp modifiedTime) {
		this.sendId = sendId;
		this.author = author;
		this.messageTitle = messageTitle;
		this.messageText = messageText;
		this.type = type;
		this.groupId = groupId;
		this.startTime = startTime;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfMessage(Long sendId, String author, String messageTitle,
			String messageText, String type, Long groupId, Timestamp startTime,
			Timestamp endTime, String sendGames, String recIds,
			Float storeAmount, String storeGame, String config,
			Boolean deleted, Timestamp createdTime, Timestamp modifiedTime) {
		this.sendId = sendId;
		this.author = author;
		this.messageTitle = messageTitle;
		this.messageText = messageText;
		this.type = type;
		this.groupId = groupId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.sendGames = sendGames;
		this.recIds = recIds;
		this.storeAmount = storeAmount;
		this.storeGame = storeGame;
		this.config = config;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSendId() {
		return this.sendId;
	}

	public void setSendId(Long sendId) {
		this.sendId = sendId;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getMessageTitle() {
		return this.messageTitle;
	}

	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}

	public String getMessageText() {
		return this.messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getSendGames() {
		return this.sendGames;
	}

	public void setSendGames(String sendGames) {
		this.sendGames = sendGames;
	}

	public String getRecIds() {
		return this.recIds;
	}

	public void setRecIds(String recIds) {
		this.recIds = recIds;
	}

	public Float getStoreAmount() {
		return this.storeAmount;
	}

	public void setStoreAmount(Float storeAmount) {
		this.storeAmount = storeAmount;
	}

	public String getStoreGame() {
		return this.storeGame;
	}

	public void setStoreGame(String storeGame) {
		this.storeGame = storeGame;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
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

	public String getAreaDesc() {
		return areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}