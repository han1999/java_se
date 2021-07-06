package com.cskaoyan.javase.basic._10key;

/**
 * @description: return关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * return: 返回
 * 它在方法中使用,表示立刻马上结束当前方法
 *
 * if的执行是具有不确定性的,到底if被不被执行需要程序执行起来才知道,编译器在编译时期是无法判断是否执行的
 * 同样for循环的执行也具有不确定性,需要执行程序才能够确定,编译器无法确定
 * 所以在这些情况下,编译器不会检查其中的return这种结束方法的关键字
 *
 *
 * 对于以上是否执行与不执行,不要死记硬背,写代码都是逐步改正的
 * 一旦发生和if,for相关的问题,可以考虑执行与不执行的可能性问题
 *
 */
public class Demo4 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 5; i++) {
            if (i == 3) {
                return;
                //break;
                //Unreachable statement
                //System.out.println("");
            }
            System.out.println("你好我的世界!");
            return;
        }
        System.out.println("666");*/

        //怎么让不确定的for循环.if判断变成编译器能够认可的绝对执行呢??
        //循环需要是死循环
        //for (;;) {
        //return;
        //}
        //while (true) {
        //}
        //System.out.println();
        //if需要满足所有的可能性,if..else
        int a = 10;
        //if (a > 0){
        //    return;
        //}else {
        //    return;
        //}
        //if (true) {
        //    return;
        //} else {
        //    return;
        //}
        //System.out.println();

        int b = 0;
        if (a > 0) {
            b = 10;
        }
        //Variable 'b' might not have been initialized
        System.out.println(b);

    }
}
