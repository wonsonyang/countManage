package com.efun.po;

import java.util.Date;

/**
 * TUsers entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUsers implements java.io.Serializable {
	private static final long serialVersionUID = 8795889289980089342L;

	// Fields
	
	private Long uid;
	private String appPlatform;
	private Long userid;
	private Integer gpid;
	private String userName;
	private String userPwd;
	private String email;
	private String address;
	private String idCard;
	private String telephone;
	private String msnqq;
	private Date registerTime;
	private String registerIp;
	private String lastLoginIp;
	private Date lastLoginTime;
	private String loginIp;
	private Date loginTime;
	private Date modifiedTime;
	private String flag;
	private String gameCode;
	private String thirdPlate;	//平台
	private String platForm;	//第三方来源
	private String userMac;
	private String advertiser;
	

	// Constructors
	public TUsers(Long uid, Long userid, Integer gpid, String userName,
			String userPwd, String email, String address,
			String idCard, String telephone, String msnqq,
			Date registerTime, String registerIp,
			String lastLoginIp, Date lastLoginTime, String loginIp,
			Date loginTime, Date modifiedTime, String flag, String gameCode,
			String thirdPlate, String platForm, String userMac,
			String advertiser) {
		super();
		this.uid = uid;
		this.userid = userid;
		this.gpid = gpid;
		this.userName = userName;
		this.userPwd = userPwd;
		this.email = email;
		this.address = address;
		this.idCard = idCard;
		this.telephone = telephone;
		this.msnqq = msnqq;
		this.registerTime = registerTime;
		this.registerIp = registerIp;
		this.lastLoginIp = lastLoginIp;
		this.lastLoginTime = lastLoginTime;
		this.loginIp = loginIp;
		this.loginTime = loginTime;
		this.modifiedTime = modifiedTime;
		this.flag = flag;
		this.gameCode = gameCode;
		this.thirdPlate = thirdPlate;
		this.platForm = platForm;
		this.userMac = userMac;
		this.advertiser = advertiser;
	}

	/** default constructor */
	public TUsers() {
	}

	/** full constructor */
	

	// Property accessors

	public Long getUid() {
		return this.uid;
	}
	

	public void setUid(Long uid) {
		this.uid = uid;
	}

	
	
	public String getAppPlatform() {
		return appPlatform;
	}

	public void setAppPlatform(String appPlatform) {
		this.appPlatform = appPlatform;
	}

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdCard() {
		return this.idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMsnqq() {
		return this.msnqq;
	}

	public void setMsnqq(String msnqq) {
		this.msnqq = msnqq;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Date getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getThirdPlate() {
		return thirdPlate;
	}

	public void setThirdPlate(String thirdPlate) {
		this.thirdPlate = thirdPlate;
	}

	public String getPlatForm() {
		return platForm;
	}

	public void setPlatForm(String platForm) {
		this.platForm = platForm;
	}
	public String getUserMac() {
		return userMac;
	}
	public void setUserMac(String userMac) {
		this.userMac = userMac;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getAdvertiser() {
		return advertiser;
	}
	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}
}