package com.yff.springcloud.dao;

import com.yff.springcloud.entity.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.dao
 * @Description
 * @date 2021/10/1 9:34
 */

public interface OrderDao {

    //新建订单
    void create(Order order);

    //修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

    Order queryAllById(@Param("id")Long id);

}
