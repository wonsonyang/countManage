package com.efun.po;

import java.util.Date;

/**
 * TGameinfo entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameinfo implements java.io.Serializable {
	private static final long serialVersionUID = -9161256152217115977L;

	// Fields

	private Long id;
	private String title;
	private String author;
	private String smallpic;
	private String bigpic;
	private String video;
	private String content;
	private Date crtime;
	private String comefrom;
	private Long hot;
	private String fileurl;
	private String cruser;
	private Long moduleid;
	private Integer viewcount;
	private Long score;
	private Integer commentSum;
	private String url;
	private Integer type;
	private String gmname;
	private Date showtime;
	private Date endshowtime;
	private Integer orderno;
	private Integer showtype;
	private Integer disabled;
	private String keyword;
	private Integer delsign;
	private String description;
	private String seoTitle;
	private String htmlpathurl;
	private Integer audited;

	// Constructors

	/** default constructor */
	public TGameinfo() {
	}

	/** full constructor */
	public TGameinfo(String title, String author, String smallpic,
			String bigpic, String video, String content, Date crtime,
			String comefrom, Long hot, String fileurl, String cruser,
			Long moduleid, Integer viewcount, Long score, Integer commentSum,
			String url, Integer type, String gmname, Date showtime,
			Date endshowtime, Integer orderno, Integer showtype,
			Integer disabled, String keyword, Integer delsign,
			String description, String seoTitle, String htmlpathurl,
			Integer audited) {
		this.title = title;
		this.author = author;
		this.smallpic = smallpic;
		this.bigpic = bigpic;
		this.video = video;
		this.content = content;
		this.crtime = crtime;
		this.comefrom = comefrom;
		this.hot = hot;
		this.fileurl = fileurl;
		this.cruser = cruser;
		this.moduleid = moduleid;
		this.viewcount = viewcount;
		this.score = score;
		this.commentSum = commentSum;
		this.url = url;
		this.type = type;
		this.gmname = gmname;
		this.showtime = showtime;
		this.endshowtime = endshowtime;
		this.orderno = orderno;
		this.showtype = showtype;
		this.disabled = disabled;
		this.keyword = keyword;
		this.delsign = delsign;
		this.description = description;
		this.seoTitle = seoTitle;
		this.htmlpathurl = htmlpathurl;
		this.audited = audited;
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

	public Date getCrtime() {
		return this.crtime;
	}

	public void setCrtime(Date crtime) {
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

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	public Date getShowtime() {
		return this.showtime;
	}

	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}

	public Date getEndshowtime() {
		return this.endshowtime;
	}

	public void setEndshowtime(Date endshowtime) {
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

	public Integer getAudited() {
		return audited;
	}

	public void setAudited(Integer audited) {
		this.audited = audited;
	}	 
}