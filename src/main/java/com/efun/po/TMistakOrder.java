package com.efun.po;

import java.util.Date;

/**
 * TMistakOrder entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TMistakOrder implements java.io.Serializable {
	private static final long serialVersionUID = -7674378416655198251L;

	// Fields

	private Integer id;
	private Long userid;
	private String gameCode;
	private String serverCode;
	private String efunOrderId;
	private String thirdOrderId;
	private Float payMoney;
	private Float stone;
	private String moneyType;
	private Date orderTime;
	private String status;
	private String mistakType;
	private String month;
	private String item;
	private String causes;
	private String disposeWith;
	private String deleted;

	// Constructors

	/** default constructor */
	public TMistakOrder() {
	}

	/** full constructor */
	public TMistakOrder(Long userid, String gameCode, String serverCode,
			String efunOrderId, String thirdOrderId, Float payMoney,
			Float stone, String moneyType, Date orderTime, String status,
			String mistakType, String month, String item, String causes,
			String disposeWith, String deleted) {
		this.userid = userid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.efunOrderId = efunOrderId;
		this.thirdOrderId = thirdOrderId;
		this.payMoney = payMoney;
		this.stone = stone;
		this.moneyType = moneyType;
		this.orderTime = orderTime;
		this.status = status;
		this.mistakType = mistakType;
		this.month = month;
		this.item = item;
		this.causes = causes;
		this.disposeWith = disposeWith;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
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

	public Float getPayMoney() {
		return this.payMoney;
	}

	public void setPayMoney(Float payMoney) {
		this.payMoney = payMoney;
	}

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMistakType() {
		return this.mistakType;
	}

	public void setMistakType(String mistakType) {
		this.mistakType = mistakType;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getCauses() {
		return this.causes;
	}

	public void setCauses(String causes) {
		this.causes = causes;
	}

	public String getDisposeWith() {
		return this.disposeWith;
	}

	public void setDisposeWith(String disposeWith) {
		this.disposeWith = disposeWith;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}