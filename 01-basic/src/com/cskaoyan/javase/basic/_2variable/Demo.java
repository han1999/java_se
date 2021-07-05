package com.cskaoyan.javase.basic._2variable;

/**
 * @description: 变量的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 该Demo主要探讨怎么使用一个变量
 *
 * 变量的使用分为声明和初始化两个步骤
 * 比如先声明,再初始化一个变量,才能够使用
 *
 * 注意事项:
 * - 注意：Java当中的整数字面值常量，默认当作int处理
 *   - 如果你想要一个整数字面值常量数据类型为long，需要在后缀上加l或L，推荐L
 * - 注意：Java当中的浮点数，默认当作double处理
 *   - 如果你想要一个浮点数字面值常量数据类型为float，需要在后缀上加f或F，推荐F
 * - 变量有效的范围，这个范围通常用{}来界定，同样一个{}不能有同名变量
 *      这种变量称之为局部变量,局部变量指的是处在块中的变量
 * - 变量必须显式初始化，只有声明的变量无法使用它
 *
 * - 一行一个语句可以定义多个同数据类型的变量，用逗号隔开
 *   - 但是一行定义多个变量会影响代码的阅读性，一般不要一行定义多个变量
 * - 浮点型有精度问题，需要特别注意
 *   - 一般来说，开发中不会使用浮点类型进行计算，尤其是财务系统等对数值敏感的地方
 *
 */
public class Demo {
    public static void main(String[] args) {
        //声明一个int类型变量
        int a;

        //仅仅声明的变量是不能使用的
        //Variable 'a' might not have been initialized
        //System.out.println(a);

        //初始化变量a
        a = 10;
        System.out.println(a);
        //声明和初始化普遍应该连在一起写
        int b = 100;
        System.out.println(b);

        //声明初始化一个long类型变量,应该在数字后面加L(一定要加大写的L)
        //'long' literal '100l' ends with lowercase 'l'
        long c = 100L;


        double d = 0.1;
        float e = 0.1F;

        int a1 = 10, a2 = 10, a3;

    }
}
