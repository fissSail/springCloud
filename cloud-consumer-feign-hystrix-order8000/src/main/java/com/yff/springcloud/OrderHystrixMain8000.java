package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/14 21:32
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHystrixMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMain8000.class,args);
    }
}
