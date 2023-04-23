package com.qfang.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author qfang
 * @date 2023/4/7 - 16:08
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    // @LoadBalanced // 负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
// application.xml <bean id = "" class = "">
