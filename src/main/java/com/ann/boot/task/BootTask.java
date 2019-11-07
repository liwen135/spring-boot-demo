package com.ann.boot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在Spring boot的启动类上添加@EnableScheduling注解，开启基于注解的定时任务
 */
@Service
public class BootTask {

    //cron = "0/3 40 11 * * ?" 每天11:40触发，没三秒执行一次
    @Scheduled(cron = "0/2 * * * * ?")
    public void printTime() {
        System.out.println("current time :" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }


}
