package com.efun.po;

import java.sql.Timestamp;

/**
 * TPfGameinfo entity. @author MyEclipse Persistence Tools
 */

public class TPfGameinfo implements java.io.Serializable {
	private static final long serialVersionUID = 5913592747055883333L;

	// Fields

	private Long id;
	private String title;
	private String author;
	private String smallpic;
	private String bigpic;
	private String video;
	private String content;
	private Timestamp crtime;
	private String comefrom;
	private Long hot;
	private String fileurl;
	private String cruser;
	private Long moduleid;
	private Integer viewcount;
	private Long score;
	private Integer commentSum;
	private Integer type;
	private String gmname;
	private Timestamp showtime;
	private Timestamp endshowtime;
	private Integer orderno;
	private Integer showtype;
	private String url;
	private Integer disabled;
	private String keyword;
	private Integer delsign;
	private String description;
	private String seoTitle;
	private String htmlpathurl;
	private String shortDesc;
	private String language;
	private String picDisplay;
	private String recomGameCode;
	private String actGameCode;
	private Integer appOrderNo;
	private Boolean audited;
	private String shieldGames;
	private Integer isvip;
	private String newVersionDesc;
	private String area;
	private String bgPic;
	private String newTitle;
	private String platform;
	// Constructors

	/** default constructor */
	public TPfGameinfo() {
	}

	/** minimal constructor */
	public TPfGameinfo(Integer isvip) {
		this.isvip = isvip;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
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

	public String getVideo() {
		return this.video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCrtime() {
		return this.crtime;
	}

	public void setCrtime(Timestamp crtime) {
		this.crtime = crtime;
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

	public Long getHot() {
		return this.hot;
	}

	public void setHot(Long hot) {
		this.hot = hot;
	}

	public String getFileurl() {
		return this.fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public String getCruser() {
		return this.cruser;
	}

	public void setCruser(String cruser) {
		this.cruser = cruser;
	}

	public Long getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(Long moduleid) {
		this.moduleid = moduleid;
	}

	public Integer getViewcount() {
		return this.viewcount;
	}

	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}

	public Long getScore() {
		return this.score;
	}

	public void setScore(Long score) {
		this.score = score;
	}

	public Integer getCommentSum() {
		return this.commentSum;
	}

	public void setCommentSum(Integer commentSum) {
		this.commentSum = commentSum;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getGmname() {
		return this.gmname;
	}

	public void setGmname(String gmname) {
		this.gmname = gmname;
	}

	public Timestamp getShowtime() {
		return this.showtime;
	}

	public void setShowtime(Timestamp showtime) {
		this.showtime = showtime;
	}

	public Timestamp getEndshowtime() {
		return this.endshowtime;
	}

	public void setEndshowtime(Timestamp endshowtime) {
		this.endshowtime = endshowtime;
	}

	public Integer getOrderno() {
		return this.orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public Integer getShowtype() {
		return this.showtype;
	}

	public void setShowtype(Integer showtype) {
		this.showtype = showtype;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getDisabled() {
		return this.disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Integer getDelsign() {
		return this.delsign;
	}

	public void setDelsign(Integer delsign) {
		this.delsign = delsign;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSeoTitle() {
		return this.seoTitle;
	}

	public void setSeoTitle(String seoTitle) {
		this.seoTitle = seoTitle;
	}

	public String getHtmlpathurl() {
		return this.htmlpathurl;
	}

	public void setHtmlpathurl(String htmlpathurl) {
		this.htmlpathurl = htmlpathurl;
	}

	public String getShortDesc() {
		return this.shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getPicDisplay() {
		return this.picDisplay;
	}

	public void setPicDisplay(String picDisplay) {
		this.picDisplay = picDisplay;
	}

	public String getRecomGameCode() {
		return this.recomGameCode;
	}

	public void setRecomGameCode(String recomGameCode) {
		this.recomGameCode = recomGameCode;
	}

	public String getActGameCode() {
		return this.actGameCode;
	}

	public void setActGameCode(String actGameCode) {
		this.actGameCode = actGameCode;
	}

	public Integer getAppOrderNo() {
		return this.appOrderNo;
	}

	public void setAppOrderNo(Integer appOrderNo) {
		this.appOrderNo = appOrderNo;
	}

	public Boolean getAudited() {
		return this.audited;
	}

	public void setAudited(Boolean audited) {
		this.audited = audited;
	}

	public String getShieldGames() {
		return this.shieldGames;
	}

	public void setShieldGames(String shieldGames) {
		this.shieldGames = shieldGames;
	}

	public Integer getIsvip() {
		return this.isvip;
	}

	public void setIsvip(Integer isvip) {
		this.isvip = isvip;
	}

	public String getNewVersionDesc() {
		return newVersionDesc;
	}

	public void setNewVersionDesc(String newVersionDesc) {
		this.newVersionDesc = newVersionDesc;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getBgPic() {
		return bgPic;
	}

	public void setBgPic(String bgPic) {
		this.bgPic = bgPic;
	}

	public String getNewTitle() {
		return newTitle;
	}

	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}
}