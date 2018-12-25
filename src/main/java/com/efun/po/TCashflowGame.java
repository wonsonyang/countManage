package com.efun.po;

import java.io.Serializable;
import java.util.Date;

public class TCashflowGame implements Serializable{
    private static final long serialVersionUID = 8320542434818171153L;

    private Long id;
    private String gameCode;
    private String gameName;
    private String parentGame;
    private String remark;
    private String creator;
    private Date createTime;
    private Byte deleted;

    public TCashflowGame() {
    }

    @Override
    public String toString() {
        return "TCashflowGame{" +
                "id=" + id +
                ", gameCode='" + gameCode + '\'' +
                ", gameName='" + gameName + '\'' +
                ", parentGame='" + parentGame + '\'' +
                ", remark='" + remark + '\'' +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", deleted=" + deleted +
                '}';
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

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getParentGame() {
        return parentGame;
    }

    public void setParentGame(String parentGame) {
        this.parentGame = parentGame;
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
}
