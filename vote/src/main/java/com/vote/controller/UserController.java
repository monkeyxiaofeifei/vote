package com.vote.controller;

import com.vote.pojo.User;
import com.vote.service.UserService;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser( Model model) throws Exception {
        log.info("查询所有用户信息(UserController)");
        List<User> userList  = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @RequestMapping("/getVoteNumber")
//    @ResponseBody
    public Map getVoteNumber(@RequestParam("callback") String callback, HttpServletRequest request, HttpServletResponse response)throws Exception{
        log.info("获得当前用户今天剩余抽奖次数(UserController)");
        //通过session获取用户对象

       //从session获取当前登录用户
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
        Integer userIsVote = null;
        if (userId != null){
            User user = userService.selectByPrimaryKey(userId);

            userIsVote = user.getUserIsVote();
            if (userIsVote == 1){
                userIsVote = 0;
            }else{
                userIsVote = 1;
            }
        }
        Map map = new HashMap();
        map.put("userIsVote",userIsVote);
        JSONObject jsonObject = JSONObject.fromObject(map);
        String json = jsonObject.toString();
        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        return null;
    }


    @RequestMapping("/setUserIsVote")
    @ResponseBody
    public Boolean setUserIsVote(HttpServletRequest request)throws  Exception{
        log.info("对用户今日是否抽奖字段置1(UserController)");
        boolean bool ;
        User user = new User();
        Integer userId = (Integer) request.getSession().getAttribute("userId");
        user.setUserId(userId);
        System.out.print(user.getUserId());
        bool = userService.updateByPrimaryKey(user);
        return bool;
    }


}
