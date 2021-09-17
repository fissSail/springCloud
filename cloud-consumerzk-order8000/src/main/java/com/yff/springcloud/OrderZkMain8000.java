package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/12 13:52
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZkMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZkMain8000.class,args);
    }
}
