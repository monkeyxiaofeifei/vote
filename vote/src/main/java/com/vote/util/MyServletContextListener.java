package com.vote.util;

import com.vote.service.DailyService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by MonkeyHu on 2017/8/23.
 */
public class MyServletContextListener implements ServletContextListener {

    private Logger log = Logger.getLogger(MyServletContextListener.class);

    public void contextInitialized(ServletContextEvent sce) {
        log.info("启动时任务 （MyServletContextListener）");
        try {
            ApplicationContext context = WebApplicationContextUtils.
                    getRequiredWebApplicationContext(sce.getServletContext());
            Object obj = context.getBean( "dailyService" );
            log.info("启动时任务开始执行 （MyServletContextListener）");
            DailyService usi = (DailyService)obj ;
            usi.startupTask();
            log.info("启动时任务执行成功 （MyServletContextListener）");
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

