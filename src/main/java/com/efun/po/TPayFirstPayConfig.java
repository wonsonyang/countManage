package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * t_pay_firstPay_config
 * 首储规则配置实体
 * @author Efun
 *
 */
public class TPayFirstPayConfig implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	
	private String gameCode;                //游戏
	
	private Integer useType;                //用于首储判断的功能类型：0(汇款)
	
	private Integer firstPayRange;          //首储计算的储值范围,0:只算汇款储值,1：所有储值
	
	private Integer firstPayRule;           //首储计算规则,0:以uid计算（一個uid只能獲得一次雙倍機會）,
	//1:以伺服器計算（一個uid在一個伺服器只能獲得一次雙倍機會）,2:以角色計算（一個uid在按角色id計算雙倍機會，即同一個伺服器，不同角色都可獲得雙倍機會）
	
	private Date startTime;                  //开始时间
	
	private Date endTime;                    //结束时间
	
	private Date createdTime;                //创建时间
	
	private Date modifiedTime;               //修改时间
	
	private String operator;                 //操作人
	
	private Integer deleted;                 //是否删除；０：否，１，已删除
	
	private String str1;                     //备用参数1
	
	private String str2;                     //备用参数2

	public TPayFirstPayConfig() {
		super();
	}

	public TPayFirstPayConfig(Long id, String gameCode, Integer useType, Integer firstPayRange, Integer firstPayRule,
			Date startTime, Date endTime, Date createdTime, Date modifiedTime, String operator, Integer deleted,
			String str1, String str2) {
		super();
		this.id = id;
		this.gameCode = gameCode;
		this.useType = useType;
		this.firstPayRange = firstPayRange;
		this.firstPayRule = firstPayRule;
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

	public Integer getUseType() {
		return useType;
	}

	public void setUseType(Integer useType) {
		this.useType = useType;
	}

	public Integer getFirstPayRange() {
		return firstPayRange;
	}

	public void setFirstPayRange(Integer firstPayRange) {
		this.firstPayRange = firstPayRange;
	}

	public Integer getFirstPayRule() {
		return firstPayRule;
	}

	public void setFirstPayRule(Integer firstPayRule) {
		this.firstPayRule = firstPayRule;
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

	@Override
	public String toString() {
		return "TPayFirstPayConfig [id=" + id + ", gameCode=" + gameCode + ", useType=" + useType + ", firstPayRange="
				+ firstPayRange + ", firstPayRule=" + firstPayRule + ", startTime=" + startTime + ", endTime=" + endTime
				+ ", createdTime=" + createdTime + ", modifiedTime=" + modifiedTime + ", operator=" + operator
				+ ", deleted=" + deleted + ", str1=" + str1 + ", str2=" + str2 + "]";
	}
	
}