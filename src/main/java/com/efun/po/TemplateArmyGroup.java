package com.efun.po;

import java.util.Date;

/**
 * TemplateArmyGroup entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TemplateArmyGroup implements java.io.Serializable {
	private static final long serialVersionUID = 676397626577455520L;

	// Fields

	private Integer id;
	private String armyName;
	private String armyChief;
	private Long roleId;
	private Integer armyPeopleNumber;
	private String armyLine;
	private String email;
	private String manifesto;
	private String armyIcon;
	private Long userId;
	private String roleName;
	private Date createTime;
	private Date checkTime;
	private String checkState;
	private String gmname;
	private Integer moduleid;
	private String htmlpathurl;
	private String item1;
	private String item2;
	private String item3;
	private String item4;
	private String item5;

	// Constructors

	/** default constructor */
	public TemplateArmyGroup() {
	}

	/** full constructor */
	public TemplateArmyGroup(String armyName, String armyChief, Long roleId,
			Integer armyPeopleNumber, String armyLine, String email,
			String manifesto, String armyIcon, Long userId, String roleName,
			Date createTime, Date checkTime, String checkState, String gmname,
			Integer moduleid, String htmlpathurl, String item1, String item2,
			String item3, String item4, String item5) {
		this.armyName = armyName;
		this.armyChief = armyChief;
		this.roleId = roleId;
		this.armyPeopleNumber = armyPeopleNumber;
		this.armyLine = armyLine;
		this.email = email;
		this.manifesto = manifesto;
		this.armyIcon = armyIcon;
		this.userId = userId;
		this.roleName = roleName;
		this.createTime = createTime;
		this.checkTime = checkTime;
		this.checkState = checkState;
		this.gmname = gmname;
		this.moduleid = moduleid;
		this.htmlpathurl = htmlpathurl;
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		this.item4 = item4;
		this.item5 = item5;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getArmyName() {
		return this.armyName;
	}

	public void setArmyName(String armyName) {
		this.armyName = armyName;
	}

	public String getArmyChief() {
		return this.armyChief;
	}

	public void setArmyChief(String armyChief) {
		this.armyChief = armyChief;
	}

	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Integer getArmyPeopleNumber() {
		return this.armyPeopleNumber;
	}

	public void setArmyPeopleNumber(Integer armyPeopleNumber) {
		this.armyPeopleNumber = armyPeopleNumber;
	}

	public String getArmyLine() {
		return this.armyLine;
	}

	public void setArmyLine(String armyLine) {
		this.armyLine = armyLine;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getManifesto() {
		return this.manifesto;
	}

	public void setManifesto(String manifesto) {
		this.manifesto = manifesto;
	}

	public String getArmyIcon() {
		return this.armyIcon;
	}

	public void setArmyIcon(String armyIcon) {
		this.armyIcon = armyIcon;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getCheckState() {
		return this.checkState;
	}

	public void setCheckState(String checkState) {
		this.checkState = checkState;
	}

	public String getGmname() {
		return this.gmname;
	}

	public void setGmname(String gmname) {
		this.gmname = gmname;
	}

	public Integer getModuleid() {
		return this.moduleid;
	}

	public void setModuleid(Integer moduleid) {
		this.moduleid = moduleid;
	}

	public String getHtmlpathurl() {
		return this.htmlpathurl;
	}

	public void setHtmlpathurl(String htmlpathurl) {
		this.htmlpathurl = htmlpathurl;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

	public String getItem2() {
		return this.item2;
	}

	public void setItem2(String item2) {
		this.item2 = item2;
	}

	public String getItem3() {
		return this.item3;
	}

	public void setItem3(String item3) {
		this.item3 = item3;
	}

	public String getItem4() {
		return this.item4;
	}

	public void setItem4(String item4) {
		this.item4 = item4;
	}

	public String getItem5() {
		return this.item5;
	}

	public void setItem5(String item5) {
		this.item5 = item5;
	}

}