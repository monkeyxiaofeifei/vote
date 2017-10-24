package com.vote.service.impl;


import com.vote.dao.AwardMapper;
import com.vote.dao.UserMapper;
import com.vote.dao.WinMapper;
import com.vote.dto.WinRecord;
import com.vote.pojo.Award;
import com.vote.pojo.User;
import com.vote.pojo.Win;
import com.vote.service.WinService;
import com.vote.util.FlowRecharge;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class WinServiceImpl implements WinService {
    private Logger logger = Logger.getLogger(WinServiceImpl.class);

    @Resource
    private WinMapper winMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private AwardMapper awardMapper;


    public boolean insert(Win record) throws Exception {
        logger.info("win表插入一条数据(WinServiceImpl)");
        boolean bool = false;
        int flag = winMapper.insert(record);
        if (flag > 0) {
            bool = true;
        }
        return bool;
    }


    public boolean updateByPrimaryKey(Win record) throws Exception {
        logger.info("按主键更新win表一条数据(WinServiceImpl)");
        boolean bool = false;
        int flag = winMapper.updateByPrimaryKey(record);
        if (flag > 0) {
            bool = true;
        }
        return bool;
    }

    public List<WinRecord> getAllWin() throws Exception {
        logger.info("查询所有中奖信息(WinServiceImpl)");

        List<WinRecord> list = new ArrayList<WinRecord>();
        Integer countWin = winMapper.getCount();
        List<Win> listWin = winMapper.getAllWin();
        if (countWin < 10) {
            for (int i = 0; i < listWin.size(); i++) {
                WinRecord winRecord = new WinRecord();
                winRecord.setUserName(listWin.get(i).getUserName());
                winRecord.setAwardName(listWin.get(i).getAwardName());
                list.add(winRecord);
            }
        } else {
            for (int i = 0; i < 10; i++) {
                WinRecord winRecord = new WinRecord();
                winRecord.setUserName(listWin.get(i).getUserName());
                winRecord.setAwardName(listWin.get(i).getAwardName());
                list.add(winRecord);
            }
        }
        return list;
    }

    /**
     * 用户抽奖处理方法
     *
     * @param user
     * @param award
     * @return
     * @throws Exception
     */
    public Win setWinInfo(User user, Award award) throws Exception {

        logger.info("用户抽奖成功后的处理方法 将是否抽奖字段置1(WinServiceImpl)");
        //对用户表(user)今日是否抽奖字段(user_is_vote)进行置1，
        Win win = null;
        user = userMapper.selectByPrimaryKey(user.getUserId());
        if (user.getUserIsVote() == 0) {
            user.setUserIsVote(1);
            userMapper.updateByPrimaryKey(user);
            if (award.getAwardId() == 10010 && award.getAwardId() == 10009) {
                return win;
            }
            logger.info("生成并插入一条中奖信息(WinServiceImpl)");
            //生成中奖信息（中奖信息表(win)生成一条数据）
            award = awardMapper.selectByPrimaryKey(award.getAwardId());
            if (award.getAwardName() != null) {
                win = new Win();
                win.setWinId((winMapper.getMaxWinId() + 1));
                win.setUserName(user.getUserName());
                win.setUserPhone(user.getUserPhone());
                win.setUserCard(user.getUserCard());
                win.setAwardName(award.getAwardName());
                win.setIsGet(0);
                win.setWinTime(new Date());
                winMapper.insert(win);
            }
        }
        return win;
    }

    /**
     * @param award
     * @param phoneNumber
     * @return
     * @throws Exception
     */
    public boolean getFlux(Award award, String phoneNumber, Win win, User user) throws Exception {
        logger.info("充值流量，并将中奖信息表是否接受字段置1(WinServiceImpl)");

        boolean bool = false;

        award = awardMapper.selectByPrimaryKey(award.getAwardId());
        win = winMapper.selectByPrimaryKey(win.getWinId());
        user = userMapper.selectByPrimaryKey(user.getUserId());

        if (win.getAwardName().equals(award.getAwardName()) && win.getUserName().equals(user.getUserName())) {
            //领取流量
            //领取流量成功code为0
            String str = FlowRecharge.recharge(phoneNumber, award.getAwardId());

            JSONObject jsonObject = JSONObject.fromObject(str);
            Integer code = (Integer) jsonObject.get("code");

            logger.info("流量充值返回结果。");
            System.out.println(str);
            if (code.equals(0)) {
                //如果领取流量成功，将是否接受字段(is_get)置1
                if (award.getAwardName() == win.getAwardName()) {
                    win.setIsGet(1);
                    int flag = winMapper.updateByPrimaryKey(win);
                    if (flag > 0) {
                        bool = true;
                    }
                }
            }
        }
        return bool;
    }
}
