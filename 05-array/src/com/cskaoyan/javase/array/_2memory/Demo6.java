package com.cskaoyan.javase.array._2memory;

/**
 * @description: 两个数组
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 分别静态、动态初始化两个数组，分别输出数组名及元素
 * - 然后分别给数组中的元素赋值，分别再次输出数组名及元素
 *
 * 在java当中,只要是使用new关键字,那么就一定会在堆上创建出一个新的对象
 * 不同的对象之间是相互隔离的,不会互相影响
 *
 */
public class Demo6 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr2 = {1, 2, 3};

        System.out.println(arr);
        System.out.println(arr2);

        arr[0] = 100;
        System.out.println(arr[0]); //100
        System.out.println(arr2[0]); //1
    }
}
