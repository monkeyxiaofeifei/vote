package com.vote.service.impl;

import com.vote.dao.VoteCountMapper;
import com.vote.pojo.VoteCount;
import com.vote.service.VoteCountService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class VoteCountServiceImpl implements VoteCountService {
    private Logger logger = Logger.getLogger(VoteCountServiceImpl.class);

    @Resource
    private VoteCountMapper voteCountMapper;


    public boolean insert(VoteCount record) throws Exception {
        logger.info("给voteCount表插入一条数据(VoteCountServiceImpl)");
        boolean bool = false;
            int flag = voteCountMapper.insert(record);
            if (flag > 0){
                bool = true;
            }
        return bool;
    }

    public int getMaxVoteCountId() throws Exception {
        logger.info("获得voteCount表的最大id(VoteCountServiceImpl)");
        int voteCountId = voteCountMapper.getMaxVoteCountId();
        return voteCountId;
    }

    public boolean updateByPrimaryKey(VoteCount record) throws Exception {
        logger.info("按主键更新voteCount表(VoteCountServiceImpl)");
        boolean bool = false;
            int flag = voteCountMapper.updateByPrimaryKey(record);
            if (flag > 0){
                bool = true;
            }
        return bool;
    }

    public VoteCount selectByPrimaryKey(Integer voteCountId) throws Exception {
        logger.info("按主键查询voteCount表的一条数据(VoteCountServiceImpl)");
        VoteCount voteCount = voteCountMapper.selectByPrimaryKey(voteCountId);

        return voteCount;
    }

}
