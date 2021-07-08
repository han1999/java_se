package com.cskaoyan.javase.array._2memory;

/**
 * @description: 多个引用指向同一个对象
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 定义两个数组
 * - 静态初始化一个数组，输出数组名，元素取值，长度
 * - 然后声明第二个数组，把第一个数组的地址赋值给第二个数组。
 * - 输出第二个数组的数组名，元素取值，长度
 * - 然后给第二个数组赋值，再次输出两个数组的名及元素
 *
 * 当多个引用指向了同一个对象时,相当于一个对象有了多个名字,不管用哪个引用操作该对象
 *      对于其它引用来说,得到的对象就会发生改变
 *
 */
public class Demo7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //声明一个数组
        int[] arr2;
        arr2 = arr;

        arr2[0] = 100;
        System.out.println(arr[0]); //100
        //打印地址值是一样的,因为它们指向了同一个对象
        System.out.println(arr);
        System.out.println(arr2);

    }
}
