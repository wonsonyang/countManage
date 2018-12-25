package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowAccount implements Serializable{
    private static final long serialVersionUID = -3940573601298324567L;
    private Long id;
    private String cashflow;
    private String month;
    private Double cashflowIncome;
    private Double efunIncome;
    private Double usdCashflowIncome;
    private Double usdEfunIncome;
    private String currency;
    private Double stone;
    private Float channelRate;
    private Double channelCost;
    private Float exchangeRate;
    private Double taxs;
    private Double test;
    private Double efunLastMonth;
    private Double efunNextMonth;
    private Double cashflowLastMonth;
    private Double cashflowNextMonth;
    private Double cashflowLoseOrder;
    private Double efunLoseOrder;
    private Double chargeReturn;
    private Double lastChargeReturn;
    private Double transfer;
    private Double departureTax;
    private Double cashflowChannelIncome;
    private Double efunChannelIncome;
    private Double currenyIncome;
    private Double usdIncome;
    private String remark;
    private String creator;
    private Date createTime;
    private String lastUpdate;
    private Date lastUpdateTime;
    private Byte deleted;
    private Double efunRepeatOrder;
    private Double cashflowRepeatOrder;
    private Double diffAmount;
    private Double otherCost;

    public TCashflowAccount(String cashflow, String month, Double cashflowIncome, Double efunIncome,
                            String currency, Double stone, Float channelRate, Double channelCost, Float exchangeRate,
                            Double taxs, Double test, Double efunLastMonth, Double efunNextMonth,
                            Double cashflowLastMonth, Double cashflowNextMonth, Double cashflowLoseOrder,
                            Double efunLoseOrder, Double chargeReturn, Double lastChargeReturn, Double transfer,
                            Double departureTax, Double cashflowChannelIncome,Double efunChannelIncome, Double currenyIncome, Double usdIncome,
                            String remark, String creator, Date createTime, String lastUpdate, Date lastUpdateTime,
                            Byte deleted,Double efunRepeatOrder,Double cashflowRepeatOrder,Double diffAmount,
                            Double usdCashflowIncome,Double usdEfunIncome,Double otherCost) {
        this.cashflow = cashflow;
        this.month = month;
        this.cashflowIncome = cashflowIncome;
        this.efunIncome = efunIncome;
        this.currency = currency;
        this.stone = stone;
        this.channelRate = channelRate;
        this.channelCost = channelCost;
        this.exchangeRate = exchangeRate;
        this.taxs = taxs;
        this.test = test;
        this.efunLastMonth = efunLastMonth;
        this.efunNextMonth = efunNextMonth;
        this.cashflowLastMonth = cashflowLastMonth;
        this.cashflowNextMonth = cashflowNextMonth;
        this.cashflowLoseOrder = cashflowLoseOrder;
        this.efunLoseOrder = efunLoseOrder;
        this.chargeReturn = chargeReturn;
        this.lastChargeReturn = lastChargeReturn;
        this.transfer = transfer;
        this.departureTax = departureTax;
        this.cashflowChannelIncome = cashflowChannelIncome;
        this.efunChannelIncome = efunChannelIncome;
        this.currenyIncome = currenyIncome;
        this.usdIncome = usdIncome;
        this.remark = remark;
        this.creator = creator;
        this.createTime = createTime;
        this.lastUpdate = lastUpdate;
        this.lastUpdateTime = lastUpdateTime;
        this.deleted = deleted;
        this.efunRepeatOrder = efunRepeatOrder;
        this.cashflowRepeatOrder = cashflowRepeatOrder;
        this.diffAmount = diffAmount;
        this.usdCashflowIncome = usdCashflowIncome;
        this.usdEfunIncome = usdEfunIncome;
        this.otherCost = otherCost;
    }

    public TCashflowAccount() {

    }

    public Double getDiffAmount() {
        return diffAmount;
    }

    public void setDiffAmount(Double diffAmount) {
        this.diffAmount = diffAmount;
    }

    public Double getEfunRepeatOrder() {
        return efunRepeatOrder;
    }

    public void setEfunRepeatOrder(Double efunRepeatOrder) {
        this.efunRepeatOrder = efunRepeatOrder;
    }

    public Double getCashflowRepeatOrder() {
        return cashflowRepeatOrder;
    }

    public void setCashflowRepeatOrder(Double cashflowRepeatOrder) {
        this.cashflowRepeatOrder = cashflowRepeatOrder;
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

    public Double getCashflowIncome() {
        return cashflowIncome;
    }

    public void setCashflowIncome(Double cashflowIncome) {
        this.cashflowIncome = cashflowIncome;
    }

    public Double getEfunIncome() {
        return efunIncome;
    }

    public void setEfunIncome(Double efunIncome) {
        this.efunIncome = efunIncome;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getStone() {
        return stone;
    }

    public void setStone(Double stone) {
        this.stone = stone;
    }

    public Float getChannelRate() {
        return channelRate;
    }

    public void setChannelRate(Float channelRate) {
        this.channelRate = channelRate;
    }

    public Double getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(Double channelCost) {
        this.channelCost = channelCost;
    }

    public Float getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Float exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getTaxs() {
        return taxs;
    }

    public void setTaxs(Double taxs) {
        this.taxs = taxs;
    }

    public Double getTest() {
        return test;
    }

    public void setTest(Double test) {
        this.test = test;
    }

    public Double getEfunLastMonth() {
        return efunLastMonth;
    }

    public void setEfunLastMonth(Double efunLastMonth) {
        this.efunLastMonth = efunLastMonth;
    }

    public Double getEfunNextMonth() {
        return efunNextMonth;
    }

    public void setEfunNextMonth(Double efunNextMonth) {
        this.efunNextMonth = efunNextMonth;
    }

    public Double getCashflowLastMonth() {
        return cashflowLastMonth;
    }

    public void setCashflowLastMonth(Double cashflowLastMonth) {
        this.cashflowLastMonth = cashflowLastMonth;
    }

    public Double getCashflowNextMonth() {
        return cashflowNextMonth;
    }

    public void setCashflowNextMonth(Double cashflowNextMonth) {
        this.cashflowNextMonth = cashflowNextMonth;
    }

    public Double getCashflowLoseOrder() {
        return cashflowLoseOrder;
    }

    public void setCashflowLoseOrder(Double cashflowLoseOrder) {
        this.cashflowLoseOrder = cashflowLoseOrder;
    }

    public Double getEfunLoseOrder() {
        return efunLoseOrder;
    }

    public void setEfunLoseOrder(Double efunLoseOrder) {
        this.efunLoseOrder = efunLoseOrder;
    }

    public Double getChargeReturn() {
        return chargeReturn;
    }

    public void setChargeReturn(Double chargeReturn) {
        this.chargeReturn = chargeReturn;
    }

    public Double getLastChargeReturn() {
        return lastChargeReturn;
    }

    public void setLastChargeReturn(Double lastChargeReturn) {
        this.lastChargeReturn = lastChargeReturn;
    }

    public Double getTransfer() {
        return transfer;
    }

    public void setTransfer(Double transfer) {
        this.transfer = transfer;
    }

    public Double getDepartureTax() {
        return departureTax;
    }

    public void setDepartureTax(Double departureTax) {
        this.departureTax = departureTax;
    }

    public Double getCashflowChannelIncome() {
        return cashflowChannelIncome;
    }

    public void setCashflowChannelIncome(Double cashflowChannelIncome) {
        this.cashflowChannelIncome = cashflowChannelIncome;
    }

    public Double getEfunChannelIncome() {
        return efunChannelIncome;
    }

    public void setEfunChannelIncome(Double efunChannelIncome) {
        this.efunChannelIncome = efunChannelIncome;
    }

    public Double getCurrenyIncome() {
        return currenyIncome;
    }

    public void setCurrenyIncome(Double currenyIncome) {
        this.currenyIncome = currenyIncome;
    }

    public Double getUsdIncome() {
        return usdIncome;
    }

    public void setUsdIncome(Double usdIncome) {
        this.usdIncome = usdIncome;
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

    public Double getUsdCashflowIncome() {
        return usdCashflowIncome;
    }

    public void setUsdCashflowIncome(Double usdCashflowIncome) {
        this.usdCashflowIncome = usdCashflowIncome;
    }

    public Double getUsdEfunIncome() {
        return usdEfunIncome;
    }

    public void setUsdEfunIncome(Double usdEfunIncome) {
        this.usdEfunIncome = usdEfunIncome;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }
}
