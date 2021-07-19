package com.cskaoyan.javase.object._3equals;

/**
 * @description: BigDecimal的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.math.BigDecimal;

/**
 * BigDecimal可以用来表示任意精度的十进制数,包括小数,它没有double/float那种精度的限制
 *      所以它经常在财务系统或者需要精确的浮点数运算时使用
 * 它是一个类,是一个引用数据类型,使用它,需要先创建它的对象
 * 它最常用的一个构造方法:
 * BigDecimal(String val)
 *           将 BigDecimal 的字符串表示形式转换为 BigDecimal。
 *然后查找其中的运算的成员方法,调用方法去做运算
 *
 * 最后: 这个类有专属的使用场景,建议大家在具体要使用的时候再学习
 *      像API没必要记住,也记不住
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 0.9;
        System.out.println(a - b);

        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("0.9");
        //调用方法做运算
        System.out.println(b1.subtract(b2));
    }
}
