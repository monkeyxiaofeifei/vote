package com.vote.controller;

import com.vote.pojo.TodayVote;
import com.vote.service.TodayVoteService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;


/**
 * Created by MonkeyHu on 2017/7/30.
 */
@Controller
@RequestMapping("/todayVote")
public class TodayVoteController {

    private Logger log = Logger.getLogger(TodayVoteController.class);


    @Resource
    private TodayVoteService todayVoteService;



    @RequestMapping("/selectByPrimaryKey")
    public String selectByPrimaryKey(@RequestParam("todayVoteId") Integer todayVoteId, Model model) throws Exception {
        log.info("按主键查询todayVote一条信息(TodayVoteController)");
        TodayVote todayVote =  todayVoteService.selectByPrimaryKey(todayVoteId);
        model.addAttribute("todayVote", todayVote);
        return "showTodayVote";
    }
}