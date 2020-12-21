package com.wyx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // 开启Feign客户端
@SpringBootApplication
public class ConsumerFeign8080Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeign8080Application.class, args);
	}

}
