package com.efun.po;

import java.util.Date;

/**
 * TGameMoneyTstore entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameMoneyTstore implements java.io.Serializable {
	private static final long serialVersionUID = -5360495152635732061L;

	// Fields

	private Long gmtid;
	private Long gsid;
	private Long uid;
	private String playerId;
	private String gameCode;
	private String serverCode;
	private String payFrom;
	private String moneyType;
	private String payType;
	private Float gamePay;
	private Float stone;
	private String payStatus;
	private String efunOrderId;
	private String tstoreOrderId;
	private Date createdTime;
	private Date modifiedTime;
	private Float twCoin;
	private Float usd;
	private String flag;
	private String remark;
	private String purchaseId;
	private String productId;

	// Constructors

	/** default constructor */
	public TGameMoneyTstore() {
	}

	/** full constructor */
	public TGameMoneyTstore(Long gsid, Long uid, String playerId,
			String gameCode, String serverCode, String payFrom,
			String moneyType, String payType, Float gamePay, Float stone,
			String payStatus, String efunOrderId, String tstoreOrderId,
			Date createdTime, Date modifiedTime, Float twCoin,Float usd, String flag,
			String remark, String purchaseId, String productId) {
		this.gsid = gsid;
		this.uid = uid;
		this.playerId = playerId;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.payFrom = payFrom;
		this.moneyType = moneyType;
		this.payType = payType;
		this.gamePay = gamePay;
		this.stone = stone;
		this.payStatus = payStatus;
		this.efunOrderId = efunOrderId;
		this.tstoreOrderId = tstoreOrderId;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.twCoin = twCoin;
		this.flag = flag;
		this.remark = remark;
		this.usd = usd;
		this.purchaseId = purchaseId;
		this.productId = productId;
	}

	// Property accessors

	public Long getGmtid() {
		return this.gmtid;
	}

	public void setGmtid(Long gmtid) {
		this.gmtid = gmtid;
	}

	public Long getGsid() {
		return this.gsid;
	}

	public void setGsid(Long gsid) {
		this.gsid = gsid;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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

	public String getPayFrom() {
		return this.payFrom;
	}

	public void setPayFrom(String payFrom) {
		this.payFrom = payFrom;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Float getGamePay() {
		return this.gamePay;
	}

	public void setGamePay(Float gamePay) {
		this.gamePay = gamePay;
	}

	public Float getStone() {
		return this.stone;
	}

	public void setStone(Float stone) {
		this.stone = stone;
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

	public String getTstoreOrderId() {
		return this.tstoreOrderId;
	}

	public void setTstoreOrderId(String tstoreOrderId) {
		this.tstoreOrderId = tstoreOrderId;
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

	public Float getTwCoin() {
		return this.twCoin;
	}

	public void setTwCoin(Float twCoin) {
		this.twCoin = twCoin;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Float getUsd() {
		return usd;
	}

	public void setUsd(Float usd) {
		this.usd = usd;
	}

	public String getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

}