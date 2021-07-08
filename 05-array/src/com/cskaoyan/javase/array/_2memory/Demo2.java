package com.cskaoyan.javase.array._2memory;

/**
 * @description: 数组的动态初始化过程, 用内存模型描述
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 {
    public static void main(String[] args) {
        //动态初始化一个数组
        int[] arr = new int[3];

        //1,直接输出数组名
        //[I@1540e19d,首先[表示这个变量是一个(一维)数组,I表示该数组是int类型的数组,@后面跟的是一个十六进制的数,表示的数组的内存地址
        System.out.println(arr);

        //2,输出数组的长度
        System.out.println(arr.length);

        //3,查看数组元素的取值
        //int类型数组的默认值是0
        System.out.println(arr[0]); //0
        System.out.println(arr[1]); //0
        System.out.println(arr[2]); //0

        //4,修改数组元素的取值
        arr[0] = 666;
        arr[1] = 777;
        arr[2] = 888;
        System.out.println(arr[0]); //666
        System.out.println(arr[1]); //777
        System.out.println(arr[2]); //888

        System.out.println(arr.length); //3
        System.out.println(arr); //这个地址值和上面的arr应该是一样的

    }
}
