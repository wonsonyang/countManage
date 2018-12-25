package com.efun.po;

import java.util.Date;

public class TCashflowBillinfo {
    private Long id;
    private String cashflow;
    private String subCashflow;
    private Integer isParent;
    private Long fileId;
    private String month;
    private String status;
    private Date beginTime;
    private Date endTime;
    private String remark;
    private String creator;
    private Date createTime;
    private String lastUpdate;
    private Date lastUpdateTime;
    private Byte deleted;
    private String department;

    public TCashflowBillinfo() {

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCashflow() {
        return cashflow;
    }

    public void setCashflow(String cashflow) {
        this.cashflow = cashflow;
    }

    public String getSubCashflow() {
        return subCashflow;
    }

    public void setSubCashflow(String subCashflow) {
        this.subCashflow = subCashflow;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TCashflowBillinfo{" +
                "id=" + id +
                ", cashflow='" + cashflow + '\'' +
                ", subCashflow='" + subCashflow + '\'' +
                ", isParent=" + isParent +
                ", fileId=" + fileId +
                ", month='" + month + '\'' +
                ", status='" + status + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", lastUpdate='" + lastUpdate + '\'' +
                ", lastUpdateTime=" + lastUpdateTime +
                ", deleted=" + deleted +
                '}';
    }
}
