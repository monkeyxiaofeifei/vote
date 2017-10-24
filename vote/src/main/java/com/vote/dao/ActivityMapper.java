package com.vote.dao;

import com.vote.pojo.Activity;
import com.vote.pojo.ActivityExample;
import com.vote.pojo.ActivityWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActivityMapper {
    int countByExample(ActivityExample example);

    int deleteByExample(ActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(ActivityWithBLOBs record);

    int insertSelective(ActivityWithBLOBs record);

    List<ActivityWithBLOBs> selectByExampleWithBLOBs(ActivityExample example);

    List<Activity> selectByExample(ActivityExample example);

    ActivityWithBLOBs selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByExampleWithBLOBs(@Param("record") ActivityWithBLOBs record, @Param("example") ActivityExample example);

    int updateByExample(@Param("record") Activity record, @Param("example") ActivityExample example);

    int updateByPrimaryKeySelective(ActivityWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ActivityWithBLOBs record);

    int updateByPrimaryKey(Activity record);
}