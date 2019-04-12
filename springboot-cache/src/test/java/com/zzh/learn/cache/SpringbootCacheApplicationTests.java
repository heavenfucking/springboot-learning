package com.zzh.learn.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootCacheApplicationTests {

    @Autowired
    private CacheService cacheService;

    @Test
    public void save() {

        cacheService.save(new User("03", "王二"));
    }

    @Test
    public void get() {
        cacheService.get("01");
    }

}
