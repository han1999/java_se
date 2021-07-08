package com.cskaoyan.javase.array._3exception._1arrayindex;

/**
 * @description: 数组下标越界异常
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 任何一个数组的下标(索引)都是有限的,它一定从0开始,最大值是数组长度-1
 * 一旦访问了超过这个范围的下标,程序就会抛出异常,报错,终止程序执行
 *
 * ArrayIndexOutOfBoundsException: 描述的是访问了一个不合法的数组下标的异常
 *
 * 数组下标越界一般不会写出这个异常,都是在循环中,因为错判了循环变量的范围,导致了错误的下标
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        //Array index is out of bounds
        //System.out.println(arr[-1]);
        for (int i = 0; i < 5; i++) {
            //这里显然会越界
            System.out.println(arr[i]);
        }
        System.out.println("hello world");
    }
}
