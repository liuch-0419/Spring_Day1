package com.baizhi.entity;

public class Product {
     private  Integer  id;
     private  String   productname;
     private  Double   price;


    public Product(Integer id, String productname, Double price) {
        this.id = id;
        this.productname = productname;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productname='" + productname + '\'' +
                ", price=" + price +
                '}';
    }
}
