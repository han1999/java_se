package com.cskaoyan.javase.basic._9control;

/**
 * @description: 块和局部变量的概念
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * class 类名后面跟的大括号称之为类体,它们不应该算成代码块
 * 其他的像方法体,像类体中的大括号等等都是属于代码块
 *
 * 代码块最重要的作用是限制其中变量的作用域,块中的变量被称之为局部变量
 *  块中代码的位置,被称之局部位置
 *
 *  代码块是可以嵌套的
 *
 */
public class Demo {
    {
        {
            {
            {
                int a=10;
            }
            }
        }
    }
    int a=30;
    public static void main(String[] args) {
        int a = 10;
        System.out.println();
        {
            //Variable 'a' is already defined in the scope
            //int a  = 20;
        }

    }
}
