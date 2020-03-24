package org.csu.spring.demo.SpringAOP.persistence;

import org.springframework.stereotype.Repository;

@Repository("accountDAO")
public class AccountDAOimpl implements AccountDAO {
    @Override
    public void insert() {
        System.out.println("增加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("更改用户");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}
