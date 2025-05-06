package com.redis.demo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    @Test
    public void test01() {
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        jedis.set("key", "value");
        String value = jedis.get("key");
        System.out.println(value);
        System.out.println(jedis.ping());
    }

}
