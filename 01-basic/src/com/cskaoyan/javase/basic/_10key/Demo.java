package com.cskaoyan.javase.basic._10key;

/**
 * @description: break关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * break: 中断
 * 它表示结束当前循环,所以他可以在循环中使用
 * 它还可以在switch中使用,表示结束switch
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("hello world!");
        }*/

        //内层for循环控制列数,结束内层for会导致列数变少,但是外层for不受break影响,它仍然是5行
        /*for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2){
                    break;
                }
                System.out.print("$");
            }
            System.out.println();
        }*/

        //使用标签label来控制break结束的循环层次,这个时候需要提前给外层的for循环加上标签
        //语法: 在for的头上加一个标识符: 然后在break后面加对应的标签
        //这种用法有点类似于goto,开发中很少使用
        tag1:
        for (int i = 0; i < 5; i++) {
            tag2:
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    break tag1;
                }
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
