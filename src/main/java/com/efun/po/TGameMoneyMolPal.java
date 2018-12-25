package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyMolPal entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyMolPal implements java.io.Serializable {
	private static final long serialVersionUID = 993931121331247518L;

	// Fields

	private Long gmmpid;
	private Integer gsid;
	private Long uid;
	private String gameCode;
	private String serverCode;
	private String payFrom;
	private String moneyType;
	private String payType;
	private Float gamePoint;
	private Float gamePay;
	private Float stone;
	private String resultCode;
	private String payStatus;
	private String efunOrderId;
	private String molOrderId;
	private String playerId;
	private String token;
	private String flag;
	private String remark;
	private String remark1; 
	private String createdBy;
	private Date createdTime;
	private String modifiedBy;
	private Date modifiedTime;
	private Float twCoin;
	private Float usd;

	// Constructors

	/** default constructor */
	public TGameMoneyMolPal() {
	}

	/** full constructor */
	public TGameMoneyMolPal(Integer gsid, Long uid, String gameCode,
			String serverCode, String payFrom, String moneyType,
			String payType, Float gamePoint, Float gamePay, Float stone,
			String resultCode, String payStatus, String efunOrderId,
			String molOrderId, String playerId, String token, String flag,
			String remark,String remark1, String createdBy, Date createdTime,
			String modifiedBy, Date modifiedTime,Float twCoin,Float usd) {
		this.gsid = gsid;
		this.uid = uid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.payFrom = payFrom;
		this.moneyType = moneyType;
		this.payType = payType;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.stone = stone;
		this.resultCode = resultCode;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.molOrderId = molOrderId;
		this.playerId = playerId;
		this.token = token;
		this.flag = flag;
		this.remark = remark;
		this.remark1 = remark1;
		this.createdBy = createdBy;
		this.createdTime = createdTime;
		this.modifiedBy = modifiedBy;
		this.modifiedTime = modifiedTime;
		this.twCoin=twCoin;
		this.usd = usd;
	}

	// Property accessors

	public Long getGmmpid() {
		return this.gmmpid;
	}

	public void setGmmpid(Long gmmpid) {
		this.gmmpid = gmmpid;
	}

	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
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

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
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

	public String getMolOrderId() {
		return this.molOrderId;
	}

	public void setMolOrderId(String molOrderId) {
		this.molOrderId = molOrderId;
	}

	public String getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
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

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Float getTwCoin() {
		return twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
	}

	public Float getUsd() {
		return usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getRemark1() {
		return remark1;
	}

	public void setRemark1(String remark1) {
		this.remark1 = remark1;
	}
}