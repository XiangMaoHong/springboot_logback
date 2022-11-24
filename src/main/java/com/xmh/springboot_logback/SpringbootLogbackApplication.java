package com.xmh.springboot_logback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 向茂鸿
 */
@SpringBootApplication
@MapperScan("com.xmh.springboot_logback.mapper")
public class SpringbootLogbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLogbackApplication.class, args);
    }

}
