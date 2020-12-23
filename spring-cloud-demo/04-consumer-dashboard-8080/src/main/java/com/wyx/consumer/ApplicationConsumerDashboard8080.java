package com.wyx.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // 开启Feign客户端
@EnableHystrixDashboard // 开启Dashboard功能
//@EnableCircuitBreaker // 开启熔断器
//@SpringBootApplication
@SpringCloudApplication // 包含了上面两个注解
public class ApplicationConsumerDashboard8080 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationConsumerDashboard8080.class, args);
	}
}
