package com.zzh.learn.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhuhao
 * @title: TestController
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/125:00 PM
 */
@RestController
public class TestController {

    @Autowired
    private CacheService cacheService;


    @RequestMapping("/save")
    public Object save(){
        cacheService.save(new User("03", "朱昊"));
        return "ok";
    }

    @RequestMapping("/get")
    public Object get(){
        return cacheService.get("01");

    }
}
