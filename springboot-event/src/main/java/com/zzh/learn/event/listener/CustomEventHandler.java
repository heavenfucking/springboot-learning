package com.zzh.learn.event.listener;

import com.zzh.learn.event.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author zhuhao
 * @title: CustomEventHandler
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/2612:01 PM
 */
@Component
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

    public void onApplicationEvent(CustomEvent event) {

        System.out.println(event.toString());

    }
}