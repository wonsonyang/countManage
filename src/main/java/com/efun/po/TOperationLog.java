package com.efun.po;

import java.io.Serializable;

/**
 * 操作日志记录表 t_operation_log
 */
public class TOperationLog implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	private Integer id;

	/**
	 * ip 操作来源IP
	 */
	private String ip;

	/**
	 * user 操作者
	 */
	private String user;

	/**
	 * description 操作描述
	 */
	private String description;

	/**
	 * opTime 操作时间
	 */
	private java.util.Date opTime;

	/**
	 * errorMsg 操作错误信息
	 */
	private String errorMsg;

	/**
	 * url 请求地址
	 */
	private String url;

	/**
	 * paramsStr 请求参数
	 */
	private String paramsStr;

	/**
	 * paramsStr 请求结果
	 */
	public String result;

	/**
	 * timeCost 请求耗时
	 */
	private Long timeCost;

	/**
	 * thread 线程
	 */
	private String thread;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getOpTime() {
		return opTime;
	}

	public void setOpTime(java.util.Date opTime) {
		this.opTime = opTime;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParamsStr() {
		return paramsStr;
	}

	public void setParamsStr(String paramsStr) {
		this.paramsStr = paramsStr;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Long getTimeCost() {
		return timeCost;
	}

	public void setTimeCost(Long timeCost) {
		this.timeCost = timeCost;
	}

	public String getThread() {
		return thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
	}

	@Override
	public String toString() {
		return "TOperationLog [id=" + id + ", ip=" + ip + ", user=" + user + ", description="
				+ description + ", opTime=" + opTime + ", errorMsg=" + errorMsg + ", url=" + url
				+ ", paramsStr=" + paramsStr + ", result=" + result + ", timeCost=" + timeCost
				+ ", thread=" + thread + "]";
	}

}