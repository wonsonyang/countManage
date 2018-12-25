package com.efun.po;

import java.util.Date;

/**
 * TGamePartnerMoney entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePartnerMoney implements java.io.Serializable {
	private static final long serialVersionUID = 4776527911735283966L;

	// Fields

	private Long gptmid;
	private Integer gsid;
	private String gameCode;
	private String serverCode;
	private String partnerCode;
	private String moneyType;
	private String payFrom;
	private Long uid;
	private Float gamePoint;
	private Float gamePay;
	private Integer stone;
	private String resultCode;
	private String payStatus;
	private String efunOrderId;
	private String ptOrderId;
	private String creditId;
	private String token;
	private String payType;
	private String playerId;
	private Date createdTime;
	private Date modifiedTime;
	private String flag;
	private String currency;
	private String remark;
	private Float twCoin;

	// Constructors

	/** default constructor */
	public TGamePartnerMoney() {
	}

	/** full constructor */
	public TGamePartnerMoney(Integer gsid, String gameCode, String serverCode,
			String partnerCode, String moneyType, String payFrom, Long uid,
			Float gamePoint, Float gamePay, Integer stone, String resultCode,
			String payStatus, String efunOrderId, String ptOrderId,
			String creditId, String token, String payType, String playerId,
			Date createdTime, Date modifiedTime, String flag, String currency,
			String remark, Float twCoin) {
		this.gsid = gsid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.partnerCode = partnerCode;
		this.moneyType = moneyType;
		this.payFrom = payFrom;
		this.uid = uid;
		this.gamePoint = gamePoint;
		this.gamePay = gamePay;
		this.stone = stone;
		this.resultCode = resultCode;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.ptOrderId = ptOrderId;
		this.creditId = creditId;
		this.token = token;
		this.payType = payType;
		this.playerId = playerId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.flag = flag;
		this.currency = currency;
		this.remark = remark;
		this.twCoin = twCoin;
	}

	// Property accessors

	public Long getGptmid() {
		return this.gptmid;
	}

	public void setGptmid(Long gptmid) {
		this.gptmid = gptmid;
	}

	public Integer getGsid() {
		return this.gsid;
	}

	public void setGsid(Integer gsid) {
		this.gsid = gsid;
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

	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
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

	public Integer getStone() {
		return this.stone;
	}

	public void setStone(Integer stone) {
		this.stone = stone;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getPayStatus() {
		return this.payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getEfunOrderId() {
		return this.efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getPtOrderId() {
		return this.ptOrderId;
	}

	public void setPtOrderId(String ptOrderId) {
		this.ptOrderId = ptOrderId;
	}

	public String getCreditId() {
		return this.creditId;
	}

	public void setCreditId(String creditId) {
		this.creditId = creditId;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getTwCoin() {
		return this.twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
	}

}