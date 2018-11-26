package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class Poller implements Runnable{

	private final Log logger = LogFactory.getLog(getClass());


	@Override
	@Scheduled(fixedRate = 5000)
	public void run() {
		logger.info("Poller is running");
	}

}
