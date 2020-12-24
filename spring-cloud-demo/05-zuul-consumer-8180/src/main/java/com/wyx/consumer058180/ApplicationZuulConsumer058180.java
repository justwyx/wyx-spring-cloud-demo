package com.wyx.consumer058180;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker // 开启降级
@SpringBootApplication
public class ApplicationZuulConsumer058180 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationZuulConsumer058180.class, args);
	}

}
