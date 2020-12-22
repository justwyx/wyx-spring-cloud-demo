package com.wyx.consumer.configure;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.wyx.consumer.balance.CustomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

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

    // 修改负载均衡策略为：自定义策略
    @Bean
    public IRule loadBalanceRule() {
        List<Integer> excludePorts = new ArrayList<>();
        excludePorts.add(8083);
        return new CustomRule(excludePorts);
    }
}
