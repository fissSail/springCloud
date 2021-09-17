package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/12 13:26
 */
@SpringBootApplication
@EnableDiscoveryClient //用于consul，zookeeper作为注册中心注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class,args);
    }
}
