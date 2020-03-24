package org.csu.spring.demo.SpringAOP.test;

import org.csu.spring.demo.SpringAOP.persistence.AccountDAO;
import org.csu.spring.demo.SpringAOP.persistence.AccountDAOimpl;
import org.csu.spring.demo.SpringAOP.proxy.ProxyDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-aop.xml")
public class Demo {

    @Resource(name = "demoAfterProxy")
    private AccountDAO accountDAO;

    @Test
    public void test(){
        //动态代理必定面向接口，在配置文件中也要写一个接口proxyInterfaces
        accountDAO.insert();
//        AccountDAO accountDAO = new AccountDAOimpl();
//
//        Class class1 = accountDAO.getClass();
//
//        //参数中加载器需要用这个被代理的对象的底层class，要get出来,还有最后自己写的代理类ProxyDemo，返回的来这个object是代理完之后的
//        Object object = Proxy.newProxyInstance(class1.getClassLoader(),class1.getInterfaces(),new ProxyDemo(accountDAO));
//
//        accountDAO = (AccountDAO)object;
//
//        accountDAO.insert();
//        accountDAO.query();

    }
}
