package com.efun.pojo;




import java.io.Serializable;
import java.util.Date;

/**
 * 汇率表
 */

public class Rate implements Serializable {

    private static final long serialVersionUID = -8518543546713979423L;

    private Integer id;
    private String originCurrency;//原始币种
    private String exchangeCurrency;//转换的目标币种
    private String gameCode;//游戏代码
    private float rate;//汇率
    private Integer deleted;
    private Integer isTest;//是否为测试，0或者1(测试)
    private Date createTime;
    private Date modifiedTime;


    public Integer getIsTest() {
        return isTest;
    }

    public void setIsTest(Integer isTest) {
        this.isTest = isTest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginCurrency() {
        return originCurrency;
    }

    public void setOriginCurrency(String originCurrency) {
        this.originCurrency = originCurrency;
    }

    public String getExchangeCurrency() {
        return exchangeCurrency;
    }

    public void setExchangeCurrency(String exchangeCurrency) {
        this.exchangeCurrency = exchangeCurrency;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "id=" + id +
                ", originCurrency='" + originCurrency + '\'' +
                ", exchangeCurrency='" + exchangeCurrency + '\'' +
                ", gameCode='" + gameCode + '\'' +
                ", rate=" + rate +
                ", deleted=" + deleted +
                ", createTime=" + createTime +
                ", modifiedTime=" + modifiedTime +
                '}';
    }
}
