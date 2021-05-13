package com.hotsse.scheduler.job.test;

import java.time.LocalDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestScheduler {

	@Scheduled(cron = "*/5 * * * * *")
	public void test() {
		System.out.println(LocalDateTime.now().toString());
	}
	
}
