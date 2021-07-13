package com.cskaoyan.javase.oop2._1extends._6initialization;

/**
 * @description: 为什么我们要在创建一个类的同时顺手写上无参构造
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 继承在开发中很常见,如果一个类没有无参构造,那么直接继承它会报错,因为子类的构造方法第一行隐含super()
 *      会去调用父类的无参构造方法
 *
 */
public class Demo3 {
    public static void main(String[] args) {

    }
}
class Father{
    int a;

    public Father(int a) {
        //super();
        this.a = a;
    }

    public Father() {
    }
}
//There is no default constructor available in 'com.cskaoyan.javase.oop2._1extends._6initialization.Father'
class Son extends Father{
    //public Son(int a) {
    //    super(a);
    //}
}