package com.xmh.springboot_logback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author xmh
 * @date 2022/11/1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntry<T> {
    private int code;
    private String message;
    private List<T> data;
}
