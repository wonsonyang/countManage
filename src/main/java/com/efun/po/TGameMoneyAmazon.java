package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyAmazon entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyAmazon implements java.io.Serializable {
	private static final long serialVersionUID = 4826376898913078628L;

	// Fields

	private Long gmaid;
	private Long uid;
	private String creditId;
	private String roleLevel;
	private String gameCode;
	private String serverCode;
	private String payFrom;
	private String currency;
	private String payType;
	private Float gamePay;
	private Float stone;
	private Float bonus;
	private String payStatus;
	private String efunOrderId;
	private String amazonOrderId;
	private String amazonUserId;
	private Date createdTime;
	private Date modifiedTime;
	private Float twd;
	private Float usd;
	private String flag;
	private String remark;

	// Constructors

	/** default constructor */
	public TGameMoneyAmazon() {
	}

	/** minimal constructor */
	public TGameMoneyAmazon(Long uid) {
		this.uid = uid;
	}

	/** full constructor */
	public TGameMoneyAmazon(Long uid, String creditId, String roleLevel,
			String gameCode, String serverCode, String payFrom,
			String currency, String payType, Float gamePay, Float stone,
			Float bonus, String payStatus, String efunOrderId,
			String amazonOrderId, String amazonUserId, Date createdTime,
			Date modifiedTime, Float twd, Float usd, String flag, String remark) {
		this.uid = uid;
		this.creditId = creditId;
		this.roleLevel = roleLevel;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.payFrom = payFrom;
		this.currency = currency;
		this.payType = payType;
		this.gamePay = gamePay;
		this.stone = stone;
		this.bonus = bonus;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.amazonOrderId = amazonOrderId;
		this.amazonUserId = amazonUserId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.twd = twd;
		this.usd = usd;
		this.flag = flag;
		this.remark = remark;
	}

	// Property accessors

	public Long getGmaid() {
		return this.gmaid;
	}

	public void setGmaid(Long gmaid) {
		this.gmaid = gmaid;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getRoleLevel() {
		return this.roleLevel;
	}

	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Float getGamePay() {
		return this.gamePay;
	}

	public void setGamePay(Float gamePay) {
		this.gamePay = gamePay;
	}

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
	}

	public Float getBonus() {
		return this.bonus;
	}

	public void setBonus(Float bonus) {
		this.bonus = bonus;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getAmazonOrderId() {
		return this.amazonOrderId;
	}

	public void setAmazonOrderId(String amazonOrderId) {
		this.amazonOrderId = amazonOrderId;
	}

	public String getAmazonUserId() {
		return this.amazonUserId;
	}

	public void setAmazonUserId(String amazonUserId) {
		this.amazonUserId = amazonUserId;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Float getTwd() {
		return this.twd;
	}

	public void setTwd(Float twd) {
		this.twd = twd;
	}

	public Float getUsd() {
		return this.usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}