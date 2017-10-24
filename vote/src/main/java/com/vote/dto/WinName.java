package com.vote.dto;

/**
 * Created by MonkeyHu on 2017/8/6.
 */
public class WinName {
    private String awardName;

    public WinName(){

    }

    public WinName(String awardName){
        this.awardName=awardName;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }
}
