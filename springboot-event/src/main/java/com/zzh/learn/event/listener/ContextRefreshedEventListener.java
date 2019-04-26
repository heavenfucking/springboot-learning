package com.zzh.learn.event.listener;


import com.zzh.learn.event.event.CustomEventPublisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger logger = LoggerFactory.getLogger(ContextRefreshedEventListener.class);


    @Autowired
    private CustomEventPublisher customEventPublisher;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        logger.info("事件 ContextRefreshedEvent");
        customEventPublisher.publish();
    }


}
