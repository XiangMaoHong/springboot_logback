package com.xmh.springboot_logback.service.impl;

import com.xmh.springboot_logback.mapper.AccountMapper;
import com.xmh.springboot_logback.pojo.Account;
import com.xmh.springboot_logback.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xmh
 * @date 2022/10/31
 */
@Service
public class AccountServiceImpl implements AccountService {
    private Logger log = LoggerFactory.getLogger(AccountService.class);

    private AccountMapper accountMapper;

    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public List<Account> findAll() {
        log.debug("查询所有用户");
        return accountMapper.findAll();
    }
}
