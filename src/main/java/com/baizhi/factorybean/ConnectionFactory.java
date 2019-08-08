package com.baizhi.factorybean;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

//创建的复杂对象的类型
public class ConnectionFactory  implements FactoryBean<Connection> {
    /*
     *
     * 书写创建复杂对象的步骤
     *
     * */
    @Override
    public Connection getObject() throws Exception {
        Class.forName("oracle.jdbc.OracleDriver");
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
        return  connection;
    }

    /*
    *
    * 返回创建的复杂对象的类型
    *
    * */
    @Override
    public Class<?> getObjectType() {
        return  Connection.class;
    }

    /*
    *
    * 控制创建对象的次数
    * 返回值：
    *         false: 每一次都会创建新的对象
    *         true:  只会创建一次对象
    * */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
