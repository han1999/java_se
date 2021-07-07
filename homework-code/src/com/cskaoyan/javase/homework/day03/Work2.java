package com.cskaoyan.javase.homework.day03;

/**
 * @description: 嵌套for循环练习题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 打印倒三角形图案
 * ******
 * *****
 * ****
 * ***
 * **
 * *
 *
 */
public class Work2 {
    public static void main(String[] args) {
        //外层控制行数,一共6行,所以外层循环6次
        //不同点就在于列数,列数是逐行递减的
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
