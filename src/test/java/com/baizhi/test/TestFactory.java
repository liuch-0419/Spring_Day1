package com.baizhi.test;

import com.baizhi.dao.UserDAO;
import com.baizhi.entity.Product;
import com.baizhi.entity.Student;
import com.baizhi.entity.User;
import com.baizhi.factorybean.ConnectionFactory;
import com.baizhi.service.UserService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {

    @Test
    public   void   testSpring(){
        //读取Spring配置文件    创建Spring工厂
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建对象
        User user =(User) ac.getBean("user");
        System.out.println(user);
    }

    @Test
    //创建Spring工厂  由Spring工厂创建对象
    public   void  testSpring1(){
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO  userDAO=(UserDAO)ac.getBean("userDAO");
        userDAO.save();
    }


    @Test
    //测试Spring创建对象的原理
    public  void   testSpring2() throws Exception {
        //com.baizhi.entity.User  //获取user的类对象
        Class<?> aClass = Class.forName("com.baizhi.entity.User");
        //由该类对象  创建类的对象
        Object o = aClass.newInstance();
        User user=(User)o;
        System.out.println(user);
    }

    @Test
    //测试Spring Service
    public  void   testSpring3() throws Exception {
        //创建Spring的工厂
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) ac.getBean("userService");
        userService.register();
    }

    @Test
    //测试构造注入
    public  void   testSpring4(){
        //创建Spring的工厂
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        Product  product=(Product) ac.getBean("product");
        System.out.println(product);
    }


    @Test
    //创建复杂对象
    public   void  testSpring5(){
        //创建Spring的工厂
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        //可以通过配置类的ID 获取到由该类所创建的复杂对象
      /*  Connection conn=(Connection) ac.getBean("connection");
        Connection conn1=(Connection) ac.getBean("connection");
        System.out.println(conn);
        System.out.println(conn1);*/
        //获取该类的对象
        ConnectionFactory connectionFactory=(ConnectionFactory) ac.getBean("&connection");
        System.out.println(connectionFactory);
    }

    @Test
    //创建复杂对象
    public   void  testSpring6(){
        //创建Spring的工厂
        ApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        SqlSessionFactory sqf=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
        SqlSessionFactory sqf1=(SqlSessionFactory) ac.getBean("sqlSessionFactory");
        System.out.println(sqf);
        System.out.println(sqf1);
    }

    @Test
    //创建复杂对象
    public   void  testSpring7(){
        //创建Spring的工厂
        ClassPathXmlApplicationContext ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        Student student=(Student) ac.getBean("student");
        //关闭工厂
        ac.close();
        System.out.println(student);
     }




}
