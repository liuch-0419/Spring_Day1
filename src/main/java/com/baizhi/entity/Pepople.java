package com.baizhi.entity;

public class Pepople {

    public Pepople() {
        System.out.println("我是People类中的无参构造");
    }

    //初始化方法
    public   void   init(){
        System.out.println("对象创建时 调用的方法");
    }
    //销毁的方法
    public  void  destory(){
        System.out.println("对象销毁时 调用的方法");
    }

}
