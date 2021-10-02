package com.yff.springcloud.service;

import com.yff.springcloud.entity.Storage;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service
 * @Description
 * @date 2021/10/1 10:37
 */

public interface StorageService {

    // 扣减库存
    void decrease(Long productId, Integer count);

    Storage queryAllById(Long id);
}
