package com.cskaoyan.javase.oop2._1extends._8exercise;

/**
 * @description: 测试子类触发父类类加载
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 extends A {
    static {
        System.out.println("Demo2类加载");
    }

    public static void main(String[] args) {
    }
}

class A {
    static {
        System.out.println("A类加载!");
    }
}