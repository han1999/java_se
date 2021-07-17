package com.cskaoyan.javase.oop3._3anonymous._2exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 要求: 控制台输出hello world!
 * 分析:
 *      show方法是接口中的抽象方法
 *      Outer.method()的返回值一定是一个接口的子类对象
 *      Outer.method()说明method方法是Outer类的无参静态方法,返回值类型应该写接口
 *
 */
public class Demo{
    public static void main(String[] args) {
        Outer.method().show();
    }
}
interface Inter {
    void show();
}
class Outer {
    public static Inter method(){
        //return new InterImpl();
        //使用匿名内部类作为方法的返回值
        return new Inter() {
            @Override
            public void show() {
                System.out.println("hello world!");
            }
        };
    }
}
//朴素的做法
class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("hello world!");
    }
}