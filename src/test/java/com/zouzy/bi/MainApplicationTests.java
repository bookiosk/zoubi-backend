package com.zouzy.bi;

import javax.annotation.Resource;

import cn.hutool.core.date.DateUtil;
import com.zouzy.bi.common.AspectScope;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

/**
 * 主类测试
 *
 * 
 * 
 */
@SpringBootTest
class MainApplicationTests {


    @Test
    void test1 () {
        System.out.println(AspectScope.USER_SCOPE.equals(AspectScope.USER_SCOPE));
    }
}
