package com.efun.po;

import java.util.Date;

/**
 * TAdvertisers entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TAdvertisers implements java.io.Serializable {
	private static final long serialVersionUID = -5676604826584032678L;

	// Fields

	private Integer id;
	private String advertiser;
	private String name;
	private Date createdTime;
	private String address;
	private String type;
	private String matchType;
	private String important;
	private String otherName;
	private String canCount;
	private String remark;
	private String hk;
	private String ae;
	private String kr;
	private String sa;
	private String cn;
	private String adType;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAdvertisers() {
	}

	/** minimal constructor */
	public TAdvertisers(String advertiser, String name, String deleted) {
		this.advertiser = advertiser;
		this.name = name;
		this.deleted = deleted;
	}

	/** full constructor */
	public TAdvertisers(String advertiser, String name, Date createdTime,
			String address, String type, String matchType, String important,
			String otherName, String canCount, String remark, String hk,
			String ae, String kr, String sa, String cn, String adType,
			String deleted) {
		this.advertiser = advertiser;
		this.name = name;
		this.createdTime = createdTime;
		this.address = address;
		this.type = type;
		this.matchType = matchType;
		this.important = important;
		this.otherName = otherName;
		this.canCount = canCount;
		this.remark = remark;
		this.hk = hk;
		this.ae = ae;
		this.kr = kr;
		this.sa = sa;
		this.cn = cn;
		this.adType = adType;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdvertiser() {
		return this.advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMatchType() {
		return this.matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getImportant() {
		return this.important;
	}

	public void setImportant(String important) {
		this.important = important;
	}

	public String getOtherName() {
		return this.otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getCanCount() {
		return this.canCount;
	}

	public void setCanCount(String canCount) {
		this.canCount = canCount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getHk() {
		return this.hk;
	}

	public void setHk(String hk) {
		this.hk = hk;
	}

	public String getAe() {
		return this.ae;
	}

	public void setAe(String ae) {
		this.ae = ae;
	}

	public String getKr() {
		return this.kr;
	}

	public void setKr(String kr) {
		this.kr = kr;
	}

	public String getSa() {
		return this.sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getCn() {
		return this.cn;
	}

	public void setCn(String cn) {
		this.cn = cn;
	}

	public String getAdType() {
		return this.adType;
	}

	public void setAdType(String adType) {
		this.adType = adType;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}