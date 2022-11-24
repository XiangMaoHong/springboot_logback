package com.xmh.springboot_logback.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;

/**
 * @author xmh
 * @date 2022/11/1
 */
@Controller
public class FileController {

    /**
     * 单文件上传
     *
     * @param file 上传文件
     */
    @RequestMapping("/upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        if (file.getOriginalFilename() != null) {
            file.transferTo(new File(
                    "D:\\ApplicationTwo\\JetBrains\\File\\springboot\\springboot\\springboot_logback\\src\\main\\resources\\upload"
                    , file.getOriginalFilename()));
            return "上传成功";
        }
        return "上传失败";
    }

    /**
     * 多文件上传
     *
     * @param file 上传文件
     */
    @RequestMapping("/uploads")
    @ResponseBody
    public void uploads(MultipartFile[] file) throws IOException {
        for (MultipartFile f : file) {
            if (f.getOriginalFilename() != null) {
                f.transferTo(new File(
                        "D:\\ApplicationTwo\\JetBrains\\File\\springboot\\springboot\\springboot_logback\\src\\main\\resources\\upload"
                        , f.getOriginalFilename()));
            }
        }
    }

    @RequestMapping("/download")
    @ResponseBody
    public void download(String filename, HttpServletResponse response) throws IOException {
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            if (filename == null) {
                throw new NullPointerException();
            }
            response.setHeader("content-disposition", "attachment;filename=" + filename);
            File file = new File("D:\\ApplicationTwo\\JetBrains\\File\\springboot\\springboot\\springboot_logback\\src\\main\\resources\\upload",
                    filename);
            fis = new FileInputStream(file);
            int len = 0;
            byte[] bytes = new byte[1024];
            os = response.getOutputStream();
            while ((len = fis.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                os.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }
}
