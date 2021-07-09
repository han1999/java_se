package com.cskaoyan.javase.two._2operation._1yanghui;

/**
 * @description: 打印杨辉三角
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;

/**
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ...
 *
 * 杨辉三角图案的规律：
 *      1，每一行的开头元素和结尾的元素都是1
 *      2，每一行的除开首尾元素，都是它的上一行元素加上 上一行的前一个元素得来的
 *
 * 我们可以把杨辉三角当中，每一行的元素当成一个一维数组，整个杨辉三角的图案组合在一起就是一个二维数组
 * 所以打印杨辉三角就是打印一个二维数组
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        printYangHui(10);
    }

    //n表示杨辉三角的行数，就是二维数组的长度，就是二维数组当中一维数组的个数
    public static void printYangHui(int n) {
        //怎么获取一个二维数组? 应该选择动态初始化当中仅指出二维数组长度的方式,因为一维数组的长度是不一的
        int[][] yangHui = new int[n][];

        //该种方式获取的二维数组实际上仍然是不可用的,需要给其中的每一个一维数组进行一次新的初始化
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
        }
        System.out.println(Arrays.deepToString(yangHui));


        //以上代码就得到了一个二维数组
        //于是开始给二维数组中的元素赋值
        //1，每一行的开头元素和结尾的元素都是1
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                yangHui[i][0] = 1;
                yangHui[i][yangHui[i].length - 1] = 1;
            }
        }
        System.out.println(Arrays.deepToString(yangHui));

        //开始给杨辉三角中的中间元素赋值
        //2，每一行的除开首尾元素，都是它的上一行元素加上一行的前一个元素得来的
        //arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
        for (int i = 2; i < yangHui.length; i++) {
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
            }
        }
        System.out.println(Arrays.deepToString(yangHui));

        //至此,杨辉三角的二维数组数据已经完成了,那么就可以打印它了,要按照杨辉三角的格式打印
        for (int[] ints : yangHui) {
            for (int element : ints) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }

    }
}
