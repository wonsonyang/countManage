package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台活动表PO
 * 
 * @author Ken
 *
 */
public class TPfActivity implements Serializable {

	private static final long serialVersionUID = -6044801388520735857L;

	private Integer id;
	private String activityName;
	private Date startTime;
	private Date endTime;
	private String activityUrl;
	private String flag;
	private Integer isPayactivity;
	private String img;
	private String context;

	public TPfActivity() {

	}

	public TPfActivity(Integer id, String activityName, Date startTime, Date endTime, String activityUrl, String flag,
			Integer isPayactivity, String img, String context) {
		super();
		this.id = id;
		this.activityName = activityName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.activityUrl = activityUrl;
		this.flag = flag;
		this.isPayactivity = isPayactivity;
		this.img = img;
		this.context = context;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getActivityUrl() {
		return activityUrl;
	}

	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public Integer getIsPayactivity() {
		return isPayactivity;
	}

	public void setIsPayactivity(Integer isPayactivity) {
		this.isPayactivity = isPayactivity;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}
