package com.efun.po;

import java.sql.Timestamp;

/**
 * TGameMoreMenus entity. @author MyEclipse Persistence Tools
 */

public class TGameMoreMenus implements java.io.Serializable {
	private static final long serialVersionUID = -698020471462192537L;

	// Fields

	private Integer id;
	private String udid;
	private String parentId;
	private String menuName;
	private String img;
	private String info;
	private String flag;
	private String cashType;
	private String moneyType;
	private String paid;
	private String pointArea;
	private String remark;
	private String menuStatus;
	private Timestamp createTime;
	private Timestamp modifyTime;
	private Timestamp lastSynctime;
	private String deleted;
	private Integer menuShowType;
	private Integer itemShowType;
	private String leftSubMenu;
	private String iconMobile;
	private String contentRule;
	private String menuType;
	private String isNew;

	// Constructors

	/** default constructor */
	public TGameMoreMenus() {
	}

	/** minimal constructor */
	public TGameMoreMenus(String iconMobile) {
		this.iconMobile = iconMobile;
	}

	/** full constructor */
	public TGameMoreMenus(String udid, String parentId, String menuName, String img, String info, String flag,
			String cashType, String moneyType, String paid, String pointArea, String remark, String menuStatus,
			Timestamp createTime, Timestamp modifyTime, Timestamp lastSynctime, String deleted, Integer menuShowType,
			Integer itemShowType, String leftSubMenu, String iconMobile, String contentRule, String menuType, String isNew) {
		this.udid = udid;
		this.parentId = parentId;
		this.menuName = menuName;
		this.img = img;
		this.info = info;
		this.flag = flag;
		this.cashType = cashType;
		this.moneyType = moneyType;
		this.paid = paid;
		this.pointArea = pointArea;
		this.remark = remark;
		this.menuStatus = menuStatus;
		this.createTime = createTime;
		this.modifyTime = modifyTime;
		this.lastSynctime = lastSynctime;
		this.deleted = deleted;
		this.menuShowType = menuShowType;
		this.itemShowType = itemShowType;
		this.leftSubMenu = leftSubMenu;
		this.iconMobile = iconMobile;
		this.contentRule = contentRule;
		this.menuType = menuType;
		this.isNew = isNew;
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

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCashType() {
		return this.cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
	}

	public String getMoneyType() {
		return this.moneyType;
	}

	public void setMoneyType(String moneyType) {
		this.moneyType = moneyType;
	}

	public String getPaid() {
		return this.paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getPointArea() {
		return this.pointArea;
	}

	public void setPointArea(String pointArea) {
		this.pointArea = pointArea;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getMenuStatus() {
		return this.menuStatus;
	}

	public void setMenuStatus(String menuStatus) {
		this.menuStatus = menuStatus;
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

	public Integer getMenuShowType() {
		return this.menuShowType;
	}

	public void setMenuShowType(Integer menuShowType) {
		this.menuShowType = menuShowType;
	}

	public Integer getItemShowType() {
		return this.itemShowType;
	}

	public void setItemShowType(Integer itemShowType) {
		this.itemShowType = itemShowType;
	}

	public String getLeftSubMenu() {
		return this.leftSubMenu;
	}

	public void setLeftSubMenu(String leftSubMenu) {
		this.leftSubMenu = leftSubMenu;
	}

	public String getIconMobile() {
		return this.iconMobile;
	}

	public void setIconMobile(String iconMobile) {
		this.iconMobile = iconMobile;
	}

	public String getContentRule() {
		return contentRule;
	}

	public void setContentRule(String contentRule) {
		this.contentRule = contentRule;
	}

	public String getMenuType() {
		return menuType;
	}

	public void setMenuType(String menuType) {
		this.menuType = menuType;
	}

	public String getIsNew() {
		return isNew;
	}

	public void setIsNew(String isNew) {
		this.isNew = isNew;
	}

}