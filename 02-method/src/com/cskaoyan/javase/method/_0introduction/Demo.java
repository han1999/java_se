package com.cskaoyan.javase.method._0introduction;

/**
 * @description: 方法的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 现在有三个需求：
 *
 * - 编写程序，计算10+20，并输出结果
 * - 编写程序，计算111+222，并输出结果
 * - 编写程序，计算333+444，并输出结果
 *
 * 请分析：
 * - 这个程序有哪些缺点？
 *
 * 这三个需求实际上都是一个需求，都是求两个int整数的和，但是我们写了三次代码
 * 代码是多余的，代码存在冗余
 * 所以自然的，我们希望能够提取出这些重复的代码，然后去复用它们，复用代码，去实现一个相同的功能
 * 在Java当中我们需要这样的一种机制：
 *      - 能够重复实现某种特定功能，解决某一类问题
 *      - 每次重复实现功能时，只需要传入具体的数据
 *      - 实现功能后，可以给出一个结果数据
 *
 * 以上机制就是Java当中的方法（method）
 * 我们以后会经常使用方法，我们把方法的使用，方法的执行叫做方法的调用（invoke）
 * 方法的本质实际上就是为了复用代码
 *
 */
public class Demo {
    public static void main(String[] args) {

        //编写程序，计算10+20，并输出结果
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println(sum);

        //编写程序，计算111+222，并输出结果
        int num3 = 111;
        int num4 = 222;
        int sum2 = num3 + num4;
        System.out.println(sum2);

        //编写程序，计算333+444，并输出结果
        int num5 = 333;
        int num6 = 444;
        int sum3 = num5 + num6;
        System.out.println(sum3);

    }
}
