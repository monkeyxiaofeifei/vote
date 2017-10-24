package com.vote.pojo;

import java.util.Date;

public class PVCount {
    private Integer pvcountId;

    private Integer pvcountCount;

    private Date dailyLastDate;

    public PVCount(Integer pvcountId, Integer pvcountCount, Date dailyLastDate) {
        this.pvcountId = pvcountId;
        this.pvcountCount = pvcountCount;
        this.dailyLastDate = dailyLastDate;
    }

    public PVCount() {
        super();
    }

    public Integer getPvcountId() {
        return pvcountId;
    }

    public void setPvcountId(Integer pvcountId) {
        this.pvcountId = pvcountId;
    }

    public Integer getPvcountCount() {
        return pvcountCount;
    }

    public void setPvcountCount(Integer pvcountCount) {
        this.pvcountCount = pvcountCount;
    }

    public Date getDailyLastDate() {
        return dailyLastDate;
    }

    public void setDailyLastDate(Date dailyLastDate) {
        this.dailyLastDate = dailyLastDate;
    }
}