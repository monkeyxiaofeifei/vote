package com.vote.controller;

import com.vote.pojo.Award;
import com.vote.service.AwardService;
import net.sf.json.JSONArray;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by MonkeyHu on 2017/8/3.
 */
@Controller
@RequestMapping("/award")
public class AwardController {

    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private AwardService awardService;

    @RequestMapping("/getAllAward")
//    @ResponseBody
    public String getAllAward(@RequestParam("callback") String callback, HttpServletRequest request, HttpServletResponse response)throws Exception{
        log.info("获得所有的奖项(AwardController)");

//        String callback = request.getParameter("callback");
        List<Award> list = awardService.selectAllAward();

        JSONArray jsonObject = JSONArray.fromObject(list);
        String json = jsonObject.toString();
        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        out.print(callback+"("+json+")");
        return null;
    }
}
