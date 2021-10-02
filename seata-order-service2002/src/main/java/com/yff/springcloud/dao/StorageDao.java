package com.yff.springcloud.dao;

import com.yff.springcloud.entity.Storage;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.dao
 * @Description
 * @date 2021/10/1 10:35
 */

public interface StorageDao {

    //扣减库存信息
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

    Storage queryAllById(@Param("id")Long id);
}
