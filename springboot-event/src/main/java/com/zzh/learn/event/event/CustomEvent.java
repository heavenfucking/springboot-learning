package com.zzh.learn.event.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author zhuhao
 * @title: CustomEvent
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/2611:59 AM
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My Custom Event";
    }
}