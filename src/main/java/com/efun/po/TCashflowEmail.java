package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowEmail implements Serializable {
    private static final long serialVersionUID = 2528524526654030098L;
    private Long id;
    private String receivemail;
    private String ccemail;
    private String bccemail;
    private String type;
    private String title;
    private String content;
    private String cashflow;
    private String department;
    private String remark;
    private String creator;
    private Date createTime;
    private Byte deleted;

    public TCashflowEmail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReceivemail() {
        return receivemail;
    }

    public void setReceivemail(String receivemail) {
        this.receivemail = receivemail;
    }

    public String getCcemail() {
        return ccemail;
    }

    public void setCcemail(String ccemail) {
        this.ccemail = ccemail;
    }

    public String getBccemail() {
        return bccemail;
    }

    public void setBccemail(String bccemail) {
        this.bccemail = bccemail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getCashflow() {
        return cashflow;
    }

    public void setCashflow(String cashflow) {
        this.cashflow = cashflow;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public Byte getDeleted() {
        return deleted;
    }

    public void setDeleted(Byte deleted) {
        this.deleted = deleted;
    }
}
