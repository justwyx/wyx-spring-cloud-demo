package com.wyx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // 开启Feign客户端
//@EnableCircuitBreaker // 开启熔断器
//@SpringBootApplication
@SpringCloudApplication // 包含了上面两个注解
public class ApplicationConsumerTurbineClient8480 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumerTurbineClient8480.class, args);
	}
}
