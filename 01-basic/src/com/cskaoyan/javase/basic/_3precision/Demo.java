package com.cskaoyan.javase.basic._3precision;

/**
 * @description: 浮点数的精度问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 10 / 3 = 3.3,3的无限循环小数
 * 二进制在表示十进制小数是也是存在二进制无限循环的
 * 比如说0.1这个小数
 * 怎么把十进制小数转换成二进制小数?
 * 0.1 * 2 = 0.2 ---- 0
 * 0.2 * 2 = 0.4 ---- 0
 * 0.4 * 2 = 0.8 ---- 0
 * 0.8 * 2 = 1.6 ---- 1
 * 0.6 * 2 = 1.2 ---- 1
 * 0.2 * 4 = 0.8 ---- 0
 * ....
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        float a = 10 / 3.0F;
        System.out.println(a);

        double b = 10 / 3.0;
        System.out.println(b);

        float a1 = 1 - 0.9F;
        double b1 = 1 - 0.9;
        System.out.println(a1);
        System.out.println(b1);

        float a2 = 0.1F;
        System.out.println(a2);

    }
}
