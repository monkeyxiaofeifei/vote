package com.vote.pojo;

public class Brand {
    private Integer brandId;

    private String brandName;

    private String brandInfo;

    private Integer brandPhotoId;

    private Integer brandVoteCount;

    private Integer brandRank;

    private String brandType;

    public Brand(Integer brandId, String brandName, String brandInfo, Integer brandPhotoId, Integer brandVoteCount, Integer brandRank, String brandType) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandInfo = brandInfo;
        this.brandPhotoId = brandPhotoId;
        this.brandVoteCount = brandVoteCount;
        this.brandRank = brandRank;
        this.brandType = brandType;
    }

    public Brand() {
        super();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(String brandInfo) {
        this.brandInfo = brandInfo == null ? null : brandInfo.trim();
    }

    public Integer getBrandPhotoId() {
        return brandPhotoId;
    }

    public void setBrandPhotoId(Integer brandPhotoId) {
        this.brandPhotoId = brandPhotoId;
    }

    public Integer getBrandVoteCount() {
        return brandVoteCount;
    }

    public void setBrandVoteCount(Integer brandVoteCount) {
        this.brandVoteCount = brandVoteCount;
    }

    public Integer getBrandRank() {
        return brandRank;
    }

    public void setBrandRank(Integer brandRank) {
        this.brandRank = brandRank;
    }

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType == null ? null : brandType.trim();
    }
}