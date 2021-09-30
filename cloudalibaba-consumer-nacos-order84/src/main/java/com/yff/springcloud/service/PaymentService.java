package com.yff.springcloud.service;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.service.impl.PaymentServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/9/29 15:53
 */
@FeignClient(value = "nacos-payment-provider",fallback = PaymentServiceImpl.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
