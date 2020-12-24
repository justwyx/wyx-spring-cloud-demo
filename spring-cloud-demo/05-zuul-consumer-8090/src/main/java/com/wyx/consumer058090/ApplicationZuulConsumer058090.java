package com.wyx.consumer058090;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker // 开启降级
@SpringBootApplication
public class ApplicationZuulConsumer058090 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationZuulConsumer058090.class, args);
	}

}
