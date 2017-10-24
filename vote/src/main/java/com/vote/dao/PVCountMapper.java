package com.vote.dao;

import com.vote.pojo.PVCount;

public interface PVCountMapper {
    int deleteByPrimaryKey(Integer pvcountId);

    int insert(PVCount record);

    int insertSelective(PVCount record);

    PVCount selectByPrimaryKey(Integer pvcountId);

    int updateByPrimaryKeySelective(PVCount record);

    int updateByPrimaryKey(PVCount record);
}