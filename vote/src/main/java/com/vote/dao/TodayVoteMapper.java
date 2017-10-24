package com.vote.dao;


import com.vote.pojo.TodayVote;

public interface TodayVoteMapper {
    int deleteByPrimaryKey(Integer todayVoteId)throws  Exception;
    Integer getMaxTodayVoteId() throws Exception;

    int getTodayVoteCount(Integer userId)throws Exception;

    int deleteAll()throws  Exception;

    int insert(TodayVote record)throws  Exception;

    int insertSelective(TodayVote record)throws  Exception;

    TodayVote selectByPrimaryKey(Integer todayVoteId) throws Exception;

    int updateByPrimaryKeySelective(TodayVote record)throws  Exception;

    int updateByPrimaryKey(TodayVote record)throws  Exception;

    int getIsTodayVote(Integer brandId)throws Exception;
}