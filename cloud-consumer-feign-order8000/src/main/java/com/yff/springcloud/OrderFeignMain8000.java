package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/14 16:48
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderFeignMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8000.class,args);
    }
}
