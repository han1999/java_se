package com.cskaoyan.javase.oop2._1extends._11final._3variable._4notice;

/**
 * @description: final的注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        final Student s = new Student(18);
        s.age = 99;
        //s = new Student();

        //final能不能修饰匿名对象?
        //final new Student();
    }
}

class Student {
    int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }

    public int test(final int a){
        //return a++;
        return a+1;
    }

}
