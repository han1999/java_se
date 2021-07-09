package com.cskaoyan.javase.oop1._2memory;

/**
 * @description: 三个对象, 其中两个引用指向同一对象
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 {
    public static void main(String[] args) {
        //创建对象
        Phone p1 = new Phone();
        Phone p2 = p1;
        Phone p3 = new Phone();

        p1.brand = "Apple";
        System.out.println(p2.brand); //Apple
        System.out.println(p3.brand); //null
    }
}

class Phone {
    //属性: 价格,品牌brand
    double price;
    String brand;

    //行为: 上网
    public void surfing() {
        System.out.println("您也在上网冲浪吗?");
    }
}
