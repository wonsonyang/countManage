package com.efun.po;

import java.util.Date;

// Generated 2018-7-10 13:57:14 by Hibernate Tools 5.2.3.Final

/**
 * TRiskIforestResult generated by hbm2java
 */
public class TRiskIforestResult implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private long id;
	private Date createdTime;
	private String username;
	private String password;
	private String userId;
	private String gameCode;
	private String advertisingId;
	private String idfa;
	private String eid;
	private String mac;
	private String imei;
	private String adId;
	private String androidId;
	private String ip;
	private String ipIso;
	private String ipAddress;
	private Long ipUserNum;
	private Double ipUserPerDevice;
	private Double cityUserPerDevice;
	private Double cityUserPerIp;
	private Long eidUserNum;
	private Long eidIpNum;
	private Double eidUserPerIp;
	private Double macUserNum;
	private Long macIpNum;
	private Double macUserPerIp;
	private Long imeiUserNum;
	private Long imeiIpNum;
	private Double imeiUserPerIp;
	private Long adUserNum;
	private Long adIpNum;
	private Double adUserPerIp;
	private Long psUserCount;
	private Long label;
	private Double anomalyScore;
	private Double prediction;
	private String comment;

	public TRiskIforestResult() {
	}

	public TRiskIforestResult(Long id, Date createdTime, String username, String password, String userId,
			String gameCode, String advertisingId, String idfa, String eid, String mac, String imei, String adId,
			String androidId, String ip, String ipIso, String ipAddress, Long ipUserNum, Double ipUserPerDevice,
			Double cityUserPerDevice, Double cityUserPerIp, Long eidUserNum, Long eidIpNum, Double eidUserPerIp,
			Double macUserNum, Long macIpNum, Double macUserPerIp, Long imeiUserNum, Long imeiIpNum,
			Double imeiUserPerIp, Long adUserNum, Long adIpNum, Double adUserPerIp, Long psUserCount, Long label,
			Double anomalyScore, Double prediction, String comment) {
		this.id = id;
		this.createdTime = createdTime;
		this.username = username;
		this.password = password;
		this.userId = userId;
		this.gameCode = gameCode;
		this.advertisingId = advertisingId;
		this.idfa = idfa;
		this.eid = eid;
		this.mac = mac;
		this.imei = imei;
		this.adId = adId;
		this.androidId = androidId;
		this.ip = ip;
		this.ipIso = ipIso;
		this.ipAddress = ipAddress;
		this.ipUserNum = ipUserNum;
		this.ipUserPerDevice = ipUserPerDevice;
		this.cityUserPerDevice = cityUserPerDevice;
		this.cityUserPerIp = cityUserPerIp;
		this.eidUserNum = eidUserNum;
		this.eidIpNum = eidIpNum;
		this.eidUserPerIp = eidUserPerIp;
		this.macUserNum = macUserNum;
		this.macIpNum = macIpNum;
		this.macUserPerIp = macUserPerIp;
		this.imeiUserNum = imeiUserNum;
		this.imeiIpNum = imeiIpNum;
		this.imeiUserPerIp = imeiUserPerIp;
		this.adUserNum = adUserNum;
		this.adIpNum = adIpNum;
		this.adUserPerIp = adUserPerIp;
		this.psUserCount = psUserCount;
		this.label = label;
		this.anomalyScore = anomalyScore;
		this.prediction = prediction;
		this.comment = comment;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getAdvertisingId() {
		return this.advertisingId;
	}

	public void setAdvertisingId(String advertisingId) {
		this.advertisingId = advertisingId;
	}

	public String getIdfa() {
		return this.idfa;
	}

	public void setIdfa(String idfa) {
		this.idfa = idfa;
	}

	public String getEid() {
		return this.eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
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

	public String getAdId() {
		return this.adId;
	}

	public void setAdId(String adId) {
		this.adId = adId;
	}

	public String getAndroidId() {
		return this.androidId;
	}

	public void setAndroidId(String androidId) {
		this.androidId = androidId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpIso() {
		return this.ipIso;
	}

	public void setIpIso(String ipIso) {
		this.ipIso = ipIso;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Long getIpUserNum() {
		return this.ipUserNum;
	}

	public void setIpUserNum(Long ipUserNum) {
		this.ipUserNum = ipUserNum;
	}

	public Double getIpUserPerDevice() {
		return this.ipUserPerDevice;
	}

	public void setIpUserPerDevice(Double ipUserPerDevice) {
		this.ipUserPerDevice = ipUserPerDevice;
	}

	public Double getCityUserPerDevice() {
		return this.cityUserPerDevice;
	}

	public void setCityUserPerDevice(Double cityUserPerDevice) {
		this.cityUserPerDevice = cityUserPerDevice;
	}

	public Double getCityUserPerIp() {
		return this.cityUserPerIp;
	}

	public void setCityUserPerIp(Double cityUserPerIp) {
		this.cityUserPerIp = cityUserPerIp;
	}

	public Long getEidUserNum() {
		return this.eidUserNum;
	}

	public void setEidUserNum(Long eidUserNum) {
		this.eidUserNum = eidUserNum;
	}

	public Long getEidIpNum() {
		return this.eidIpNum;
	}

	public void setEidIpNum(Long eidIpNum) {
		this.eidIpNum = eidIpNum;
	}

	public Double getEidUserPerIp() {
		return this.eidUserPerIp;
	}

	public void setEidUserPerIp(Double eidUserPerIp) {
		this.eidUserPerIp = eidUserPerIp;
	}

	public Double getMacUserNum() {
		return this.macUserNum;
	}

	public void setMacUserNum(Double macUserNum) {
		this.macUserNum = macUserNum;
	}

	public Long getMacIpNum() {
		return this.macIpNum;
	}

	public void setMacIpNum(Long macIpNum) {
		this.macIpNum = macIpNum;
	}

	public Double getMacUserPerIp() {
		return this.macUserPerIp;
	}

	public void setMacUserPerIp(Double macUserPerIp) {
		this.macUserPerIp = macUserPerIp;
	}

	public Long getImeiUserNum() {
		return this.imeiUserNum;
	}

	public void setImeiUserNum(Long imeiUserNum) {
		this.imeiUserNum = imeiUserNum;
	}

	public Long getImeiIpNum() {
		return this.imeiIpNum;
	}

	public void setImeiIpNum(Long imeiIpNum) {
		this.imeiIpNum = imeiIpNum;
	}

	public Double getImeiUserPerIp() {
		return this.imeiUserPerIp;
	}

	public void setImeiUserPerIp(Double imeiUserPerIp) {
		this.imeiUserPerIp = imeiUserPerIp;
	}

	public Long getAdUserNum() {
		return this.adUserNum;
	}

	public void setAdUserNum(Long adUserNum) {
		this.adUserNum = adUserNum;
	}

	public Long getAdIpNum() {
		return this.adIpNum;
	}

	public void setAdIpNum(Long adIpNum) {
		this.adIpNum = adIpNum;
	}

	public Double getAdUserPerIp() {
		return this.adUserPerIp;
	}

	public void setAdUserPerIp(Double adUserPerIp) {
		this.adUserPerIp = adUserPerIp;
	}

	public Long getPsUserCount() {
		return this.psUserCount;
	}

	public void setPsUserCount(Long psUserCount) {
		this.psUserCount = psUserCount;
	}

	public Long getLabel() {
		return this.label;
	}

	public void setLabel(Long label) {
		this.label = label;
	}

	public Double getAnomalyScore() {
		return this.anomalyScore;
	}

	public void setAnomalyScore(Double anomalyScore) {
		this.anomalyScore = anomalyScore;
	}

	public Double getPrediction() {
		return this.prediction;
	}

	public void setPrediction(Double prediction) {
		this.prediction = prediction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
