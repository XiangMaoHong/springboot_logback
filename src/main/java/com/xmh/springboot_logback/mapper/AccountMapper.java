package com.xmh.springboot_logback.mapper;

import com.xmh.springboot_logback.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author xmh
 * @date 2022/10/31
 */
@Repository
public interface AccountMapper {
    List<Account> findAll();
}
