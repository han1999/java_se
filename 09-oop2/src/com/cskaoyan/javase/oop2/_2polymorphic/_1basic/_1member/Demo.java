package com.cskaoyan.javase.oop2._2polymorphic._1basic._1member;

/**
 * @description: 多态现象中的成员变量访问特征
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 成员变量的访问是没有多态现象的
 * 它的访问范围和访问的结果都是由引用的数据类型来决定的
 * 所以我们总结了一句它访问特征的话:
 *      编译时(访问范围)看左边,运行时(访问结果)还看左边
 *
 * > 解释成员变量不具有多态性，一个例子
 * - 成员变量描述的是对象的“外貌特征”
 * - 把子类对象赋值给父类类型的引用，就相当于给子类对象披上了一个父类类型马甲
 * - 外貌特征上来看，这时候的子类就变成了父类
 * - 编译时看左边，运行时看左边
 *
 */
public class Demo {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.a);
    }
}

class Father {
    int a = 10;
}

class Son extends Father {
    int a = 100;
}
