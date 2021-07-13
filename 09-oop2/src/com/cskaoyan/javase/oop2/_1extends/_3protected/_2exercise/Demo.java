package com.cskaoyan.javase.oop2._1extends._3protected._2exercise;

/**
 * @description: Object类当中的clone方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 1,Object类当中的clone方法,它的访问权限是protected
 * 2,Object类是java当中所有类的父类
 * 所以java当中所有类都要继承Object类当中的clone方法
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*//这里能否调用A的clone方法?
        A a = new A();
        //'clone()' has protected access in 'java.lang.Object'
        a.clone()*/

        //这里如果想要访问clone方法,只能访问谁的? 怎么访问?
        Demo d = new Demo();
        d.clone();
    }
}

class A {
    public void test() throws CloneNotSupportedException {
        /*Demo demo = new Demo();
        demo.clone*/
        A a = new A();
        a.clone();
    }
}
