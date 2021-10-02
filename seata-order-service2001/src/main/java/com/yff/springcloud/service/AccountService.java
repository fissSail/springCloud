package com.yff.springcloud.service;

import com.yff.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/10/1 9:42
 */
@FeignClient(value = "seata-account-service")
public interface AccountService{

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}