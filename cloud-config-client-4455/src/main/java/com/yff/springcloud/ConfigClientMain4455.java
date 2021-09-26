package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/18 17:21
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain4455 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientMain4455.class,args);
    }
}
