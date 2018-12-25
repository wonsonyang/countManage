package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyBank entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyBank implements java.io.Serializable {
	private static final long serialVersionUID = 4205812176144528249L;

	// Fields

	private Long id;
	private Long uid;
	private String creditId;
	private String roleLevel;
	private String gameCode;
	private String serverCode;
	private String moneyType;
	private String payType;
	private Float gamePay;
	private Float stone;
	private String payStatus;
	private String efunOrderId;
	private Date createdTime;
	private Date modifiedTime;
	private Float twCoin;
	private Float usd;
	private String flag;
	private String remark;
	private String payFrom;
	private String bonus;
	private String bankOrderId;
	private String awardContent;    //发奖励配置内容json

	// Constructors

	/** default constructor */
	public TGameMoneyBank() {
	}

	/** minimal constructor */
	public TGameMoneyBank(Long uid) {
		this.uid = uid;
	}

	/** full constructor */
	public TGameMoneyBank(Long uid, String creditId, String roleLevel,
			String gameCode, String serverCode, String moneyType,
			String payType, Float gamePay, Float stone, String payStatus,
			String efunOrderId, Date createdTime, Date modifiedTime,
			Float twCoin, Float usd, String flag, String remark,
			String payFrom, String bonus, String bankOrderId) {
		this.uid = uid;
		this.creditId = creditId;
		this.roleLevel = roleLevel;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.moneyType = moneyType;
		this.payType = payType;
		this.gamePay = gamePay;
		this.stone = stone;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.twCoin = twCoin;
		this.usd = usd;
		this.flag = flag;
		this.remark = remark;
		this.payFrom = payFrom;
		this.bonus = bonus;
		this.bankOrderId = bankOrderId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
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

	public Float getTwCoin() {
		return this.twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
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

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getBonus() {
		return this.bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	public String getBankOrderId() {
		return this.bankOrderId;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}

	public String getAwardContent() {
		return awardContent;
	}

	public void setAwardContent(String awardContent) {
		this.awardContent = awardContent;
	}

}