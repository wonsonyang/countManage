package com.efun.po;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * TGameMoreItems entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreItems implements java.io.Serializable {
	private static final long serialVersionUID = -6111055227997169320L;

	// Fields

	private Integer id;
	private String udid;
	private String menuId;
	private String productId;
	private String thirdProductId;
	private String productRule;
	private Integer sequenceId;
	private String payFrom;
	private String gamePay;
	private String stone;
	private String img;
	private Timestamp startTime;
	private Timestamp endTime;
	private String content;
	private String remark;
	private String cashType;
	private String activityExtra;
	private String moneyType;
	private String paid;
	private String pointArea;
	private String flag;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Timestamp lastSynctime;
	private String deleted;
	private String stoneType;
	private String isBindActivityExtra;
	private String activityExtraText;
	private String stoneImage;
	private String categoryId;
	private BigDecimal originAmount;
	private String originCurrency;

	// Constructors

	/** default constructor */
	public TGameMoreItems() {
	}

	/** full constructor */
	public TGameMoreItems(String udid, String menuId, String productId, String thirdProductId, String productRule,
			Integer sequenceId, String payFrom, String gamePay, String stone, String img, Timestamp startTime,
			Timestamp endTime, String content, String remark, String cashType, String activityExtra, String moneyType,
			String paid, String pointArea, String flag, Timestamp createTime, Timestamp modifyTime,
			Timestamp lastSynctime, String deleted, String stoneType, String isBindActivityExtra,
			String activityExtraText, String stoneImage, String categoryId) {
		this.udid = udid;
		this.menuId = menuId;
		this.productId = productId;
		this.thirdProductId = thirdProductId;
		this.productRule = productRule;
		this.sequenceId = sequenceId;
		this.payFrom = payFrom;
		this.gamePay = gamePay;
		this.stone = stone;
		this.img = img;
		this.startTime = startTime;
		this.endTime = endTime;
		this.content = content;
		this.remark = remark;
		this.cashType = cashType;
		this.activityExtra = activityExtra;
		this.moneyType = moneyType;
		this.paid = paid;
		this.pointArea = pointArea;
		this.flag = flag;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.lastSynctime = lastSynctime;
		this.deleted = deleted;
		this.stoneType = stoneType;
		this.isBindActivityExtra = isBindActivityExtra;
		this.activityExtraText = activityExtraText;
		this.stoneImage = stoneImage;
		this.categoryId = categoryId;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUdid() {
		return this.udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getThirdProductId() {
		return this.thirdProductId;
	}

	public void setThirdProductId(String thirdProductId) {
		this.thirdProductId = thirdProductId;
	}

	public String getProductRule() {
		return this.productRule;
	}

	public void setProductRule(String productRule) {
		this.productRule = productRule;
	}

	public Integer getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getGamePay() {
		return this.gamePay;
	}

	public void setGamePay(String gamePay) {
		this.gamePay = gamePay;
	}

	public String getStone() {
		return this.stone;
	}

	public void setStone(String stone) {
		this.stone = stone;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Timestamp getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCashType() {
		return this.cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
	}

	public String getActivityExtra() {
		return this.activityExtra;
	}

	public void setActivityExtra(String activityExtra) {
		this.activityExtra = activityExtra;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPointArea() {
		return this.pointArea;
	}

	public void setPointArea(String pointArea) {
		this.pointArea = pointArea;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Timestamp getLastSynctime() {
		return this.lastSynctime;
	}

	public void setLastSynctime(Timestamp lastSynctime) {
		this.lastSynctime = lastSynctime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getStoneType() {
		return stoneType;
	}

	public void setStoneType(String stoneType) {
		this.stoneType = stoneType;
	}

	public String getIsBindActivityExtra() {
		return isBindActivityExtra;
	}

	public void setIsBindActivityExtra(String isBindActivityExtra) {
		this.isBindActivityExtra = isBindActivityExtra;
	}

	public String getActivityExtraText() {
		return activityExtraText;
	}

	public void setActivityExtraText(String activityExtraText) {
		this.activityExtraText = activityExtraText;
	}

	public String getStoneImage() {
		return stoneImage;
	}

	public void setStoneImage(String stoneImage) {
		this.stoneImage = stoneImage;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public BigDecimal getOriginAmount() {
		return originAmount;
	}

	public void setOriginAmount(BigDecimal originAmount) {
		this.originAmount = originAmount;
	}

	public String getOriginCurrency() {
		return originCurrency;
	}

	public void setOriginCurrency(String originCurrency) {
		this.originCurrency = originCurrency;
	}
}