package com.zzh.learn.cache.config;

import org.ehcache.Cache;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.builders.CacheConfigurationBuilder;
import org.ehcache.config.builders.CacheManagerBuilder;
import org.ehcache.config.builders.ExpiryPolicyBuilder;
import org.ehcache.config.builders.ResourcePoolsBuilder;
import org.ehcache.config.units.MemoryUnit;
import org.ehcache.impl.serialization.PlainJavaSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

/**
 * @author zhuhao
 * @title: CacheConfig
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/293:39 PM
 * https://blog.51cto.com/881206524/2320745?source=dra
 * http://www.leftso.com/blog/126.html
 */
@Configuration
public class CacheConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheConfig.class);

    private static final String CACHE_NAME_XXXX = "system";

    private static final String CACHE_NAME_YYYY = "YYYY";

    @Bean
    public CacheManager cacheManager() {
        ResourcePoolsBuilder resourcePoolsBuilder = ResourcePoolsBuilder.newResourcePoolsBuilder().heap(20, MemoryUnit.MB).offheap(30, MemoryUnit.MB);
        CacheConfiguration<String, Object> cacheConfiguration = CacheConfigurationBuilder.newCacheConfigurationBuilder(String.class, Object.class, resourcePoolsBuilder)
                .withValueSerializer(new PlainJavaSerializer<>(this.getClass().getClassLoader()))
                .withExpiry(ExpiryPolicyBuilder.timeToIdleExpiration(Duration.ofSeconds(10))).build();
        CacheManager cacheManager = CacheManagerBuilder.newCacheManagerBuilder()
                .withDefaultSizeOfMaxObjectSize(500, MemoryUnit.KB)
                .withDefaultSizeOfMaxObjectGraph(2000)
                .withCache(CACHE_NAME_XXXX, cacheConfiguration)
                .withCache(CACHE_NAME_YYYY, cacheConfiguration)
                .build(true);
        return cacheManager;

    }

    @Bean
    public Cache geCache() {
        return cacheManager().getCache(CACHE_NAME_XXXX, String.class, Object.class);
    }

}
