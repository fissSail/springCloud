package com.yff.springcloud.service.impl;

import com.yff.springcloud.dao.OrderDao;
import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.entity.Order;
import com.yff.springcloud.service.AccountService;
import com.yff.springcloud.service.OrderService;
import com.yff.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service.impl
 * @Description
 * @date 2021/10/1 9:38
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     */

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order){
        log.info("----->开始新建订单");
        //新建订单
        orderDao.create(order);

        //扣减库存
        log.info("----->订单微服务开始调用库存，做扣减Count");
        CommonResult storageCommonResult = storageService.decrease(order.getProductId(), order.getCount());
        log.info("----->订单微服务开始调用库存，做扣减end" + storageCommonResult);

        //扣减账户
        log.info("----->订单微服务开始调用账户，做扣减Money");
        CommonResult accountCommonResult = accountService.decrease(order.getUserId(), order.getMoney());
        log.info("----->订单微服务开始调用账户，做扣减end" + accountCommonResult);

        //修改订单状态，从零到1代表已经完成
        log.info("----->修改订单状态开始");
        orderDao.update(order.getUserId(),0);
        log.info("----->修改订单状态结束");

        log.info("----->下订单结束了");
    }

    @Override
    public Order queryAllById(Long id) {
        return orderDao.queryAllById(id);
    }

}
