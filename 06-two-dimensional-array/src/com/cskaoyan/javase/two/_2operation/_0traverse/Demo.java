package com.cskaoyan.javase.two._2operation._0traverse;

import java.util.Arrays;

/**
 * @description:
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4}, {6, 6, 6}};
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }

        //arr = null;
        //JDK当中的方法
        System.out.println(Arrays.deepToString(arr));

        traverseTwoDArray2(arr);


    }

    public static void traverseTwoDArray2(int[][] arr) {
        System.out.print("[");
        //一维数组使用for循环，二维数组使用双层for循环去遍历
        //外层for应该遍历二维数组中的一维数组
        for (int i = 0; i < arr.length; i++) {
            //内层for应该遍历每一个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                //这里就是具体元素的值
                if (j == 0 && j != arr[i].length - 1) {
                    //如果是每个数组中的开头元素且不是最后一个元素
                    System.out.print("[" + arr[i][j] + ", ");
                } else if (j == 0) {
                    //是开头也是最后的元素
                    System.out.print("[" + arr[i][j] + "], ");
                } else if ((j == arr[i].length - 1 && i != arr.length - 1)) {
                    //如果是每个一维数组的末尾元素,除最后一个
                    System.out.print(arr[i][j] + "], ");
                } else if ((i == arr.length - 1) && (j == arr[arr.length - 1].length - 1)) {
                    //如果是整个二维数组的最后一个元素
                    System.out.print(arr[i][j] + "]");
                } else {
                    //普通的在中间的元素
                    System.out.print(arr[i][j] + " ,");
                }
            }
        }
        System.out.println("]");
    }
}
