package com.qfang.springcloud.service;

import com.qfang.cloud.entity.CommonResult;

import com.qfang.springcloud.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author qfang
 * @date 2023/4/23 - 19:51
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE", configuration = FeignConfig.class) // feign功能接口
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "/payment/feign/timeout")
    String paymentFeignTimeout();
}
