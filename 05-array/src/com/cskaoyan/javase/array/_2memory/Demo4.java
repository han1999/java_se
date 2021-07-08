package com.cskaoyan.javase.array._2memory;

/**
 * @description: 初学者经典问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 既然引用数据类型具有默认初始化(具有默认值的过程)，那为什么声明一个数组后不能立刻使用呢？
 * 引用数据类型的默认初始化过程针对的是堆上的对象,对象当中的元素具有默认值
 * 但是栈帧中的引用是没有默认值的
 * 所以声明一个数组引用之后,必须显式的初始化
 *
 * 而对于数组对象而言,其中的元素具有默认值,你只需要指出数组的长度即可,无需指出数组元素的取值,它们具有默认值
 *
 */
public class Demo4 {
    public static void main(String[] args) {

    }
}
