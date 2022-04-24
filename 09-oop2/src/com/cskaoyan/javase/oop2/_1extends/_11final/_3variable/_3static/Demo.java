package com.cskaoyan.javase.oop2._1extends._11final._3variable._3static;

/**
 * @description: final修饰静态成员变量
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import javax.print.attribute.standard.NumberUp;

/**
 * 语法: [访问权限修饰符] final static 数据类型 变量名;
 * 以上全局常量需要在类加载的过程中就完成赋值,同样的也不能是默认值
 * 赋值方式:
 *  1,显式赋值
 *  2,静态代码块
 * 以上两种赋值方式可选其一,也必须,也只能选其一
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Student.NUM);
    }
}

class Student {
    static {
        System.out.println("Student");
    }
    static final int NUM = 100;
    static int num2=200;

    //public Student(int NUM){
    //    Student.NUM = NUM;
    //}
    //public static void test(){
    //    NUM = 10;
    //}
}
class  A extends Student{

}
