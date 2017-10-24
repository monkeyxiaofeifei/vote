package com.vote.pojo;

public class Image {
    private Integer imageId;

    private String imageLogo;

    private String imageInfo1;

    private String imageInfo2;

    private String imageInfo3;

    private String imageInfo4;

    private String imageInfo5;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getImageLogo() {
        return imageLogo;
    }

    public void setImageLogo(String imageLogo) {
        this.imageLogo = imageLogo == null ? null : imageLogo.trim();
    }

    public String getImageInfo1() {
        return imageInfo1;
    }

    public void setImageInfo1(String imageInfo1) {
        this.imageInfo1 = imageInfo1 == null ? null : imageInfo1.trim();
    }

    public String getImageInfo2() {
        return imageInfo2;
    }

    public void setImageInfo2(String imageInfo2) {
        this.imageInfo2 = imageInfo2 == null ? null : imageInfo2.trim();
    }

    public String getImageInfo3() {
        return imageInfo3;
    }

    public void setImageInfo3(String imageInfo3) {
        this.imageInfo3 = imageInfo3 == null ? null : imageInfo3.trim();
    }

    public String getImageInfo4() {
        return imageInfo4;
    }

    public void setImageInfo4(String imageInfo4) {
        this.imageInfo4 = imageInfo4 == null ? null : imageInfo4.trim();
    }

    public String getImageInfo5() {
        return imageInfo5;
    }

    public void setImageInfo5(String imageInfo5) {
        this.imageInfo5 = imageInfo5 == null ? null : imageInfo5.trim();
    }
}