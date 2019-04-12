package com.zzh.learn.cache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author zhuhao
 * @title: RedisConfiguratioon
 * @projectName spring-boot-learning
 * @description: TODO
 * @date 2019/4/124:40 PM
 * <p>
 * https://blog.csdn.net/s297485987/article/details/84350728
 */
@Configuration
@EnableCaching
public class RedisConfig {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Bean(name = "redisTemplate")
    public RedisTemplate<String, Object> getRedisTemplate(LettuceConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(connectionFactory);
        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        template.setKeySerializer(stringRedisSerializer);
        template.setHashKeySerializer(stringRedisSerializer);
        template.afterPropertiesSet();
        logger.info("redisTemplate init success");
        return template;
    }

    @Bean(name = "stringRedisTemplate")
    public StringRedisTemplate getStringRedisTemplate(LettuceConnectionFactory connectionFactory) {
        logger.info("StringRedisTemplate init success");
        return new StringRedisTemplate(connectionFactory);
    }
}
