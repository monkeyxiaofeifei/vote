package com.vote.service;

import com.vote.pojo.TodayVote;

/**
 * Created by MonkeyHu on 2017/7/30.
 */
public interface TodayVoteService {
    TodayVote selectByPrimaryKey(Integer todayVoteId) throws Exception;

    boolean updateByPrimaryKeySelective(TodayVote record)throws  Exception;

    boolean insert(TodayVote record)throws  Exception;

    boolean deleteAll() throws Exception;

    int getMaxTodayVoteId() throws Exception;
}
