package com.efun.po;

/**
 * TAccountBillmoney entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TAccountBillmoney implements java.io.Serializable {
	private static final long serialVersionUID = 1800929907478562735L;

	// Fields

	private Integer id;
	private TAccountBillinfo TAccountBillinfo;
	private String settleItem;
	private Double settleMoney;
	private Double exchangeRate;
	private Double exchangeMoney;
	private String divideRatio;
	private Double cashflowMoney;
	private Double divideMoney;
	private String standby;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAccountBillmoney() {
	}

	/** full constructor */
	public TAccountBillmoney(TAccountBillinfo TAccountBillinfo,
			String settleItem, Double settleMoney, Double exchangeRate,
			Double exchangeMoney, String divideRatio, Double cashflowMoney,
			Double divideMoney, String standby, String deleted) {
		this.TAccountBillinfo = TAccountBillinfo;
		this.settleItem = settleItem;
		this.settleMoney = settleMoney;
		this.exchangeRate = exchangeRate;
		this.exchangeMoney = exchangeMoney;
		this.divideRatio = divideRatio;
		this.cashflowMoney = cashflowMoney;
		this.divideMoney = divideMoney;
		this.standby = standby;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TAccountBillinfo getTAccountBillinfo() {
		return this.TAccountBillinfo;
	}

	public void setTAccountBillinfo(TAccountBillinfo TAccountBillinfo) {
		this.TAccountBillinfo = TAccountBillinfo;
	}

	public String getSettleItem() {
		return this.settleItem;
	}

	public void setSettleItem(String settleItem) {
		this.settleItem = settleItem;
	}

	public Double getSettleMoney() {
		return this.settleMoney;
	}

	public void setSettleMoney(Double settleMoney) {
		this.settleMoney = settleMoney;
	}

	public Double getExchangeRate() {
		return this.exchangeRate;
	}

	public void setExchangeRate(Double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Double getExchangeMoney() {
		return this.exchangeMoney;
	}

	public void setExchangeMoney(Double exchangeMoney) {
		this.exchangeMoney = exchangeMoney;
	}

	public String getDivideRatio() {
		return this.divideRatio;
	}

	public void setDivideRatio(String divideRatio) {
		this.divideRatio = divideRatio;
	}

	public Double getCashflowMoney() {
		return this.cashflowMoney;
	}

	public void setCashflowMoney(Double cashflowMoney) {
		this.cashflowMoney = cashflowMoney;
	}

	public Double getDivideMoney() {
		return this.divideMoney;
	}

	public void setDivideMoney(Double divideMoney) {
		this.divideMoney = divideMoney;
	}

	public String getStandby() {
		return this.standby;
	}

	public void setStandby(String standby) {
		this.standby = standby;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}