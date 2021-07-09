package com.cskaoyan.javase.oop1._3compare;

/**
 * @description: 局部变量和成员变量的比较
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import javafx.geometry.VPos;

/**
 * > 局部变量和成员变量的比较，我们从以下五个方面去比较：
 *
 * - 在类中定义的位置不同
 * 局部变量: 定义在局部位置,局部位置一般指的是方法当中或者一些代码块中
 * 成员变量: 定义在成员位置,类体中局部位置外的区域
 *
 * - 在内存中的位置不同
 * 局部变量: 方法栈帧中
 * 成员变量: 堆上的对象中
 *
 * - 生命周期不同
 * 局部变量: 方法"同生共死"
 * 成员变量: 对象"同生共死",但实际上只要对象成为垃圾,该成员变量就无法访问到
 *
 * - 初始化值不同
 * 局部变量: 没有默认值
 * 成员变量: 有默认值
 *
 * - 作用范围
 * 局部变量: 仅在方法或者包含局部变量的那个作用域内部,出了这个作用域,就无法访问到了
 * 成员变量: 成员变量在整个类中都可以访问,但是只能够在普通成员方法(不加static)中直接访问
 *              加了static的方法,无法直接访问类中的成员变量
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
}
class Person{
    String name;

    public void test(){
        System.out.println(name);
    }

    public static void test2(){
        //System.out.println(name);
    }
}
