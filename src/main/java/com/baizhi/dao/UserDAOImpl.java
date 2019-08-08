package com.baizhi.dao;

public class UserDAOImpl implements  UserDAO {
    @Override
    public void save() {
        System.out.println("我是UserDAO中的save方法");
    }
}
