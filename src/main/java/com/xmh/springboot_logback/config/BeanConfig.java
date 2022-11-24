package com.xmh.springboot_logback.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

/**
 * @author xmh
 * @date 2022/11/1
 */
//@Configuration
public class BeanConfig {
//    @Bean
    public MultipartResolver multipartResolver() throws IOException {
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        commonsMultipartResolver.setMaxUploadSize(10 * 1024 * 1024);
        commonsMultipartResolver.setMaxUploadSizePerFile(10 * 1024 * 1024);
        commonsMultipartResolver.setDefaultEncoding("utf-8");
/*        Resource resource = new UrlResource("D:\\ApplicationTwo\\JetBrains\\File\\springboot\\springboot\\springboot_logback\\src\\main\\resources\\upload");
        commonsMultipartResolver.setUploadTempDir(resource);*/
        return commonsMultipartResolver;
    }
}
