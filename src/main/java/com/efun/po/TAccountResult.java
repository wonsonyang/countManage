package com.efun.po;

import java.util.Date;

/**
 * TAccountResult entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TAccountResult implements java.io.Serializable {
	private static final long serialVersionUID = -2783918226663447629L;

	// Fields

	private Integer id;
	private String gcode;
	private String month;
	private String status;
	private String settleUser;
	private Date createTime;
	private String stone;
	private String usd;
	private String totalusd;
	private String totalstone;
	private String cashflow;
	private String efunTestStone;
	private String manuTestStone;
	private String giveStone;
	private String dividMoney;
	private String reserve1;
	private String reserve2;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAccountResult() {
	}

	/** full constructor */
	public TAccountResult(String gcode, String month, String status,
			String settleUser, Date createTime, String stone, String usd,
			String totalusd, String totalstone, String cashflow,
			String efunTestStone, String manuTestStone, String giveStone,
			String dividMoney, String reserve1, String reserve2, String deleted) {
		this.gcode = gcode;
		this.month = month;
		this.status = status;
		this.settleUser = settleUser;
		this.createTime = createTime;
		this.stone = stone;
		this.usd = usd;
		this.totalusd = totalusd;
		this.totalstone = totalstone;
		this.cashflow = cashflow;
		this.efunTestStone = efunTestStone;
		this.manuTestStone = manuTestStone;
		this.giveStone = giveStone;
		this.dividMoney = dividMoney;
		this.reserve1 = reserve1;
		this.reserve2 = reserve2;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGcode() {
		return this.gcode;
	}

	public void setGcode(String gcode) {
		this.gcode = gcode;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSettleUser() {
		return this.settleUser;
	}

	public void setSettleUser(String settleUser) {
		this.settleUser = settleUser;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getStone() {
		return this.stone;
	}

	public void setStone(String stone) {
		this.stone = stone;
	}

	public String getUsd() {
		return this.usd;
	}

	public void setUsd(String usd) {
		this.usd = usd;
	}

	public String getTotalusd() {
		return this.totalusd;
	}

	public void setTotalusd(String totalusd) {
		this.totalusd = totalusd;
	}

	public String getTotalstone() {
		return this.totalstone;
	}

	public void setTotalstone(String totalstone) {
		this.totalstone = totalstone;
	}

	public String getCashflow() {
		return this.cashflow;
	}

	public void setCashflow(String cashflow) {
		this.cashflow = cashflow;
	}

	public String getEfunTestStone() {
		return this.efunTestStone;
	}

	public void setEfunTestStone(String efunTestStone) {
		this.efunTestStone = efunTestStone;
	}

	public String getManuTestStone() {
		return this.manuTestStone;
	}

	public void setManuTestStone(String manuTestStone) {
		this.manuTestStone = manuTestStone;
	}

	public String getGiveStone() {
		return this.giveStone;
	}

	public void setGiveStone(String giveStone) {
		this.giveStone = giveStone;
	}

	public String getDividMoney() {
		return this.dividMoney;
	}

	public void setDividMoney(String dividMoney) {
		this.dividMoney = dividMoney;
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

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}