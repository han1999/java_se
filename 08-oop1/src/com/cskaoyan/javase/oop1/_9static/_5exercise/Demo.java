package com.cskaoyan.javase.oop1._9static._5exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 读程序题先找main方法
 * 启动一个类的main方法,会触发该类的类加载
 * 类加载的过程中会初始化该类的静态成员变量
 *
 * 类加载当中负责认识类型,了解该类当中的信息的步骤都在前面
 * 像给静态成员变量初始化等步骤,都在最后一步
 *
 * 所以类加载在进行到初始化静态变量之前,该类已经能够创建对象
 *
 *
 */
public class Demo {
    static {
        System.out.println("Demo 类加载");
    }
    static Cat cat = new Cat(); //static int a = 10;
    Dog dog = new Dog();
    Dog dog2;

    public static void main(String[] args) {
        System.out.println("hello world!");
        Demo d = new Demo();
    }

    public Demo() {
        System.out.println("demo");
    }
}

class Cat {
    static Dog dog = new Dog(); //static3 int a = 10;
    static {
        System.out.println("Cat 类加载");
    }

    public Cat() {
        System.out.println("cat");
    }
}

class Dog {
    static {
        System.out.println("Dog 类加载");
    }
    public Dog() {
        System.out.println("dog");
    }
}