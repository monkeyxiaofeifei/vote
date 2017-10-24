package com.vote.pojo;

public class VoteCount {
    private Integer voteCountId;

    private Integer userId;

    private Integer brandId;

    private Integer brandCount;

    public VoteCount(Integer voteCountId, Integer userId, Integer brandId, Integer brandCount) {
        this.voteCountId = voteCountId;
        this.userId = userId;
        this.brandId = brandId;
        this.brandCount = brandCount;
    }

    public VoteCount() {
        super();
    }

    public Integer getVoteCountId() {
        return voteCountId;
    }

    public void setVoteCountId(Integer voteCountId) {
        this.voteCountId = voteCountId;
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

    public Integer getBrandCount() {
        return brandCount;
    }

    public void setBrandCount(Integer brandCount) {
        this.brandCount = brandCount;
    }
}