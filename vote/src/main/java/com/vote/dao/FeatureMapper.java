package com.vote.dao;

import com.vote.pojo.Feature;
import com.vote.pojo.FeatureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeatureMapper {
    int countByExample(FeatureExample example);

    int deleteByExample(FeatureExample example);

    int deleteByPrimaryKey(Integer featureId);

    int insert(Feature record);

    int insertSelective(Feature record);

    List<Feature> selectByExample(FeatureExample example);

    Feature selectByPrimaryKey(Integer featureId);

    int updateByExampleSelective(@Param("record") Feature record, @Param("example") FeatureExample example);

    int updateByExample(@Param("record") Feature record, @Param("example") FeatureExample example);

    int updateByPrimaryKeySelective(Feature record);

    int updateByPrimaryKey(Feature record);
}