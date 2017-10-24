package com.vote.dao;

import com.vote.pojo.Manager;
import com.vote.pojo.ManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerMapper {
    int countByExample(ManagerExample example);

    int deleteByExample(ManagerExample example);

    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    int insertSelective(Manager record);

    List<Manager> selectByExampleWithBLOBs(ManagerExample example);

    List<Manager> selectByExample(ManagerExample example);

    Manager selectByPrimaryKey(Integer managerId);

    int updateByExampleSelective(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExampleWithBLOBs(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByExample(@Param("record") Manager record, @Param("example") ManagerExample example);

    int updateByPrimaryKeySelective(Manager record);

    int updateByPrimaryKeyWithBLOBs(Manager record);

    int updateByPrimaryKey(Manager record);
}