package com.cskaoyan.javase.recursion._1basic._1deeptest;

/**
 * @description: 测试递归深度
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        sum(0);
    }

    //这是一个异常处理的代码try...catch
    public static int sum(int a) {
        //int b = 1000;
        try {
            //try代码块当中存放那些可能会产生异常的代码
            return a + sum(a - 1);
        } catch (StackOverflowError error) {
            //如果try中代码产生异常,并且恰好能够匹配上,就会执行catch代码块中的代码,并且程序不会停止
            System.out.println("sum方法" + a + "层");
        }
        return 0;
    }
}
