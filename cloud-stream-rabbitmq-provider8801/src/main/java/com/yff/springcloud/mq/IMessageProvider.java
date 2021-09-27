package com.yff.springcloud.mq;

import org.springframework.stereotype.Component;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud
 * @Description
 * @date 2021/9/26 11:17
 */
public interface IMessageProvider {
    String send();
}
