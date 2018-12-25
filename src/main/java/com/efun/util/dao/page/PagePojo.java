package com.efun.util.dao.page;

import java.util.Map;

public class PagePojo {

	private String sql;
	
	private Object[] params;
	
	private int pageSize;
	
	private int offset;
	
	private String type;
	
	private Class<?> entityClass;
	
	private Map<String,Class<?>> entityClassMap;
	
	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Class<?> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<?> entityClass) {
		this.entityClass = entityClass;
	}

	public Map<String, Class<?>> getEntityClassMap() {
		return entityClassMap;
	}

	public void setEntityClassMap(Map<String, Class<?>> entityClassMap) {
		this.entityClassMap = entityClassMap;
	}

}
