package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.IntervalTask;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

@Configuration
public class ScheduleConfigurer  {
//
//	@Autowired
//	Poller poller;
//	
//	@Override
//	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//		taskRegistrar.setScheduler(poolScheduler());
//		taskRegistrar.addFixedRateTask(new IntervalTask(poller, 5000, 0));
//	}
//	
//	public void addTasks(ScheduledTaskRegistrar taskRegistrar) {
//		configureTasks(taskRegistrar
//	}
//	
//	public void removeTasks(ScheduledTaskRegistrar taskRegistrar) {
//		taskRegistrar.destroy();
//	}
//
//	@Bean(destroyMethod = "shutdown")
//	public TaskScheduler poolScheduler() {
//		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
//		scheduler.setThreadNamePrefix("poolScheduler");
//		scheduler.setPoolSize(10);
//		return scheduler;
//	}

}
