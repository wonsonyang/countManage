package com.efun.po;

import java.util.Date;

/**
 * TActivity entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TActivity implements java.io.Serializable {
	private static final long serialVersionUID = -2588514369821747818L;

	// Fields

	private Integer id;
	private String gameCode;
	private String activityCode;
	private String activityName;
	private String advertiser;
	private Date startTime;
	private Date endTime;
	private Date lotteryTime;
	private Integer lotteryNum;
	private String activityUrl;
	private String context;
	private String isActivity;
	private String flag;
	private Integer isPayactivity;
	private Float integralRatio;
	private Float drawRatio;
	private Integer cycle;
	private Integer cycleTimes;
	private Date payendTime;
	private String version;
	private String serverCodes;
	private String rankingtype;
	private String fullservice;
	private String img;
	private String shareicon;
	private String payType;
	private Integer storeType;
	private Integer rankType;
	private Integer rankLimit;
	private String bigPic;

	// Constructors

	/** default constructor */
	public TActivity() {
	}

	/** full constructor */
	public TActivity(String gameCode, String activityCode, String activityName,
			String advertiser, Date startTime, Date endTime, Date lotteryTime,
			Integer lotteryNum, String activityUrl, String context,
			String isActivity, String flag, Integer isPayactivity,
			Float integralRatio, Float drawRatio, Integer cycle,
			Integer cycleTimes, Date payendTime, String version,
			String serverCodes, String rankingtype, String fullservice,
			String img, String shareicon, String payType, Integer storeType,
			Integer rankType, Integer rankLimit) {
		this.gameCode = gameCode;
		this.activityCode = activityCode;
		this.activityName = activityName;
		this.advertiser = advertiser;
		this.startTime = startTime;
		this.endTime = endTime;
		this.lotteryTime = lotteryTime;
		this.lotteryNum = lotteryNum;
		this.activityUrl = activityUrl;
		this.context = context;
		this.isActivity = isActivity;
		this.flag = flag;
		this.isPayactivity = isPayactivity;
		this.integralRatio = integralRatio;
		this.drawRatio = drawRatio;
		this.cycle = cycle;
		this.cycleTimes = cycleTimes;
		this.payendTime = payendTime;
		this.version = version;
		this.serverCodes = serverCodes;
		this.rankingtype = rankingtype;
		this.fullservice = fullservice;
		this.img = img;
		this.shareicon = shareicon;
		this.payType = payType;
		this.storeType = storeType;
		this.rankType = rankType;
		this.rankLimit = rankLimit;
	}

	// Property accessors

	public String getBigPic() {
		return bigPic;
	}

	public void setBigPic(String bigPic) {
		this.bigPic = bigPic;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getActivityCode() {
		return this.activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getAdvertiser() {
		return this.advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getLotteryTime() {
		return this.lotteryTime;
	}

	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}

	public Integer getLotteryNum() {
		return this.lotteryNum;
	}

	public void setLotteryNum(Integer lotteryNum) {
		this.lotteryNum = lotteryNum;
	}

	public String getActivityUrl() {
		return this.activityUrl;
	}

	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getIsActivity() {
		return this.isActivity;
	}

	public void setIsActivity(String isActivity) {
		this.isActivity = isActivity;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getIsPayactivity() {
		return this.isPayactivity;
	}

	public void setIsPayactivity(Integer isPayactivity) {
		this.isPayactivity = isPayactivity;
	}

	public Float getIntegralRatio() {
		return this.integralRatio;
	}

	public void setIntegralRatio(Float integralRatio) {
		this.integralRatio = integralRatio;
	}

	public Float getDrawRatio() {
		return this.drawRatio;
	}

	public void setDrawRatio(Float drawRatio) {
		this.drawRatio = drawRatio;
	}

	public Integer getCycle() {
		return this.cycle;
	}

	public void setCycle(Integer cycle) {
		this.cycle = cycle;
	}

	public Integer getCycleTimes() {
		return this.cycleTimes;
	}

	public void setCycleTimes(Integer cycleTimes) {
		this.cycleTimes = cycleTimes;
	}

	public Date getPayendTime() {
		return this.payendTime;
	}

	public void setPayendTime(Date payendTime) {
		this.payendTime = payendTime;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getServerCodes() {
		return this.serverCodes;
	}

	public void setServerCodes(String serverCodes) {
		this.serverCodes = serverCodes;
	}

	public String getRankingtype() {
		return this.rankingtype;
	}

	public void setRankingtype(String rankingtype) {
		this.rankingtype = rankingtype;
	}

	public String getFullservice() {
		return this.fullservice;
	}

	public void setFullservice(String fullservice) {
		this.fullservice = fullservice;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getShareicon() {
		return this.shareicon;
	}

	public void setShareicon(String shareicon) {
		this.shareicon = shareicon;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public Integer getStoreType() {
		return this.storeType;
	}

	public void setStoreType(Integer storeType) {
		this.storeType = storeType;
	}

	public Integer getRankType() {
		return this.rankType;
	}

	public void setRankType(Integer rankType) {
		this.rankType = rankType;
	}

	public Integer getRankLimit() {
		return this.rankLimit;
	}

	public void setRankLimit(Integer rankLimit) {
		this.rankLimit = rankLimit;
	}

}