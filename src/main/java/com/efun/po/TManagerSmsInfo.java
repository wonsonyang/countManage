package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 *  t_manager_sms_info
 */
public class TManagerSmsInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/**
	 * id ID
	 */
	private String id;

	/**
	 * title 短信标题
	 */
	private String title;

	/**
	 * content 短信内容
	 */
	private String content;

	/**
	 * sendTime 发送时间
	 */
	private Date sendTime;

	/**
	 * thirdType 所属地区
	 */
	private String thirdType;

	/**
	 * phoneNum 电话号码
	 */
	private String phoneNum;

	/**
	 * sendState  发送状态（1：未发送，2：发送失败，3：发送成功，4：部分发送失败）
	 */
	private Integer sendState;

	/**
	 * successNum 成功数量
	 */
	private Integer successNum;

	/**
	 * totalNum 发送总数量
	 */
	private Integer totalNum;

	/**
	 * sendTime 发送时间
	 */
	private Date createTime;

	/**
	 * filePath 上传文件路径
	 */
	private String filePath;

	/**
	 * istort 是否侵权（1：侵权，2：非侵权）
	 */
	private Integer istort;

	/**
	 * gameCode 游戏代号
	 */
	private String gameCode;

	/**
	 * activityCode 活动代号
	 */
	private String activityCode;

	/**
	 * area 地区
	 */
	private String area;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getSendState() {
		return sendState;
	}

	public void setSendState(Integer sendState) {
		this.sendState = sendState;
	}

	public Integer getSuccessNum() {
		return successNum;
	}

	public void setSuccessNum(Integer successNum) {
		this.successNum = successNum;
	}

	public Integer getIstort() {
		return istort;
	}

	public void setIstort(Integer istort) {
		this.istort = istort;
	}

	public String getThirdType() {
		return thirdType;
	}

	public void setThirdType(String thirdType) {
		this.thirdType = thirdType;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	public String getGameCode() {
		return gameCode;
	}

	public void setGameCode(String gameCode) {
		this.gameCode = gameCode;
	}

	public String getActivityCode() {
		return activityCode;
	}

	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}