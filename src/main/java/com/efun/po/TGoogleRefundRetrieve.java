package com.efun.po;

import java.io.Serializable;

public class TGoogleRefundRetrieve implements Serializable {
    private static final long serialVersionUID = -3836938024500323391L;
    private Long id;
    private Long userId;
    private String roleId;
    private String gameCode;
    private String serverCode;
    private String efunOrderId;
    private String googleOrderId;
    private String currency;
    private Double stone;
    private Double gamePay;
    private Double twCoin;
    private Double usd;
    private String createdTime;
    private String modifiedTime;
    private String voidedTime;
    private String productId;
    private Integer status;
    private String recoveryPeriod;
    private Integer deleted;
    private String banTime;
    private String remark;
    private String operator;
    private String operatedTime;
    private String recoveryTime;

    public TGoogleRefundRetrieve(Long userId, String roleId, String gameCode, String serverCode, String efunOrderId,
                                 String googleOrderId, String currency, Double stone, Double gamePay, Double twCoin, Double usd,
                                 String createdTime, String modifiedTime, String voidedTime, String productId, Integer status,
                                 String recoveryPeriod, Integer deleted, String banTime, String remark, String operator, String operatedTime,String recoveryTime) {
        this.userId = userId;
        this.roleId = roleId;
        this.gameCode = gameCode;
        this.serverCode = serverCode;
        this.efunOrderId = efunOrderId;
        this.googleOrderId = googleOrderId;
        this.currency = currency;
        this.stone = stone;
        this.gamePay = gamePay;
        this.twCoin = twCoin;
        this.usd = usd;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
        this.voidedTime = voidedTime;
        this.productId = productId;
        this.status = status;
        this.recoveryPeriod = recoveryPeriod;
        this.deleted = deleted;
        this.banTime = banTime;
        this.remark = remark;
        this.operator = operator;
        this.operatedTime = operatedTime;
        this.recoveryTime = recoveryTime;
    }

    public TGoogleRefundRetrieve() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
    }

    public String getEfunOrderId() {
        return efunOrderId;
    }

    public void setEfunOrderId(String efunOrderId) {
        this.efunOrderId = efunOrderId;
    }

    public String getGoogleOrderId() {
        return googleOrderId;
    }

    public void setGoogleOrderId(String googleOrderId) {
        this.googleOrderId = googleOrderId;
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

    public Double getGamePay() {
        return gamePay;
    }

    public void setGamePay(Double gamePay) {
        this.gamePay = gamePay;
    }

    public Double getTwCoin() {
        return twCoin;
    }

    public void setTwCoin(Double twCoin) {
        this.twCoin = twCoin;
    }

    public Double getUsd() {
        return usd;
    }

    public void setUsd(Double usd) {
        this.usd = usd;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getVoidedTime() {
        return voidedTime;
    }

    public void setVoidedTime(String voidedTime) {
        this.voidedTime = voidedTime;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRecoveryPeriod() {
        return recoveryPeriod;
    }

    public void setRecoveryPeriod(String recoveryPeriod) {
        this.recoveryPeriod = recoveryPeriod;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getBanTime() {
        return banTime;
    }

    public void setBanTime(String banTime) {
        this.banTime = banTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperatedTime() {
        return operatedTime;
    }

    public void setOperatedTime(String operatedTime) {
        this.operatedTime = operatedTime;
    }

    public String getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(String recoveryTime) {
        this.recoveryTime = recoveryTime;
    }
}
