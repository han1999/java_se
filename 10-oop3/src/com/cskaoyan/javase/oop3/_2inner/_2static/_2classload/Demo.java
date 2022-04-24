package com.cskaoyan.javase.oop3._2inner._2static._2classload;

/**
 * @description: 验证静态内部类的类加载
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {

    public static void main(String[] args) {
        System.out.println(Enclosed.Inner.a);
    }


}

class Enclosed {
    static {
        System.out.println("Enclosed类类加载了!");
    }

    static class Inner {
        static int a = 10;

        static {
            System.out.println("Inner类加载了");
        }
    }
}