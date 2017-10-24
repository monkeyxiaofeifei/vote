package com.vote.dao;

import com.vote.pojo.VoteCount;

public interface VoteCountMapper {
    int deleteByPrimaryKey(Integer voteCountId)throws  Exception;

    int insert(VoteCount record)throws  Exception;

    int insertSelective(VoteCount record)throws  Exception;

    VoteCount selectByPrimaryKey(Integer voteCountId)throws  Exception;

    Integer getMaxVoteCountId()throws Exception;

    int updateByPrimaryKeySelective(VoteCount record)throws  Exception;

    int updateByPrimaryKey(VoteCount record)throws  Exception;

    Integer getUserBrandVoteCountId(VoteCount voteCount)throws Exception;
}