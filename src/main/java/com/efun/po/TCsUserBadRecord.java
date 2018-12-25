package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCsUserBadRecord implements Serializable {
    private static final long serialVersionUID = -3568198889671978196L;
    private Long id;
    private Long uid;
    private String userName;
    private String roleid;
    private String gameCode;
    private String gameName;
    private String serverCode;
    private String remark;
    private String creator;
    private Date createdTime;
    private String modificator;
    private Date modifiedTime;
    private Integer deleted;
    private String department;

    private String firstWaringTime;
    private String secondWaringTime;
    private String thirdWaringTime;
    private String firstBanTime;
    private String secondBanTime;
    private String thirdBanTime;
    private String fourthBanTime;
    private String fifthBanTime;

    public TCsUserBadRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getServerCode() {
        return serverCode;
    }

    public void setServerCode(String serverCode) {
        this.serverCode = serverCode;
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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModificator() {
        return modificator;
    }

    public void setModificator(String modificator) {
        this.modificator = modificator;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getFirstWaringTime() {
        return firstWaringTime;
    }

    public void setFirstWaringTime(String firstWaringTime) {
        this.firstWaringTime = firstWaringTime;
    }

    public String getSecondWaringTime() {
        return secondWaringTime;
    }

    public void setSecondWaringTime(String secondWaringTime) {
        this.secondWaringTime = secondWaringTime;
    }

    public String getThirdWaringTime() {
        return thirdWaringTime;
    }

    public void setThirdWaringTime(String thirdWaringTime) {
        this.thirdWaringTime = thirdWaringTime;
    }

    public String getFirstBanTime() {
        return firstBanTime;
    }

    public void setFirstBanTime(String firstBanTime) {
        this.firstBanTime = firstBanTime;
    }

    public String getSecondBanTime() {
        return secondBanTime;
    }

    public void setSecondBanTime(String secondBanTime) {
        this.secondBanTime = secondBanTime;
    }

    public String getThirdBanTime() {
        return thirdBanTime;
    }

    public void setThirdBanTime(String thirdBanTime) {
        this.thirdBanTime = thirdBanTime;
    }

    public String getFourthBanTime() {
        return fourthBanTime;
    }

    public void setFourthBanTime(String fourthBanTime) {
        this.fourthBanTime = fourthBanTime;
    }

    public String getFifthBanTime() {
        return fifthBanTime;
    }

    public void setFifthBanTime(String fifthBanTime) {
        this.fifthBanTime = fifthBanTime;
    }
}
