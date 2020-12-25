package com.wyx.busconfigserver9999;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer // 开启Config的服务器功能
@SpringBootApplication
public class ApplicationBusConfigServer9999 {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBusConfigServer9999.class, args);
	}

}
