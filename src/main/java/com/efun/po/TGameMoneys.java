package com.efun.po;

import java.util.Date;

/**
 * TGameMoneys entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneys implements java.io.Serializable {
	private static final long serialVersionUID = 1447749884134795297L;

	// Fields

	private Long id;
	private Long uid;
	private String creditId;
	private String roleLevel;
	private String gameCode;
	private String serverCode;
	private String efunOrderId;
	private String thirdOrderId;
	private String payType;
	private String currency;
	private Float gamePoint;
	private Float gamePay;
	private Float stone;
	private Float twCoin;
	private Float usd;
	private Date orderTime;
	private Date modifiedTime;
	private String flag;
	private String payFrom;
	private String remark;
	private String resend;
	private String checkoutMonth;

	// Constructors

	/** default constructor */
	public TGameMoneys() {
	}

	/** minimal constructor */
	public TGameMoneys(Long uid, String creditId, String gameCode,
			String serverCode, String efunOrderId) {
		this.uid = uid;
		this.creditId = creditId;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.efunOrderId = efunOrderId;
	}

	/** full constructor */
	public TGameMoneys(Long uid, String creditId, String roleLevel,
			String gameCode, String serverCode, String efunOrderId,
			String thirdOrderId, String payType, String currency,
			Float gamePoint, Float gamePay, Float stone, Float twCoin,
			Float usd, Date orderTime, Date modifiedTime, String flag,
			String payFrom, String remark, String resend, String checkoutMonth) { 
		this.uid = uid;
		this.creditId = creditId;
		this.roleLevel = roleLevel;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.efunOrderId = efunOrderId;
		this.thirdOrderId = thirdOrderId;
		this.payType = payType;
		this.currency = currency;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.stone = stone;
		this.twCoin = twCoin;
		this.usd = usd;
		this.orderTime = orderTime;
		this.modifiedTime = modifiedTime;
		this.flag = flag;
		this.payFrom = payFrom;
		this.remark = remark;
		this.resend = resend;
		this.checkoutMonth = checkoutMonth;
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

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getThirdOrderId() {
		return this.thirdOrderId;
	}

	public void setThirdOrderId(String thirdOrderId) {
		this.thirdOrderId = thirdOrderId;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getResend() {
		return this.resend;
	}

	public void setResend(String resend) {
		this.resend = resend;
	}

	public String getCheckoutMonth() {
		return this.checkoutMonth;
	}

	public void setCheckoutMonth(String checkoutMonth) {
		this.checkoutMonth = checkoutMonth;
	}

}