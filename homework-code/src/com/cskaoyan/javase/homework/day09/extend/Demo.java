package com.cskaoyan.javase.homework.day09.extend;

/**
 * @description: 扩展1
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
}
class  Student{
    int age;
    String name;
    int var;
    public Student(){
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name){
        //this(var);
        this.name = name;
    }
}