package com.cskaoyan.javase.basic._10key;

/**
 * @description: 小试牛刀
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 对于上述补全代码，我想实现
 *   - 控制台输出2次，"我热爱学习Java"
 *   - 控制台输出7次，"我热爱学习Java"
 *   - 控制台输出13次，我热爱Java
 */
public class Demo3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                //在此处填写代码
                //continue;
                System.out.println("我热爱学习Java");
            }
            System.out.println("我热爱学习Java");
        }
    }
}
