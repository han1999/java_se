package com.cskaoyan.javase.debug;

import java.util.Scanner;

/**
 * @description: Debug模式初体验
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world");
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("你输入的数大于0");
        } else if (num == 0) {
            System.out.println("你输入的数等于0");
        } else {
            System.out.println("你输入的数小于0");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        method();

        new A().test();
    }

    public static void method() {
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
        System.out.println("test");
    }
}

class A{
    public A(){
        System.out.println();
    }
    public void test(){
        System.out.println("A");
    }
}
