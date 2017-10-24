package com.vote.pojo;

public class User {
    private Integer userId;

    private String userName;

    private String userPhone;

    private String userCard;

    private Integer userVoteCount;

    private Integer userIsVote;

    private String userPwd;

    public User(Integer userId, String userName, String userPhone, String userCard, Integer userVoteCount, Integer userIsVote, String userPwd) {
        this.userId = userId;
        this.userName = userName;
        this.userPhone = userPhone;
        this.userCard = userCard;
        this.userVoteCount = userVoteCount;
        this.userIsVote = userIsVote;
        this.userPwd = userPwd;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserCard() {
        return userCard;
    }

    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    public Integer getUserVoteCount() {
        return userVoteCount;
    }

    public void setUserVoteCount(Integer userVoteCount) {
        this.userVoteCount = userVoteCount;
    }

    public Integer getUserIsVote() {
        return userIsVote;
    }

    public void setUserIsVote(Integer userIsVote) {
        this.userIsVote = userIsVote;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }
}