package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 *  t_gameplayer_problem
 */
public class TGameplayerProblem implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * tgppid 编号
	 */
	private Integer tgppid;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * serverCode 游戏服代码
	 */
	private String serverCode;

	/**
	 * roleid 玩家账号
	 */
	private String roleid;

	/**
	 * palayName 玩家角色名
	 */
	private String palayName;

	/**
	 * uid 用户ID
	 */
	private String uid;

	/**
	 * createTime 提问时间
	 */
	private Date createTime;

	/**
	 * questionsTitle 
	 */
	private String questionsTitle;

	/**
	 * theQuestions 问题内容
	 */
	private String theQuestions;

	/**
	 * questionType 问题类型
	 */
	private Integer questionType;

	/**
	 * replyState 回复状态
	 */
	private Integer replyState;

	/**
	 * tcspid 外键引用
	 */
	private Integer tcspid;

	/**
	 * plateform 
	 */
	private String plateform;

	/**
	 * item1 预留字段1
	 */
	private String item1;

	/**
	 * item2 预留字段2
	 */
	private String item2;

	/**
	 * item3 预留字段3
	 */
	private String item3;

	/**
	 * item4 
	 */
	private String item4;

	/**
	 * item5 预留字段5
	 */
	private String item5;

	/**
	 * img 
	 */
	private String img;

	/**
	 * item6 
	 */
	private String item6;

	/**
	 * item7 
	 */
	private Date item7;

	/**
	 * item8 
	 */
	private String item8;

	/**
	 * item9 
	 */
	private String item9;

	/**
	 * item10 
	 */
	private String item10;

	/**
	 * dynamicTime 动态时间，默认为提问时间，存放最新玩家追问时间
	 */
	private Date dynamicTime;

	/**
	 * language_ 语言
	 */
	private String language_;

	/**
	 * remark 备注
	 */
	private String remark;

	/**
	 * item11 备用字段11
	 */
	private String item11;

	/**
	 * item12 备用字段12
	 */
	private String item12;

	/**
	 * item13 备用字段13
	 */
	private String item13;

	/**
	 * item14 
	 */
	private String item14;

	/**
	 * item15 备用字段15
	 */
	private String item15;

	/**
	 * qq 玩家QQ号码
	 */
	private String qq;

	/**
	 * wechat 玩家微信号
	 */
	private String wechat;

	/**
	 * interval 间隔时间
	 */
	private Integer interval;
	
	/**
	 * 储值类型
	 */
	private String payType;
	
	/**
	 * 储值时间
	 */
	private Date payTime;
	
	/**
	 * 储值金额
	 */
	private Double payAmount;
	
	/**
	 * 储值订单号
	 */
	private String payId;
	
	/**
	 * 留言给客服
	 */
	private String csRemark;
	
	/**
	 * 留言给平台
	 */
	private String pfRemark;
	
	/**
	 * 支付状态
	 */
	private String payStatus;
	
	/**
	 * Efun订单号，补发用
	 */
	private String efunOrderId;
	
	/**
	 * Google订单号，补发用
	 */
	private String googleOrderId;
	
	/**
	 * 金流订单号，补发用
	 */
	private String transactionId;
	
	/**
	 * 订单主键，补发用
	 */
	private String gpmid;

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}

	public Integer getTgppid() {
		return tgppid;
	}

	public void setTgppid(Integer tgppid) {
		this.tgppid = tgppid;
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

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getPalayName() {
		return palayName;
	}

	public void setPalayName(String palayName) {
		this.palayName = palayName;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getQuestionsTitle() {
		return questionsTitle;
	}

	public void setQuestionsTitle(String questionsTitle) {
		this.questionsTitle = questionsTitle;
	}

	public String getTheQuestions() {
		return theQuestions;
	}

	public void setTheQuestions(String theQuestions) {
		this.theQuestions = theQuestions;
	}

	public Integer getQuestionType() {
		return questionType;
	}

	public void setQuestionType(Integer questionType) {
		this.questionType = questionType;
	}

	public Integer getReplyState() {
		return replyState;
	}

	public void setReplyState(Integer replyState) {
		this.replyState = replyState;
	}

	public Integer getTcspid() {
		return tcspid;
	}

	public void setTcspid(Integer tcspid) {
		this.tcspid = tcspid;
	}

	public String getPlateform() {
		return plateform;
	}

	public void setPlateform(String plateform) {
		this.plateform = plateform;
	}

	public String getItem1() {
		return item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getItem6() {
		return item6;
	}

	public void setItem6(String item6) {
		this.item6 = item6;
	}

	public Date getItem7() {
		return item7;
	}

	public void setItem7(Date item7) {
		this.item7 = item7;
	}

	public String getItem8() {
		return item8;
	}

	public void setItem8(String item8) {
		this.item8 = item8;
	}

	public String getItem9() {
		return item9;
	}

	public void setItem9(String item9) {
		this.item9 = item9;
	}

	public String getItem10() {
		return item10;
	}

	public void setItem10(String item10) {
		this.item10 = item10;
	}

	public Date getDynamicTime() {
		return dynamicTime;
	}

	public void setDynamicTime(Date dynamicTime) {
		this.dynamicTime = dynamicTime;
	}

	public String getLanguage_() {
		return language_;
	}

	public void setLanguage_(String language_) {
		this.language_ = language_;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getItem11() {
		return item11;
	}

	public void setItem11(String item11) {
		this.item11 = item11;
	}

	public String getItem12() {
		return item12;
	}

	public void setItem12(String item12) {
		this.item12 = item12;
	}

	public String getItem13() {
		return item13;
	}

	public void setItem13(String item13) {
		this.item13 = item13;
	}

	public String getItem14() {
		return item14;
	}

	public void setItem14(String item14) {
		this.item14 = item14;
	}

	public String getItem15() {
		return item15;
	}

	public void setItem15(String item15) {
		this.item15 = item15;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWechat() {
		return wechat;
	}

	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getCsRemark() {
		return csRemark;
	}

	public void setCsRemark(String csRemark) {
		this.csRemark = csRemark;
	}

	public String getPfRemark() {
		return pfRemark;
	}

	public void setPfRemark(String pfRemark) {
		this.pfRemark = pfRemark;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getEfunOrderId() {
		return efunOrderId;
	}

	public void setEfunOrderId(String efunOrderId) {
		this.efunOrderId = efunOrderId;
	}

	public String getGoogleOrderId() {
		return googleOrderId;
	}

	public void setGoogleOrderId(String googleOrderId) {
		this.googleOrderId = googleOrderId;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getGpmid() {
		return gpmid;
	}

	public void setGpmid(String gpmid) {
		this.gpmid = gpmid;
	}

}