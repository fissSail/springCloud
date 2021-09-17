package com.yff.springcloud.controller;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.controller
 * @Description
 * @date 2021/9/14 16:58
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    @GetMapping("/consumer/payment/timeout")
    public String timeout(){
        return paymentFeignService.timeout();
    }
}
