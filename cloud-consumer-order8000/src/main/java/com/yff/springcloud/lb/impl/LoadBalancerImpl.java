package com.yff.springcloud.lb.impl;

import com.yff.springcloud.lb.LoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.lb.impl
 * @Description
 * @date 2021/9/14 16:13
 */
@Component
public class LoadBalancerImpl implements LoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);

    private final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println(next);
        return next;
    }

    @Override
    public ServiceInstance serviceInstance(List<ServiceInstance> instanceList) {
        int i = getAndIncrement() % instanceList.size();
        return instanceList.get(i);
    }
}
