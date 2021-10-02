package com.yff.springcloud.service;

import com.yff.springcloud.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/10/1 9:41
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService{

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
