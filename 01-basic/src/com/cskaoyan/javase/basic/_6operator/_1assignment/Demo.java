package com.cskaoyan.javase.basic._6operator._1assignment;

/**
 * @description: 赋值运算符的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        //赋值运算符 =
        //扩展的赋值运算符 +=
        int a = 10;
        int b = 20;
        int c = 30;
        c += b;
        c = c + b;

        //扩展的赋值运算符除了写法较为简单外,还隐含了强制类型转换
        //short s = 1;
        //s = s + 1;

        byte s1 = 127;
        s1 += 1;
        System.out.println(s1);

        //**赋值运算符构成的赋值表达式，仍然有结果，其结果是赋值表达式右边要赋给左边变量的值**
        int num1 = 10;
        int num2 = 20;
        int num3;
        System.out.println(num3 = num1 + num2);

        //后面经常看到这种写法:
        if ((num3 = (num1 + num2)) > 0) {
            //Condition '(num3 = (num1 + num2)) > 0' is always 'true'
        }
    }
}
