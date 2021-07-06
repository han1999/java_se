package com.cskaoyan.javase.overload._0introduction;

/**
 * @description: 方法的重载引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 引例
 *
 * - 现在有三个需求：
 *   - 编写程序，计算两个int类型数据之和，并输出结果
 *   - 编写程序，计算两个double类型数据之和，并输出结果
 *   - 编写程序，计算两个long类型数据之和，并输出结果
 *
 * - 请分析：
 *   - 这个程序有哪些缺点？
 *   - 显然这三个方法实现的都是相似的功能，都是求和，只不过是针对的数据类型不同罢了
 *   - 如果它们能够拥有相同的方法名：
 *     - 那么可以方便我们记忆，方便我们去调用这些方法
 *   - 所以在这里，程序有优化的空间
 * - 这个时候我们就需要这样一种机制：
 *   - 针对实现相似的功能的方法，允许它们有相同的名字
 *   - 方便记忆，方便调用
 * - 以上所描述的正是Java的**方法重载**机制（**overload**）
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
    //'sumInt(int, int)' is already defined in 'com.cskaoyan.javase.overload._0introduction.Demo'
    public static int sumInt(int a,int b){
        return a + b;
    }
    public static double sumDouble(double a,double b){
        return a + b;
    }
    public static long sumLong(long a,long b){
        return a + b;
    }
}
