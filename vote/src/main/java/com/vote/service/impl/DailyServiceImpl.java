package com.vote.service.impl;

import com.vote.dao.PVCountMapper;
import com.vote.dao.TodayVoteMapper;
import com.vote.dao.UserMapper;
import com.vote.pojo.PVCount;
import com.vote.service.DailyService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by MonkeyHu on 2017/8/1.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DailyServiceImpl implements DailyService {

    private Logger logger = Logger.getLogger(DailyServiceImpl.class);

    @Resource
    private UserMapper userMapper;
    @Resource
    private TodayVoteMapper todayVoteMapper;
    @Resource
    private PVCountMapper pvCountMapper;


    public void daily() throws Exception {
        logger.info("每日清理任务执行(DailyServiceImpl)");
        //用户表是否领奖字段置零
        logger.info("用户表是否领奖字段置零(DailyServiceImpl)");
        userMapper.updateUserIsVote();
        //清空当天投票管理表
        logger.info("清空当天投票管理表(DailyServiceImpl)");
        todayVoteMapper.deleteAll();
        //访问量统计表改变定时任务最后执行时间
        PVCount pvCount = pvCountMapper.selectByPrimaryKey(10001);
        pvCount.setDailyLastDate(new Date());
        pvCountMapper.updateByPrimaryKey(pvCount);
//        //清空redis所有数据
//        logger.info("清空redis所有数据(DailyServiceImpl)");
//        MyJedisPool.flushdbDaily();
        logger.info("每日清理任务执行结束(DailyServiceImpl)");
    }

    public void startupTask() throws Exception {
        logger.info("启动时任务开始执行（DailyServiceImpl）");

        Date nowDate = new Date();
        Date lastDate = pvCountMapper.selectByPrimaryKey(10001).getDailyLastDate();
        if (!(nowDate.toString().substring(0,10).equals(lastDate.toString().substring(0,10)))){
            logger.info("上次清理错过 ，执行清理任务（DailyServiceImpl）");
            daily();
        }
    }
}
