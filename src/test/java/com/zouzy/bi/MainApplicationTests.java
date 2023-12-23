package com.zouzy.bi;

import javax.annotation.Resource;
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
        Map<Integer,String> map =new HashMap(){{
            put(1,"zhangsan");
            put(2,"zhangsan");
            put(3,"zhangsan");
        }} ;

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            map.put(1,"jjj"); //这里会报错么
            System.out.printf("key:%d,value:%s \n",entry.getKey(),entry.getValue());
        }
    }
}
