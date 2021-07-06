package com.cskaoyan.javase.basic._6operator._3ternary;

/**
 * @description: 三目运算符
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 三目其实就是三元,就是指有三个操作数的运算符
 * 语法:
 *      (布尔表达式)?表达式1:表达式2
 * 注意,表达式往往都是有值的,这是三目运算符的特点,也是它的一个缺点
 * 如果有没有值输出的选择,这个时候,我们可以使用if...else代替三目运算符
 *
 *
 * 三目运算符完全可以用if..else替代
 * 但是如果可以用三目运算符还是尽量使用,因为它更简洁,并且它的效率要比if..else稍微高一点
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*int a = 10;
        System.out.println((a > 0) ? 2 : 1);
        int b = (a > 0) ? 2 : 1;*/

        //需求: 求两个数的最大值
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println(max);

        //需求: 求两个数的最大值,但是要求直接在控制台输出它
        //(a > b) ? System.out.println(a) : b;
        if (a > b) {
            //max = a;
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}

