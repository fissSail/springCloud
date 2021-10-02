package com.yff.springcloud.controller;

import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Storage;
import com.yff.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.controller
 * @Description
 * @date 2021/10/1 10:38
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    //扣减库存
    @PostMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count) {
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣减库存成功！");
    }

    @GetMapping("/storage/get/{id}")
    public CommonResult queryAllById(@PathVariable("id")Long id) {
        Storage storage = storageService.queryAllById(id);
        return new CommonResult(200,"库存查询成功",storage);
    }

}
