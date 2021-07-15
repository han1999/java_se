package com.cskaoyan.javase.homework.day09.extend;

/**
 * @description: 扩展1
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {

    }
}

class Student {
    int age;
    String name;
    //集合类的源代码中，会出现用自身的静态成员变量作为this()的参数
    static int var = 100;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public Student(String name) {
        //Cannot reference 'Student.var' before supertype constructor has been called
        this(var); //这里如果能使用var去赋值，它的值永远只有默认值，就是0
        this.name = name;
    }
}