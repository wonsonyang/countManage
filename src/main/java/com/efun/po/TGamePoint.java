package com.efun.po;

import java.util.Date;

/**
 * TGamePoint entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePoint implements java.io.Serializable {
	private static final long serialVersionUID = -7255487722081614540L;

	// Fields

	private Long id;
	private Long uid;
	private String pointOrderId;
	private String thirdOrderId;
	private String flag;
	private Float point;
	private Float freePoint;
	private String pointCode;
	private Float gamePoint;
	private Float gamePay;
	private String currency;
	private Float twCoin;
	private Float usd;
	private String gameCode;
	private String serverCode;
	private Float stone;
	private Float donate;
	private Float bouns;
	private String creditId;
	private String roleLevel;
	private String payType;
	private String payFrom;
	private String payStatus;
	private String pointOrderStatus;
	private String resend;
	private Date createdTime;
	private Date modifiedTime;
	private String remark;
	private String comment;
	private String reserve1;
	private String reserve2;
	private String reserve3;
	private String reserve4;
	private String reserve5;

	// Constructors

	/** default constructor */
	public TGamePoint() {
	}

	/** minimal constructor */
	public TGamePoint(Long uid, String pointOrderId, Float point,
			Float freePoint, String pointCode, String payStatus) {
		this.uid = uid;
		this.pointOrderId = pointOrderId;
		this.point = point;
		this.freePoint = freePoint;
		this.pointCode = pointCode;
		this.payStatus = payStatus;
	}

	/** full constructor */
	public TGamePoint(Long uid, String pointOrderId, String thirdOrderId,
			String flag, Float point, Float freePoint, String pointCode,
			Float gamePoint, Float gamePay, String currency, Float twCoin,
			Float usd, String gameCode, String serverCode, Float stone,
			Float donate, Float bouns, String creditId, String roleLevel,
			String payType, String payFrom, String payStatus,
			String pointOrderStatus, String resend, Date createdTime,
			Date modifiedTime, String remark, String comment, String reserve1,
			String reserve2, String reserve3, String reserve4, String reserve5) {
		this.uid = uid;
		this.pointOrderId = pointOrderId;
		this.thirdOrderId = thirdOrderId;
		this.flag = flag;
		this.point = point;
		this.freePoint = freePoint;
		this.pointCode = pointCode;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.currency = currency;
		this.twCoin = twCoin;
		this.usd = usd;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.stone = stone;
		this.donate = donate;
		this.bouns = bouns;
		this.creditId = creditId;
		this.roleLevel = roleLevel;
		this.payType = payType;
		this.payFrom = payFrom;
		this.payStatus = payStatus;
		this.pointOrderStatus = pointOrderStatus;
		this.resend = resend;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.remark = remark;
		this.comment = comment;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.reserve3 = reserve3;
		this.reserve4 = reserve4;
		this.reserve5 = reserve5;
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

	public String getPointOrderId() {
		return this.pointOrderId;
	}

	public void setPointOrderId(String pointOrderId) {
		this.pointOrderId = pointOrderId;
	}

	public String getThirdOrderId() {
		return this.thirdOrderId;
	}

	public void setThirdOrderId(String thirdOrderId) {
		this.thirdOrderId = thirdOrderId;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Float getPoint() {
		return this.point;
	}

	public void setPoint(Float point) {
		this.point = point;
	}

	public Float getFreePoint() {
		return this.freePoint;
	}

	public void setFreePoint(Float freePoint) {
		this.freePoint = freePoint;
	}

	public String getPointCode() {
		return this.pointCode;
	}

	public void setPointCode(String pointCode) {
		this.pointCode = pointCode;
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

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
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

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
	}

	public Float getDonate() {
		return this.donate;
	}

	public void setDonate(Float donate) {
		this.donate = donate;
	}

	public Float getBouns() {
		return this.bouns;
	}

	public void setBouns(Float bouns) {
		this.bouns = bouns;
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

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPointOrderStatus() {
		return this.pointOrderStatus;
	}

	public void setPointOrderStatus(String pointOrderStatus) {
		this.pointOrderStatus = pointOrderStatus;
	}

	public String getResend() {
		return this.resend;
	}

	public void setResend(String resend) {
		this.resend = resend;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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

	public String getReserve5() {
		return this.reserve5;
	}

	public void setReserve5(String reserve5) {
		this.reserve5 = reserve5;
	}

}