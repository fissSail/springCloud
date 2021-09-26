package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/26 9:43
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain5566 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain5566.class,args);
    }
}
