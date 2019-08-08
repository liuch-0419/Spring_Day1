package com.baizhi.factorybean;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.FactoryBean;

import java.io.InputStream;

public class SqlSessionFactoryBean implements FactoryBean<SqlSessionFactory> {
    @Override
    public SqlSessionFactory getObject() throws Exception {
        //创建SqlSessionfactory的步骤
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        return  sqlSessionFactory;
    }

    @Override
    public Class<?> getObjectType() {
        return  SqlSessionFactory.class;
    }


    //SqlSessioNFactory是重量级资源  一个应用创建一次
    @Override
    public boolean isSingleton() {
        return  true;
    }
}
