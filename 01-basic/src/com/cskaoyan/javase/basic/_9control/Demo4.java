package com.cskaoyan.javase.basic._9control;

/**
 * @description: 嵌套for循环
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo4 {
    public static void main(String[] args) {
        //外层for控制行数,内层for控制列数
        //打印5行4列的井号
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("#");
            }
            //换行
            System.out.println();
        }
    }
}
