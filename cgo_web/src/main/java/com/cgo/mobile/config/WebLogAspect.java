package com.cgo.mobile.config;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * 统一请求日志打印 类
 */
@Aspect
@Component
@Slf4j
public class WebLogAspect {


    @Pointcut("execution(public * com.cgo.mobile.controller..*.*(..))")
    public void weblog(){ }

    @Before("weblog()")
    public void doBefore(JoinPoint joinPoint){
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        // 记录下请求内容
        log.info("========================================== Start ==========================================");
        log.info("url         :  " + request.getRequestURL().toString());
        log.info("class      :  "+joinPoint.getTarget().getClass());
        log.info("method  :  " + request.getMethod());
        log.info("ip           :  " + request.getRemoteAddr());
        Enumeration<String> enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String name = (String) enu.nextElement();
            log.info("key:{},value:{}", name, request.getParameter(name));
        }
    }

    /**
     * 此处不对  异常情况打印  异常情况由 ExceptionHanle 处理日志
     * @param response
     * @throws Throwable
     */
    @AfterReturning(returning = "response", pointcut = "weblog()")
    public void doAfterReturning(Object response) throws Throwable {
        // 处理完请求，返回内容
        log.info("response : " + response);
        log.info("========================================== end ==========================================");
    }


}
