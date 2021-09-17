package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/12 20:24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain8000.class,args);
    }
}
