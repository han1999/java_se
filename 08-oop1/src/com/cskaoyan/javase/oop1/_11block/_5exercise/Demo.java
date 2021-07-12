package com.cskaoyan.javase.oop1._11block._5exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        new A();
    }
}

class A {
    static {
        System.out.println("A完成类加载");
    }
    static B b = new B(); //B的类加载执行到可以创建对象的步骤
}

class B {
    static {
        System.out.println("B完成类加载");
    }
    static C c = new C();
}

class C {
    static {
        System.out.println("C完成类加载");
    }
    static A a = new A();
}
