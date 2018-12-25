package com.efun.po;

/**
 * TUserAuthority entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TUserAuthority implements java.io.Serializable {
	private static final long serialVersionUID = -329715991387117283L;

	// Fields

	private Integer id;
	private Long userid;
	private Integer departId;
	private String gameCode;
	private String advertiser;
	private String flag;
	private String reserve;
	private String deleted;

	// Constructors

	/** default constructor */
	public TUserAuthority() {
	}

	/** full constructor */
	public TUserAuthority(Long userid, Integer departId, String gameCode,
			String advertiser, String flag, String reserve, String deleted) {
		this.userid = userid;
		this.departId = departId;
		this.gameCode = gameCode;
		this.advertiser = advertiser;
		this.flag = flag;
		this.reserve = reserve;
		this.deleted = deleted;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserid() {
		return this.userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Integer getDepartId() {
		return this.departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getAdvertiser() {
		return this.advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getReserve() {
		return this.reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}