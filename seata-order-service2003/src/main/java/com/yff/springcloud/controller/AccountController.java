package com.yff.springcloud.controller;

import com.yff.springcloud.entity.Account;
import com.yff.springcloud.entity.CommonResult;
import com.yff.springcloud.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * @author yanfeifan
 * @Package com.yff.springcloud.controller
 * @Description
 * @date 2021/10/1 10:38
 */
@RestController
public class AccountController  {

    @Autowired
    private AccountService accountService;

    /**
     * 扣减账户余额
     */
    @PostMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId,money);
        return new CommonResult(200,"扣减账户余额成功！");
    }

    @GetMapping("/account/get/{id}")
    public CommonResult queryAllById(@PathVariable("id")Long id) {
        Account account = accountService.queryAllById(id);
        return new CommonResult(200,"账户查询成功",account);
    }


}
