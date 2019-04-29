package com.zzh.learn.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;


//https://www.cnblogs.com/cnjavahome/p/8436219.html
//https://www.cnblogs.com/yueshutong/p/9381540.html
@SpringBootApplication
public class SpringbootCacheApplication {

    public static Logger logger = LoggerFactory.getLogger(SpringbootCacheApplication.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder()
                .sources(SpringbootCacheApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
        logger.info("启动");
    }

}
