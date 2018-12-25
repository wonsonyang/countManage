package com.efun.po;

import java.util.Date;

/**
 * TPayRateData entity. @author MyEclipse Persistence Tools
 */

public class TPayRateData implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Long id;
	private String userId;
	private String gameCode;
	private String serverCode;
	private String creditId;
	private Double amount;
	private Double areaAmount;
	private Double usd;
	private Integer stone;
	private String currency;
	private String flag;
	private String paid;
	private String payFrom;
	private String payType;
	private String productId;
	private String efunOrderId;
	private Date createdTime;
	private String payStatus;
	private Long rateConfigId;
	private String rate;
	private String random;
	private String awardid;
	private Integer num;
	private String str1;
	private String str2;

	// Constructors

	/** default constructor */
	public TPayRateData() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getCreditId() {
		return creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getAreaAmount() {
		return areaAmount;
	}

	public void setAreaAmount(Double areaAmount) {
		this.areaAmount = areaAmount;
	}

	public Double getUsd() {
		return usd;
	}

	public void setUsd(Double usd) {
		this.usd = usd;
	}

	public Integer getStone() {
		return stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPayFrom() {
		return payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getEfunOrderId() {
		return efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public Long getRateConfigId() {
		return rateConfigId;
	}

	public void setRateConfigId(Long rateConfigId) {
		this.rateConfigId = rateConfigId;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRandom() {
		return random;
	}

	public void setRandom(String random) {
		this.random = random;
	}

	public String getAwardid() {
		return awardid;
	}

	public void setAwardid(String awardid) {
		this.awardid = awardid;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}

	// Property accessors

}