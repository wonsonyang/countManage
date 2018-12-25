package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountGame entity. @author MyEclipse Persistence Tools
 */

public class TAccountGame implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String gameCode;
	private String gameName;
	private String manuName;
	private Short department;
	private String manuAccount;
	private Timestamp createdTime;
	private String deleted;
	/**
	 * 厂商数量,用于解决一个游戏有多个厂商分成的问题
	 */
	private Integer manuNumber;

	// Constructors

	/** default constructor */
	public TAccountGame() {
	}

	/** full constructor */
	public TAccountGame(String gameCode, String gameName, String manuName, Short department, String manuAccount, Timestamp createdTime, String deleted) {
		this.gameCode = gameCode;
		this.gameName = gameName;
		this.manuName = manuName;
		this.department = department;
		this.manuAccount = manuAccount;
		this.createdTime = createdTime;
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
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getManuName() {
		return this.manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	public Short getDepartment() {
		return this.department;
	}

	public void setDepartment(Short department) {
		this.department = department;
	}

	public String getManuAccount() {
		return this.manuAccount;
	}

	public void setManuAccount(String manuAccount) {
		this.manuAccount = manuAccount;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
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