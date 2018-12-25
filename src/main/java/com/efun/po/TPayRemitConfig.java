package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 汇款奖励配置
 * t_pay_remit_config
 * @author Efun
 *
 */
public class TPayRemitConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String gameCode; //游戏
	
	private Integer firstValue; //是否首储配置；０：否，１：是
	
	private Integer isPfVip; //是否平台VIP配置；0：否，1：是
	
	private Float remitAmount; //汇款额度
	
	private Double rate; //返利比例
	
	private String awardContent; //发奖励配置内容,存放JSON List数据,JSON数据格式：awardName（奖励名称）,awardid（发奖励id）, num（发奖数量）
	
	private Date startTime; //开始时间
	
	private Date endTime;   //结束时间
	
	private Date createdTime; //创建时间
	
	private Date modifiedTime; //修改时间
	
	private String operator;  //操作人
	
	/*private String emailTitle; //邮件主题
	
	private String emailContent; //邮件内容
*/	
	private Integer deleted; //是否删除；０：否，１，已删除
	
	private String str1; //备用参数1
	
	private String str2; //备用参数2

	public TPayRemitConfig() {
		super();
	}

	public TPayRemitConfig(Long id, String gameCode, Integer firstValue, Float remitAmount, Double rate,
			String awardContent, Date startTime, Date endTime, Date createdTime, Date modifiedTime, String operator,
			Integer deleted, String str1, String str2) {
		super();
		this.id = id;
		this.gameCode = gameCode;
		this.firstValue = firstValue;
		this.remitAmount = remitAmount;
		this.rate = rate;
		this.awardContent = awardContent;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.operator = operator;
		this.deleted = deleted;
		this.str1 = str1;
		this.str2 = str2;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(Integer firstValue) {
		this.firstValue = firstValue;
	}

	public Float getRemitAmount() {
		return remitAmount;
	}

	public void setRemitAmount(Float remitAmount) {
		this.remitAmount = remitAmount;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getAwardContent() {
		return awardContent;
	}

	public void setAwardContent(String awardContent) {
		this.awardContent = awardContent;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
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

	public Integer getIsPfVip() {
		return isPfVip;
	}

	public void setIsPfVip(Integer isPfVip) {
		this.isPfVip = isPfVip;
	}

	@Override
	public String toString() {
		return "TPayRemitConfig [id=" + id + ", gameCode=" + gameCode + ", firstValue=" + firstValue + ", remitAmount="
				+ remitAmount + ", rate=" + rate + ", awardContent=" + awardContent + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime
				+ ", operator=" + operator +  ", deleted=" + deleted + ", str1=" + str1 + ", str2=" + str2 + "]";
	}
	
}