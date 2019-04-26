package com.zzh.learn.cache.lock;

/**
 * @author zhuhao
 * @title: DistributedLock
 * @projectName spring-boot-learning
 * @description:
 * @date 2019/4/2611:06 AM
 * 参考 https://my.oschina.net/dengfuwei/blog/1600681
 */
interface DistributedLock {

    long TIMEOUT_MILLIS = 30000;

    int RETRY_TIMES = Integer.MAX_VALUE;

    long SLEEP_MILLIS = 500;

    boolean lock(String key);

    boolean lock(String key, int retryTimes);

    boolean lock(String key, int retryTimes, long sleepMillis);

    boolean lock(String key, long expire);

    boolean lock(String key, long expire, int retryTimes);

    boolean lock(String key, long expire, int retryTimes, long sleepMillis);

    boolean releaseLock(String key);
}
