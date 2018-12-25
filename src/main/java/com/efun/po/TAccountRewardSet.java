package com.efun.po;

import java.io.Serializable;

/**
 * 奖励金设置实体
 * Created by peterpeng on 2018/1/8.
 */
public class TAccountRewardSet implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private String areaName;     //地区名称，港台亚欧：hktwasia；韩国：korea

	private String gameCodes;    //多个游戏gameCode串联，中间用“-”

	private String gameNames;    //多个游戏名串联，对应gameCode，中间用“-”

	private String countType;    //韩国计算类型，all,google_ios,third,多选，中间用“-”

	private String currentMonthLadder;    //当月流水阶梯配置，币种流水金额-->币种奖励金金额；USD1500000-->USD50000，

	private String accumulationLadder;    //累计流水阶梯配置，格式如上

	private String deleted;      //逻辑删除 0或空 未删除 1 已删除

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

	public String getGameCodes() {
		return gameCodes;
	}

	public void setGameCodes(String gameCodes) {
		this.gameCodes = gameCodes;
	}

	public String getGameNames() {
		return gameNames;
	}

	public void setGameNames(String gameNames) {
		this.gameNames = gameNames;
	}

	public String getCountType() {
		return countType;
	}

	public void setCountType(String countType) {
		this.countType = countType;
	}

	public String getCurrentMonthLadder() {
		return currentMonthLadder;
	}

	public void setCurrentMonthLadder(String currentMonthLadder) {
		this.currentMonthLadder = currentMonthLadder;
	}

	public String getAccumulationLadder() {
		return accumulationLadder;
	}

	public void setAccumulationLadder(String accumulationLadder) {
		this.accumulationLadder = accumulationLadder;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
}
