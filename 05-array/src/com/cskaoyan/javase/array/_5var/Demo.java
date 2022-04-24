package com.cskaoyan.javase.array._5var;

/**
 * @description: 可变参数
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 引例,需求:
 *      计算不确定个数的int数的和
 *
 * 如何实现?
 *      我们可以用数组来存放要加和的所有int数,然后在方法中遍历求和
 *
 * 使用数组作为形参,然后在调用方法时,新建数组传入实参,这种方式是可以实现需求的
 * 但是还是有点不够简洁
 * 我希望能够直接在调用方法时,在方法的实参括号中,想买几个就写几个,这又怎么实现呢?
 *
 * 这个时候就需要可变参数来完成我们的需求
 * 可变参数的语法:
 *     [修饰符列表] 返回值类型 方法名 (形式参数列表,数据类型... 变量名){
 * 	        //方法体
 *      }
 * 1,可变参数写在方法的形参列表中,用"数据类型..."表示一个可变参数
 * 2,(重点)可变参数的实际就是一个数组,带有可变参数的方法,可以在调用方法时自由的选择传入对应类型的变量
 *
 * 然后在底层,编译器会自动的把这些不固定个数的实参,封装成一个数组,然后给方法去使用
 * 在Java当中,这种不改变实现原理,但是简化了程序的代码书写,减少了程序员的思考,称之为"语法糖"
 * 语法糖在高级的Java当中越来越多
 *
 * 注意事项:
 *   1,书写格式: 我们推荐使用"数据类型..."的方式表示可变参数
 *   2,一个方法只能有一个可变参数并且该可变参数一定是方法形参列表的最后一个参数
 *   不能在前面,更不能在中间(语法限制)
 *   3,可变参数本质是一个数组,带有可变参数的方法之间,仍然能够构成方法的重载
 *      但是很容易导致两个方法都不可用
 *      所以最好还是避免带有可变参数的方法构成重载
 *   4,类中如果有固定参数的方法也能够匹配上方法调用,优先选择固定参数的去匹配执行
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));*/

        //System.out.println(sum(1, 2));
        //Ambiguous method call: both 'Demo.sum(int...)' and 'Demo.sum(int, int...)' match
        //System.out.println(sum(1, 2));
        System.out.println(sum(1, 2));
    }

    //不确定个数int值求和
    //public static int sum(int[] arr) {
    //    //预先定义一个值,用来存放和
    //    int sumValue = 0;
    //    //遍历数组,求和
    //    for (int a : arr) {
    //        sumValue += a;
    //    }
    //    return sumValue;
    //}

    //'sum(int...)' is already defined in 'com.cskaoyan.javase.array._5var.Demo'
    //使用可变参数改造
    public static int sum(int... arr) {
        int sumValue = 0;
//遍历数组,求和
        for (int a : arr) {
            sumValue += a;
        }
        return sumValue;
    }

    public static int sum(int value, int... arr) {
        int sumValue = 0;
//遍历数组,求和
        for (int a : arr) {
            sumValue += a;
        }
        return sumValue;
    }

    public static int sum(int a , int b){
        return 1;
    }
}
