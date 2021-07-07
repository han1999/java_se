package com.cskaoyan.javase.overload._0introduction;

/**
 * @description: 全新的版本 用方法重载改造这个案例
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 现在有三个需求：
 *   - 编写程序，计算两个int类型数据之和，并输出结果
 *   - 编写程序，计算两个double类型数据之和，并输出结果
 *   - 编写程序，计算两个long类型数据之和，并输出结果
 *
 * 方法重载指的是在java当中,允许一个类中定义多个同名方法的现象
 * 方法的重载的条件:
 *      在方法名相同的前提下,要求方法的签名不同
 *      也就是说它们的形参列表必须不同
 * 什么叫形参列表不同?
 *      1,数量不同
 *      2,数据类型不同
 *      3,如果数量相同,数据类型也相同,它们的顺序不同
 *
 * 以上三条就是方法重载的条件,也是唯三的条件,除此之外,其余条件都不能构成方法重载
 * 包括：
 * - 形参的名字不同
 * - 返回值类型不同
 * - 修饰符列表不同
 * 等等条件都不能构成方法的重载
 *
 * 思考：
 *      为什么方法的重载要求它形参不同，并且只有三种方式呢？
 *      方法的调用是怎么判断的？
 *      方法调用时，是根据传入的实参的数据类型来决定调用的是哪个重载的同名方法
 *      正因为如此，所以构成方法重载必须要求形参列表不同，并且只有三种方式
 *
 */
public class NewDemo {
    public static void main(String[] args) {

    }

    public static void test() {

    }

  /*  public static int test() {
        return 1;
    }*/

    public static void test(int a) {
    }
    /*
    public static void test(int b) {
    }
    */

    public static void test(long a) {

    }

    public static void test(long a, int b) {

    }

    public static void test(int a, long b) {

    }


    /*public static void test(){
    }*/
}
