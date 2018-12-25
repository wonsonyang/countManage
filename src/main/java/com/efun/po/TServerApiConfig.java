package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 接口信息表
 * Created by peterpeng on 2018/2/7.
 */
public class TServerApiConfig implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long id;

	private String apiType;        //接口业务类型 充值回调、发奖、角色查询、自动对账

	private String gameCode;       //游戏标识

	private String serverCode;     //游戏服Id。单个业务接口存在多个服请求路径不一样的情况，需要通过游戏服id指定唯一路径。

	private String urlAddress;     //接口路径

	private String contentType;    //application/x-www-form-urlencoded、application/json

	private String requestMethod;  //请求方法,Get post

	private String status;         //未发布("nopublish"),发布中（"publishing"），已发布("publish"),已废弃("abandon");

	private Date publishTime;      //发布时间

	private String auditor;        //审核人

	private String description;    //描述

	private Date createdTime;

	private Date modifiedTime;

	private Integer deleted;       //逻辑删除 0或空 未删除; 1 已删除

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

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getUrlAddress() {
		return urlAddress;
	}

	public void setUrlAddress(String urlAddress) {
		this.urlAddress = urlAddress;
	}

	public String getRequestMethod() {
		return requestMethod;
	}

	public void setRequestMethod(String requestMethod) {
		this.requestMethod = requestMethod;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
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

	public String getServerCode() {
		return serverCode;
	}

	public void setServerCode(String serverCode) {
		this.serverCode = serverCode;
	}
}
