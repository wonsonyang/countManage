package com.efun.po;

import java.util.Date;

/**
 * TCusserviceProblem entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TCusserviceProblem implements java.io.Serializable {
	private static final long serialVersionUID = 7786842972587608900L;

	// Fields

	private Integer tcspid;
	private String gameCode;
	private String serverCode;
	private Integer tgppid;
	private Date replyTime;
	private String replyName;
	private String replyUid;
	private String replyContent;
	private String plateform;
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	private String item5;
	private Integer interval;

	// Constructors

	/** default constructor */
	public TCusserviceProblem() {
	}

	/** minimal constructor */
	public TCusserviceProblem(Date replyTime) {
		this.replyTime = replyTime;
	}

	/** full constructor */
	public TCusserviceProblem(String gameCode, String serverCode,
			Integer tgppid, Date replyTime, String replyName, String replyUid,
			String replyContent, String plateform, String item1, String item2,
			String item3, String item4, String item5) {
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.tgppid = tgppid;
		this.replyTime = replyTime;
		this.replyName = replyName;
		this.replyUid = replyUid;
		this.replyContent = replyContent;
		this.plateform = plateform;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
	}

	// Property accessors

	public Integer getTcspid() {
		return this.tcspid;
	}

	public void setTcspid(Integer tcspid) {
		this.tcspid = tcspid;
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

	public Integer getTgppid() {
		return this.tgppid;
	}

	public void setTgppid(Integer tgppid) {
		this.tgppid = tgppid;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public String getReplyName() {
		return this.replyName;
	}

	public void setReplyName(String replyName) {
		this.replyName = replyName;
	}

	public String getReplyUid() {
		return this.replyUid;
	}

	public void setReplyUid(String replyUid) {
		this.replyUid = replyUid;
	}

	public String getReplyContent() {
		return this.replyContent;
	}

	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}

	public String getPlateform() {
		return this.plateform;
	}

	public void setPlateform(String plateform) {
		this.plateform = plateform;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return this.item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return this.item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return this.item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

	public Integer getInterval() {
		return interval;
	}

	public void setInterval(Integer interval) {
		this.interval = interval;
	}
}