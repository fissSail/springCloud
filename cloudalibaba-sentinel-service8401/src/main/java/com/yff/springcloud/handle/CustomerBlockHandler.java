package com.yff.springcloud.handle;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.yff.springcloud.entity.CommonResult;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.handle
 * @Description
 * @date 2021/9/29 13:55
 */

public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException blockException){
        return new CommonResult(500,"你好111");
    }

    public static CommonResult handleException2(BlockException blockException){
        return new CommonResult(500,"你好2222");
    }
}
