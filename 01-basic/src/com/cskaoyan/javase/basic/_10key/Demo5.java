package com.cskaoyan.javase.basic._10key;

/**
 * @description: 小试牛刀
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

//- 在填入的位置分别填入break，continue，return
//- 说一说程序有什么执行结果
public class Demo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("我喜欢学习Java!");
                //填入
                //break;
                //continue;
                return;
            }
            System.out.println(i);
        }
        System.out.println("我喜欢学习C++!");
    }
}
