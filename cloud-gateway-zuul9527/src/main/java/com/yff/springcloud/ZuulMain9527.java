package com.yff.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/16 21:03
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulMain9527 {

    public static void main(String[] args) {
        SpringApplication.run(ZuulMain9527.class,args);
    }
}
