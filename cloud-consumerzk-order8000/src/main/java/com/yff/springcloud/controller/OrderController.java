package com.yff.springcloud.controller;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author yanfeifan
 * @Package com.com.yff.springcloud.controller
 * @Description
 * @date 2021/8/27 11:34
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOME_URL = "http://cloud-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payment (){
        String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
        return result;
    }


}
