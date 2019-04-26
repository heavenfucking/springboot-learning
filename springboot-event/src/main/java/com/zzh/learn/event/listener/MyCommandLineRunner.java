package com.zzh.learn.event.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhuhao
 * @title: MyCommandLineRunner
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/2611:38 AM
 */
@Component
@Order(value=1)
public class MyCommandLineRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println(">>>>>>>>>>>>>>>服务启动执行，执行加载数据等操作<<<<<<<<<<<<<");
    }

}
