package com.efun.po;

import java.util.Date;
import java.util.List;

public class AdviceDescriptionEntity implements java.io.Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;

    private String purpose;

    private String advice;

    private String option;

    private String type;	//问题类型:1代表单选题，2代表多选题，3代表填空题

    private Integer orderno;

    private String area;

    private String creator;

    private Date createdtime;

    private Long optionId;

    private String remark;

    private Byte deleted;

    private long offset;

    private long pageSize;

    private List<AdviceOptionEntity> optionEntityList = null;


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

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose == null ? null : purpose.trim();
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice == null ? null : advice.trim();
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option == null ? null : option.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }


	public List<AdviceOptionEntity> getOptionEntityList() {
		return optionEntityList;
	}

	public void setOptionEntityList(List<AdviceOptionEntity> optionEntityList) {
		this.optionEntityList = optionEntityList;
	}

	public String toString() {
		return "AdviceDescriptionEntity [id=" + id + ", purpose=" + purpose + ", advice=" + advice + ", option="
				+ option + ", type=" + type + ", orderno=" + orderno + ", area=" + area + ", creator=" + creator
				+ ", createdtime=" + createdtime + ", optionId=" + optionId + ", remark=" + remark + ", deleted="
				+ deleted + ", offset=" + offset + ", pageSize=" + pageSize + ", optionEntityList=" + optionEntityList
				+ "]";
	}
}