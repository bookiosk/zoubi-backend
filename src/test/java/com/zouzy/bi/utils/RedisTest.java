package com.zouzy.bi.utils;

import org.junit.jupiter.api.Test;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisTest {

    @Autowired
    private RedissonClient redissonClient;

    @Test
    public void queryRedis() {
        redissonClient.getLock("k1")
    }
}
