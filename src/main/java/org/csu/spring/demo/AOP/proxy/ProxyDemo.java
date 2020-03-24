package org.csu.spring.demo.AOP.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyDemo implements InvocationHandler {

    //被代理的类
    public Object object;

    //利用构造方法传入被代理的类
    public ProxyDemo(Object object){
        this.object = object;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //产生的切面前后可以添加任意函数//或者添加条件
        if (method.getName().equals("query")){
            beforeAdvice();
        }

        //object这个被代理的对象，传进来之后，在这里调用了invoke来执行传进来的这个被代理的对象的方法
        Object proxyObject = method.invoke(object,args);

        return proxyObject;
    }

    public void beforeAdvice(){
        System.out.println("前置建议，日志记录");
    }
    public void afterAdvice(){
        System.out.println("后置建议");
    }
}
