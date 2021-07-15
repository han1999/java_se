package com.cskaoyan.javase.oop2._1extends._11final._3variable._1local;

/**
 * @description: final修饰局部变量
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 局部位置有很多,比如方法中,代码块中,这里我们以方法为例学习局部的final常量
 * 方法的局部位置有两个:
 *      1,方法体中
 *          意味着该变量成为了一个常量,其取值在第一次赋值后就不可变了
 *      2,方法的形参列表中
 *          意味着该形参在方法传入实参后,在方法体不可更改它的取值
 *          但是不意味着方法的实参必须是一个常量,实参只要数据类型符合,不要求变量常量
 *
 */
public class Demo {
    public static void main(String[] args) {
        test(100);
        int a = 100;
        test(a);
    }

    public static void test(final int A){
        //final int A = 10;
        //Variable 'a' might already have been assigned to
        //a = 100;
        //A = 100;
        System.out.println(A + 1);
    }
}
