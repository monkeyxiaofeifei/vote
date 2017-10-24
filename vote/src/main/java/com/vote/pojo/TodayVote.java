package com.vote.pojo;

public class TodayVote {
    private Integer todayVoteId;

    private Integer userId;

    private Integer brandId;

    public TodayVote(Integer todayVoteId, Integer userId, Integer brandId) {
        this.todayVoteId = todayVoteId;
        this.userId = userId;
        this.brandId = brandId;
    }

    public TodayVote() {
        super();
    }

    public Integer getTodayVoteId() {
        return todayVoteId;
    }

    public void setTodayVoteId(Integer todayVoteId) {
        this.todayVoteId = todayVoteId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }
}