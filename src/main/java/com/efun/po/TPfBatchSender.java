package com.efun.po;

import java.util.Date;

public class TPfBatchSender {

    private Long id;

    private String batchCode;

    private String uid;

    private String isSuccess;

    private String reissueType;

    private String reissueItem;

    private String remark;

    private String deleted;

    private Date modifyTime;

    private Date createdTime;

    private String platform;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getReissueType() {
        return reissueType;
    }

    public void setReissueType(String reissueType) {
        this.reissueType = reissueType;
    }

    public String getReissueItem() {
        return reissueItem;
    }

    public void setReissueItem(String reissueItem) {
        this.reissueItem = reissueItem;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
