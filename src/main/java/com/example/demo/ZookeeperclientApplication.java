package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Configuration
@EnableDiscoveryClient
@RestController
public class ZookeeperclientApplication {

	  @RequestMapping("/hello")
	  public String home() {
	    return "Hello World";
	  }

	
	public static void main(String[] args) {
		SpringApplication.run(ZookeeperclientApplication.class, args);
	}
}
