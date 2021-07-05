package com.cskaoyan.javase.basic._5exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

//1或者2这种字面值常量只是说它默认用int来接收，但是不意味它就是int类型
public class Demo {
    public static void main(String[] args) {
        //byte b1 = 1, b2 = 2, b;
        //更推荐一行定义一个变量
        byte b1 = 1;
        byte b2 = 2;
        byte b;

        b = ((byte) (b1 + b2));
        b = 1 + 2;
        System.out.println(b);
        //b = 3;
        //byte c = 128;
    }
}
