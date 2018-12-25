package com.efun.po;

import java.util.Date;

public class AdviceAnswerEntity {
	private Long id;
	private Long adviceId;
	private Long uid;
	private String answer;
	private Date createdtime;
	private byte deleted;
	private String area;
	private String purpose;
	private Long optionId;
	private String remark;

	private Date beginTime;
	private Date endTime;

	public AdviceAnswerEntity() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAdviceId() {
		return adviceId;
	}

	public void setAdviceId(Long adviceId) {
		this.adviceId = adviceId;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getCreatedtime() {
		return createdtime;
	}

	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}

	public byte getDeleted() {
		return deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
}
