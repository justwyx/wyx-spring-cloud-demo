package com.wyx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker // 开启降级
@SpringBootApplication
public class ApplicationConsumerAlarm8080 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumerAlarm8080.class, args);
	}

}
