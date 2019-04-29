package com.zzh.learn.cache;

import org.ehcache.Cache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zhuhao
 * @title: DemoController
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/293:53 PM
 */
@RestController
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Cache cache;


    @RequestMapping("get")
    public Object testcache() {
        String key = "list";
        if(!cache.containsKey(key)){
            Random random = new Random();
            List<String> list = Stream.generate(() -> String.valueOf(random.nextInt(10000))).limit(100000).collect(Collectors.toList());
            cache.put(key, list);
            logger.info("init cache");

        }
        return cache.get(key);
    }

    @RequestMapping("clear")
    public Object clearcache() {
        String key = "list";
        cache.clear();
        return cache.get(key);
    }

}
