package org.csu.spring.demo.IOC.test;

import org.csu.spring.demo.IOC.domain.Account;
import org.csu.spring.demo.IOC.persistence.AccountDAO;
import org.csu.spring.demo.IOC.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//利用junit和spring的一个标签，来每次测试自动运行下面的context上下文环境
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class demotest {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void test(){
        //DAO dao = new DAOimpl();


        //IOC 利用context上下文环境 (通过获取配置文件)
        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //测试serivce
        //XML方法//注解方法
//        AccountService accountService = (AccountService) context.getBean("accountService");
        accountService.login();





//        AccountDAO accountDAO = (AccountDAO) context.getBean("accountDAO");
//

        //测试account
//        Account tem = (Account)context.getBean("account");
//        System.out.println(tem.getUsername()+" "+tem.getPassword()+" "+tem.getAge());
//
//        accountDAO.insert();
//        accountDAO.delete();
//        accountDAO.update();
//        accountDAO.query();
    }
}
