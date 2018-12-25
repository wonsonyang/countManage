package com.efun.po;

import com.efun.tools.StringUtil;

import java.util.Date;

/**
 * TPfLinks entity. @author MyEclipse Persistence Tools
 */

public class TPfGameItems implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	private String gameCode;
	
	private Integer pid;
	
	private String name;
	
	private String picture;
	
	private String description;
	
	private String content;
	
	private String htmlPathUrl;
	
	private Integer isOpen;
	
	private Integer deleted;
	
	private Date createdTime;
	
	private Date modifiedTime;

	private String picture1;

	private String picture2;

	private String picture3;

	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getHtmlPathUrl() {
		return htmlPathUrl;
	}

	public void setHtmlPathUrl(String htmlPathUrl) {
		this.htmlPathUrl = htmlPathUrl;
	}

	public Integer getIsOpen() {
		return isOpen;
	}

	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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

	public TPfGameItems() {
		super();
	}

	public TPfGameItems(Integer id, String gameCode, Integer pid, String name, String picture, String description, String content, String htmlPathUrl, Integer isOpen, Integer deleted, Date createdTime, Date modifiedTime, String picture1, String picture2, String picture3, String type) {
		this.id = id;
		this.gameCode = gameCode;
		this.pid = pid;
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.content = content;
		this.htmlPathUrl = htmlPathUrl;
		this.isOpen = isOpen;
		this.deleted = deleted;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.picture1 = picture1;
		this.picture2 = picture2;
		this.picture3 = picture3;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPicture1() {

		return picture1;
	}

	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}

	public String getPicture2() {
		return picture2;
	}

	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}

	public String getPicture3() {
		return picture3;
	}

	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}

	public void setPictrues(){
		if(StringUtil.isEmpty(picture)){
			picture = "";
			if(StringUtil.isNotEmpty(picture1)){
				picture += picture1;
			}
			picture += ";";
			if(StringUtil.isNotEmpty(picture2)){
				picture += picture2;
			}
			picture += ";";
			if(StringUtil.isNotEmpty(picture3)){
				picture += picture3;
			}
		}
	}
}