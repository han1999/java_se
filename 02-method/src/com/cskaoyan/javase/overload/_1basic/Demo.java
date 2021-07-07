package com.cskaoyan.javase.overload._1basic;

/**
 * @description: 一堆重载方法的调用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 当一个类中有很多个重载的方法，在调用时是根据它的形参的数据类型来决定调用哪个方法
 *
 * 当多个方法都能匹配时(因为实际参数能够类型自动转换)
 * 优先选择那个能够最近匹配的方法
 * 这种原则在java当中非常常见,是java的设计原则之一
 * 就是"就近原则"
 *
 * 尤其注意不要在重载方法中给出模糊的定义:比如两个方法,两个参数都要提升,那么就无法得知调用哪个方法
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //test(10);
        //Ambiguous method call: both 'Demo.test(double, int)' and 'Demo.test(int, double)' match
        //test(10, 10);
        test(10.0,10);
    }

    public static void test() {
    }

    //public static void test(int a) {
    //}

    public static void test(long a) {
    }

    public static void test(double a) {
    }

    public static void test(float a) {
    }

    //public static void test(int a, int b) {
    //}
    //
    //public static void test(int a, long b) {
    //}

    public static void test(double a, int b) {
    }

    public static void test(int a, double b) {
    }

    //public static void test(int a, float b) {
    //}
}
