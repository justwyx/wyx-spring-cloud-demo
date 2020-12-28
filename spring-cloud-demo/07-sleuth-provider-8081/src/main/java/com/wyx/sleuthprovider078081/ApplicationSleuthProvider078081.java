package com.wyx.sleuthprovider078081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @EnableEurekaClient     // 仅限于注册中心是Eureka(只有 springboot项目需要加)
// @EnableDiscoveryClient  // 注册中心可以是任意的类型(只有 springboot项目需要加)
@SpringBootApplication
public class ApplicationSleuthProvider078081 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationSleuthProvider078081.class, args);
	}

}
