package com.vote.controller;


import com.vote.dto.WinRecord;
import com.vote.pojo.Award;
import com.vote.pojo.User;
import com.vote.pojo.Win;
import com.vote.service.WinService;
import com.vote.util.FlowUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Controller
@RequestMapping("win")
public class WinController {

    private Logger log = Logger.getLogger(WinController.class);

    @Resource
    private WinService winService;

    /**
     * 查询获奖记录
     * @return
     * @throws Exception
     */
    @RequestMapping("getWinList")
//    @ResponseBody
    public String getWinList(@RequestParam("callback") String callback, HttpServletRequest request,HttpServletResponse response) throws Exception{
        log.info("获取获奖列表(WinController)");
//        String callback = request.getParameter("callback");

        List<WinRecord> list =  winService.getAllWin();

        //获得获奖列表的前十条数据
        JSONArray jsonObject = JSONArray.fromObject(list);
        String json = jsonObject.toString();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");

        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        return null;
    }


    /**
     * 流量充值，领取成功，将中奖信息表(win)是否接受(is_get)字段置1;
     * @param request
     * @return
     * @throws Exception
     */
    @RequestMapping("getFlux")
//    @ResponseBody
    public Map getFlux(@RequestParam("callback") String callback,@RequestParam("phoneNumber") String phoneNumber,@RequestParam("awardId") Integer awardId, HttpServletRequest request,HttpServletResponse response)throws Exception{
        log.info("领取流量(WinController)");
        //领取流量
        boolean bool =false;
        User user = new User();
        //从session获得当前用户ID
        Integer userId = (Integer) request.getSession().getAttribute("userId");

        //如果session中没有值，则从cookie中取值
        if (userId == null){
            Cookie[] cookies = request.getCookies();
            for (int i= 0;i<cookies.length;i++){
                Cookie cookie = cookies[i];
                if (cookie.getName().equalsIgnoreCase("userId")){
                    userId = Integer.valueOf(cookie.getValue());
                }
            }
        }
//        userId=10001;
        user.setUserId(userId);
        if (phoneNumber != null ){
            //如果领取流量成功，将是否接受字段置1
            //从session中获取当前用户的抽奖信息ID和awardId
            Win win = new Win();
            Integer winId = (Integer) request.getSession().getAttribute("winId");

            //如果session中没有值，则从cookie中取值
//            if (winId == null){
//                Cookie[] cookies = request.getCookies();
//                for (int i= 0;i<cookies.length;i++){
//                    Cookie cookie = cookies[i];
//                    if (cookie.getName().equalsIgnoreCase("winId")){
//                        winId = Integer.valueOf(cookie.getValue());
//                    }
//                }
//            }
//            winId=10014;
            win.setWinId(winId);
            if (winId > 0 && awardId > 0){
                Award award = new Award();
                award.setAwardId(awardId);

                bool = winService.getFlux(award,phoneNumber,win,user);
                if (bool){
                    //销毁session中winId的值
                    request.getSession().removeAttribute("winId");
                }
            }
        }
        Map map = new HashMap();
        map.put("booleanValue",bool);
        JSONObject jsonObject = JSONObject.fromObject(map);
        String json = jsonObject.toString();
        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        return null;
    }

    /**
     * 前台抽奖成功
     * @return
     * @throws Exception
     */
    @RequestMapping("/setWinInfo")
//    @ResponseBody
    public Map setWinInfo(@RequestParam("callback") String callback,HttpServletRequest request,HttpServletResponse response)throws Exception{
        log.info("对用户今日已抽奖字段状态进行改变，并生成中奖信息(WinController)");
        User user = new User();
        //从session获得当前用户ID
        Integer userId = (Integer) request.getSession().getAttribute("userId");

        //如果session中没有值，则从cookie中取值
        if (userId == null){
            Cookie[] cookies = request.getCookies();
            for (int i= 0;i<cookies.length;i++){
                Cookie cookie = cookies[i];
                if (cookie.getName().equalsIgnoreCase("userId")){
                    userId = Integer.valueOf(cookie.getValue());
                }
            }
        }
//        userId=10001;
        Map map = new HashMap();
        Win win ;
        if (userId!=null){
            user.setUserId(userId);
            Award award = new Award();
            //从前台获得当前用户所中奖项ID
            int awardId = FlowUtil.getId();
            award.setAwardId(awardId);
            //对用户表(user)今日是否抽奖字段(user_is_vote)进行置1，
            //生成中奖信息（中奖信息表(win)生成一条数据）
            win = winService.setWinInfo(user,award);
            if (win != null){
                request.getSession().setAttribute("winId",win.getWinId());
            }
            map.put("awardId",awardId);
        }
        JSONObject jsonObject = JSONObject.fromObject(map);
        String json = jsonObject.toString();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        System.out.println(callback);
        return null;
    }
}
