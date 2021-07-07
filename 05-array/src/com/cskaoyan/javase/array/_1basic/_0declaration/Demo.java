package com.cskaoyan.javase.array._1basic._0declaration;

/**
 * @description: 数组的声明
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 数组的声明: 它的作用是告诉编译器,数组的数据类型和数组的名字
 * 数组的数据类型: 是数组当中存储元素的数据类型
 * 数组的名字: 本质上还是一个变量名,遵循小驼峰式的命名,还有很多程序员喜欢给数组命名加一个s,表示复数
 * 语法:
 *      格式一:
 *      数据类型[] 数组名
 *
 *      格式二:
 *      数据类型 数组名[];
 *      格式二是c语言风格的数组声明方式
 *
 */
public class Demo {
    public static void main(String[] args) {
        //方式一:声明一个int类型数组
        int[] arr;
        //方式二: 声明一个double类型数组
        // C-style array declaration of local variable 'arr2'.
        //数组arr2也是一个局部变量
        double arr2[];

        //只有声明的数组是不可用,必须初始化它,才能使用
        //System.out.println(arr);
    }
}
