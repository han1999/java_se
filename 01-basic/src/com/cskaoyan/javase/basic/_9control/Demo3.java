package com.cskaoyan.javase.basic._9control;

/**
 * @description: 循环结构
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Scanner;

/**
 * for(初始化语句 ; 条件判断语句(布尔表达式); 循环控制语句) {
 *   //循环体语句
 * }
 * 初始化语句可以看成是初始化一个循环的控制变量
 * 在for循环中定义的循环控制变量是属于for循环自己的局部变量
 *
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i += 2) {
            System.out.println("hello world!");
        }*/
        //for (; ; ) {
        //    //死循环
        //}
        //和if一样,如果循环体语句只有一条,那么大括号可以省略
        //int i = 10;
        for (int i = 0; i < 5; i++) System.out.println("你好");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }


        //珠峰的高度是8848m，假设有一张足够大可折叠的纸张，初始厚度是0.01m，
        //- 求解这张纸折叠多少次，纸张的厚度开始超过珠峰？
        double thickness = 0.01; //初始厚度
        //需要一个计数器
        int count = 0;
        while (thickness < 8848) {
            thickness *= 2;
            count++;
        }
        System.out.println(count);

        //完全没有机会执行的for循环
        //for (int i = 0; i < -1; i++) {
        //}

        //for循环的快捷键 fori
        for (int i = 0; i < 10; i++) {
        }

        int a = 10;
        do {
            System.out.println("我好生气!");
        } while (a < 0);

        //死循环在测试时往往用途还是有的
        //Scanner sc = new Scanner(System.in);
        //while (true){
        //    String str = sc.nextLine();
        //    System.out.println(str);
        //}

    }
}
