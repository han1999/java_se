package com.cskaoyan.javase.two._1basic._0declaration;

/**
 * @description: 二维数组的声明
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 二维数组的声明是用来告诉编译器它的数据类型,以及它的名字
 * 格式一:
 *      数据类型[][] 数组名;
 * 格式二:
 *      数据类型 数组名[][];
 * 格式三:
 *      数据类型[] 数组名[];
 *
 * 仅有声明是不可用的,还需要初始化
 *
 */
public class Demo {
    public static void main(String[] args) {
        //声明一个int类型二维数组
        int[][] arr;

        // C-style array declaration of local variable 'arr2'.
        double arr2[][];

        String[] arr3[];

        //奇怪的面试题
        int a, b;
        int[] m, n[];

        //System.out.println(arr);
    }
}
