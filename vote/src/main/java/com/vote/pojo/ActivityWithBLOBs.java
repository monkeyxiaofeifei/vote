package com.vote.pojo;

public class ActivityWithBLOBs extends Activity {
    private String activityDevInfo;

    private String activityInfo;

    private String voteInfo;

    public String getActivityDevInfo() {
        return activityDevInfo;
    }

    public void setActivityDevInfo(String activityDevInfo) {
        this.activityDevInfo = activityDevInfo == null ? null : activityDevInfo.trim();
    }

    public String getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo == null ? null : activityInfo.trim();
    }

    public String getVoteInfo() {
        return voteInfo;
    }

    public void setVoteInfo(String voteInfo) {
        this.voteInfo = voteInfo == null ? null : voteInfo.trim();
    }
}