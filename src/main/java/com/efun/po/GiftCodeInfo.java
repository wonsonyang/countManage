package com.efun.po;

import java.sql.Timestamp;

/**
 * 
 * @author peterpeng
 * @date 2017-03-01 13:02
 */
public class GiftCodeInfo implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;

	private String gameCode;

	private String propId;

	private String codeDesc;

	private Timestamp activeStartTime;

	private Timestamp activeEndTime;

	private Timestamp createdTime;

	private Timestamp modifiedTime;

	private Integer number;         // 奖品数量

	private Integer deleted;        // 是否删除 0：未删除, 1：删除

	private Integer giftCodeCount;  // 礼品码数量

	private String platform;      // 平台

	private Integer useCount;     // 用户可使用礼品码数量，默认1

	private Float amount;         // 原币金额

	private Integer awardType;    // 奖励类型:0游戏道具,1游戏币

	private String currency;     // 币种
	
	private Integer codeType; //是否通码 0、非通码; 1、通码
	
	private Integer awardRange; //发奖范围 0、userId发奖; 1、roleId发奖
	
	private String code; // 通码

	public GiftCodeInfo() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPropId() {
		return propId;
	}

	public void setPropId(String propId) {
		this.propId = propId;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public Timestamp getActiveStartTime() {
		return activeStartTime;
	}

	public void setActiveStartTime(Timestamp activeStartTime) {
		this.activeStartTime = activeStartTime;
	}

	public Timestamp getActiveEndTime() {
		return activeEndTime;
	}

	public void setActiveEndTime(Timestamp activeEndTime) {
		this.activeEndTime = activeEndTime;
	}

	public Timestamp getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getGiftCodeCount() {
		return giftCodeCount;
	}

	public void setGiftCodeCount(Integer giftCodeCount) {
		this.giftCodeCount = giftCodeCount;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public Integer getUseCount() {
		return useCount;
	}

	public void setUseCount(Integer useCount) {
		this.useCount = useCount;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}

	public Integer getAwardType() {
		return awardType;
	}

	public void setAwardType(Integer awardType) {
		this.awardType = awardType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Integer getCodeType() {
		return codeType;
	}

	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
	}

	public Integer getAwardRange() {
		return awardRange;
	}

	public void setAwardRange(Integer awardRange) {
		this.awardRange = awardRange;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "GiftCodeInfo [id=" + id + ", gameCode=" + gameCode + ", propId=" + propId
				+ ", codeDesc=" + codeDesc + ", activeStartTime=" + activeStartTime
				+ ", activeEndTime=" + activeEndTime + ", createdTime=" + createdTime
				+ ", modifiedTime=" + modifiedTime + ", number=" + number + ", deleted=" + deleted
				+ ", giftCodeCount=" + giftCodeCount + ", platform=" + platform + ", useCount=" + useCount 
				+ ", codeType=" + codeType+ ", awardRange=" + awardRange + ", code=" + code+ "]";
	}

}
