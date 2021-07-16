package com.cskaoyan.javase.oop3._1interface._4case;

/**
 * @description: 链式调用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 链式调用的前提是前面的方法调用 返回的是一个对象,于是可以在后面继续调用方法
 * 链式调用的优点是简化代码,并且全程使用匿名对象
 * 链式调用的缺点是过于简单的代码可读性差,所以不建议在开发中写出过长的链式调用
 *      如果有过长的链式调用,可以考虑掐一半
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = s.getStudent();
        Teacher t = s2.getTeacher();
        t.show();

        //以上过程全部可以合起来
        new Student().getStudent().getTeacher().show();
    }
}
class Student{

    public Student getStudent(){
        return new Student();
    }

    public Teacher getTeacher(){
        return new Teacher();
    }
}
class Teacher{
    public void show(){
        System.out.println("秀一波~~~");
    }
}