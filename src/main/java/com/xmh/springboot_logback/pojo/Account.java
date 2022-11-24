package com.xmh.springboot_logback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xmh
 * @date 2022/10/31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    private int id;
    private String username;
    private String password;
    private String name;
    private String salt;
}
