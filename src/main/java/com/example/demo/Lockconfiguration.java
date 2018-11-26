package com.example.demo;

import org.apache.curator.framework.CuratorFramework;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.leader.Candidate;
import org.springframework.integration.leader.DefaultCandidate;
import org.springframework.integration.zookeeper.leader.LeaderInitiator;

@Configuration
public class Lockconfiguration {

	@Bean
	public DefaultCandidate leaderCandidate() {
		return new DefaultCandidate(java.util.UUID.randomUUID().toString(), "scheduling");
	}

	@Bean
	public LeaderInitiator leaderInitiator(CuratorFramework client, Candidate candidate) {
		return new LeaderInitiator(client, candidate);
	}

}