package com.cskaoyan.javase.basic._5exercise;

/**
 * @description: 练习2
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 字符串可以进行+号的运算，表示进行字符串的拼接
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        System.out.println('a'); //a
        System.out.println('a' + 1); //98
        System.out.println("hello" + 'a' + 1); //helloa1
        System.out.println('a' + 1 + "hello"); //98hello
        System.out.println("5+5=" + 5 + 5); //5+5=55
        System.out.println("5+5=" + (5 + 5)); //5+5=10
        System.out.println(5 + 5 + "=5+5"); //10=5+5
        System.out.println(5 + 5.0); //10.0
        System.out.println(10 / 3); //3
        System.out.println(10 / 3.0); //double
        System.out.println(10 / 3.0F); //float
        System.out.println(5 + "5" + 5.0); //555.0
    }

}
