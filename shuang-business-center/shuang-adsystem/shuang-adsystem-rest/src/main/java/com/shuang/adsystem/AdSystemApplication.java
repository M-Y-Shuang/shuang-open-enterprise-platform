package com.shuang.adsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序化广告系统
 */
@SpringBootApplication(scanBasePackages = {"com.shuang.adsystem", "com.shuang.commons"})
public class AdSystemApplication {

    public static void main(String[] args) {

        SpringApplication.run(AdSystemApplication.class, args);
    }

}
