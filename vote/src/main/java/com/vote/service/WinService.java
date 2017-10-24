package com.vote.service;

import com.vote.dto.WinRecord;
import com.vote.pojo.Award;
import com.vote.pojo.User;
import com.vote.pojo.Win;

import java.util.List;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
public interface WinService {
    boolean insert(Win record) throws Exception ;
    boolean updateByPrimaryKey(Win record)throws  Exception;
    List<WinRecord> getAllWin()throws Exception;
    Win setWinInfo(User user, Award award)throws Exception;

    boolean getFlux(Award award , String phoneNumber ,Win win,User user)throws Exception;
}
