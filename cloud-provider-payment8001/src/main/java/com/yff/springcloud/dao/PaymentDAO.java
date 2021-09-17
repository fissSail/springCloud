package com.yff.springcloud.dao;

import com.yff.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.dao
 * @Description
 * @date 2021/9/10 16:26
 */

public interface PaymentDAO {

    int createPayment(Payment payment);

    Payment getPaymentById(@Param("id")Long id);
}
