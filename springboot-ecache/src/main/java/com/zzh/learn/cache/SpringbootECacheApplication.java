package com.zzh.learn.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class SpringbootECacheApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringbootECacheApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder()
                .sources(SpringbootECacheApplication.class)
                .web(true)
                .run(args);
        logger.info("启动");
    }

}
