package com.efun.po;

/**
 * TGamePropellingSetIos entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGamePropellingSetIos implements java.io.Serializable {
	private static final long serialVersionUID = 9206661774638192876L;

	// Fields

	private Integer id;
	private String gameCode;
	private String hostApns;
	private String password;
	private String path;

	private String deleted;
	// Constructors

	/** default constructor */
	public TGamePropellingSetIos() {
	}

	/** full constructor */
	

	// Property accessors
	
	public TGamePropellingSetIos(Integer id, String gameCode, String hostApns,
			String password, String path, String deleted) {
		super();
		this.id = id;
		this.gameCode = gameCode;
		this.hostApns = hostApns;
		this.password = password;
		this.path = path;
		this.deleted = deleted;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getHostApns() {
		return this.hostApns;
	}

	public void setHostApns(String hostApns) {
		this.hostApns = hostApns;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}
	

}