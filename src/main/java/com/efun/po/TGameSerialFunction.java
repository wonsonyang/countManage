package com.efun.po;

import java.util.Date;

/**
 * TGameSerialFunction entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameSerialFunction implements java.io.Serializable {
	private static final long serialVersionUID = 4429740091422420736L;

	// Fields

	private Integer id;
	private String serialNumber;
	private Integer uid;
	private String roleId;
	private Float amount;
	private Date timeLimit;
	private Date createdTime;
	private Date exchangeTime;
	private String status;
	private String function;
	private String creator;
	private String batchNumber;
	private String gameCode;
	private String efunOrderId;

	// Constructors

	/** default constructor */
	public TGameSerialFunction() {
	}

	/** full constructor */
	public TGameSerialFunction(String serialNumber, Integer uid, String roleId,
			Float amount, Date timeLimit, Date createdTime, Date exchangeTime,
			String status, String function, String creator, String batchNumber,
			String gameCode, String efunOrderId) {
		this.serialNumber = serialNumber;
		this.uid = uid;
		this.roleId = roleId;
		this.amount = amount;
		this.timeLimit = timeLimit;
		this.createdTime = createdTime;
		this.exchangeTime = exchangeTime;
		this.status = status;
		this.function = function;
		this.creator = creator;
		this.batchNumber = batchNumber;
		this.gameCode = gameCode;
		this.efunOrderId = efunOrderId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Float getAmount() {
		return this.amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Date getTimeLimit() {
		return this.timeLimit;
	}

	public void setTimeLimit(Date timeLimit) {
		this.timeLimit = timeLimit;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getExchangeTime() {
		return this.exchangeTime;
	}

	public void setExchangeTime(Date exchangeTime) {
		this.exchangeTime = exchangeTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

}