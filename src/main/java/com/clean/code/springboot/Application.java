package com.clean.code.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
//	@Scheduled(fixedRate = 2000)
//	public void startRate() {
//		System.out.println("New startRate " + new Date());
//	}

	@Scheduled(initialDelay = 1000L, fixedDelay = 2000)
	public void startDelay() {
		System.out.println("New startDelay " + new Date());
	}

	@Scheduled(cron = "0 44 12 30 Mar Thu")
	public void startCron() {
		System.out.println("New startCron " + new Date());
	}
	}
}
