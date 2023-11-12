package com.neonci.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	@Scheduled(fixedRate = 5000) // Run every 5 seconds
	public void printMessage() {
		System.out.println("Scheduled Task: Hello, this is a scheduled message!");
	}
}