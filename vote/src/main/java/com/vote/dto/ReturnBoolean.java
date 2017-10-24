package com.vote.dto;

/**
 * Created by MonkeyHu on 2017/8/6.
 */
public class ReturnBoolean {
    private Boolean booleanValue;

    public ReturnBoolean(){

    }

    public ReturnBoolean(Boolean booleanValue){
        this.booleanValue=booleanValue;

    }

    public Boolean getBooleanValue() {
        return booleanValue;
    }

    public void setBooleanValue(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }
}
