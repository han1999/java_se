package com.cskaoyan.javase.array._6callby;

/**
 * @description: 方法的传值问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.util.Arrays;

/**
 * 什么是传值问题?
 *      我们在使用方法时,需要给方法传入一个实参变量
 *      那么该实参传入后,如果在方法当中修改了它
 *      那么该实参如何变化?
 *      这就是所谓的传值问题
 *
 * 两种传值的方式:
 *      1,值传递
 *      值传递指的是方法得到的是实参的一个拷贝值,并不是实参本身
 *      那么在方法当中修改的就是实参拷贝的取值
 *      所以方法执行结束出栈后,实参原本的取值是不会发生变化的
 *
 *      2,引用传递
 *      引用传递指的是方法得到的是实参的地址,相当于获取了实参本身
 *      那么在方法当中修改的就是实参本身的取值
 *      那么方法执行结束出栈后,实参原本的取值会跟着发生变化
 *
 *  写代码验证一下java当中的传值方式
 *      1,针对基本数据类型,我们通过一个二倍int数值的方法,发现方法不能改变基本数据类型int实参的取值
 *          ---> 至少对于基本数据类型,java是值传递的
 *      2,针对引用数据类型,我们通过一个二倍数组元素的方法,发现方法可以改变引用数据类型对象元素的取值
 *          ----> 对于引用数据类型,Java是引用传递的 ✖✖
 *      3,实际上以上观点2是绝对错误的,java当中仅存在值传递,没有任何引用传递
 *
 */
public class Demo {
    public static void main(String[] args) {
        //测试基本数据类型实参通过方法去改变
        int a = 10;
        doubleIntValue(a);
        System.out.println(a);

        //测试引用数据类型实参通过方法去改变元素的取值
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        doubleIntArrayValue(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("--------------------------");
        int[] arr1 = {111, 222, 333};
        int[] arr2 = {666, 777, 888};
        System.out.println("交换之前的arr1: "+ Arrays.toString(arr1));
        System.out.println("交换之前的arr2: "+ Arrays.toString(arr2));
        swapArray(arr1, arr2);
        System.out.println("交换之后的arr1: "+ Arrays.toString(arr1));
        System.out.println("交换之后的arr2: "+ Arrays.toString(arr2));
        /**
         * 思考:
         *  如果是引用传递,能否交换成功?  是/否
         *  如果是值传递,能否交换成功?  是/否
         *
         */

    }

    //扩大一个int类型数组,变为它原本的二倍
    public static void doubleIntValue(int a) {
        a *= 2;
    }

    //扩大数组元素的取值,都变成它原先取值的二倍
    public static void doubleIntArrayValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    //需求: 交换两个数组的引用所指向的对象
    public static void swapArray(int[] arr1, int[] arr2) {
        //需要一个temp进行数组的交换
        int[] temp;
        temp = arr1;
        arr1 = arr2;
        arr2 = temp;

        System.out.println("交换方法中的arr1: "+ Arrays.toString(arr1));
        System.out.println("交换方法中的arr2: "+ Arrays.toString(arr2));
    }
}
