package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * Created by peterpeng on 2018/2/7.
 */
public class TServerApiTestcase implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private Date createdTime;

	private Date modifiedTime;

	private Integer deleted;       //逻辑删除 0或空 未删除; 1 已删除

	private String name;           //用例名称

	private String description;    //说明

	private String apiType;        //接口标识

	private String paramModel;     //参数模板 拼接json格式数据

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getParamModel() {
		return paramModel;
	}

	public void setParamModel(String paramModel) {
		this.paramModel = paramModel;
	}
}
