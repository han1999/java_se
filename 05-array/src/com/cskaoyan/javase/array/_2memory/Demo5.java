package com.cskaoyan.javase.array._2memory;

/**
 * @description: 静态初始化数组
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 静态初始化一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。
 *
 * 需要明确,默认初始化具有默认值的过程是不可省略的,后续的其它赋值方式都是在默认值基础上完成赋值的
 *
 */
public class Demo5 {
    public static void main(String[] args) {
        //静态初始化一个double数组
        double[] arr = new double[]{0.1, 0.2, 0.3};
        //[D@1540e19d 表示arr是一个double类型的数组,后面跟的是它的地址值
        System.out.println(arr);

        System.out.println(arr[0]); //0.1
        System.out.println(arr[1]); //0.2
        System.out.println(arr[2]); //0.3

        arr[0] = 1.1;
        arr[1] = 1.2;
        arr[2] = 1.3;
        System.out.println(arr[0]); //1.1
        System.out.println(arr[1]); //1.2
        System.out.println(arr[2]); //1.3

        System.out.println(arr);
    }
}
