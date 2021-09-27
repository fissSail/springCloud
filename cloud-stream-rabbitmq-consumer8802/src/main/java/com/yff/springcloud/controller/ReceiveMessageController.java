package com.yff.springcloud.controller;

import com.yff.springcloud.mq.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.controller
 * @Description
 * @date 2021/9/26 11:20
 */
@RestController
@EnableBinding(Sink.class)
@Slf4j
public class ReceiveMessageController {

    @Value("server.port")
    private String serverPort;


    @StreamListener(Sink.INPUT)
    public void sendMessage(Message<String> msg)
    {
        log.info("消费者1号接收消息：{},{}",msg.getPayload(),serverPort);
    }

}
