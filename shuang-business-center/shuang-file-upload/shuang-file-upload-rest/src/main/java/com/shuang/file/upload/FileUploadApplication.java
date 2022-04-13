package com.shuang.file.upload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 上传下载组件
 */
@SpringBootApplication(scanBasePackages = {"com.shuang.file.upload", "com.shuang.commons"})
public class FileUploadApplication {

    public static void main(String[] args) {

        SpringApplication.run(FileUploadApplication.class, args);
    }

}
