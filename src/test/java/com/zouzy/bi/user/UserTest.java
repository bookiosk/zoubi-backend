package com.zouzy.bi.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

@SpringBootTest
public class UserTest {

    private static final String SALT = "shuTing";

    @Test
    void register () {
        String userPassword = "C!590dy334";
        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + userPassword).getBytes());
        System.out.println(encryptPassword);
    }
}
