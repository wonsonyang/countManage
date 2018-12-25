package com.efun.po;

import java.util.Date;

/**
 * TUsersRelation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUsersRelation implements java.io.Serializable {
	private static final long serialVersionUID = -2127648243575122839L;

	// Fields

	private Long id;
	private Long userid;
	private Integer gpid;
	private String gameCode;
	private String thirdPlate;
	private String plateForm;
	private String registerIp;
	private String address;
	private String advertiser;
	private String mac;
	private String imei;
	private String systemVersion;
	private String deviceType;
	private Date registerTime;
	private Integer flag;

	// Constructors

	/** default constructor */
	public TUsersRelation() {
	}

	/** full constructor */
	public TUsersRelation(Long userid, Integer gpid, String gameCode,
			String thirdPlate, String plateForm, String registerIp,
			String address, String advertiser, String mac, String imei,
			String systemVersion, String deviceType, Date registerTime,
			Integer flag) {
		this.userid = userid;
		this.gpid = gpid;
		this.gameCode = gameCode;
		this.thirdPlate = thirdPlate;
		this.plateForm = plateForm;
		this.registerIp = registerIp;
		this.address = address;
		this.advertiser = advertiser;
		this.mac = mac;
		this.imei = imei;
		this.systemVersion = systemVersion;
		this.deviceType = deviceType;
		this.registerTime = registerTime;
		this.flag = flag;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getThirdPlate() {
		return this.thirdPlate;
	}

	public void setThirdPlate(String thirdPlate) {
		this.thirdPlate = thirdPlate;
	}

	public String getPlateForm() {
		return this.plateForm;
	}

	public void setPlateForm(String plateForm) {
		this.plateForm = plateForm;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdvertiser() {
		return this.advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSystemVersion() {
		return this.systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Integer getFlag() {
		return this.flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

}