package com.vote.pojo;

public class Award {
    private Integer awardId;

    private String awardName;

    private String awardImage;

    public Award(Integer awardId, String awardName, String awardImage) {
        this.awardId = awardId;
        this.awardName = awardName;
        this.awardImage = awardImage;
    }

    public Award() {
        super();
    }

    public Integer getAwardId() {
        return awardId;
    }

    public void setAwardId(Integer awardId) {
        this.awardId = awardId;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName == null ? null : awardName.trim();
    }

    public String getAwardImage() {
        return awardImage;
    }

    public void setAwardImage(String awardImage) {
        this.awardImage = awardImage == null ? null : awardImage.trim();
    }
}