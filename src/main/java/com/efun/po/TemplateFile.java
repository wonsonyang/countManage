package com.efun.po;

/**
 * TemplateFile entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TemplateFile implements java.io.Serializable {
	private static final long serialVersionUID = 9036672096780141091L;

	// Fields

	private Integer id;
	private String tlFpath;
	private String tlName;
	private String tlExplain;
	private String tlClaw;
	private String tlCpath;
	private Integer type;
	private String grid;
	private String param;
	private String template;
	private String pageKeyword;
	private String pageDescription;
	private String pageTitle;
	private String tlFpathTest;
	private String tlCpathTest;
	private Integer deleted;
	private String tlHttpUrl;

	// Constructors

	/** default constructor */
	public TemplateFile() {
	}

	/** minimal constructor */
	public TemplateFile(String tlFpath, String tlName, String tlClaw,
			String template) {
		this.tlFpath = tlFpath;
		this.tlName = tlName;
		this.tlClaw = tlClaw;
		this.template = template;
	}

	/** full constructor */
	public TemplateFile(String tlFpath, String tlName, String tlExplain,
			String tlClaw, String tlCpath, Integer type, String grid,
			String param, String template, String pageKeyword,
			String pageDescription, String pageTitle, String tlFpathTest,
			String tlCpathTest, Integer deleted, String tlHttpUrl) {
		this.tlFpath = tlFpath;
		this.tlName = tlName;
		this.tlExplain = tlExplain;
		this.tlClaw = tlClaw;
		this.tlCpath = tlCpath;
		this.type = type;
		this.grid = grid;
		this.param = param;
		this.template = template;
		this.pageKeyword = pageKeyword;
		this.pageDescription = pageDescription;
		this.pageTitle = pageTitle;
		this.tlFpathTest = tlFpathTest;
		this.tlCpathTest = tlCpathTest;
		this.deleted = deleted;
		this.tlHttpUrl = tlHttpUrl;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTlFpath() {
		return this.tlFpath;
	}

	public void setTlFpath(String tlFpath) {
		this.tlFpath = tlFpath;
	}

	public String getTlName() {
		return this.tlName;
	}

	public void setTlName(String tlName) {
		this.tlName = tlName;
	}

	public String getTlExplain() {
		return this.tlExplain;
	}

	public void setTlExplain(String tlExplain) {
		this.tlExplain = tlExplain;
	}

	public String getTlClaw() {
		return this.tlClaw;
	}

	public void setTlClaw(String tlClaw) {
		this.tlClaw = tlClaw;
	}

	public String getTlCpath() {
		return this.tlCpath;
	}

	public void setTlCpath(String tlCpath) {
		this.tlCpath = tlCpath;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getGrid() {
		return this.grid;
	}

	public void setGrid(String grid) {
		this.grid = grid;
	}

	public String getParam() {
		return this.param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getPageKeyword() {
		return this.pageKeyword;
	}

	public void setPageKeyword(String pageKeyword) {
		this.pageKeyword = pageKeyword;
	}

	public String getPageDescription() {
		return this.pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
	}

	public String getPageTitle() {
		return this.pageTitle;
	}

	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	public String getTlFpathTest() {
		return this.tlFpathTest;
	}

	public void setTlFpathTest(String tlFpathTest) {
		this.tlFpathTest = tlFpathTest;
	}

	public String getTlCpathTest() {
		return this.tlCpathTest;
	}

	public void setTlCpathTest(String tlCpathTest) {
		this.tlCpathTest = tlCpathTest;
	}

	public Integer getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getTlHttpUrl() {
		return this.tlHttpUrl;
	}

	public void setTlHttpUrl(String tlHttpUrl) {
		this.tlHttpUrl = tlHttpUrl;
	}

}