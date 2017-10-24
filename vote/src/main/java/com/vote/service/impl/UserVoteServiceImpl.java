package com.vote.service.impl;

import com.vote.dao.BrandMapper;
import com.vote.dao.TodayVoteMapper;
import com.vote.dao.UserMapper;
import com.vote.dao.VoteCountMapper;
import com.vote.pojo.Brand;
import com.vote.pojo.TodayVote;
import com.vote.pojo.User;
import com.vote.pojo.VoteCount;
import com.vote.service.UserVoteService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserVoteServiceImpl implements UserVoteService {

    private Logger logger= Logger.getLogger(UserVoteServiceImpl.class);

    @Resource
    private UserMapper userMapper;
    @Resource
    private TodayVoteMapper todayVoteMapper;
    @Resource
    private VoteCountMapper voteCountMapper;
    @Resource
    private BrandMapper brandMapper;


    /**
     * 投票seivice实现
     * @param user
     * @param brand
     * @return
     * @throws Exception
     */
    public boolean uservote(User user, Brand brand) throws Exception {
        logger.info("用户投票(UserVoteServiceImpl)");

        boolean bool = false;
        //判断当前用户今天的投票次数是否到十次（到当天投票管理表按用户id查凑count）
        int todayVoteCount = todayVoteMapper.getTodayVoteCount(user.getUserId());
        //判断当前用户今天是否给此品牌投过票
        int isTodayVote = todayVoteMapper.getIsTodayVote(brand.getBrandId());
        if (todayVoteCount <= 10 && isTodayVote < 1) {
            //若未到十次
            //更改用户表（总投票次数加一)
            user = userMapper.selectByPrimaryKey(user.getUserId());
            user.setUserVoteCount(user.getUserVoteCount() + 1);
            int flag1 = userMapper.updateByPrimaryKey(user);
            //当天投票管理插入投票一次投票
            TodayVote todayVote = new TodayVote();
            Integer todayVoteId = todayVoteMapper.getMaxTodayVoteId();
            if (todayVoteId == null){
                todayVoteId = 0;
            }
            todayVote.setTodayVoteId(todayVoteId + 1);
            todayVote.setBrandId(brand.getBrandId());
            todayVote.setUserId(user.getUserId());
            int flag2 = todayVoteMapper.insert(todayVote);
                    /*
                    在表中按用户id和品牌id匹配信息，如果存在，brand_count字段加一
                     */
            VoteCount voteCount = new VoteCount();
            voteCount.setUserId(user.getUserId());
            voteCount.setBrandId(brand.getBrandId());
            Integer voteCountId = voteCountMapper.getUserBrandVoteCountId(voteCount);
            int flag5 = 0;
            if (voteCountId != null) {
                //如果存在，brand_count字段加一
                voteCount = voteCountMapper.selectByPrimaryKey(voteCountId);
                voteCount.setBrandCount(voteCount.getBrandCount() + 1);
                int flag3 = voteCountMapper.updateByPrimaryKey(voteCount);
                flag5+=flag3;
            } else {
                //否则，插入新数据，且brand_count字段为1
                voteCountId = voteCountMapper.getMaxVoteCountId();
                if (voteCountId == null){
                    voteCountId = 0;
                }
                voteCount.setVoteCountId(voteCountId + 1);
                voteCount.setBrandCount(1);
                int flag4 = voteCountMapper.insert(voteCount);
                flag5+=flag4;
            }
            //品牌表  brand_vote_count字段加一
            brand = brandMapper.selectByPrimaryKey(brand.getBrandId());
            brand.setBrandVoteCount(brand.getBrandVoteCount() + 1);
            int flag6 = brandMapper.updateByPrimaryKey(brand);

            if (flag1 > 0 && flag2 > 0 && flag5 > 0 && flag6 > 0) {
                bool = true;
            }
        }
        return bool;
    }

}
