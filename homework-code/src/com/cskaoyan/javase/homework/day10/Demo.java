package com.cskaoyan.javase.homework.day10;

/**
 * @description: 测试全局常量
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 访问类的基本数据类型全局常量不会触发该类完整类加载
 * 访问引用数据类型全局常量,如果是new对象方式创建的对象,会触发完整类加载
 *      如果是String,使用字面值常量赋值的方式,也不会触发完整的类加载
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Animal.D);
    }
}
class Animal{
    static {
        System.out.println("Animal");
    }
    static final String D = "str";
}
