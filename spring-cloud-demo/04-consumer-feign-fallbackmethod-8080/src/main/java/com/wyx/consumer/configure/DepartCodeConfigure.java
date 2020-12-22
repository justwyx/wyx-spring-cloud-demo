package com.wyx.consumer.configure;

import org.springframework.stereotype.Controller;


@Controller
public class DepartCodeConfigure {
    /**
     * 指定ribbon使用随机算法策略
     * 如果 xml 与 Configure 文件中都设置了策略，
     * Configure这里的设置的优先级更高
     */
//    @Bean
//    public IRule loadBalanceRule() {
//        return new RoundRobinRule();
//    }
}
