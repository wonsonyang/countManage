package com.efun.po;

import java.sql.Timestamp;
import java.util.Date;

/**
 * TPfKoreaMemberGoods entity. @author MyEclipse Persistence Tools
 */

public class TPfKoreaMemberGoods implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Long autoIncrId;
	private String id;
	private String gameCode;
	private String gameCodes;
	private String goodsName;
	private String awardDesc;
	private String awardRule;
	private String awardPrice;
	private String category;
	private String goodsType;
	private String needAuthority;
	private Integer needGold;
	private String deductType;
	private String icon;
	private String pcIcon;
	private String isOneTime;
	private Integer playCount;
	private Integer totalCount;
	private Timestamp activeStartTime;
	private Timestamp activeEndTime;
	private String areaDesc;
	private Float probability;
	private String isSerail;
	private Integer quantity;
	private String deleted;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String remark;
	private Integer orderno;
	private String tasks;
	private Boolean audited;
	private Integer addExperience;
	private String receiveConfig;
	private Short showScope;
	private String isTestData;
	private String tag;
	private String detailPic;
	private Float discount;
	private Short goodsLevel;
	private String awardIcons;
	private String propId;
	private Integer propNum;
	private Date serialEndTime;
	private Date serialStartTime;
	private Integer taskId;
	// Constructors

	/** default constructor */
	public TPfKoreaMemberGoods() {
	}

	/** minimal constructor */
	public TPfKoreaMemberGoods(String id, String deductType, Integer totalCount, Timestamp createdTime,
			Timestamp modifiedTime, Short showScope, String isTestData) {
		this.id = id;
		this.deductType = deductType;
		this.totalCount = totalCount;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.showScope = showScope;
		this.isTestData = isTestData;
	}

	/** full constructor */
	public TPfKoreaMemberGoods(String id, String gameCode, String goodsName, String awardDesc,
			String awardRule, String awardPrice, String category, String goodsType,
			String needAuthority, Integer needGold, String deductType, String icon, String pcIcon,
			String isOneTime, Integer playCount, Integer totalCount, Timestamp activeStartTime,
			Timestamp activeEndTime, String areaDesc, Float probability, String isSerail,
			Integer quantity, String deleted, Timestamp createdTime, Timestamp modifiedTime,
			String remark, Integer orderno, String tasks, Boolean audited, Integer addExperience,
			String receiveConfig, Short showScope, String isTestData, String tag, String detailPic,
			Float discount, Short goodsLevel) {
		this.id = id;
		this.gameCode = gameCode;
		this.goodsName = goodsName;
		this.awardDesc = awardDesc;
		this.awardRule = awardRule;
		this.awardPrice = awardPrice;
		this.category = category;
		this.goodsType = goodsType;
		this.needAuthority = needAuthority;
		this.needGold = needGold;
		this.deductType = deductType;
		this.icon = icon;
		this.pcIcon = pcIcon;
		this.isOneTime = isOneTime;
		this.playCount = playCount;
		this.totalCount = totalCount;
		this.activeStartTime = activeStartTime;
		this.activeEndTime = activeEndTime;
		this.areaDesc = areaDesc;
		this.probability = probability;
		this.isSerail = isSerail;
		this.quantity = quantity;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.remark = remark;
		this.orderno = orderno;
		this.tasks = tasks;
		this.audited = audited;
		this.addExperience = addExperience;
		this.receiveConfig = receiveConfig;
		this.showScope = showScope;
		this.isTestData = isTestData;
		this.tag = tag;
		this.detailPic = detailPic;
		this.discount = discount;
		this.goodsLevel = goodsLevel;
	}

	public Date getSerialEndTime() {
		return serialEndTime;
	}

	public void setSerialEndTime(Date serialEndTime) {
		this.serialEndTime = serialEndTime;
	}

	public String getGameCodes() {
		return gameCodes;
	}

	public void setGameCodes(String gameCodes) {
		this.gameCodes = gameCodes;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getAwardDesc() {
		return this.awardDesc;
	}

	public void setAwardDesc(String awardDesc) {
		this.awardDesc = awardDesc;
	}

	public String getAwardRule() {
		return this.awardRule;
	}

	public void setAwardRule(String awardRule) {
		this.awardRule = awardRule;
	}

	public String getAwardPrice() {
		return this.awardPrice;
	}

	public void setAwardPrice(String awardPrice) {
		this.awardPrice = awardPrice;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}

	public String getNeedAuthority() {
		return this.needAuthority;
	}

	public void setNeedAuthority(String needAuthority) {
		this.needAuthority = needAuthority;
	}

	public Integer getNeedGold() {
		return this.needGold;
	}

	public void setNeedGold(Integer needGold) {
		this.needGold = needGold;
	}

	public String getDeductType() {
		return this.deductType;
	}

	public void setDeductType(String deductType) {
		this.deductType = deductType;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getPcIcon() {
		return this.pcIcon;
	}

	public void setPcIcon(String pcIcon) {
		this.pcIcon = pcIcon;
	}

	public String getIsOneTime() {
		return this.isOneTime;
	}

	public void setIsOneTime(String isOneTime) {
		this.isOneTime = isOneTime;
	}

	public Integer getPlayCount() {
		return this.playCount;
	}

	public void setPlayCount(Integer playCount) {
		this.playCount = playCount;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Timestamp getActiveStartTime() {
		return this.activeStartTime;
	}

	public void setActiveStartTime(Timestamp activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public Timestamp getActiveEndTime() {
		return this.activeEndTime;
	}

	public void setActiveEndTime(Timestamp activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public String getAreaDesc() {
		return this.areaDesc;
	}

	public void setAreaDesc(String areaDesc) {
		this.areaDesc = areaDesc;
	}

	public Float getProbability() {
		return this.probability;
	}

	public void setProbability(Float probability) {
		this.probability = probability;
	}

	public String getIsSerail() {
		return this.isSerail;
	}

	public void setIsSerail(String isSerail) {
		this.isSerail = isSerail;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getTasks() {
		return this.tasks;
	}

	public void setTasks(String tasks) {
		this.tasks = tasks;
	}

	public Boolean getAudited() {
		return this.audited;
	}

	public void setAudited(Boolean audited) {
		this.audited = audited;
	}

	public Integer getAddExperience() {
		return this.addExperience;
	}

	public void setAddExperience(Integer addExperience) {
		this.addExperience = addExperience;
	}

	public String getReceiveConfig() {
		return this.receiveConfig;
	}

	public void setReceiveConfig(String receiveConfig) {
		this.receiveConfig = receiveConfig;
	}

	public Short getShowScope() {
		return this.showScope;
	}

	public void setShowScope(Short showScope) {
		this.showScope = showScope;
	}

	public String getIsTestData() {
		return this.isTestData;
	}

	public void setIsTestData(String isTestData) {
		this.isTestData = isTestData;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getDetailPic() {
		return this.detailPic;
	}

	public void setDetailPic(String detailPic) {
		this.detailPic = detailPic;
	}

	public Float getDiscount() {
		return this.discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public Short getGoodsLevel() {
		return this.goodsLevel;
	}

	public void setGoodsLevel(Short goodsLevel) {
		this.goodsLevel = goodsLevel;
	}

	public String getAwardIcons() {
		return awardIcons;
	}

	public void setAwardIcons(String awardIcons) {
		this.awardIcons = awardIcons;
	}

	public String getPropId() {
		return propId;
	}

	public void setPropId(String propId) {
		this.propId = propId;
	}

	public Integer getPropNum() {
		return propNum;
	}

	public void setPropNum(Integer propNum) {
		this.propNum = propNum;
	}

	public Date getSerialStartTime() {
		return serialStartTime;
	}

	public void setSerialStartTime(Date serialStartTime) {
		this.serialStartTime = serialStartTime;
	}

	public Integer getTaskId() {
		return taskId;
	}

	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Long getAutoIncrId() {
		return autoIncrId;
	}

	public void setAutoIncrId(Long autoIncrId) {
		this.autoIncrId = autoIncrId;
	}
}