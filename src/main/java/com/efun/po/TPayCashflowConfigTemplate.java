package com.efun.po;

import java.util.Date;

public class TPayCashflowConfigTemplate {

    private Long id;

    private String cashflow;

    private String configTemplate;

    private Date createdTime;

    private String deleted;

    private Date modifiedTime;

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

    public String getConfigTemplate() {
        return configTemplate;
    }

    public void setConfigTemplate(String configTemplate) {
        this.configTemplate = configTemplate;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
