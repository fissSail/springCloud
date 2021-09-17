package com.yff.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.config
 * @Description
 * @date 2021/9/16 14:35
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator router(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("payment_routh3",
                r-> r.path("/guonei")
                        .uri("http://news.baidu.com/guonei"))
                        .build();
        return  routes.build();
    }
}
