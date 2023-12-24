package com.zouzy.bi.chart;

import com.zouzy.bi.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ChartTest {

    @Resource
    private UserMapper userMapper;
}
