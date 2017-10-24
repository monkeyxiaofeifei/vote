package com.vote.service.impl;

import com.vote.dao.TodayVoteMapper;
import com.vote.pojo.TodayVote;
import com.vote.service.TodayVoteService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by MonkeyHu on 2017/7/30.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class TodayVoteServiceImpl implements TodayVoteService{

    private Logger logger = Logger.getLogger(TodayVoteServiceImpl.class);


    @Resource
    private TodayVoteMapper todayVoteMapper;

    /**
     * 按主键查询TodayVote一条数据
     * @param todayVoteId TodayVote主键
     * @return
     */
    public TodayVote selectByPrimaryKey(Integer todayVoteId) throws Exception{
        logger.info("按主键查询TodayVote一条数据(TodayVoteServiceImpl)");
        TodayVote todayVote = todayVoteMapper.selectByPrimaryKey(todayVoteId);
        return todayVote;
    }

    /**
     * 更新TodayVote表的一条数据
     * @param record
     * @return
     */
    public boolean updateByPrimaryKeySelective(TodayVote record) throws Exception{
        logger.info("按主键更新TodayVote表的一条数据(TodayVoteServiceImpl)");
        boolean bool = false;
            int flag = todayVoteMapper.updateByPrimaryKeySelective(record);
            if (flag > 0){
                bool = true;
            }
        return bool;
    }

    public boolean insert(TodayVote record) throws Exception {
        logger.info("todayVote插入一条数据(TodayVoteServiceImpl)");
        boolean bool = false;
            int flag = todayVoteMapper.insert(record);
            if (flag > 0){
                bool = true;
            }
        return bool;
    }

    /**
     * 删除表的所有数据
     * @return
     */
    public boolean deleteAll()throws Exception{
        logger.info("删除today Vote表的所有数据(TodayVoteServiceImpl)");
        boolean bool = false;
            int flag = todayVoteMapper.deleteAll();
            if (flag > 0){
                bool = true;
            }

        return bool;
    }

    /**
     * 获得表的最大ID
     * @return
     */
    public int getMaxTodayVoteId() throws Exception {
        logger.info("获取todayVote表当前最大ID(TodayVoteServiceImpl)");
        int todayVoteId = todayVoteMapper.getMaxTodayVoteId();

        return todayVoteId;
    }
}
