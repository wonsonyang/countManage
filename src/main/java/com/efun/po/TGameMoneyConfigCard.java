package com.efun.po;

/**
 * TGameMoneyConfigCard entity. @author MyEclipse Persistence Tools
 */

public class TGameMoneyConfigCard implements java.io.Serializable {
	private static final long serialVersionUID = -6866969327324044217L;

	// Fields

	private Long id;
	private String gameCode;
	private String productId;
	private String productName;
	private Double amount;
	private String currency;
	private Integer stone;
	private String noCardTabPayment;
	private String noSubStonePayment;
	private String info;
	private String conditionValue;
	private String popInfo;
	private Integer sequenceId;
	private String des;
	private Integer deleted;
	private String str1;
	private Integer isShow;

	// Constructors

	/** default constructor */
	public TGameMoneyConfigCard() {
	}

	/** minimal constructor */
	public TGameMoneyConfigCard(String gameCode, String productId, String productName,
			Integer stone, String info) {
		this.gameCode = gameCode;
		this.productId = productId;
		this.productName = productName;
		this.stone = stone;
		this.info = info;
	}

	/** full constructor */
	public TGameMoneyConfigCard(String gameCode, String productId, String productName,
			Double amount, String currency, Integer stone, String noCardTabPayment,
			String noSubStonePayment, String info, String conditionValue, String popInfo,
			Integer sequenceId, String des, Integer deleted, String str1) {
		this.gameCode = gameCode;
		this.productId = productId;
		this.productName = productName;
		this.amount = amount;
		this.currency = currency;
		this.stone = stone;
		this.noCardTabPayment = noCardTabPayment;
		this.noSubStonePayment = noSubStonePayment;
		this.info = info;
		this.conditionValue = conditionValue;
		this.popInfo = popInfo;
		this.sequenceId = sequenceId;
		this.des = des;
		this.deleted = deleted;
		this.str1 = str1;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getNoCardTabPayment() {
		return this.noCardTabPayment;
	}

	public void setNoCardTabPayment(String noCardTabPayment) {
		this.noCardTabPayment = noCardTabPayment;
	}

	public String getNoSubStonePayment() {
		return this.noSubStonePayment;
	}

	public void setNoSubStonePayment(String noSubStonePayment) {
		this.noSubStonePayment = noSubStonePayment;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getConditionValue() {
		return this.conditionValue;
	}

	public void setConditionValue(String conditionValue) {
		this.conditionValue = conditionValue;
	}

	public String getPopInfo() {
		return this.popInfo;
	}

	public void setPopInfo(String popInfo) {
		this.popInfo = popInfo;
	}

	public Integer getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getStr1() {
		return this.str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public Integer getIsShow() {
		return isShow;
	}

	public void setIsShow(Integer isShow) {
		this.isShow = isShow;
	}
}