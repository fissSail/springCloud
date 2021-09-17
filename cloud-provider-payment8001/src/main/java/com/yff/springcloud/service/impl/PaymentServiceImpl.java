package com.yff.springcloud.service.impl;

import com.yff.springcloud.dao.PaymentDAO;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanfeifan
 * @Package com.com.yff.springcloud.service.impl
 * @Description
 * @date 2021/8/27 10:02
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDAO paymentDao;

    @Override
    public int createPayment(Payment payment) {
        return paymentDao.createPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
