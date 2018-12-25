package com.efun.po;

import java.io.Serializable;

/**
 * 游戏ID关系表 t_account_gameid_rela
 */
public class TAccountGameidRela implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id id
	 */
	private Integer id;

	/**
	 * gameid 游戏ID
	 */
	private String gameid;

	/**
	 * cashType 金流商
	 */
	private String cashType;

	/**
	 * gameCode 游戏标示
	 */
	private String gameCode;

	/**
	 * gameName 游戏名称
	 */
	private String gameName;

	/**
	 * createTime 创建时间
	 */
	private java.util.Date createTime;

	/**
	 * deleted 删除标示
	 */
	private String deleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameid() {
		return gameid;
	}

	public void setGameid(String gameid) {
		this.gameid = gameid;
	}

	public String getCashType() {
		return cashType;
	}

	public void setCashType(String cashType) {
		this.cashType = cashType;
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

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}