package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口表实体
 * Created by peterpeng on 2018/2/7.
 */
public class TServerApi implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private Date createdTime;

	private Date modifiedTime;

	private String apiType;       //接口业务类型 充值回调、发奖、角色查询、自动对账

	private String apiName;       //接口中文名

	private String parameters;    //接口参数集合

	private String description;   //接口描述

	private Integer deleted;      //逻辑删除 0或空 未删除; 1 已删除

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

	public String getApiType() {
		return apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getParameters() {
		return parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
}
