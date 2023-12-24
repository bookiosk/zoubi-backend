package com.zouzy.bi.controller;

import cn.hutool.core.date.DateUtil;
import com.zouzy.bi.annotation.ApiMethodLimit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/test")
    @ApiMethodLimit
    public void methodLimitTest (@RequestParam(required = false) String test,@RequestParam(required = false) Integer ai) {
    }
}
