package com.efun.po;

import java.util.Date;

/**
 * TUsersExpand entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUsersExpand implements java.io.Serializable {
	private static final long serialVersionUID = 570259884949705791L;

	// Fields

	private Long userId;
	private String userMsg;
	private String msgOther;
	private Date modifiedTime;
	private String msgState;
	private Long  keyId;
	private int  msgType;

	// Constructors

	/** default constructor */
	public TUsersExpand() {
	}

	public TUsersExpand(Long userId, String userMsg, String msgOther,
			Date modifiedTime, String msgState, Long keyId, int msgType) {
		super();
		this.userId = userId;
		this.userMsg = userMsg;
		this.msgOther = msgOther;
		this.modifiedTime = modifiedTime;
		this.msgState = msgState;
		this.keyId = keyId;
		this.msgType = msgType;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserMsg() {
		return userMsg;
	}

	public void setUserMsg(String userMsg) {
		this.userMsg = userMsg;
	}

	public String getMsgOther() {
		return msgOther;
	}

	public void setMsgOther(String msgOther) {
		this.msgOther = msgOther;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getMsgState() {
		return msgState;
	}

	public void setMsgState(String msgState) {
		this.msgState = msgState;
	}

	public Long getKeyId() {
		return keyId;
	}

	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	public int getMsgType() {
		return msgType;
	}

	public void setMsgType(int msgType) {
		this.msgType = msgType;
	}

	 
}