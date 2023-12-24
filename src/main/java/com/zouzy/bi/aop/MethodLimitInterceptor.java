package com.zouzy.bi.aop;

import com.zouzy.bi.annotation.ApiMethodLimit;
import com.zouzy.bi.annotation.AuthCheck;
import com.zouzy.bi.common.ErrorCode;
import com.zouzy.bi.exception.BusinessException;
import com.zouzy.bi.model.entity.User;
import com.zouzy.bi.model.enums.UserRoleEnum;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.redisson.api.RedissonClient;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@Aspect
@Component
public class MethodLimitInterceptor {

    @Resource
    private RedissonClient redissonClient;

    /**
     * 执行拦截
     *
     * @param joinPoint
     * @param apiMethodLimit
     * @return
     */
    @Around("@annotation(apiMethodLimit)")
    public Object doInterceptor(ProceedingJoinPoint joinPoint, ApiMethodLimit apiMethodLimit) throws Throwable {
        int limitTimes = apiMethodLimit.limitTimes();
        System.out.println(joinPoint.getKind());
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.toString());
        this.argsCheck(apiMethodLimit.limitTimes(), apiMethodLimit.cycle());
        // 通过权限校验，放行
        return joinPoint.proceed();
    }

    private void argsCheck(int limitTimes, int cycle) {

    }
}
