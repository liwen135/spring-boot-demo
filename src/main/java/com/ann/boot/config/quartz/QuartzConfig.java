package com.ann.boot.config.quartz;

import com.ann.boot.task.QuartzTaskDemo;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail printTimeJobDetail() {
        return JobBuilder.newJob(QuartzTaskDemo.class)//QuartzTaskDemo我们的业务类
                .withIdentity("demoJobDetail")//可以给该JobDetail起一个id
                //每个JobDetail内都有一个Map，包含了关联到这个Job的数据，在Job类中可以通过context获取
                .usingJobData("msg", "Hello Quartz")//关联键值对
                .storeDurably()//即使没有Trigger关联时，也不需要删除该JobDetail
                .build();
    }

    /**
     * 0/3 40 11 * * ?
     * @return
     */
    @Bean
    public Trigger printTimeJobTrigger() {
        CronScheduleBuilder cronScheduleBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");
        return TriggerBuilder.newTrigger()
                .forJob(printTimeJobDetail())//关联上述的JobDetail
                .withIdentity("quartzTriggerDemo")//给Trigger起个名字
                .withSchedule(cronScheduleBuilder)
                .build();
    }
}
