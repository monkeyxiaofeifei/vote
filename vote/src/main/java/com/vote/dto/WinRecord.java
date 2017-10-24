package com.vote.dto;

/**
 * 获奖列表展示  用户名+奖项
 * Created by MonkeyHu on 2017/8/6.
 */
public class WinRecord {
    private String userName;
    private String awardName;

    public WinRecord(){

    }

    public WinRecord(String userName,String awardName){

        this.userName=userName;
        this.awardName=awardName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
