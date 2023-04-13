package com.qfang.springcloud.service;

import com.qfang.cloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author qfang
 * @date 2023/4/3 - 19:44
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
