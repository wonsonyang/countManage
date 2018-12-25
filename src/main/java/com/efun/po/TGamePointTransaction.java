package com.efun.po;

import java.sql.Timestamp;

/**
 * TGamePointTransaction entity. @author MyEclipse Persistence Tools
 */

public class TGamePointTransaction implements java.io.Serializable {
	private static final long serialVersionUID = -7210261681459960039L;

	// Fields

	private Long id;
	private Long useridOut;
	private Long useridIn;
	private Float point;
	private Float freePoint;
	private Integer transactionType;
	private String transactionId;
	private String efunOrderIdOut;
	private String efunOrderIdIn;
	private String efunOrderIdOutBackOut;
	private String efunOrderIdInBackOut;
	private String transactionIdBackout;
	private String transactionFrom;
	private String isSuccess;
	private String isBackout;
	private Timestamp createdTime;
	private Timestamp transactionTime;
	private Timestamp backoutTime;
	private Timestamp modifiedTime;
	private String operator;
	private String operatorIp;
	private String remark;
	private String flag;
	private String gameCode;

	// Constructors

	/** default constructor */
	public TGamePointTransaction() {
	}

	/** minimal constructor */
	public TGamePointTransaction(Float point, Float freePoint) {
		this.point = point;
		this.freePoint = freePoint;
	}

	/** full constructor */
	public TGamePointTransaction(Long useridOut, Long useridIn, Float point,
			Float freePoint, Integer transactionType, String transactionId,
			String efunOrderIdOut, String efunOrderIdIn,
			String efunOrderIdOutBackOut, String efunOrderIdInBackOut,
			String transactionIdBackout, String transactionFrom,
			String isSuccess, String isBackout, Timestamp createdTime,
			Timestamp transactionTime, Timestamp backoutTime,
			Timestamp modifiedTime, String operator, String operatorIp,
			String remark, String flag, String gameCode) {
		this.useridOut = useridOut;
		this.useridIn = useridIn;
		this.point = point;
		this.freePoint = freePoint;
		this.transactionType = transactionType;
		this.transactionId = transactionId;
		this.efunOrderIdOut = efunOrderIdOut;
		this.efunOrderIdIn = efunOrderIdIn;
		this.efunOrderIdOutBackOut = efunOrderIdOutBackOut;
		this.efunOrderIdInBackOut = efunOrderIdInBackOut;
		this.transactionIdBackout = transactionIdBackout;
		this.transactionFrom = transactionFrom;
		this.isSuccess = isSuccess;
		this.isBackout = isBackout;
		this.createdTime = createdTime;
		this.transactionTime = transactionTime;
		this.backoutTime = backoutTime;
		this.modifiedTime = modifiedTime;
		this.operator = operator;
		this.operatorIp = operatorIp;
		this.remark = remark;
		this.flag = flag;
		this.gameCode = gameCode;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUseridOut() {
		return this.useridOut;
	}

	public void setUseridOut(Long useridOut) {
		this.useridOut = useridOut;
	}

	public Long getUseridIn() {
		return this.useridIn;
	}

	public void setUseridIn(Long useridIn) {
		this.useridIn = useridIn;
	}

	public Float getPoint() {
		return this.point;
	}

	public void setPoint(Float point) {
		this.point = point;
	}

	public Float getFreePoint() {
		return this.freePoint;
	}

	public void setFreePoint(Float freePoint) {
		this.freePoint = freePoint;
	}

	public Integer getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getEfunOrderIdOut() {
		return this.efunOrderIdOut;
	}

	public void setEfunOrderIdOut(String efunOrderIdOut) {
		this.efunOrderIdOut = efunOrderIdOut;
	}

	public String getEfunOrderIdIn() {
		return this.efunOrderIdIn;
	}

	public void setEfunOrderIdIn(String efunOrderIdIn) {
		this.efunOrderIdIn = efunOrderIdIn;
	}

	public String getEfunOrderIdOutBackOut() {
		return this.efunOrderIdOutBackOut;
	}

	public void setEfunOrderIdOutBackOut(String efunOrderIdOutBackOut) {
		this.efunOrderIdOutBackOut = efunOrderIdOutBackOut;
	}

	public String getEfunOrderIdInBackOut() {
		return this.efunOrderIdInBackOut;
	}

	public void setEfunOrderIdInBackOut(String efunOrderIdInBackOut) {
		this.efunOrderIdInBackOut = efunOrderIdInBackOut;
	}

	public String getTransactionIdBackout() {
		return this.transactionIdBackout;
	}

	public void setTransactionIdBackout(String transactionIdBackout) {
		this.transactionIdBackout = transactionIdBackout;
	}

	public String getTransactionFrom() {
		return this.transactionFrom;
	}

	public void setTransactionFrom(String transactionFrom) {
		this.transactionFrom = transactionFrom;
	}

	public String getIsSuccess() {
		return this.isSuccess;
	}

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getIsBackout() {
		return this.isBackout;
	}

	public void setIsBackout(String isBackout) {
		this.isBackout = isBackout;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getTransactionTime() {
		return this.transactionTime;
	}

	public void setTransactionTime(Timestamp transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Timestamp getBackoutTime() {
		return this.backoutTime;
	}

	public void setBackoutTime(Timestamp backoutTime) {
		this.backoutTime = backoutTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorIp() {
		return this.operatorIp;
	}

	public void setOperatorIp(String operatorIp) {
		this.operatorIp = operatorIp;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

}