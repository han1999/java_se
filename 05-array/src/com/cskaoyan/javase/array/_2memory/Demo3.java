package com.cskaoyan.javase.array._2memory;

/**
 * @description: 对象当中元素的默认值
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo3 {
    public static void main(String[] args) {
        byte[] arr = new byte[3];
        System.out.println(arr[0]);

        long[] arr2 = new long[3];
        System.out.println(arr2[0]);

        float[] arr3 = new float[3];
        System.out.println(arr3[0]);

        char[] arr4 = new char[3];
        System.out.println(arr4[0]);
        System.out.println("hello");

        boolean[] arr5 = new boolean[3];
        System.out.println(arr5[0]);

        String[] arr6 = new String[3];
        System.out.println(arr6[0]);


    }
}
