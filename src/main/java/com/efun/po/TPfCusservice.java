package com.efun.po;

import java.util.Date;

/**
 * TPfCusservice entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TPfCusservice implements java.io.Serializable {
	private static final long serialVersionUID = -5415883211505985425L;

	// Fields

	private String id;
	private Long userid;
	private String csno;
	private String sex;
	private String nickname;
	private String profile;
	private String icon;
	private Integer likes;
	private Integer deleted;
	private Integer reservedField1;
	private Integer reservedField2;
	private String reservedField3;
	private String reservedField4;
	private Date createdTime;
	private Date modifiedTime;

	// Constructors

	/** default constructor */
	public TPfCusservice() {
	}

	/** minimal constructor */
	public TPfCusservice(Long userid, String csno, String nickname,
			String profile, String icon, Date createdTime, Date modifiedTime) {
		this.userid = userid;
		this.csno = csno;
		this.nickname = nickname;
		this.profile = profile;
		this.icon = icon;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	/** full constructor */
	public TPfCusservice(Long userid, String csno, String sex, String nickname,
			String profile, String icon, Integer likes, Integer deleted,
			Integer reservedField1, Integer reservedField2,
			String reservedField3, String reservedField4, Date createdTime,
			Date modifiedTime) {
		this.userid = userid;
		this.csno = csno;
		this.sex = sex;
		this.nickname = nickname;
		this.profile = profile;
		this.icon = icon;
		this.likes = likes;
		this.deleted = deleted;
		this.reservedField1 = reservedField1;
		this.reservedField2 = reservedField2;
		this.reservedField3 = reservedField3;
		this.reservedField4 = reservedField4;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getCsno() {
		return this.csno;
	}

	public void setCsno(String csno) {
		this.csno = csno;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getLikes() {
		return this.likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Integer getReservedField1() {
		return this.reservedField1;
	}

	public void setReservedField1(Integer reservedField1) {
		this.reservedField1 = reservedField1;
	}

	public Integer getReservedField2() {
		return this.reservedField2;
	}

	public void setReservedField2(Integer reservedField2) {
		this.reservedField2 = reservedField2;
	}

	public String getReservedField3() {
		return this.reservedField3;
	}

	public void setReservedField3(String reservedField3) {
		this.reservedField3 = reservedField3;
	}

	public String getReservedField4() {
		return this.reservedField4;
	}

	public void setReservedField4(String reservedField4) {
		this.reservedField4 = reservedField4;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}