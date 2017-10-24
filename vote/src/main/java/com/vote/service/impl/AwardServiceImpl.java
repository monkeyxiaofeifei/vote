package com.vote.service.impl;

import com.vote.dao.AwardMapper;
import com.vote.pojo.Award;
import com.vote.service.AwardService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by MonkeyHu on 2017/8/3.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AwardServiceImpl implements AwardService{

    private Logger log = Logger.getLogger(AwardServiceImpl.class);

    @Resource
    private AwardMapper awardMapper;


    public Award selectByPrimaryKey(Integer awardId) throws Exception {
        log.info("根据id查询奖项（AwardServiceImpl）");
        Award award = awardMapper.selectByPrimaryKey(awardId);
        return award;
    }


    public List<Award> selectAllAward()throws Exception{
        log.info("查询奖项表所有奖项（AwardServiceImpl）");
        List<Award> list = awardMapper.selectAllAward();
        return list;
    }
}
