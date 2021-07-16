package com.cskaoyan.javase.oop3._1interface._4case;

/**
 * @description: 方法的传值问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法的形式参数（formal）在传值的时候
 * **1.基本类型：**对于基本数据类型的方法传参，存在自动类型提升
 *
 * **2.引用类型：** 对于引用数据类型的方法传参，存在自动向上转型
 *
 * - 类：调用方法时需要传入的是该类的对象或者该类的子类对象
 * - 抽象类：调用方法时需要传入的是该抽象类的子类对象
 * - 接口：调用方法时需要传入的是该接口的子类对象
 *
 */
public class Demo {
    public static void main(String[] args) {
        test(10.0F);
        test(new Son());
        test(new IAImpl());
    }

    public static void test(double a) {

    }

    public static void test(Father f) {

    }

    public static void test(IA a) {

    }
}

abstract class Father {
}

class Son extends Father {
}

interface IA {
}

class IAImpl implements IA {
}
