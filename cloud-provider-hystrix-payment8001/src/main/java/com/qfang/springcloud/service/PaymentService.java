package com.qfang.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author qfang
 * @date 2023/4/25 - 20:27
 */
@Service
public class PaymentService {

    // 正常访问，肯定OK的方法
    public String paymentInfoOK(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " paymentOK, id = " + id + "\t" + "哈哈~";
    }

    // 正常访问，肯定OK的方法
    public String paymentInfoTimeout(Integer id) {
        int timeNumber = 3;

        // 暂停3秒
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentTimeout, id = " + id + "\t" + "哈哈~" + "耗时" + timeNumber + "秒钟";
    }

}
