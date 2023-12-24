package com.zouzy.bi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ApiMethodLimit {

    /**
     * 限定次数
     *
     * @return
     */
    int limitTimes() default 1;

    /**
     * 单位时间划分的小周期
     * @return
     */
    int cycle() default 1;

    /**
     * 时间格式
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.SECONDS;
}
