package com.efun.po;

import java.io.Serializable;

/**
 * 漫画表 t_pf_cartoon
 */
public class TPfCartoon implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id 唯一id标识
	 */
	private Long id;

	/**
	 * gameCode 游戏代码
	 */
	private String gameCode;

	/**
	 * name 漫画名字
	 */
	private String name;

	/**
	 * description 漫画简介
	 */
	private String description;

	/**
	 * cover 漫画封面
	 */
	private String cover;

	/**
	 * cartoon 漫画正文
	 */
	private String cartoon;

	/**
	 * bigPicUrl 漫画大图
	 */
	private String bigPicUrl;

	/**
	 * url 下载地址
	 */
	private String url;

	/**
	 * orderno 排序位置
	 */
	private Integer orderno;

	/**
	 * createdTime 创建时间
	 */
	private java.util.Date createdTime;

	/**
	 * modifiedTime 更新时间
	 */
	private java.util.Date modifiedTime;

	/**
	 * deleted
	 */
	private Integer deleted;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getCartoon() {
		return cartoon;
	}

	public void setCartoon(String cartoon) {
		this.cartoon = cartoon;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getOrderno() {
		return orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public java.util.Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(java.util.Date createdTime) {
		this.createdTime = createdTime;
	}

	public java.util.Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(java.util.Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getBigPicUrl() {
		return bigPicUrl;
	}

	public void setBigPicUrl(String bigPicUrl) {
		this.bigPicUrl = bigPicUrl;
	}
	
}