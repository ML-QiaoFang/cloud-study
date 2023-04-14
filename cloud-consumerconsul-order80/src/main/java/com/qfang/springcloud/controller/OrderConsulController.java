package com.qfang.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author qfang
 * @date 2023/4/14 - 16:06
 */
@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo() {
        // 返回值为String.class
        String result = restTemplate.getForObject(INVOKE_URL + "/" + "payment/consul", String.class);
        return result;
    }

}
