package com.cskaoyan.javase.oop2._0extends._0introduction._0old;

/**
 * @description: 继承的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 根据我们刚刚学过的知识，完成如下练习：
 * - 分别定义一个表示人和学生的类
 *   - 人类：有姓名属性，以及吃饭这个行为
 *   - 学生类：有姓名，学号两个属性，同时有吃饭，学习两种行为
 *   - 教师类：有姓名，教师号两个属性，同时有吃饭，教学两种行为
 * - 代码有什么问题？
 *      1,类的成员代码是有冗余的,比如eat方法,name属性等
 *      2,代码重复没有被复用,导致程序的可维护性下降
 *
 * 为了解决上述两个问题,我们就引入了继承的概念
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Person{
    String name;
    public void eat(){
        System.out.println("我要吃饭!");
    }
}
class Student{
    String name;
    int stuId;

    public void eat(){
        System.out.println("我要吃饭!");
    }
    public void study(){
        System.out.println("我要学习!");
    }
}
class Teacher{
    String name;
    int teacherId;

    public void eat(){
        System.out.println("我要吃饭!");
    }
    public void teach(){
        System.out.println("我能上课!");
    }
}
