package com.shuang.commons.log.feign;

import feign.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignLoggerFactory;

/**
 * feign info 日志工厂
 * @author: shuang
 */
public class InfoFeignLoggerFactory implements FeignLoggerFactory {

    @Override
    public Logger create(Class<?> type) {
        return new com.shuang.commons.log.feign.InfoFeignLogger(LoggerFactory.getLogger(type));
    }
}