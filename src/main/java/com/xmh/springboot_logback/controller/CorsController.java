package com.xmh.springboot_logback.controller;

import com.xmh.springboot_logback.pojo.ResponseEntry;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xmh
 * @date 2022/11/1
 */
@Controller

public class CorsController {
    @RequestMapping("/test")
    @ResponseBody
    public ResponseEntry<?> testCors() {
        ResponseEntry<?> responseEntry = new ResponseEntry<>();
        responseEntry.setCode(HttpStatus.OK.value());
        responseEntry.setMessage("同源请求");
        return responseEntry;
    }
}
