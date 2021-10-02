package com.yff.springcloud.service.impl;

import com.yff.springcloud.dao.StorageDao;
import com.yff.springcloud.entity.Storage;
import com.yff.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.service.impl
 * @Description
 * @date 2021/10/1 10:37
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId,count);
        log.info("------->storage-service中扣减库存结束");
    }

    @Override
    public Storage queryAllById(Long id) {
        return storageDao.queryAllById(id);
    }
}
