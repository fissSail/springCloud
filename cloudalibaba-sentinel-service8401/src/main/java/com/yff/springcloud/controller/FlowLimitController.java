package com.yff.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.handle.CustomerBlockHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.controller
 * @Description
 * @date 2021/9/28 11:37
 */

@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() throws InterruptedException {
        //Thread.sleep(3000);
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() throws InterruptedException {
        //Thread.sleep(3000);
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD() {
        int i = 10 / 0;
        //try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
        log.info("testD 测试RT");
        return "------testD";
    }

    @GetMapping("/hotKey")
    @SentinelResource(value = "hotKey",blockHandler = "dealHotKey")
    public String hotKey(@RequestParam(value = "p1",required = false) String p1,
                         @RequestParam(value = "p2",required = false) String p2){
        return "hotKey";
    }

    public String dealHotKey(String p1, String p2, BlockException blockException){
        return "dealHotKey";
    }

    @GetMapping("/aa")
    @SentinelResource(value = "aa",blockHandler = "bb")
    public String aa(){
        return "aa";
    }

    public String bb(BlockException blockException){
        return "bb";
    }


    @GetMapping("/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handleException2")
    public CommonResult customerBlockHandler()
    {
        return new CommonResult(200,"按客戶自定义",new Payment(2020L,"serial003"));
    }

}

