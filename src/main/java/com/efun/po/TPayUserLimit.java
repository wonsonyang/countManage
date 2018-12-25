package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TPayUserLimit implements Serializable {
    private static final long serialVersionUID = -3666956116653153229L;
    private Long id;
    private String gameCodes;
    private String isAllGameLimit;
    private String payFlag;
    private String isAllPayLimit;
    private String userId;
    private String comment;
    private Date createTime;
    private Date modifiedTime;
    private String operator;
    private String flag;
    private String deleted;

    public TPayUserLimit() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameCodes() {
        return gameCodes;
    }

    public void setGameCodes(String gameCodes) {
        this.gameCodes = gameCodes;
    }

    public String getIsAllGameLimit() {
        return isAllGameLimit;
    }

    public void setIsAllGameLimit(String isAllGameLimit) {
        this.isAllGameLimit = isAllGameLimit;
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag;
    }

    public String getIsAllPayLimit() {
        return isAllPayLimit;
    }

    public void setIsAllPayLimit(String isAllPayLimit) {
        this.isAllPayLimit = isAllPayLimit;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }
}
