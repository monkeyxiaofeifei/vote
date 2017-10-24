package com.vote.service.impl;

import com.vote.dao.UserMapper;
import com.vote.pojo.User;
import com.vote.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {

    private Logger logger = Logger.getLogger(UserServiceImpl.class);
    
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUser() throws Exception {
        logger.info("查询所有用户(UserServiceImpl)");
        List<User> list = userMapper.getAllUser();
        return  list;
    }

    public boolean updateByPrimaryKeySelective(User record) throws Exception {
        logger.info("按主键更新用户表(UserServiceImpl)");
        boolean bool = false;
            Integer flag = userMapper.updateByPrimaryKeySelective(record);
        if (flag>0){
            bool = true;
        }
        return bool;
    }

    public User selectByPrimaryKey(Integer userId) throws Exception {
        logger.info("按主键查询用户表信息(UserServiceImpl)");
        User user = userMapper.selectByPrimaryKey(userId);
        return user;
    }

    /**
     * 将是否抽奖字段置1，表示已抽过奖
     * @param record
     * @return
     * @throws Exception
     */
    public boolean updateByPrimaryKey(User record) throws Exception {
        logger.info("将是否抽奖字段置1，表示已抽过奖(UserServiceImpl)");
        boolean bool = false;
        record = userMapper.selectByPrimaryKey(record.getUserId());
        record.setUserIsVote(1);
        int flag = userMapper.updateByPrimaryKey(record);
        if (flag > 0){
            bool = true;
        }
        return bool;
    }


}
