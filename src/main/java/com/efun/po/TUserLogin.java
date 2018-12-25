package com.efun.po;

import java.util.Date;

/**
 * TUserLogin entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserLogin implements java.io.Serializable {
	private static final long serialVersionUID = -2411412121560749262L;

	// Fields

	private Long id;
	private Long userid;
	private String gameCode;
	private String serverCode;
	private Integer gpid;
	private String thirdPlate;
	private Date firstLogin;
	private Date lastLogin;
	private Integer total;
	private String address;
	private String ip;
	private String mac;
	private String imei;
	private String countryCode;
	private String cityCode;
	private String token;

	// Constructors

	/** default constructor */
	public TUserLogin() {
	}

	/** full constructor */
	public TUserLogin(Long userid, String gameCode, String serverCode,
			Integer gpid, String thirdPlate, Date firstLogin, Date lastLogin,
			Integer total, String address, String ip, String mac, String imei,
			String countryCode, String cityCode, String token) {
		this.userid = userid;
		this.gameCode = gameCode;
		this.serverCode = serverCode;
		this.gpid = gpid;
		this.thirdPlate = thirdPlate;
		this.firstLogin = firstLogin;
		this.lastLogin = lastLogin;
		this.total = total;
		this.address = address;
		this.ip = ip;
		this.mac = mac;
		this.imei = imei;
		this.countryCode = countryCode;
		this.cityCode = cityCode;
		this.token = token;
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

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getThirdPlate() {
		return this.thirdPlate;
	}

	public void setThirdPlate(String thirdPlate) {
		this.thirdPlate = thirdPlate;
	}

	public Date getFirstLogin() {
		return this.firstLogin;
	}

	public void setFirstLogin(Date firstLogin) {
		this.firstLogin = firstLogin;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
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

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}