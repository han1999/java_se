package com.cskaoyan.javase.array._4operation._0traverse;

/**
 * @description: 数组遍历的常用方式
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;

/**
 * 1,JDK当中提供的数组的遍历的方法
 *      Arrays.toString(各自数据类型的数组)
 * 该方法的返回值是一个字符串,该字符串把数组,用[xxxx]的形式表示出来
 * 源码当中的方法都是久经迭代的,经过很多次修改的,一般不会有bug
 * 我们在后面的学习工作中,如果有仅仅是看一下数组的内容的需求,推荐使用该方法
 *
 * 2,增强for循环,也叫foreach
 * for(数据类型 变量名 : 数组名/集合名){
 *
 * }
 * 冒号后面的数组名或者集合名表示要遍历的数组或者集合
 * 冒号前面的数据类型 变量名 表示被遍历数组或者集合当中每一个元素
 *
 * for循环和增强for循环的区别:
 *      1,增强for循环没有下标存在,如果你想要在循环中使用数组的下标,显然必须要用for循环
 *      2,增强for语法更简洁,用于遍历数组更加快捷,运行效率也更高
 *      3,增强for还是foreach,它们都有个外号叫做"迭代器",它们是专门用来遍历查看一个容器的
 *          它是不能在遍历中修改元素的取值
 *  综上,foreach是比较好的用来遍历查看数组元素取值的方式
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3};
        //arr = null;
        arr = new int[]{};
        System.out.println(Arrays.toString(arr));*/

        //快捷键: 使用for循环快速打印数组 数组名.fori
        /*for (int i = 0; i < arr.length; i++) {
        }*/
        int[] arr = {1, 2, 3};
        //增强for快捷键 iter
        for (int a : arr) {
            a = 100;
        }
        System.out.println(Arrays.toString(arr));

    }
}
