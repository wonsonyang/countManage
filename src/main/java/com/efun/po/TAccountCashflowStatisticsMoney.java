package com.efun.po;

import java.sql.Timestamp;

/**
 * TAccountCashflowStatisticsMoney entity. @author MyEclipse Persistence Tools
 */

public class TAccountCashflowStatisticsMoney implements java.io.Serializable {
	private static final long serialVersionUID = -4544513744099322928L;

	// Fields

	private Integer id;
	private Integer pid;
	private String game;
	private Short index;
	private Double money;
	private Timestamp createdTime;
	private String deleted;

	// Constructors

	/** default constructor */
	public TAccountCashflowStatisticsMoney() {
	}

	/** full constructor */
	public TAccountCashflowStatisticsMoney(Integer pid, String game, Short index, Double money, Timestamp createdTime, String deleted) {
		this.pid = pid;
		this.game = game;
		this.index = index;
		this.money = money;
		this.createdTime = createdTime;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getGame() {
		return this.game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public Short getIndex() {
		return this.index;
	}

	public void setIndex(Short index) {
		this.index = index;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public Timestamp getCreatedTime() {
		return this.createdTime;
	}

	public void setCreatedTime(Timestamp createdTime) {
		this.createdTime = createdTime;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}