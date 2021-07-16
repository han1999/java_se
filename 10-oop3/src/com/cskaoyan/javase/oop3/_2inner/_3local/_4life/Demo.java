package com.cskaoyan.javase.oop3._2inner._3local._4life;

/**
 * @description: 对象的生命周期和方法冲突
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

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
        return new ASon();
    }
}

class A {
    public void method(){
    }
}
