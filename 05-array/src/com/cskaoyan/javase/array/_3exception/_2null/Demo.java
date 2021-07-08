package com.cskaoyan.javase.array._3exception._2null;

/**
 * @description: 空指针异常
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 空指针异常:
 *      当一个引用指向null时,意味着这个引用没有指向对象,
 *      这个时候如果你仍然想要通过该引用去访问对象,显然是访问不到的,显然是错误
 *      这个时候JVM会给你抛出异常,终止程序
 *
 * NullPointerException: 也就是空指针异常(引用可以看成是弱化的指针)
 *      空指针异常简称NPE,它是java当中最著名的异常,最常见的异常
 *
 * 在java当中只有四类八种基本数据类型,其余的都是引用数据类型,引用数据类型的引用都可以指向null的,所以在以后的学习工作中,我们要频繁的和空指针异常打交道
 * 写java代码要时刻去注意空指针异常
 *
 * 我们碰到了空指针异常该怎么处理?
 *      1,在多数情况下,程序是不应该出现空指针异常的,我们需要检查代码,避免让指向null的引用去操作对象
 *      2,如果这里确实需要一个空指针异常,那么对它做异常的处理
 *
 * 如何避免空指针异常?
 *      最基本的,最简单的,在使用一个访问对象之前,用if做判断
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(arr.length);
        //Array access 'arr[0]' will produce 'NullPointerException'
        System.out.println(arr[0]);
        //if (arr != null){
        //    System.out.println(arr.length);
        //}
        System.out.println("hello");
    }
}
