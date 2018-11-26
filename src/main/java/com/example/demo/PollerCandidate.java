package com.example.demo;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.leader.AbstractCandidate;
import org.springframework.integration.leader.Context;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

public class PollerCandidate extends AbstractCandidate {

	private final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private Poller poller;
	@Autowired
	private ScheduleConfigurer scheduleConfigurer;
	
	@Autowired
	ScheduledTaskRegistrar taskRegistrar;
	
	private volatile Context leaderContext;

	/**
	 * Instantiate a default candidate.
	 */
	public PollerCandidate() {
		super();
	}

	/**
	 * Instantiate a default candidate.
	 *
	 * @param id
	 *            the identifier
	 * @param role
	 *            the role
	 */
	public PollerCandidate(String id, String role) {
		super(id, role);
	}

	@Override
	public void onGranted(Context ctx) {
		if (this.logger.isInfoEnabled()) {
			this.logger.info(this + " has been granted leadership; context: " + ctx);
		}
		this.leaderContext = ctx;
	}

	@Override
	public void onRevoked(Context ctx) {
		if (this.logger.isInfoEnabled()) {
			this.logger.info(this + " leadership has been revoked: " + ctx);
		}


	}

	/**
	 * Voluntarily yield leadership if held. If leader context is not yet known this
	 * method does nothing. Leader context becomes available only after
	 * {@link #onGranted(Context)} method is called by the leader initiator.
	 */
	public void yieldLeadership() {
		if (this.leaderContext != null) {
			this.leaderContext.yield();
		}
	}

	@Override
	public String toString() {
		return String.format("DefaultCandidate{role=%s, id=%s}", getRole(), getId());
	}

}
