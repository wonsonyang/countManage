package com.efun.po;

import java.util.Date;

/**
 * TUppic entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUppic implements java.io.Serializable {
	private static final long serialVersionUID = 7107424831402624294L;

	// Fields

	private Long pid;
	private Long moduleid;
	private String author;
	private Long pictype;
	private String smallpic;
	private String bigpic;
	private Long viewCount;
	private Long commentCount;
	private Long status;
	private Date crtime;
	private Date effectiveTime;
	
	private String title;
	private String commendUrl;
	private String url;
	private String gamename;
	private String gameserver;
	private String description;
	private String keyword;
	private String plateType;
	private Integer orderno;
	private String gameCode;
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	private String item5;
	private Date startTime;
	private Date endTime;
	private String language;
	private String platform;

	// Constructors

	/** default constructor */
	public TUppic() {
	}

	public TUppic(Long pid, Long moduleid, String author, Long pictype,
			String smallpic, String bigpic, Long viewCount, Long commentCount,
			Long status, Date crtime, Date effectiveTime, String title,
			String commendUrl, String url, String gamename, String gameserver,
			String description, String keyword, String plateType,
			Integer orderno, String gameCode, String item1, String item2,
			String item3, String item4, String item5, Date startTime, Date endTime,String language) {
		super();
		this.pid = pid;
		this.moduleid = moduleid;
		this.author = author;
		this.pictype = pictype;
		this.smallpic = smallpic;
		this.bigpic = bigpic;
		this.viewCount = viewCount;
		this.commentCount = commentCount;
		this.status = status;
		this.crtime = crtime;
		this.effectiveTime = effectiveTime;
		this.title = title;
		this.commendUrl = commendUrl;
		this.url = url;
		this.gamename = gamename;
		this.gameserver = gameserver;
		this.description = description;
		this.keyword = keyword;
		this.plateType = plateType;
		this.orderno = orderno;
		this.gameCode = gameCode;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
		this.startTime = startTime;
		this.endTime = endTime;
		this.language = language;
	}



	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Long getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(Long moduleid) {
		this.moduleid = moduleid;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getPictype() {
		return this.pictype;
	}

	public void setPictype(Long pictype) {
		this.pictype = pictype;
	}

	public String getSmallpic() {
		return this.smallpic;
	}

	public void setSmallpic(String smallpic) {
		this.smallpic = smallpic;
	}

	public String getBigpic() {
		return this.bigpic;
	}

	public void setBigpic(String bigpic) {
		this.bigpic = bigpic;
	}

	public Long getViewCount() {
		return this.viewCount;
	}

	public void setViewCount(Long viewCount) {
		this.viewCount = viewCount;
	}

	public Long getCommentCount() {
		return this.commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public Long getStatus() {
		return this.status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Date getCrtime() {
		return this.crtime;
	}

	public void setCrtime(Date crtime) {
		this.crtime = crtime;
	}
	
	public Date getEffectiveTime() {
		return effectiveTime;
	}

	public void setEffectiveTime(Date effectiveTime) {
		this.effectiveTime = effectiveTime;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCommendUrl() {
		return this.commendUrl;
	}

	public void setCommendUrl(String commendUrl) {
		this.commendUrl = commendUrl;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getGamename() {
		return this.gamename;
	}

	public void setGamename(String gamename) {
		this.gamename = gamename;
	}

	public String getGameserver() {
		return this.gameserver;
	}

	public void setGameserver(String gameserver) {
		this.gameserver = gameserver;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPlateType() {
		return this.plateType;
	}

	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}

	public Integer getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}