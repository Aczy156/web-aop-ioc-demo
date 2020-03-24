package org.csu.spring.demo.AOP.test;

import org.csu.spring.demo.AOP.persistence.AccountDAO;
import org.csu.spring.demo.AOP.persistence.AccountDAOimpl;
import org.csu.spring.demo.AOP.proxy.ProxyDemo;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class Demo {
    @Test
    public void test(){
        AccountDAO accountDAO = new AccountDAOimpl();

        Class class1 = accountDAO.getClass();

        //参数中加载器需要用这个被代理的对象的底层class，要get出来,还有最后自己写的代理类ProxyDemo，返回的来这个object是代理完之后的
        Object object = Proxy.newProxyInstance(class1.getClassLoader(),class1.getInterfaces(),new ProxyDemo(accountDAO));

        accountDAO = (AccountDAO)object;

        accountDAO.insert();
        accountDAO.query();

    }
}
