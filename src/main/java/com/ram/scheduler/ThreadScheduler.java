package com.ram.scheduler;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ThreadScheduler {

//	@Scheduled(fixedRate = 5000)
//	public void getData() {
//		System.err.println("hi "+new Date());
//	}
	
	@Scheduled(fixedDelay  = 5000)
	public void getData() {
		System.err.println("hi "+new Date());
	}
}
