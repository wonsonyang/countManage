package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowAccountOther implements Serializable {
    private static final long serialVersionUID = 8418856445297681044L;

    private Long id;
    private String cashflow;
    private String subCashflow;
    private String type;
    private String gameName;
    private String gameCode;
    private String currency;
    private Double income;
    private Double taxs;
    private Double channelCost;
    private Double totalCost;
    private Double efunAmount;
    private Double efunNetIncome;
    private Double departureTax;
    private String month;
    private String remark;
    private String creator;
    private Date createTime;
    private String lastUpdate;
    private Date lastUpdateTime;
    private Byte deleted;
    private Double netIncome;
    private Double otherCost;
    private Double refundAmount;
    private Double incomeNoneTax;
    private Double incomeTax;
    private Double totalCostNoneTax;
    private Double totalCostTax;

    public TCashflowAccountOther(String cashflow, String subCashflow, String type, String gameName, String gameCode,
                                 String currency, Double income, Double totalCost, Double efunAmount, Double efunNetIncome,
                                 Double departureTax, String month, String remark, String creator,
                                 Date createTime, String lastUpdate, Date lastUpdateTime, Byte deleted,Double taxs,
                                 Double channelCost, Double netIncome,Double otherCost,Double refundAmount,
                                 Double incomeNoneTax,Double incomeTax,Double totalCostNoneTax,Double totalCostTax) {
        this.cashflow = cashflow;
        this.subCashflow = subCashflow;
        this.type = type;
        this.gameName = gameName;
        this.gameCode = gameCode;
        this.currency = currency;
        this.income = income;
        this.totalCost = totalCost;
        this.efunAmount = efunAmount;
        this.efunNetIncome = efunNetIncome;
        this.departureTax = departureTax;
        this.month = month;
        this.remark = remark;
        this.creator = creator;
        this.createTime = createTime;
        this.lastUpdate = lastUpdate;
        this.lastUpdateTime = lastUpdateTime;
        this.deleted = deleted;
        this.taxs = taxs;
        this.channelCost = channelCost;
        this.netIncome = netIncome;
        this.otherCost = otherCost;
        this.refundAmount = refundAmount;
        this.incomeNoneTax = incomeNoneTax;
        this.incomeTax = incomeTax;
        this.totalCostNoneTax = totalCostNoneTax;
        this.totalCostTax = totalCostTax;
    }

    public Double getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Double refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Double getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(Double channelCost) {
        this.channelCost = channelCost;
    }

    public Double getTaxs() {
        return taxs;
    }

    public void setTaxs(Double taxs) {
        this.taxs = taxs;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getEfunAmount() {
        return efunAmount;
    }

    public void setEfunAmount(Double efunAmount) {
        this.efunAmount = efunAmount;
    }

    public Double getEfunNetIncome() {
        return efunNetIncome;
    }

    public void setEfunNetIncome(Double efunNetIncome) {
        this.efunNetIncome = efunNetIncome;
    }

    public Double getDepartureTax() {
        return departureTax;
    }

    public void setDepartureTax(Double departureTax) {
        this.departureTax = departureTax;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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

    public Double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(Double netIncome) {
        this.netIncome = netIncome;
    }

    public Double getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(Double otherCost) {
        this.otherCost = otherCost;
    }

    public Double getIncomeNoneTax() {
        return incomeNoneTax;
    }

    public void setIncomeNoneTax(Double incomeNoneTax) {
        this.incomeNoneTax = incomeNoneTax;
    }

    public Double getIncomeTax() {
        return incomeTax;
    }

    public void setIncomeTax(Double incomeTax) {
        this.incomeTax = incomeTax;
    }

    public Double getTotalCostNoneTax() {
        return totalCostNoneTax;
    }

    public void setTotalCostNoneTax(Double totalCostNoneTax) {
        this.totalCostNoneTax = totalCostNoneTax;
    }

    public Double getTotalCostTax() {
        return totalCostTax;
    }

    public void setTotalCostTax(Double totalCostTax) {
        this.totalCostTax = totalCostTax;
    }

    public TCashflowAccountOther() {

    }
}
