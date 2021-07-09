package com.cskaoyan.javase.two._1basic._2use;

/**
 * @description: 二维数组的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {7, 7}, {3}};
        //[[I@1540e19d [[表示它是一个二维数组
        System.out.println(arr);

        System.out.println(arr.length);

        //获取二维数组中一维数组的长度
        //arr[0].length
        //遍历一个二维数组,得到的是其中的每一个一维数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length);
        }

        //获取某个位置的元素
        System.out.println(arr[0][1]);

        //遍历整个二维数组,需要使用嵌套for循环
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        //二维数组本质也是一维数组,所以它也会数组下表越界,也会产生空指针异常
        //System.out.println(arr[2][8]);
        int[][] arr2 = new int[3][];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {

            }
        }



    }
}
