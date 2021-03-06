package com.shuang.eureka.listener;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class InstanceCancelListener implements ApplicationListener<EurekaInstanceCanceledEvent> {

    @Override
    public void onApplicationEvent(EurekaInstanceCanceledEvent event) {

        log.info("ζε‘:{}ζδΊ",event.getAppName());
    }
}