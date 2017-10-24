package com.vote.service;

import com.vote.pojo.Brand;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
public interface BrandService {

    Brand selectByPrimaryKey(Integer brandId)throws  Exception;

    boolean updateByPrimaryKey(Brand record)throws  Exception;
}
