package com.xmh.springboot_logback.service;

import com.xmh.springboot_logback.pojo.Account;

import java.util.List;

/**
 * @author xmh
 * @date 2022/10/31
 */
public interface AccountService {
    List<Account> findAll();
}
