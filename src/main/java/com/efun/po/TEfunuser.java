package com.efun.po;

import java.io.Serializable;
import java.util.Date;

/**
 * TEfunuser entity
 *
 * @author MyEclipse Persistence Tools
 */

public class TEfunuser implements Serializable {
    private static final long serialVersionUID = 943218865498703212L;
    // Fields
    private Long userid;
    private String username;
    private String funname;
    private String email;
    private String mobile;
    private Long status;
    private String cruser;
    private Date cretime;
    private String password;
    private String remake;
    private Long delesign;
    private Long deptid;
    private String gameCode;
    private String icon;
    private String gameLimit;
    private String advLimit;
    private Date lastLoginTime;
    private Long companyId;
    private Date lastViewTime;


    // Constructors

    /**
     * default constructor
     */
    public TEfunuser() {
    }

    // Property accessors

    public TEfunuser(Long userid, String username, String funname, String email, String mobile, Long status, String cruser, Date cretime, String password, String remake, Long delesign, Long deptid, String gameCode, String icon, String gameLimit, String advLimit, Date lastLoginTime, Long companyId, Date lastViewTime) {
        this.userid = userid;
        this.username = username;
        this.funname = funname;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        this.cruser = cruser;
        this.cretime = cretime;
        this.password = password;
        this.remake = remake;
        this.delesign = delesign;
        this.deptid = deptid;
        this.gameCode = gameCode;
        this.icon = icon;
        this.gameLimit = gameLimit;
        this.advLimit = advLimit;
        this.lastLoginTime = lastLoginTime;
        this.companyId = companyId;
        this.lastViewTime = lastViewTime;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFunname() {
        return funname;
    }

    public void setFunname(String funname) {
        this.funname = funname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getCruser() {
        return cruser;
    }

    public void setCruser(String cruser) {
        this.cruser = cruser;
    }

    public Date getCretime() {
        return cretime;
    }

    public void setCretime(Date cretime) {
        this.cretime = cretime;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public Long getDelesign() {
        return delesign;
    }

    public void setDelesign(Long delesign) {
        this.delesign = delesign;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getGameCode() {
        return gameCode;
    }

    public void setGameCode(String gameCode) {
        this.gameCode = gameCode;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getGameLimit() {
        return gameLimit;
    }

    public void setGameLimit(String gameLimit) {
        this.gameLimit = gameLimit;
    }

    public String getAdvLimit() {
        return advLimit;
    }

    public void setAdvLimit(String advLimit) {
        this.advLimit = advLimit;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getLastViewTime() {
        return lastViewTime;
    }

    public void setLastViewTime(Date lastViewTime) {
        this.lastViewTime = lastViewTime;
    }

    @Override
    public String toString() {
        return "TEfunuser{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", funname='" + funname + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status=" + status +
                ", cruser='" + cruser + '\'' +
                ", cretime=" + cretime +
                ", password='" + password + '\'' +
                ", remake='" + remake + '\'' +
                ", delesign=" + delesign +
                ", deptid=" + deptid +
                ", gameCode='" + gameCode + '\'' +
                ", icon='" + icon + '\'' +
                ", gameLimit='" + gameLimit + '\'' +
                ", advLimit='" + advLimit + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                '}';
    }
}