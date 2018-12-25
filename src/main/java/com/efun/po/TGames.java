package com.efun.po;

import java.sql.Timestamp;

/**
 * TGames entity. @author MyEclipse Persistence Tools
 */

public class TGames implements java.io.Serializable {
	private static final long serialVersionUID = 7824089722455676576L;

	// Fields

	private Integer gid;
	private Integer pid;
	private Integer gpid;
	private String gameName;
	private String gameCode;
	private String parentGame;
	private String gameLogo;
	private String content;
	private String netUrl;
	private String payAllow;
	private String loginAllow;
	private String iosDownloadUrl;
	private String androidDownloadUrl;
	private String ipadDownloadUrl;
	private String javaDownloadUrl;
	private String otherDownloadUrl;
	private String image1;
	private String image2;
	private String image3;
	private String image4;
	private String image5;
	private Integer hotClick;
	private String flag;
	private Timestamp createdTime;
	private Timestamp modifiedTime;
	private String createdBy;
	private String modifiedBy;
	private String apikey;
	private String secret;
	private String siteUrl;
	private String gameappkey;
	private String appkey;
	private String language;
	private String isWeb;
	private String googleWalletKey;
	private Timestamp mstartTime;
	private Timestamp mendTime;
	private String mcontent;
	private String department;
	private Integer level;
	private String ipWhitelist;
	private String gameServerIpList;
	private String isOnline;
	private String isGame;
	private String dataSource;
	private String registerAllow;
	private Integer warnTimes;
	private Integer forbidTimes;
	private String pubSigns;
	private Integer timeZone;
	private String iphoneDownloadUrl;
	private String ipodDownloadUrl;
	private String macintoshDownloadUrl;
	private String windowsDownloadUrl;
	private String icon;

	// Constructors

	/** default constructor */
	public TGames() {
	}

	/** minimal constructor */
	public TGames(String registerAllow, Integer warnTimes, Integer forbidTimes) {
		this.registerAllow = registerAllow;
		this.warnTimes = warnTimes;
		this.forbidTimes = forbidTimes;
	}

	public TGames(Integer gid, Integer pid, Integer gpid, String gameName, String gameCode, String parentGame,
			String gameLogo, String content, String netUrl, String payAllow, String loginAllow, String iosDownloadUrl,
			String androidDownloadUrl, String ipadDownloadUrl, String javaDownloadUrl, String otherDownloadUrl,
			String image1, String image2, String image3, String image4, String image5, Integer hotClick, String flag,
			Timestamp createdTime, Timestamp modifiedTime, String createdBy, String modifiedBy, String apikey,
			String secret, String siteUrl, String gameappkey, String appkey, String language, String isWeb,
			String googleWalletKey, Timestamp mstartTime, Timestamp mendTime, String mcontent, String department,
			Integer level, String ipWhitelist, String isOnline, String isGame, String dataSource, String registerAllow,
			Integer warnTimes, Integer forbidTimes, String pubSigns, Integer timeZone, String iphoneDownloadUrl,
			String ipodDownloadUrl, String macintoshDownloadUrl, String windowsDownloadUrl, String gameServerIpList) {
		this.gid = gid;
		this.pid = pid;
		this.gpid = gpid;
		this.gameName = gameName;
		this.gameCode = gameCode;
		this.parentGame = parentGame;
		this.gameLogo = gameLogo;
		this.content = content;
		this.netUrl = netUrl;
		this.payAllow = payAllow;
		this.loginAllow = loginAllow;
		this.iosDownloadUrl = iosDownloadUrl;
		this.androidDownloadUrl = androidDownloadUrl;
		this.ipadDownloadUrl = ipadDownloadUrl;
		this.javaDownloadUrl = javaDownloadUrl;
		this.otherDownloadUrl = otherDownloadUrl;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.image4 = image4;
		this.image5 = image5;
		this.hotClick = hotClick;
		this.flag = flag;
		this.createdTime = createdTime;
		this.modifiedTime = modifiedTime;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.apikey = apikey;
		this.secret = secret;
		this.siteUrl = siteUrl;
		this.gameappkey = gameappkey;
		this.appkey = appkey;
		this.language = language;
		this.isWeb = isWeb;
		this.googleWalletKey = googleWalletKey;
		this.mstartTime = mstartTime;
		this.mendTime = mendTime;
		this.mcontent = mcontent;
		this.department = department;
		this.level = level;
		this.ipWhitelist = ipWhitelist;
		this.isOnline = isOnline;
		this.isGame = isGame;
		this.dataSource = dataSource;
		this.registerAllow = registerAllow;
		this.warnTimes = warnTimes;
		this.forbidTimes = forbidTimes;
		this.pubSigns = pubSigns;
		this.timeZone = timeZone;
		this.iphoneDownloadUrl = iphoneDownloadUrl;
		this.ipodDownloadUrl = ipodDownloadUrl;
		this.macintoshDownloadUrl = macintoshDownloadUrl;
		this.windowsDownloadUrl = windowsDownloadUrl;
		this.gameServerIpList = gameServerIpList;
	}

	/** full constructor */

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getGpid() {
		return this.gpid;
	}

