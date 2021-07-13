package com.cskaoyan.javase.method._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Scanner;

/**
 * > 小试牛刀
 * - 键盘录入两个值，求最大值
 * - 定义一个方法，求圆的面积
 *   - 方法参数:半径 (radius)
 *   - 圆周率:3.14
 * - 定义一个计算器（Calculator）它的功能有
 *   - 加，减，乘，除
 *   - 求平方
 *   - 求a的n次方
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //测试getMaxValueByScanner方法
        //Scanner sc = _1new Scanner(System.in);
        //System.out.println("输入的最大值是: " + getMaxValueByScanner(sc));

        //测试求圆的面积
        System.out.println(getRoundArea(2));
    }

    //根据键盘录入,求最大值
    //(Scanner sc)表示需要传入一个Scanner对象
    public static int getMaxValueByScanner(Scanner sc) {
        System.out.println("请输入一个数字: ");
        int num1 = sc.nextInt();
        System.out.println("请再输入一个数字: ");
        int num2 = sc.nextInt();
        return (num1 > num2) ? num1 : num2;
    }

    //- 定义一个方法，求圆的面积
    // *   - 方法参数:半径 (radius)
    // *   - 圆周率:3.14
    public static double getRoundArea(double radius) {
        //PI作为一个常量,在Java当中可以用Math.PI直接获取它
        //System.out.println(Math.PI);
        return 3.14 * radius * radius;
    }
}
