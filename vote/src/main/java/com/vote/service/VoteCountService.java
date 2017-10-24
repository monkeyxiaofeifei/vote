package com.vote.service;

import com.vote.pojo.VoteCount;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
public interface VoteCountService {
    boolean insert(VoteCount record)throws  Exception;

    int getMaxVoteCountId()throws Exception;

    boolean updateByPrimaryKey(VoteCount record)throws  Exception;

    VoteCount selectByPrimaryKey(Integer voteCountId)throws  Exception;
}
