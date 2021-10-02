package com.yff.springcloud.dao;

import com.yff.springcloud.entity.Account;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.dao
 * @Description
 * @date 2021/10/1 10:35
 */

public interface AccountDao {

    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

    Account queryAllById(@Param("id")Long id);

}
