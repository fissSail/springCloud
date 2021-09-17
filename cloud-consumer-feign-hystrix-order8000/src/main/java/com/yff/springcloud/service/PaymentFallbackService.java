package com.yff.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/9/15 15:47
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "paymentInfo_TimeOut";
    }
}
