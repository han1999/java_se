package com.cskaoyan.javase.homework.day12;

/**
 * @description: getClass方法练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * getClass获取一个类的运行时对象,Class对象，类对象
 * 这个方法仅用来获取对象，这个Class对象是类加载时JVM在堆上创建的
 * 类加载只有一次，所以对于一个类来说，Class对象也只有一份
 *      所以只要时同一个类生成的对象，那么它们的Class对象就是同一个（地址值相同）
 * Class对象到底有啥用？
 *      用来获取类型信息
 *      类型信息包括： 有哪些成员变量，有哪些方法，有哪些构造器等等
 *      Class对象是反射的基础
 *      反射是可以为所欲为的，反射实际上就是Class API
 *
 */
public class Work3 {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();
        Class aClazz1 = a.getClass();
        Class aClazz2 = a1.getClass();

        //快捷键 ctrl+alt+左右键 前进和后退光标所在的位置
        String n1 = aClazz1.getName();
        String n2 = aClazz2.getName();
        System.out.println(n1.equals(n2)); //比较的是内容
        System.out.println(n1 == n2); //比较的是地址

        B b = new B();
        Class bClazz = b.getClass();

        //System.out.println(aClazz1 == aClazz2);
    }
}

class A {
}

class B {
}