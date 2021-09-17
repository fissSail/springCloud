package com.yff.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.lb
 * @Description
 * @date 2021/9/14 16:12
 */

public interface LoadBalancer {
    ServiceInstance serviceInstance(List<ServiceInstance> instanceList);
}
