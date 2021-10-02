package com.yff.springcloud.service;

import com.yff.springcloud.entity.Order;
import org.springframework.stereotype.Service;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/10/1 9:37
 */
public interface OrderService {

    void create(Order order);

    Order queryAllById(Long id);

}
