package com.efun.po;

public class TKlPreRegister implements java.io.Serializable {

	private static final long serialVersionUID = -7844150414411603839L;
	
	private Long id;
	private String gameCode;
	private String thirdPlate;
	private String playerId;
	private String date;
	private String preRegisterDate;
	private String device;
	private String registeredOS;
	private Integer deleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getThirdPlate() {
		return thirdPlate;
	}

	public void setThirdPlate(String thirdPlate) {
		this.thirdPlate = thirdPlate;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPreRegisterDate() {
		return preRegisterDate;
	}

	public void setPreRegisterDate(String preRegisterDate) {
		this.preRegisterDate = preRegisterDate;
	}

	public String getRegisteredOS() {
		return registeredOS;
	}

	public void setRegisteredOS(String registeredOS) {
		this.registeredOS = registeredOS;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

}
