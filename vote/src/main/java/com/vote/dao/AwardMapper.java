package com.vote.dao;

import com.vote.pojo.Award;

import java.util.List;

public interface AwardMapper {
    int deleteByPrimaryKey(Integer awardId)throws  Exception;

    int insert(Award record)throws  Exception;

    int insertSelective(Award record)throws  Exception;

    Award selectByPrimaryKey(Integer awardId)throws  Exception;

    int updateByPrimaryKeySelective(Award record)throws  Exception;

    int updateByPrimaryKey(Award record)throws  Exception;

    List<Award> selectAllAward()throws Exception;
}