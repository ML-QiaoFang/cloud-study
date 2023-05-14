package com.qfang.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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

    // 超时，3秒为正常
    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public String paymentInfoTimeout(Integer id) {
//        int age = 10 / 0;
        int timeNumber = 2;
        // 暂停3秒
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + " paymentTimeout, id = " + id + "\t" + "哈哈~" + "耗时" + timeNumber + "秒钟";
    }

    public String paymentInfoTimeoutHandler(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + " 寄了, id = " + id + "\t" + "wuwuwu~~";
    }


}
