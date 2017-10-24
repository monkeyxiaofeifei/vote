package com.vote.pojo;

public class Manager {
    private Integer managerId;

    private String managerName;

    private String managerPwd;

    private String managerPhone;

    private String managerCard;

    private String managerInfo;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName == null ? null : managerName.trim();
    }

    public String getManagerPwd() {
        return managerPwd;
    }

    public void setManagerPwd(String managerPwd) {
        this.managerPwd = managerPwd == null ? null : managerPwd.trim();
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone == null ? null : managerPhone.trim();
    }

    public String getManagerCard() {
        return managerCard;
    }

    public void setManagerCard(String managerCard) {
        this.managerCard = managerCard == null ? null : managerCard.trim();
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo == null ? null : managerInfo.trim();
    }
}