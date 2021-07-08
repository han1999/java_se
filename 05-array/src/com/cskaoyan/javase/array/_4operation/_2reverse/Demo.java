package com.cskaoyan.javase.array._4operation._2reverse;

/**
 * @description: 数组的逆置
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;

/**
 * 数组的逆置:
 *      相当于把数组翻转过来,第一个元素成为最后一个,最后一个元素成为第一个元素
 * 假设一个数组arr
 *      arr[0] <---> arr[arr.length-1]
 *      arr[1] <---> arr[arr.length-2]
 *      ...
 *      arr[i] <---> arr[arr.length - 1 - i]
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("数组逆置前: " + Arrays.toString(arr));
        reverse2(arr);
        System.out.println("数组逆置后: " + Arrays.toString(arr));
    }

    //数组的逆置
    public static void reverse(int[] arr) {
        //需要使用下标操作数组,所以必须用普通for遍历数组
        //为了避免交换后,又交换回去,所以只遍历一半数组
        for (int i = 0; i < arr.length / 2; i++) {
            //在java当中交换两个变量的取值,需要一个中间变量temp
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //数组的逆置方式二
    //for循环当中分号隔开的都是一条语句,可以定义多个变量,可以写多个表达式
    public static void reverse2(int[] arr) {
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            //交换两个元素
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
