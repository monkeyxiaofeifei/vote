package com.vote.service;

import com.vote.pojo.User;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {

    List<User> getAllUser()throws Exception;

    boolean updateByPrimaryKeySelective(User record)throws  Exception;

    User selectByPrimaryKey(Integer userId)throws  Exception;
    boolean updateByPrimaryKey(User record)throws  Exception;


}
