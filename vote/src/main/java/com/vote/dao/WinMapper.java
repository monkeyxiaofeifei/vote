package com.vote.dao;

import com.vote.pojo.Win;

import java.util.List;

public interface WinMapper {
    int deleteByPrimaryKey(Integer winId)throws  Exception;

    int insert(Win record)throws  Exception;

    int insertSelective(Win record)throws  Exception;

    Win selectByPrimaryKey(Integer winId)throws  Exception;

    int getMaxWinId() throws Exception;

    int updateByPrimaryKeySelective(Win record)throws  Exception;

    int updateByPrimaryKey(Win record)throws  Exception;

    List<Win> getAllWin()throws Exception;

    int getCount() throws Exception;
}