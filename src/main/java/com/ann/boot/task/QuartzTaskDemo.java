package com.ann.boot.task;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 定时任务业务处理类，我们继承QuartzJobBean
 * 重写executeInternal方法来实现具体的定时业务逻辑
 */
@Service
public class QuartzTaskDemo extends QuartzJobBean {

    private static final Logger logger = LoggerFactory.getLogger(QuartzTaskDemo.class);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        //获取JobDetail中关联的数据
        String msg = (String) context.getJobDetail().getJobDataMap().get("msg");
        logger.info("quartz current time :{},---{}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), msg);
    }
}




