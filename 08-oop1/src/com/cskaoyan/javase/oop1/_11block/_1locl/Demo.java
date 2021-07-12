package com.cskaoyan.javase.oop1._11block._1locl;

/**
 * @description: 局部代码块
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 局部代码块: 声明在局部位置(包括方法和其它代码块的局部位置)的代码块就是局部代码块
 * 声明的方式: {}
 * 局部代码块的作用:
 *      1,代码块限制了局部变量的作用域,从理论角度上来说,当代码执行完毕该作用域,该作用域内的变量就被销毁了
 *          及早释放，提高内存利用率
 *      2,可以允许定义同名的局部变量
 *
 * 总结: 早期JVM的效率执行很低,所以为了提升一点点JVM性能,程序员绞尽脑汁做出了现在看来不太能理解的一些操作
 *      比如说局部代码块
 *      使用局部代码块会显著的提升代码的阅读难度,所以在jvm性能已经比较良好的现在,不建议使用局部代码块
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //int a = 10;
        //局部代码块
        {
            int a = 10;
            {
                //Variable 'a' is already defined in the scope
                //int a = 10;
                int b = 20;
                {
                    int c = 20;
                }
            }
        }
        int a = 10;
    }
}
