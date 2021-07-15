package com.cskaoyan.javase.oop3._0abstract._2notice;

/**
 * @description: abstract关键字使用注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *abstract关键字使用上的注意点（notice）
 * 不能用来修饰构造器、属性、代码块等结构，只用来修饰class和方法
 * 不能用来修饰final类
 * 无法被继承的类
 * 不能用来修饰私有方法、静态方法 、final方法
 * 无法被重写的方法
 * 一个抽象类中可以没有抽象方法，但是意义不是很大
 *      一般来说，抽象类当中就应该有抽象方法
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
}
//Illegal combination of modifiers: 'final' and 'abstract'
abstract  class A{

}