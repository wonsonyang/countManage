package com.efun.po;

import java.sql.Timestamp;

/**
 * 
 * @author peterpeng
 * @date 2017-03-01 13:02
 */
public class GiftCode implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String infoId; //礼品码信息表id

	private String code; //礼品码
	
	private String uid; //uid

	private String serverCode; //伺服器代码
	
	private String roleId;  //角色id
	
	private String status; //0未使用、1已使用、2已删除
	
	private Timestamp exchangeTime; //兑换时间
	
	public GiftCode() {
		super();
	}

	public GiftCode(String id, String infoId, String code, String uid, String serverCode, String roleId, String status,
			Timestamp exchangeTime) {
		super();
		this.id = id;
		this.infoId = infoId;
		this.code = code;
		this.uid = uid;
		this.serverCode = serverCode;
		this.roleId = roleId;
		this.status = status;
		this.exchangeTime = exchangeTime;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getExchangeTime() {
		return exchangeTime;
	}

	public void setExchangeTime(Timestamp exchangeTime) {
		this.exchangeTime = exchangeTime;
	}

	@Override
	public String toString() {
		return "GiftCode [id=" + id + ", infoId=" + infoId + ", code=" + code + ", uid=" + uid + ", serverCode="
				+ serverCode + ", roleId=" + roleId + ", status=" + status + ", exchangeTime=" + exchangeTime + "]";
	}

}
