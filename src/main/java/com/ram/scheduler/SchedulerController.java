package com.ram.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {
	
	@Autowired
	ThreadScheduler scheduler;

	@GetMapping("/specific")
	public String specificTime() {
		
		return scheduler.specificTime2();
	}
}
