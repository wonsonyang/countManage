package com.efun.po;

import java.util.Date;

/**
 * TGameMoneys entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneys_hktw implements java.io.Serializable {
	private static final long serialVersionUID = -4736678387935587188L;

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
	private Float donate;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private String reserve4;

	// Constructors

	/** default constructor */
	public TGameMoneys_hktw() {
	}

	/** minimal constructor */
	public TGameMoneys_hktw(Long uid, String creditId, String gameCode,
			String serverCode, String efunOrderId) {
		this.uid = uid;
		this.creditId = creditId;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.efunOrderId = efunOrderId;
	}

	/** full constructor */
	public TGameMoneys_hktw(Long uid, String creditId, String roleLevel,
			String gameCode, String serverCode, String efunOrderId,
			String thirdOrderId, String payType, String currency,
			Float gamePoint, Float gamePay, Float stone, Float twCoin,
			Float usd, Date orderTime, Date modifiedTime, String flag,
			String payFrom, String remark, String resend, String checkoutMonth,
			Float donate, String reserve1, String reserve2, String reserve3,
			String reserve4) {
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
		this.donate = donate;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.reserve4 = reserve4;
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

	public Float getDonate() {
		return this.donate;
	}

	public void setDonate(Float donate) {
		this.donate = donate;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public String getReserve4() {
		return this.reserve4;
	}

	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}

}