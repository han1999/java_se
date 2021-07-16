package com.cskaoyan.javase.oop3._2inner._3local._4life;

import com.sun.javafx.binding.SelectBinding;

/**
 * @description: 对象的生命周期和方法冲突
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 局部内部类对象如果被一个其它类（完全不想关的类）指向，其实是比较危险的
 *      会造成GC无法正常回收垃圾
 *      建议在开发中不要这么使用
 *
 */
public class Demo {
    public static void main(String[] args) {
        A a = test();
        a.method();
    }

    public static A test() {
        int a = 10;
        class ASon extends A {
            @Override
            public void method(){
                System.out.println(a);
            }
        }
        ASon as = new ASon();
        as.method();
        System.out.println(a);
        return new ASon();
    }
}

class A {
    public void method(){
    }
}
