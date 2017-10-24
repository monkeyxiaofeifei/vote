package com.vote.dao;

import com.vote.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> getAllUser() throws  Exception;

    int deleteByPrimaryKey(Integer userId)throws  Exception;

    int insert(User record)throws  Exception;

    int insertSelective(User record)throws  Exception;

    User selectByPrimaryKey(Integer userId)throws  Exception;

    int updateByPrimaryKeySelective(User record)throws  Exception;

    int updateByPrimaryKey(User record)throws  Exception;


    int updateUserIsVote()throws Exception;

}