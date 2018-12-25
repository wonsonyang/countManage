package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TPayActivityCouponOrder implements Serializable {
    private static final long serialVersionUID = -7049310437124518487L;

    private Long id;
    private String exchangeCode;
    private Date bindTime;
    private String efunOrderId;
    private String backup;

    public TPayActivityCouponOrder() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExchangeCode() {
        return exchangeCode;
    }

    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    public Date getBindTime() {
        return bindTime;
    }

    public void setBindTime(Date bindTime) {
        this.bindTime = bindTime;
    }

    public String getEfunOrderId() {
        return efunOrderId;
    }

    public void setEfunOrderId(String efunOrderId) {
        this.efunOrderId = efunOrderId;
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup;
    }
}
