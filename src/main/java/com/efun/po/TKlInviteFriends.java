package com.efun.po;

public class TKlInviteFriends implements java.io.Serializable {

	private static final long serialVersionUID = -745028104006086872L;
	
	private Long id;
	private String gameCode;
	private String thirdPlate;
	private String inviterPlayerId;
	private String invitedPlayerIds;
	private String inviterRegisterOS;
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

	public String getInviterPlayerId() {
		return inviterPlayerId;
	}

	public void setInviterPlayerId(String inviterPlayerId) {
		this.inviterPlayerId = inviterPlayerId;
	}

	public String getInviterRegisterOS() {
		return inviterRegisterOS;
	}

	public void setInviterRegisterOS(String inviterRegisterOS) {
		this.inviterRegisterOS = inviterRegisterOS;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getInvitedPlayerIds() {
		return invitedPlayerIds;
	}

	public void setInvitedPlayerIds(String invitedPlayerIds) {
		this.invitedPlayerIds = invitedPlayerIds;
	}

}
