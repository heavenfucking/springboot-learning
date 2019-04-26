package com.zzh.learn.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

//https://blog.csdn.net/sinat_25518349/article/details/85545848
//http://wiki.jikexueyuan.com/project/spring/event-handling-in-spring.html
@SpringBootApplication
public class SpringbootEventApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringbootEventApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder()
                .sources(SpringbootEventApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
        logger.info("启动");
    }

}
