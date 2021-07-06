package com.cskaoyan.javase.basic._6operator._0arithmetic;

/**
 * @description: 算术运算符---自增自减
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 自增自减放在操作数的前面,先自增自减,然后再参与运算或者赋值
 *
 */
public class Demo {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 10;
        a = b++; //c = 10,b = 11,a = 10
        c = --a; //b 11, a = 9, c = 9
        b = ++a; //c = 9,a = 10, b = 10
        a = c--; //b = 10, c = 8, a = 9
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int x = 4;
        int y = (x++) + (++x) + (x * 10); //4 + 6 + 60 = 70
        System.out.println(y);

        //开发中自增自减往往只用在for循环当中
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }

    }
}
