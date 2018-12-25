package com.efun.po;

/**
 * TemplateLabel entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class TemplateLabel implements java.io.Serializable {
	private static final long serialVersionUID = -7029371726484820800L;

	// Fields

	private Integer id;
	private Integer connId;
	private String tlFn;
	private String name;
	private Integer byid;
	private String type;
	private String table;
	private String field;
	private String where;
	private String orderBy;
	private String limit;
	private String content;
	private String title;

	// Constructors

	/** default constructor */
	public TemplateLabel() {
	}

	/** minimal constructor */
	public TemplateLabel(Integer connId, String tlFn) {
		this.connId = connId;
		this.tlFn = tlFn;
	}

	/** full constructor */
	public TemplateLabel(Integer connId, String tlFn, String name, Integer byid, String type, String table,
			String field, String where, String orderBy, String limit, String content, String title) {
		this.connId = connId;
		this.tlFn = tlFn;
		this.name = name;
		this.byid = byid;
		this.type = type;
		this.table = table;
		this.field = field;
		this.where = where;
		this.orderBy = orderBy;
		this.limit = limit;
		this.content = content;
		this.title = title;
	}

	// Property accessors

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getConnId() {
		return connId;
	}

	public void setConnId(Integer connId) {
		this.connId = connId;
	}

	public String getTlFn() {
		return tlFn;
	}

	public void setTlFn(String tlFn) {
		this.tlFn = tlFn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getByid() {
		return byid;
	}

	public void setByid(Integer byid) {
		this.byid = byid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String limit) {
		this.limit = limit;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}