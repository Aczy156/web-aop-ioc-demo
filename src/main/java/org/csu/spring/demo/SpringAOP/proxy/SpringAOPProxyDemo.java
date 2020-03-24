package org.csu.spring.demo.SpringAOP.proxy;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class SpringAOPProxyDemo implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置建议：日志记录");
    }
}
