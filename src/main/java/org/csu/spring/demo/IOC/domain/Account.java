package org.csu.spring.demo.IOC.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//注解此处内部的值，类似于xml中bean中的id的值，然后Value的初始化类似xml中
@Component("account")
public class Account {
    @Value("Allen")
    private String username;

//    //构造注入
//    public Account(String username, String password, int age) {
//        this.username = username;
//        this.password = password;
//        this.age = age;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Value("123456789")
    private String password;

    @Value("17")
    private int age;

}
