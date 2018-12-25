package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameMore entity. @author MyEclipse Persistence Tools
 */

public class TGameMore implements java.io.Serializable {
	private static final long serialVersionUID = -18545306546866567L;

	// Fields

	private Integer id;
	private String udid;
	private String gameCode;
	private String menuType;
	private String siteCode;
	private Integer sequenceId;
	private String parentCode;
	private String parentId;
	private String menuId;
	private String info;
	private String isParent;
	private String flag;
	private String userIdWhileList;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Timestamp lastSynctime;
	private String deleted;
	private String areaCode;

	// Constructors

	/** default constructor */
	public TGameMore() {
	}

	/** full constructor */
	public TGameMore(String udid, String gameCode, String menuType,
			String siteCode, Integer sequenceId, String parentCode,
			String parentId, String menuId, String info, String isParent,
			 String flag, String userIdWhileList,
			Timestamp createTime, Timestamp modifyTime, Timestamp lastSynctime,
			String deleted,String areaCode) {
		this.udid = udid;
		this.gameCode = gameCode;
		this.menuType = menuType;
		this.siteCode = siteCode;
		this.sequenceId = sequenceId;
		this.parentCode = parentCode;
		this.parentId = parentId;
		this.menuId = menuId;
		this.info = info;
		this.isParent = isParent;
		this.flag = flag;
		this.userIdWhileList = userIdWhileList;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.lastSynctime = lastSynctime;
		this.deleted = deleted;
		this.areaCode = areaCode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUdid() {
		return this.udid;
	}

	public void setUdid(String udid) {
		this.udid = udid;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getMenuType() {
		return this.menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getSiteCode() {
		return this.siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public Integer getSequenceId() {
		return this.sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getParentCode() {
		return this.parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getIsParent() {
		return this.isParent;
	}

	public void setIsParent(String isParent) {
		this.isParent = isParent;
	}


	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getUserIdWhileList() {
		return this.userIdWhileList;
	}

	public void setUserIdWhileList(String userIdWhileList) {
		this.userIdWhileList = userIdWhileList;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Timestamp modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Timestamp getLastSynctime() {
		return this.lastSynctime;
	}

	public void setLastSynctime(Timestamp lastSynctime) {
		this.lastSynctime = lastSynctime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
}