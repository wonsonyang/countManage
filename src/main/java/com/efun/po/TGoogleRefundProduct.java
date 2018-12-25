package com.efun.po;

import java.io.Serializable;

public class TGoogleRefundProduct implements Serializable{
    private static final long serialVersionUID = 1873663251503895103L;
    private Long id;
    private String gameCode;
    private String productName;
    private String productId;
    private Double gamePay;
    private Double stone;
    private Integer deleted;

    public TGoogleRefundProduct() {
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getGamePay() {
        return gamePay;
    }

    public void setGamePay(Double gamePay) {
        this.gamePay = gamePay;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Double getStone() {
        return stone;
    }

    public void setStone(Double stone) {
        this.stone = stone;
    }
}
