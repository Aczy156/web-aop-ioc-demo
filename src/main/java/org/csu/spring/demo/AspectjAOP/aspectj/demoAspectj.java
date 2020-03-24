package org.csu.spring.demo.AspectjAOP.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class demoAspectj {
    //通过注释解释插入的这个函数的属性 * 指的是任意的返回值类型 ,路径里边*任意文件的任意函数(..)，..意思为任意参数
    @Before(value = "execution(* org.csu.spring.demo.AspectjAOP.persistence.*.*(..))" )
    public void before(){
        System.out.println("这是一个前置建议");
    }
}
