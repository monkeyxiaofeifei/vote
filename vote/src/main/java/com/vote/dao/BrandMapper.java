package com.vote.dao;

import com.vote.pojo.Brand;

public interface BrandMapper {
    int deleteByPrimaryKey(Integer brandId)throws  Exception;

    int insert(Brand record)throws  Exception;

    int insertSelective(Brand record)throws  Exception;

    Brand selectByPrimaryKey(Integer brandId)throws  Exception;

    int updateByPrimaryKeySelective(Brand record)throws  Exception;

    int updateByPrimaryKey(Brand record)throws  Exception;
}