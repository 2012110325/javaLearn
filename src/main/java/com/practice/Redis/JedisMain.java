package com.practice.Redis;

/**
 * Created by liqiang28 on 2018/4/12.
 */
public class JedisMain {

    /*
     redis相关的重点关注以下几点
     0）几种常用数据结构的实现
     1）redis持久化的两种方式，异同点等
     2）redis集群搭建
     3）redis的高可用如何保证
     4）redis.conf文件阅读 sentinel.conf 文件阅读
     */
    public static void main (String[] args) {

        String key = "firstKey";
        JedisInstance.JEDIS.set(key, "firstValue");
        System.out.println(JedisInstance.JEDIS.get(key));
    }
}
