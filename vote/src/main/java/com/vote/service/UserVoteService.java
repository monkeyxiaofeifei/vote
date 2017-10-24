package com.vote.service;

import com.vote.pojo.Brand;
import com.vote.pojo.User;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
public interface UserVoteService {
    boolean uservote(User user, Brand brand)throws Exception;
}
