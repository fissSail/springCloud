package com.yff.springcloud.controller;


import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Payment;
import com.yff.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yanfeifan
 * @Package com.com.yff.springcloud.controller
 * @Description
 * @date 2021/8/27 10:03
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.createPayment(payment);
        log.info("插入结果：{}",result);
        if (result > 0){
            return new CommonResult(200,"插入数据库成功,端口"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败,端口"+serverPort);
        }
    }

    @GetMapping(value = "/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询结果：{}",payment);
        if (!ObjectUtils.isEmpty(payment)){
            return new CommonResult(200,"查询成功,端口"+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id+"端口"+serverPort);
        }
    }


    @GetMapping(value = "/discoveryClient")
    public void discoveryClient(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("+++++++++++{}",service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        for (ServiceInstance instance : instances) {
            log.info("======{}",instance.getHost());
        }
    }

    @GetMapping("/payment/lb")
    public String getPaymentLB(HttpServletRequest request){
        String username = request.getParameter("aa");
        return serverPort;
    }


    @GetMapping("/payment/timeout")
    public String timeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String zipkin(HttpServletRequest request){

        return "zipkin";
    }

}
