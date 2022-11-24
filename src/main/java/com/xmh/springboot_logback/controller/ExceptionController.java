package com.xmh.springboot_logback.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.xmh.springboot_logback.pojo.ResponseEntry;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xmh
 * @date 2022/11/1
 */
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ResponseEntry<?> exception(Exception e) {
        ResponseEntry<?> responseEntry = new ResponseEntry<>();
        responseEntry.setCode(500);
        responseEntry.setMessage(e.getMessage());
        return responseEntry;
    }
}
