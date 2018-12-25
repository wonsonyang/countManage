package com.efun.po;

import java.math.BigDecimal;
import java.util.Date;

public class TCashflowGameMoneys implements java.io.Serializable{
    private static final long serialVersionUID = 3258278425947691046L;
    private Long id;
    private String gameCode;
    private String cashflow;
    private String area;
    private String subCashflow;
    private String cashflowOrderId;
    private String efunOrderId;
    private BigDecimal gamePay;
    private BigDecimal taxCost;
    private BigDecimal channelCost;
    private String currency;
    private String transactionType;
    private String remark;
    private String creator;
    private Date createTime;
    private Byte deleted;
    private Long fileId;
    private Date receivetime;
    private BigDecimal otherCost;

    public TCashflowGameMoneys() {

    }

    public TCashflowGameMoneys(String gameCode, String cashflow, String area, String subCashflow, String cashflowOrderId,
                               String efunOrderId, BigDecimal gamePay, BigDecimal taxCost, BigDecimal channelCost, String currency,
                               String transactionType, String remark, String creator, Date createTime, Byte deleted,
                               Long fileId, Date receivetime) {
        this.gameCode = gameCode;
        this.cashflow = cashflow;
        this.area = area;
        this.subCashflow = subCashflow;
        this.cashflowOrderId = cashflowOrderId;
        this.efunOrderId = efunOrderId;
        this.gamePay = gamePay;
        this.taxCost = taxCost;
        this.channelCost = channelCost;
        this.currency = currency;
        this.transactionType = transactionType;
        this.remark = remark;
        this.creator = creator;
        this.createTime = createTime;
        this.deleted = deleted;
        this.fileId = fileId;
        this.receivetime = receivetime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getCashflow() {
        return cashflow;
    }

    public void setCashflow(String cashflow) {
        this.cashflow = cashflow;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSubCashflow() {
        return subCashflow;
    }

    public void setSubCashflow(String subCashflow) {
        this.subCashflow = subCashflow;
    }

    public String getCashflowOrderId() {
        return cashflowOrderId;
    }

    public void setCashflowOrderId(String cashflowOrderId) {
        this.cashflowOrderId = cashflowOrderId;
    }

    public String getEfunOrderId() {
        return efunOrderId;
    }

    public void setEfunOrderId(String efunOrderId) {
        this.efunOrderId = efunOrderId;
    }

    public BigDecimal getGamePay() {
        return gamePay;
    }

    public void setGamePay(BigDecimal gamePay) {
        this.gamePay = gamePay;
    }

    public BigDecimal getTaxCost() {
        return taxCost;
    }

    public void setTaxCost(BigDecimal taxCost) {
        this.taxCost = taxCost;
    }

    public BigDecimal getChannelCost() {
        return channelCost;
    }

    public void setChannelCost(BigDecimal channelCost) {
        this.channelCost = channelCost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
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

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public BigDecimal getOtherCost() {
        return otherCost;
    }

    public void setOtherCost(BigDecimal otherCost) {
        this.otherCost = otherCost;
    }
}
