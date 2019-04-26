package com.zzh.learn.event.listener;

import com.zzh.learn.event.event.CustomEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhuhao
 * @title: ContextStartedEventListener
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/2611:50 AM
 */
@Component
public class ContextStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {

    private static final Logger logger = LoggerFactory.getLogger(ContextRefreshedEventListener.class);


    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        logger.info("事件：ApplicationStartingEvent");

    }
}
