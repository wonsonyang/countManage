package com.efun.po;

import java.sql.Timestamp;

/**
 * TCrossFunctional entity. @author MyEclipse Persistence Tools
 */

public class TCrossFunctional implements java.io.Serializable {
	private static final long serialVersionUID = 3655199689337380470L;

	// Fields

	private Long id;
	private String context;
	private String pictureUrl;
	private String pictureName;
	private String activityCode;
	private String gameCode;
	private String promotinggameCode;
	private String statisticalUrl;
	private String mark;
	private Timestamp creationtime;
	private String isopen;
	private String serverCode;
	private String orderid;
	private Timestamp starttime;
	private Timestamp endtime;
	private String flag;
	private String outline;
	private String rewarddescription;

	// Constructors

	/** default constructor */
	public TCrossFunctional() {
	}

	/** minimal constructor */
	public TCrossFunctional(String activityCode, String gameCode,
			String promotinggameCode, String flag) {
		this.activityCode = activityCode;
		this.gameCode = gameCode;
		this.promotinggameCode = promotinggameCode;
		this.flag = flag;
	}

	/** full constructor */
	public TCrossFunctional(String context, String pictureUrl,
			String pictureName, String activityCode, String gameCode,
			String promotinggameCode, String statisticalUrl, String mark,
			Timestamp creationtime, String isopen, String serverCode,
			String orderid, Timestamp starttime, Timestamp endtime,
			String flag, String outline, String rewarddescription) {
		this.context = context;
		this.pictureUrl = pictureUrl;
		this.pictureName = pictureName;
		this.activityCode = activityCode;
		this.gameCode = gameCode;
		this.promotinggameCode = promotinggameCode;
		this.statisticalUrl = statisticalUrl;
		this.mark = mark;
		this.creationtime = creationtime;
		this.isopen = isopen;
		this.serverCode = serverCode;
		this.orderid = orderid;
		this.starttime = starttime;
		this.endtime = endtime;
		this.flag = flag;
		this.outline = outline;
		this.rewarddescription = rewarddescription;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getPictureUrl() {
		return this.pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getPictureName() {
		return this.pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getPromotinggameCode() {
		return this.promotinggameCode;
	}

	public void setPromotinggameCode(String promotinggameCode) {
		this.promotinggameCode = promotinggameCode;
	}

	public String getStatisticalUrl() {
		return this.statisticalUrl;
	}

	public void setStatisticalUrl(String statisticalUrl) {
		this.statisticalUrl = statisticalUrl;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public Timestamp getCreationtime() {
		return this.creationtime;
	}

	public void setCreationtime(Timestamp creationtime) {
		this.creationtime = creationtime;
	}

	public String getIsopen() {
		return this.isopen;
	}

	public void setIsopen(String isopen) {
		this.isopen = isopen;
	}

	public String getServerCode() {
		return this.serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Timestamp endtime) {
		this.endtime = endtime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getOutline() {
		return this.outline;
	}

	public void setOutline(String outline) {
		this.outline = outline;
	}

	public String getRewarddescription() {
		return this.rewarddescription;
	}

	public void setRewarddescription(String rewarddescription) {
		this.rewarddescription = rewarddescription;
	}

}