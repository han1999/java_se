package com.cskaoyan.javase.string._1notvar;

import java.util.Scanner;

/**
 * @description: 字符串的不可变性
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 字符串对象的不可变性:
 *      字符串String底层是用private final char value[]数组来装一个字符串的
 *      它是final修饰的
 *      意味着:
 *           1,该value数组不可能指向新的数组
 *           2,该value数组当中的内容是可变的
 *
 *      String字符串内容一旦修改,就会创建新的字符串对象,原先的字符串对象不会发生改变,这就是字符串对象的不可变性
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串: ");
        String s = sc.nextLine();
        testStringNotVar(s);
        System.out.println(s);*/


        /*Student s2 = new Student();
        s2.age = 10;
        test(s2);
        System.out.println(s2.age);*/


        String s = "hello";
        s += "world";
        System.out.println(s);
    }

    //方法可以改变对象的状态,所以正常情况下,字符串的内容是可以修改成功的
    public static void testStringNotVar(String s) {
        s = s + "的弟弟";
    }

    public static void test(Student s) {
        s.age = 100;
    }
}

class Student {
    int age;
}