package com.practice.Redis;

import redis.clients.jedis.Jedis;

/**
 * Created by liqiang28 on 2018/4/12.
 */
public class JedisInstance {

    public final static Jedis JEDIS = new Jedis("localhost", 6379);
}
