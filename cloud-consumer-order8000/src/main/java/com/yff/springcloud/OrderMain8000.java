package com.yff.springcloud;

import com.yff.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author yanfeifan
 * @Package com.yff.springCloud
 * @Description
 * @date 2021/9/10 16:50
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain8000 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8000.class,args);
    }
}
