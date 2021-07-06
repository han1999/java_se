package com.cskaoyan.javase.basic._10key;

/**
 * @description: continue关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * continue: 继续
 * continue只能在循环中使用,表示跳出/跳过当前次循环,而进行下一次循环
 *
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("你好中国!");
        }
    }
}
