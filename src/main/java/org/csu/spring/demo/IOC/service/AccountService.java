package org.csu.spring.demo.IOC.service;

import org.csu.spring.demo.IOC.persistence.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountService {
    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    //[七个最常用的标签]注入对象的特殊情况=》不可以用value了，可用以下两个autowired[按类型搜索，只要是类一样就拿过来]Resource[按名称指定特定的,那个名字就是那个类上边的ComponentRespority/Controller/Service里边的那个参数的名字]
//    @Autowired
    @Resource(name = "accountDAO")
    private AccountDAO accountDAO;

    public void login(){
        System.out.println("service login 方法");
        accountDAO.query();
    }
}
