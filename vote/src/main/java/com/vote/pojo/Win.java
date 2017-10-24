package com.vote.pojo;

import java.util.Date;

public class Win {
    private Integer winId;

    private String userName;

    private String userPhone;

    private String userCard;

    private String awardName;

    private Integer isGet;

    private Date winTime;

    public Win(Integer winId, String userName, String userPhone, String userCard, String awardName, Integer isGet, Date winTime) {
        this.winId = winId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCard = userCard;
        this.awardName = awardName;
        this.isGet = isGet;
        this.winTime = winTime;
    }

    public Win() {
        super();
    }

    public Integer getWinId() {
        return winId;
    }

    public void setWinId(Integer winId) {
        this.winId = winId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    public Integer getIsGet() {
        return isGet;
    }

    public void setIsGet(Integer isGet) {
        this.isGet = isGet;
    }

    public Date getWinTime() {
        return winTime;
    }

    public void setWinTime(Date winTime) {
        this.winTime = winTime;
    }
}