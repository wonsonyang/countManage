package com.efun.po;

import java.util.Date;

public class AdviceOptionEntity implements java.io.Serializable{
	private static final long serialVersionUID = 2510959042454209118L;
	private Long id;
	private Long adviceId;
	private Date createdtime;
	private String optionDes;
	private Integer orderno;
	private Byte deleted;
	private Integer totalNum;
	public AdviceOptionEntity() {
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
	public Date getCreatedtime() {
		return createdtime;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
	public String getOptionDes() {
		return optionDes;
	}
	public void setOptionDes(String optionDes) {
		this.optionDes = optionDes;
	}
	public Integer getOrderno() {
		return orderno;
	}
	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}
	public Byte getDeleted() {
		return deleted;
	}
	public void setDeleted(Byte deleted) {
		this.deleted = deleted;
	}

	public Integer getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(Integer totalNum) {
		this.totalNum = totalNum;
	}

	@Override
	public String toString() {
		return "AdviceOptionEntity [id=" + id + ", adviceId=" + adviceId + ", createdtime=" + createdtime
				+ ", optionDes=" + optionDes + ", orderno=" + orderno + ", deleted=" + deleted + ", totalNum="
				+ totalNum + "]";
	}
	
	
}
