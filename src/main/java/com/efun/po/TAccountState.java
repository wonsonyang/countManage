package com.efun.po;

import java.io.Serializable;

/**
 * 封号/解封记录表 t_account_state
 */
public class TAccountState implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * keyId 主键
	 */
	private Long keyId;

	/**
	 * gameCode gameCode
	 */
	private String gameCode;

	/**
	 * accountId 设备标识或用户id
	 */
	private String accountId;

	/**
	 * accountName 设备名称或用户名
	 */
	private String accountName;

	/**
	 * accountType 0：单个用户；1：设备
	 */
	private String accountType;

	/**
	 * accountState 0：被封；1：解封
	 */
	private String accountState;

	/**
	 * recordState 0：历史；1：当前
	 */
	private String recordState;

	/**
	 * recordPublic 0：不对外；1：对外公开
	 */
	private String recordPublic;

	/**
	 * handleCause 原因
	 */
	private String handleCause;

	/**
	 * handleWay 处理方式或结果
	 */
	private String handleWay;

	/**
	 * hanldeRemark 备注
	 */
	private String hanldeRemark;

	/**
	 * createdTime 时间
	 */
	private java.util.Date createdTime;

	/**
	 * modifiedTime 修改时间
	 */
	private java.util.Date modifiedTime;

	/**
	 * expiredTime 停权到期日
	 */
	private java.util.Date expiredTime;

	/**
	 * hanldeAuthor 处理人
	 */
	private String hanldeAuthor;

	public Long getKeyId() {
		return keyId;
	}

	public void setKeyId(Long keyId) {
		this.keyId = keyId;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountState() {
		return accountState;
	}

	public void setAccountState(String accountState) {
		this.accountState = accountState;
	}

	public String getRecordState() {
		return recordState;
	}

	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	public String getRecordPublic() {
		return recordPublic;
	}

	public void setRecordPublic(String recordPublic) {
		this.recordPublic = recordPublic;
	}

	public String getHandleCause() {
		return handleCause;
	}

	public void setHandleCause(String handleCause) {
		this.handleCause = handleCause;
	}

	public String getHandleWay() {
		return handleWay;
	}

	public void setHandleWay(String handleWay) {
		this.handleWay = handleWay;
	}

	public String getHanldeRemark() {
		return hanldeRemark;
	}

	public void setHanldeRemark(String hanldeRemark) {
		this.hanldeRemark = hanldeRemark;
	}

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public java.util.Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(java.util.Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public String getHanldeAuthor() {
		return hanldeAuthor;
	}

	public void setHanldeAuthor(String hanldeAuthor) {
		this.hanldeAuthor = hanldeAuthor;
	}
}