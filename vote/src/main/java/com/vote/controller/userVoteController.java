package com.vote.controller;

import com.vote.pojo.Brand;
import com.vote.pojo.User;
import com.vote.service.UserVoteService;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by MonkeyHu on 2017/7/31.
 */
@Controller
@RequestMapping("/userVote")
public class userVoteController {

    private Logger log = Logger.getLogger(userVoteController.class);

    @Resource
    private UserVoteService userVoteService;

    @RequestMapping("/userVote")
//    @ResponseBody
    public Map userVote(@RequestParam("callback") String callback,@RequestParam("brandId") Integer brandId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("用户投票(userVoteController)");
        boolean bool = false;
        //从session获取当前登录用户ID
        Integer userId = (Integer) request.getSession().getAttribute("userId");

        //如果session中没右值，则从cookie中取值
//        if (userId == null){
//            Cookie[] cookies = request.getCookies();
//            for (int i= 0;i<cookies.length;i++){
//                Cookie cookie = cookies[i];
//                if (cookie.getName().equalsIgnoreCase("userId")){
//                    userId = Integer.valueOf(cookie.getValue());
//                }
//            }
//        }
        if (userId != null){
            User user = new User();
            user.setUserId(userId);
            //获取当前投票品牌
            Brand brand = new Brand();
            brand.setBrandId(brandId);
            try {
                bool = userVoteService.uservote(user,brand);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Map map = new HashMap();
        map.put("returnBoolean",bool);
        JSONObject jsonObject = JSONObject.fromObject(map);
        String json = jsonObject.toString();
        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        return null;
    }
}
