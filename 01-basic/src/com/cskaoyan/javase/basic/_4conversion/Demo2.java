package com.cskaoyan.javase.basic._4conversion;

/**
 * @description: 基本数据类型互相进行运算时，表达式的类型
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 多个不同类型的基本数据类型参与了运算，那么它的结果是什么数据类型呢？
 * 它的表达式结果的数据类型应该是表达式中范围最大的那个数据类型
 * 特殊的：
 *      1，char类型也可以参与加减乘除的运算，参与运算的是它的编码值
 *      2，当byte、short、char类型之间任意两个参与运算，它们的结果都是int类型，而不是提升到最大取值范围的
 *
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        //int a = 10;
        //long b = 20;
        //long c = a + b;
        //double d = 0.1;
        //double e = d + a + c;
        //System.out.println(a + b);

        char a = 'a';
        int b = 0;
        System.out.println(a);
        System.out.println(a + b);

    }
}
