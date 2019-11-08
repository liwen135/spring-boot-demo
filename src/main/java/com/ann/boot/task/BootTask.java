package com.ann.boot.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在Spring boot的启动类上添加@EnableScheduling注解，开启基于注解的定时任务
 */
@Service
public class BootTask {

    private static final Logger logger = LoggerFactory.getLogger(BootTask.class);

    //cron = "0/3 40 11 * * ?" 每天11:40触发，没三秒执行一次
    @Scheduled(cron = "0/2 * * * * ?")
    public void printTime() {
        logger.info("current time :{}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }


}
