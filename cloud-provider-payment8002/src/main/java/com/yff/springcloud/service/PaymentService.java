package com.yff.springcloud.service;

import com.yff.springcloud.entity.Payment;

/**
 * @author yanfeifan
 * @Package com.com.yff.springcloud.service
 * @Description
 * @date 2021/8/27 10:01
 */

public interface PaymentService {

    int createPayment(Payment payment);

    Payment getPaymentById(Long id);
}
