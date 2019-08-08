package com.baizhi.dao;

public class UserDAOImpl1 implements  UserDAO {
    @Override
    public void save() {
        System.out.println("我是新的实现类中的save方法");
    }
}
