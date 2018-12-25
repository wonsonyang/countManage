package com.efun.po;

import java.sql.Timestamp;

public class TUserOnline implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Long uid;
	private String gameCode;
	private Integer onlineTime;
	private Integer startCnt;
	private String flag;
	private String type;
	private Timestamp createTime;
	private Timestamp modifyTime;

	public TUserOnline(Long id, Long uid, String gameCode, Integer onlineTime, Integer startCnt, String flag, String type,
			Timestamp createTime, Timestamp modifyTime) {
		this.id = id;
		this.uid = uid;
		this.gameCode = gameCode;
		this.onlineTime = onlineTime;
		this.startCnt = startCnt;
		this.flag = flag;
		this.type = type;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
	}

	public TUserOnline() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getOnlineTime() {
		return onlineTime;
	}

	public void setOnlineTime(Integer onlineTime) {
		this.onlineTime = onlineTime;
	}

	public Integer getStartCnt() {
		return startCnt;
	}

	public void setStartCnt(Integer startCnt) {
		this.startCnt = startCnt;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

}
