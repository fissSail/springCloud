package com.yff.springcloud.service.impl;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service.impl
 * @Description
 * @date 2021/9/29 15:54
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
