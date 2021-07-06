package com.cskaoyan.javase.method._3exercise;

/**
 * @description: 计算器类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 定义一个计算器（Calculator）它的功能有
 * - 加，减，乘，除
 * - 求平方
 * - 求a的n次方
 *
 */
public class Calculator {
    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static int square(int num) {
        return num * num;
    }

    //求a的n次方
    public static int power(int a, int n) {
        /*//jdk当中提供的方法
        //Math.pow(double,double) 它的返回值也是double类型
        //double --> int 需要做强制类型转换
        return ((int) Math.pow(a, n));*/

        //手写一个幂运算
        //用循环完成重复的一件事情
        //在外部定义一个结果值变量,用来装结果
        int result = 1;
        for (int i = 0; i < n; i++) {
            //a *= a;
            result *= a;
        }
        return result;
    }
}