	public void setGpid(Integer gpid) {
		this.gpid = gpid;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getParentGame() {
		return this.parentGame;
	}

	public void setParentGame(String parentGame) {
		this.parentGame = parentGame;
	}

	public String getGameLogo() {
		return this.gameLogo;
	}

	public void setGameLogo(String gameLogo) {
		this.gameLogo = gameLogo;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getNetUrl() {
		return this.netUrl;
	}

	public void setNetUrl(String netUrl) {
		this.netUrl = netUrl;
	}

	public String getPayAllow() {
		return this.payAllow;
	}

	public void setPayAllow(String payAllow) {
		this.payAllow = payAllow;
	}

	public String getLoginAllow() {
		return this.loginAllow;
	}

	public void setLoginAllow(String loginAllow) {
		this.loginAllow = loginAllow;
	}

	public String getIosDownloadUrl() {
		return this.iosDownloadUrl;
	}

	public void setIosDownloadUrl(String iosDownloadUrl) {
		this.iosDownloadUrl = iosDownloadUrl;
	}

	public String getAndroidDownloadUrl() {
		return this.androidDownloadUrl;
	}

	public void setAndroidDownloadUrl(String androidDownloadUrl) {
		this.androidDownloadUrl = androidDownloadUrl;
	}

	public String getIpadDownloadUrl() {
		return this.ipadDownloadUrl;
	}

	public void setIpadDownloadUrl(String ipadDownloadUrl) {
		this.ipadDownloadUrl = ipadDownloadUrl;
	}

	public String getJavaDownloadUrl() {
		return this.javaDownloadUrl;
	}

	public void setJavaDownloadUrl(String javaDownloadUrl) {
		this.javaDownloadUrl = javaDownloadUrl;
	}

	public String getOtherDownloadUrl() {
		return this.otherDownloadUrl;
	}

	public void setOtherDownloadUrl(String otherDownloadUrl) {
		this.otherDownloadUrl = otherDownloadUrl;
	}

	public String getImage1() {
		return this.image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return this.image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getImage4() {
		return this.image4;
	}

	public void setImage4(String image4) {
		this.image4 = image4;
	}

	public String getImage5() {
		return this.image5;
	}

	public void setImage5(String image5) {
		this.image5 = image5;
	}

	public Integer getHotClick() {
		return this.hotClick;
	}

	public void setHotClick(Integer hotClick) {
		this.hotClick = hotClick;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public Timestamp getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(Timestamp modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getApikey() {
		return this.apikey;
	}

	public void setApikey(String apikey) {
		this.apikey = apikey;
	}

	public String getSecret() {
		return this.secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getSiteUrl() {
		return this.siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getGameappkey() {
		return this.gameappkey;
	}

	public void setGameappkey(String gameappkey) {
		this.gameappkey = gameappkey;
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIsWeb() {
		return this.isWeb;
	}

	public void setIsWeb(String isWeb) {
		this.isWeb = isWeb;
	}

	public String getGoogleWalletKey() {
		return this.googleWalletKey;
	}

	public void setGoogleWalletKey(String googleWalletKey) {
		this.googleWalletKey = googleWalletKey;
	}

	public Timestamp getMstartTime() {
		return this.mstartTime;
	}

	public void setMstartTime(Timestamp mstartTime) {
		this.mstartTime = mstartTime;
	}

	public Timestamp getMendTime() {
		return this.mendTime;
	}

	public void setMendTime(Timestamp mendTime) {
		this.mendTime = mendTime;
	}

	public String getMcontent() {
		return this.mcontent;
	}

	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getIpWhitelist() {
		return this.ipWhitelist;
	}

	public void setIpWhitelist(String ipWhitelist) {
		this.ipWhitelist = ipWhitelist;
	}

	public String getIsOnline() {
		return this.isOnline;
	}

	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}

	public String getIsGame() {
		return this.isGame;
	}

	public void setIsGame(String isGame) {
		this.isGame = isGame;
	}

	public String getDataSource() {
		return this.dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getRegisterAllow() {
		return this.registerAllow;
	}

	public void setRegisterAllow(String registerAllow) {
		this.registerAllow = registerAllow;
	}

	public Integer getWarnTimes() {
		return this.warnTimes;
	}

	public void setWarnTimes(Integer warnTimes) {
		this.warnTimes = warnTimes;
	}

	public Integer getForbidTimes() {
		return this.forbidTimes;
	}

	public void setForbidTimes(Integer forbidTimes) {
		this.forbidTimes = forbidTimes;
	}

	public String getPubSigns() {
		return pubSigns;
	}

	public void setPubSigns(String pubSigns) {
		this.pubSigns = pubSigns;
	}

	public Integer getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(Integer timeZone) {
		this.timeZone = timeZone;
	}

	public String getIphoneDownloadUrl() {
		return iphoneDownloadUrl;
	}

	public void setIphoneDownloadUrl(String iphoneDownloadUrl) {
		this.iphoneDownloadUrl = iphoneDownloadUrl;
	}

	public String getIpodDownloadUrl() {
		return ipodDownloadUrl;
	}

	public void setIpodDownloadUrl(String ipodDownloadUrl) {
		this.ipodDownloadUrl = ipodDownloadUrl;
	}

	public String getMacintoshDownloadUrl() {
		return macintoshDownloadUrl;
	}

	public void setMacintoshDownloadUrl(String macintoshDownloadUrl) {
		this.macintoshDownloadUrl = macintoshDownloadUrl;
	}

	public String getWindowsDownloadUrl() {
		return windowsDownloadUrl;
	}

	public void setWindowsDownloadUrl(String windowsDownloadUrl) {
		this.windowsDownloadUrl = windowsDownloadUrl;
	}

	public String getGameServerIpList() {
		return gameServerIpList;
	}

	public void setGameServerIpList(String gameServerIpList) {
		this.gameServerIpList = gameServerIpList;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}