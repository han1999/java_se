package com.cskaoyan.javase.overload._2exercise;

/**
 * @description: 练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 使用方法重载，输出各种数据类型
 * - 实现一个功能更强大的计算器
 *
 */
public class Demo {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        System.out.println();
    }

    public static void print(byte a) {
        System.out.println(a);
    }

    public static void print(short a) {
        System.out.println(a);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(long a) {
        System.out.println(a);
    }

    public static void print(float a) {
        System.out.println(a);
    }

    public static void print(double a) {
        System.out.println(a);
    }

    public static void print(char a) {
        System.out.println(a);
    }

    public static void print(String a) {
        System.out.println(a);
    }

    public static void print(boolean a) {
        System.out.println(a);
    }
}
