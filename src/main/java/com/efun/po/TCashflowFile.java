package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowFile implements Serializable{
    private static final long serialVersionUID = -5781947252796724760L;
    private Long id;
    private String cashflow;
    private String month;
    private String currency;
    private String fileName;
    private String filePath;
    private String fileType;
    private String type;
    private String remark;
    private Date createTime;
    private Byte deleted;

    public TCashflowFile(String cashflow, String month, String currency, String fileName, String filePath,
                         String fileType, String type, String remark, Date createTime,Byte deleted) {
        this.cashflow = cashflow;
        this.month = month;
        this.currency = currency;
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileType = fileType;
        this.type = type;
        this.remark = remark;
        this.createTime = createTime;
        this.deleted = deleted;
    }

    public TCashflowFile() {
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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
