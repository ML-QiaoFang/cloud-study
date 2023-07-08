package com.qfang.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qfang
 * @date 2023/7/6 - 16:49
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${config.port}")
    private String port;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return "server port: " + port + "\t" + "configInfo: " + configInfo;
    }
}
