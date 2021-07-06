package com.cskaoyan.javase.method._2basic;

/**
 * @description: 方法的实参和形参数据类型的兼容问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法调用时传入的实参数据类型并不要求和形参数据类型保持完全一致
 * 因为基本数据类型存在自动类型转换,所以当形参是一个大取值范围的数据类型,可以给实参传入小取值范围的数据类型
 * 因为发生了自动类型转换
 *
 * 思考:
 *      方法的返回值类型和方法体中的实际返回值的数据类型要求完全一致吗?
 *      不要求,同样和形参实参一样,只要求兼容,对于基本数据类型而言,可以发生类型的自动转换
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(test(10L));
        System.out.println(test(10));
        byte a = 10;
        System.out.println(test(a));

        System.out.println(test2(2F));
    }

    public static int test(long a) {
        int b  = 1;
        byte c = 10;
        return c;
    }

    public static int test2(double a) {
        return 1;
    }

    //引用数据类型要挖个坑,等面向对象,继承时再讲
    /*public static int test3(String a) {
        return 1;
    }*/

    public static double test3(){
        return 1.0;
    }
}
