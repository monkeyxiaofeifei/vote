package com.vote.service;

import com.vote.pojo.Award;

import java.util.List;

/**
 * Created by MonkeyHu on 2017/8/3.
 */
public interface AwardService {

    Award selectByPrimaryKey(Integer awardId)throws  Exception;

    List<Award> selectAllAward()throws Exception;
}
