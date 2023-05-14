package com.qfang.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author qfang
 * @date 2023/5/14 - 20:31
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfoOK(Integer id) {
        return "----PaymentFallbackService--paymentInfoOK--fallback";
    }

    @Override
    public String paymentInfoTimeout(Integer id) {
        return "----PaymentFallbackService--paymentInfoTimeout--fallback";

    }
}
