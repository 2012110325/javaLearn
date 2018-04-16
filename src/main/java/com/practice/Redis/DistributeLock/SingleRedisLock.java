package com.practice.Redis.DistributeLock;

import com.practice.Redis.JedisInstance;

/**
 * Created by liqiang28 on 2018/4/16.
 */
public class SingleRedisLock {

    public boolean lock(String key, String value, int expireTimems) {

        JedisInstance.JEDIS.setnx(key, value);
        JedisInstance.JEDIS.pexpire(key, expireTimems);

        return true;
    }

    public boolean unlock(String key, String value) {
        // 释放锁， 只有值是value时 才释放锁
        return false;
    }
}
