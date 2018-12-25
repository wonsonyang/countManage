package com.efun.po;

/**
 * TPiclocation entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TPicLocation implements java.io.Serializable {
	private static final long serialVersionUID = 3264638941958199886L;

	// Fields

	private Long locationId;
	private String name;
	private String description;
	private String gameCode;
	private Integer deleted;

	// Constructors

	/** default constructor */
	public TPicLocation() {
	}

	/** full constructor */
	public TPicLocation(String name, String description, String gameCode,
			Integer deleted) {
		this.name = name;
		this.description = description;
		this.gameCode = gameCode;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getLocationId() {
		return this.locationId;
	}

	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

}