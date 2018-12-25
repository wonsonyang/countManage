package com.efun.po;

import java.io.Serializable;

/**
 * 优惠券实体类
 */
public class TCoupon implements Serializable{
    private static final long serialVersionUID = 5422826721119732983L;
    //特殊字段，页面显示以及其他功能，并非在真实表中的字段，请忽略
    private String timeLimitStr;    //是否显示限时
    private String goodsType;       //限时字段
    private String bindPhoneStr;    //是否需要绑定手机（1:是，0:否）
    private String areaName;        //地区名称
    private Integer bindNums;       //领取数量

    //平台部分的数据
    private String id;              //项目ID
    private String method;          //新增add，修改upString
    private String goodsName;       //兑换标题
    private Integer needGold;       //需要的积分
    private Integer playCount;      //玩家可以领取的次数
    private String activeStartTime;   //活动开始时间
    private String activeEndTime;     //活动结束时间
    private String platform;
    private Integer totalCount;     //优惠券总数
    private String discount;        //折扣
    private String timeLimit;       //是否限时,1是限时
    private String gameCodes;       //平台礼包gameCode(兑换gameCode)
    private String useCase;         //应用场景：1积分商城，2储值赠送，3app赠送，4只增加优惠券不保存平台礼包信息
    private String bindPhone;       //是否需要绑定手机 1是
    private String storeAmount;     //储值范围 100,200
    private String payType;         //可获取的金流
    private String deleted;         //0上架 2下架
    private String isTestData;      //是否测试数据0：不是，1是
    private String expiryDateNumber; //优惠券有效天数

    //储值部分的数据
    private String couponName;      //优惠券名称
    private String usePayType;      //可以使用到的金流
    private String amount;          //最小订单金额
    private String extraRate;       //优惠额度
    private String expiryDate;      //过期时间
    private String useGameCode;     //可以使用到的游戏
    private String couponCode;
    private String productId;

    //公共部分的数据
    private String description;     //兑换描述
    private String icon;            //背景图
    private String isUsed;          //是否被使用：1表示已被使用（不可修改），0表示未被使用（可修改）

    public TCoupon() {

    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getBindPhoneStr() {
        return bindPhoneStr;
    }

    public void setBindPhoneStr(String bindPhoneStr) {
        this.bindPhoneStr = bindPhoneStr;
    }

    public String getTimeLimitStr() {
        return timeLimitStr;
    }

    public void setTimeLimitStr(String timeLimitStr) {
        this.timeLimitStr = timeLimitStr;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getNeedGold() {
        return needGold;
    }

    public void setNeedGold(Integer needGold) {
        this.needGold = needGold;
    }

    public Integer getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Integer playCount) {
        this.playCount = playCount;
    }

    public String getActiveStartTime() {
        return activeStartTime;
    }

    public void setActiveStartTime(String activeStartTime) {
        this.activeStartTime = activeStartTime;
    }

    public String getActiveEndTime() {
        return activeEndTime;
    }

    public void setActiveEndTime(String activeEndTime) {
        this.activeEndTime = activeEndTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit;
    }

    public String getGameCodes() {
        return gameCodes;
    }

    public void setGameCodes(String gameCodes) {
        this.gameCodes = gameCodes;
    }

    public String getUseCase() {
        return useCase;
    }

    public void setUseCase(String useCase) {
        this.useCase = useCase;
    }

    public String getBindPhone() {
        return bindPhone;
    }

    public void setBindPhone(String bindPhone) {
        this.bindPhone = bindPhone;
    }

    public String getStoreAmount() {
        return storeAmount;
    }

    public void setStoreAmount(String storeAmount) {
        this.storeAmount = storeAmount;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public String getUsePayType() {
        return usePayType;
    }

    public void setUsePayType(String usePayType) {
        this.usePayType = usePayType;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getExtraRate() {
        return extraRate;
    }

    public void setExtraRate(String extraRate) {
        this.extraRate = extraRate;
    }

    public String getUseGameCode() {
        return useGameCode;
    }

    public void setUseGameCode(String useGameCode) {
        this.useGameCode = useGameCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getIsTestData() {
        return isTestData;
    }

    public void setIsTestData(String isTestData) {
        this.isTestData = isTestData;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public Integer getBindNums() {
        return bindNums;
    }

    public void setBindNums(Integer bindNums) {
        this.bindNums = bindNums;
    }

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

    public String getExpiryDateNumber() {
        return expiryDateNumber;
    }

    public void setExpiryDateNumber(String expiryDateNumber) {
        this.expiryDateNumber = expiryDateNumber;
    }
}
