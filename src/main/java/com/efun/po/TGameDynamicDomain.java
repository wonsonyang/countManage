package com.efun.po;

/**
 * TGameDynamicDomain entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TGameDynamicDomain implements java.io.Serializable {
	private static final long serialVersionUID = 2212276595778695565L;

	// Fields

	private Long id;
	private String gameCode;
	private String gamePackage;
	private String testPass;
	private String testPerson;
	private String normalPass;
	private String normalPerson;
	private String sdkverson;
	private String versionFile;
	private String domainFile;
	private String isNode;
	private String isNomal;
	private String deleted;

	// Constructors

	/** default constructor */
	public TGameDynamicDomain() {
	}

	/** full constructor */
	public TGameDynamicDomain(String gameCode, String gamePackage,
			String testPass, String testPerson, String normalPass,
			String normalPerson, String sdkverson, String versionFile,
			String domainFile, String isNode, String isNomal, String deleted) {
		this.gameCode = gameCode;
		this.gamePackage = gamePackage;
		this.testPass = testPass;
		this.testPerson = testPerson;
		this.normalPass = normalPass;
		this.normalPerson = normalPerson;
		this.sdkverson = sdkverson;
		this.versionFile = versionFile;
		this.domainFile = domainFile;
		this.isNode = isNode;
		this.isNomal = isNomal;
		this.deleted = deleted;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGameCode() {
		return this.gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getGamePackage() {
		return this.gamePackage;
	}

	public void setGamePackage(String gamePackage) {
		this.gamePackage = gamePackage;
	}

	public String getTestPass() {
		return this.testPass;
	}

	public void setTestPass(String testPass) {
		this.testPass = testPass;
	}

	public String getTestPerson() {
		return this.testPerson;
	}

	public void setTestPerson(String testPerson) {
		this.testPerson = testPerson;
	}

	public String getNormalPass() {
		return this.normalPass;
	}

	public void setNormalPass(String normalPass) {
		this.normalPass = normalPass;
	}

	public String getNormalPerson() {
		return this.normalPerson;
	}

	public void setNormalPerson(String normalPerson) {
		this.normalPerson = normalPerson;
	}

	public String getSdkverson() {
		return this.sdkverson;
	}

	public void setSdkverson(String sdkverson) {
		this.sdkverson = sdkverson;
	}

	public String getVersionFile() {
		return this.versionFile;
	}

	public void setVersionFile(String versionFile) {
		this.versionFile = versionFile;
	}

	public String getDomainFile() {
		return this.domainFile;
	}

	public void setDomainFile(String domainFile) {
		this.domainFile = domainFile;
	}

	public String getIsNode() {
		return this.isNode;
	}

	public void setIsNode(String isNode) {
		this.isNode = isNode;
	}

	public String getIsNomal() {
		return this.isNomal;
	}

	public void setIsNomal(String isNomal) {
		this.isNomal = isNomal;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

}