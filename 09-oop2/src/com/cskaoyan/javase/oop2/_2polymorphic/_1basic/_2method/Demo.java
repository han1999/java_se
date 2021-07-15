package com.cskaoyan.javase.oop2._2polymorphic._1basic._2method;

/**
 * @description: 多态现象中的方法的访问特征
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法是具有多态性的
 * 方法的访问范围是由引用的数据类型来决定的,调用结果是由对象的数据类型的来决定的
 * 同样使用一句话总结它的访问特征:
 *      编译时左边,运行时看右边
 *
 * > 解释方法的多态性，一个很贴切的例子
 * - 我家中的一台电视机，贼贵，功能很丰富
 * - 对于电视机而言，我们只能使用，遥控器去操作电视机
 * - 这也就是说，只有遥控器上提供的功能我们才能使用
 *   - 即便电视机本身功能多么强大，如果遥控器上只有音量键，那我们也毫无办法
 *   - 遥控器有啥功能，决定了我们能使用的功能
 * - 即使电视机本身功能再丰富，没有遥控器的支持，我们啥也用不了
 *
 * > 把这个例子转换到Java程序中
 *
 * - 电视机就相当于对象本身，而遥控器就是引用变量
 * - 实际对象的功能再强大，如果引用中没有这个功能，那也无法调用该功能
 * - 对象的行为，受限于引用变量，和对象本身没有直接关系
 * - 对象的引用类型决定了可以访问对象的成员范围
 * - 编译时看左边，运行时看右边
 *
 */
public class Demo {
    public static void main(String[] args) {
        A a = new B();
        a.test();
    }
}

class A {
    public void test() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void test() {
        System.out.println("B");
    }
}
