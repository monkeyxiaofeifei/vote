package com.vote.service.impl;

import com.vote.dao.BrandMapper;
import com.vote.pojo.Brand;
import com.vote.service.BrandService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BrandServiceImpl implements BrandService {

    private Logger logger = Logger.getLogger(BrandServiceImpl.class);

    @Resource
    private BrandMapper brandMapper;

    public Brand selectByPrimaryKey(Integer brandId)throws Exception{
        logger.info("根据id查询品牌(BrandServiceImpl)");
        Brand brand = brandMapper.selectByPrimaryKey(brandId);
        return brand;
    }

    public boolean updateByPrimaryKey(Brand record)throws Exception{
        logger.info("按主键更新品牌表(BrandServiceImpl)");
        boolean bool = false;
        int flag = brandMapper.updateByPrimaryKey(record);
        if (flag > 0){
            bool = true;
        }
        return bool;
    }
}
