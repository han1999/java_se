package com.cskaoyan.javase.basic._7scanner;

import java.util.Scanner;

/**
 * @description: 测试next方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*    System.out.println("请输入int数值：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);*/

        System.out.println("请输入字符串：");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
