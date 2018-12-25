package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowTaxs implements Serializable{
    private static final long serialVersionUID = 824799009536163660L;
    private Long id	;
    private Long billinfoId	;
    private String gameCode	;
    private Float taxRate	;
    private Float exchangeRate	;
    private Float departureTax	;
    private Float channelRate	;
    private String currency	;
    private String area	;
    private Date createTime	;
    private Byte deleted	;

    public TCashflowTaxs() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBillinfoId() {
        return billinfoId;
    }

    public void setBillinfoId(Long billinfoId) {
        this.billinfoId = billinfoId;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    public Float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Float getDepartureTax() {
        return departureTax;
    }

    public void setDepartureTax(Float departureTax) {
        this.departureTax = departureTax;
    }

    public Float getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Float channelRate) {
        this.channelRate = channelRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
