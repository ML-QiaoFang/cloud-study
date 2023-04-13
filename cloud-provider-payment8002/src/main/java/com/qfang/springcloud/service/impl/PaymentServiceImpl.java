package com.qfang.springcloud.service.impl;

import com.qfang.cloud.entity.Payment;
import com.qfang.springcloud.dao.PaymentDao;
import com.qfang.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author qfang
 * @date 2023/4/3 - 19:45
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
