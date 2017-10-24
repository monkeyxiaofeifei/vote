package com.vote.controller;

import com.vote.service.DailyService;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by MonkeyHu on 2017/8/3.
 */

/**
 * 每日定时清理数据库
 */
@Component
public class Daily2 {
    private Logger log = Logger.getLogger(Daily2.class);

    @Resource
    private DailyService dailyService;

    @Scheduled(cron = "0 01 00 ? * *")
    public void fun(){
        log.info("定时任务开始执行！(Daily2)");
        try {
            dailyService.daily();
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("定时任务执行成功！(Daily2)");
    }
}