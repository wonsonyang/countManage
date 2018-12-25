package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyDanal entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyDanal implements java.io.Serializable {
	private static final long serialVersionUID = -1924025535777335955L;

	// Fields

	private Long gmmid;
	private Long uid;
	private String creditId;
	private String roleLevel;
	private String roleName;
	private String gameCode;
	private String serverCode;
	private String payFrom;
	private String moneyType;
	private String payType;
	private Float gamePoint;
	private Float gamePay;
	private Float stone;
	private String payStatus;
	private String efunOrderId;
	private String danalOrderId;
	private String danalType;
	private Date createdTime;
	private Date modifiedTime;
	private Float twCoin;
	private Float usd;
	private String flag;
	private String remark;

	// Constructors

	/** default constructor */
	public TGameMoneyDanal() {
	}

	/** minimal constructor */
	public TGameMoneyDanal(Long uid) {
		this.uid = uid;
	}

	/** full constructor */
	public TGameMoneyDanal(Long uid, String creditId, String roleLevel,
			String roleName, String gameCode, String serverCode,
			String payFrom, String moneyType, String payType, Float gamePoint,
			Float gamePay, Float stone, String payStatus, String efunOrderId,
			String danalOrderId, String danalType, Date createdTime,
			Date modifiedTime, Float twCoin, Float usd, String flag,
			String remark) {
		this.uid = uid;
		this.creditId = creditId;
		this.roleLevel = roleLevel;
		this.roleName = roleName;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.payFrom = payFrom;
		this.moneyType = moneyType;
		this.payType = payType;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.stone = stone;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.danalOrderId = danalOrderId;
		this.danalType = danalType;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.twCoin = twCoin;
		this.usd = usd;
		this.flag = flag;
		this.remark = remark;
	}

	// Property accessors

	public Long getGmmid() {
		return this.gmmid;
	}

	public void setGmmid(Long gmmid) {
		this.gmmid = gmmid;
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

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

	public Float getGamePoint() {
		return this.gamePoint;
	}

	public void setGamePoint(Float gamePoint) {
		this.gamePoint = gamePoint;
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

	public String getDanalOrderId() {
		return this.danalOrderId;
	}

	public void setDanalOrderId(String danalOrderId) {
		this.danalOrderId = danalOrderId;
	}

	public String getDanalType() {
		return this.danalType;
	}

	public void setDanalType(String danalType) {
		this.danalType = danalType;
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

}