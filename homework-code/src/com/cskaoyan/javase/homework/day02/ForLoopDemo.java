package com.cskaoyan.javase.homework.day02;

/**
 * @description: for循环的小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 使用for循环遍历100以内的奇数，并计算所有的奇数的和并输出，要求使用方法
 *
 */
public class ForLoopDemo {
    public static void main(String[] args) {
        sumOddNum();
        /*//求和之前，可以声明一个结果值，初始值为0
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            //取余2不是0，说明是奇数
            if (i % 2 != 0) {
                //求和
                result += i;
            }
        }
        System.out.println(result);*/
    }

    public static int sumOddNum() {
        //求和之前，可以声明一个结果值，初始值为0
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            //取余2不是0，说明是奇数
            if (i % 2 != 0) {
                //求和
                result += i;
            }
            int a = 10;

        }
        //System.out.println(result);
        return result;
    }
}
