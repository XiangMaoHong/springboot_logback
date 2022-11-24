package com.xmh.springboot_logback;

import com.xmh.springboot_logback.pojo.Account;
import com.xmh.springboot_logback.service.AccountService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author xmh
 * @date 2022/10/31
 */
public class AccountServiceTest extends BaseTest {
    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Test
    public void testFindAll() {
        List<Account> accountList = accountService.findAll();
        System.out.println(accountList);
    }
}
