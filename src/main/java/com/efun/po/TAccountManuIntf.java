package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 厂商对账接口配置信息实体
 * Created by peterpeng on 2017/11/21.
 */
public class TAccountManuIntf implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String areaName;     //游戏地区

	private String gameCode;     //游戏gameCode

	private String gameName;     //游戏名称

	private String proPerson;    //产品对接人

	private String testAddress;  //测试接口地址

	private String address;      //接口地址

	private Integer sign;        //是否有sign值加密,0没有，1有

	private String key;          //加密key值

	private Integer online;      //是否上线，0没有，1有

	private Date onlineDate;     //上线时间

	private String deleted;      //逻辑删除 0或空 未删除 1 已删除

	public TAccountManuIntf() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getProPerson() {
		return proPerson;
	}

	public void setProPerson(String proPerson) {
		this.proPerson = proPerson;
	}

	public String getTestAddress() {
		return testAddress;
	}

	public void setTestAddress(String testAddress) {
		this.testAddress = testAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Date getOnlineDate() {
		return onlineDate;
	}

	public void setOnlineDate(Date onlineDate) {
		this.onlineDate = onlineDate;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public Integer getSign() {
		return sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	public Integer getOnline() {
		return online;
	}

	public void setOnline(Integer online) {
		this.online = online;
	}
}
