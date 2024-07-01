package com.ram.scheduler;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ThreadScheduler {

	// It will execute automatically every 5 seconds, until before method thread execution completes when server starts 
	@Scheduled(fixedRate = 5000)
	public void getData1() throws InterruptedException {
		System.err.println("hi "+new Date());
		Thread.sleep(6000);
	}

	// It will execute automatically every 5 seconds until before method thread execution not completes when server starts 
	@Scheduled(fixedDelay = 5000)
	public void getData2() throws InterruptedException {
		System.err.println("hi " + new Date());
		Thread.sleep(6000);
	}

	// It will execute once after 5 seconds when it is called
	public void specificTime1() {
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				System.err.println("called");
			}
		}, 5000);
	}

	// It will execute once after 5 seconds when it is called
	public String specificTime2() {
		ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.err.println("called");
			}
		};
		executor.schedule(task, 5, TimeUnit.SECONDS);
		executor.shutdown();
		return "Called";
	}
}
