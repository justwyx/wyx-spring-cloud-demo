package com.wyx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker // 开启降级
@SpringBootApplication
public class ApplicationFallbackMethod8080 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationFallbackMethod8080.class, args);
	}

}
