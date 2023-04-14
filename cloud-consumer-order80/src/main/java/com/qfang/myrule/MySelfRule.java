package com.qfang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qfang
 * @date 2023/4/14 - 20:44
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        // 定义为随机，默认为轮询
        return new RandomRule();
    }

}
