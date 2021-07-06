package com.cskaoyan.javase.basic._6operator._2comparison;

/**
 * @description: 比较运算符的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
       /* //(10,20)
        int a = 10;
        //if(20 > a > 10)

        //比较运算符如果直接连接基本数据类型的数值比较,就是比较它的数值
        int b = 20;
        System.out.println(a > b);*/

        //浮点数的数值比较基本都是不准确的
        //浮点数的比较要设置一个精度,超过这个精度就直接不比较了
        //浮点数的比较最好不要用等号或者不等号
        //Float.compare(float a,float b)
        double a = 0.1;
        float b = 0.1F;
        double c = 0.1000000000000000000000000000001;
        System.out.println(a == b); //false
        System.out.println(a == c); //true


        //基本数据类型的数值类型可以用比较运算符连接,但是引用数据类型只能用其中的=号或者不等号连接
        //两个引用数据类型之间只能比较是否相等,没有大小的概念
        //引用数据类型比较的是地址

    }
}
