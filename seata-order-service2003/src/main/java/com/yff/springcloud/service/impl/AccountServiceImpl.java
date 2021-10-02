package com.yff.springcloud.service.impl;

import com.yff.springcloud.dao.AccountDao;
import com.yff.springcloud.entity.Account;
import com.yff.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service.impl
 * @Description
 * @date 2021/10/1 10:37
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("------->account-service中扣减账户余额开始");
        //try { TimeUnit.SECONDS.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); }
        accountDao.decrease(userId,money);
        log.info("------->account-service中扣减账户余额结束");
    }

    @Override
    public Account queryAllById(Long id) {
        return accountDao.queryAllById(id);
    }
}
