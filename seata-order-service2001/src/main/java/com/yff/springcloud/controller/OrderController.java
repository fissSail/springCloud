package com.yff.springcloud.controller;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Order;
import com.yff.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/10/1 9:43
 */

@RestController
public class OrderController{

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

    @GetMapping("/order/get/{id}")
    public CommonResult queryAllById(@PathVariable("id")Long id) {
        Order order = orderService.queryAllById(id);
        return new CommonResult(200,"订单查询成功",order);
    }
}

