package com.zzh.learn.cache.service;

import com.zzh.learn.cache.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhuhao
 * @title: CaceService
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/123:32 PM
 */
// https://blog.csdn.net/shuxing520/article/details/78787545
@Component
public class CacheService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static Map<String, User> users = new HashMap<String, User>() {{
        put("01", new User("01", "张三"));
        put("02", new User("02", "李四"));
    }};

    @CachePut(value = "user", key = "#user.id")
    public void save(User user) {
        users.put(user.getId(), user);
    }


    @Cacheable(value = "user#${select.cache.timeout:1000}", key = "#id")//example 是cache容器名字 #后边的是SpEL表达式
    public User get(String id){
        logger.info("get {}", id);
        return users.get(id);
    }


}
