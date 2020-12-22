package com.wyx.consumer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients // 开启Feign客户端
//@EnableCircuitBreaker // 开启熔断器
//@SpringBootApplication
@EnableHystrixDashboard // 开启Dashboard功能
@SpringCloudApplication // 包含了上面两个注解
public class ConsumerFeign8080Application {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeign8080Application.class, args);
	}

}
