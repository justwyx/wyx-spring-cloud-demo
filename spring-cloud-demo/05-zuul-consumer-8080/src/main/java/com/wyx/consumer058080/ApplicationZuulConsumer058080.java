package com.wyx.consumer058080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker // 开启降级
@SpringBootApplication
public class ApplicationZuulConsumer058080 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationZuulConsumer058080.class, args);
	}

}
