package com.cskaoyan.javase.exception._0introduction;

/**
 * @description: 什么是异常
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 异常:
 *      指的是程序在运行时期出现了不正常的情况,然后会在控制台打印报错信息,程序终止
 * 编译报错: 不能通过语法检查,编译时期就会报错
 *
 * Throwable: (异常继承层次的祖先类)
 *      Error: 这个可以不用管,不是学习重点
 *      Exception:
 *          RuntimeException: 指的是运行时异常
 *             RuntimeException，指的是在程序运行期间，发生的一般问题，称之为**运行时异常**
 *             这种问题无法在编译时检查和预料，只有到程序运行后才能显现问题
 *             例如用null调用方法，数组使用错误的下标，错误的强制类型转换
 *             RuntimeException可以写代码进行正常的处理，属于一般问题
 *
 * 需要明确的是：
 * 运行时异常绝大多数都是因为编码问题所导致的
 * 也就是可以避免的异常，当程序抛出该异常后，最好能够重构代码，修正问题
 *
 *          非RuntimeException,或者称之为编译时异常
 *              非RuntimeException，指的是在编译时期，就需要显式的检查并处理的异常，称之为**编译时异常**
 * -            部分书籍也称其为，受检查的异常（Checked Exception）
 * -            这种异常必须在编译期检查和处理
 * -            例如打开一个文件夹（要考虑该文件夹存不存在）
 * -            克隆一个对象（要检查该类是否实现Cloneable接口）
 * -            Exception的子类中，只要不是RuntimeException的子类，那必然是非RuntimeException
 *
 * RuntimeException和它的子类都属于运行时异常,Exception的子类当中除了RuntimeException以及它的子类,都是编译时异常
 * 那么Exception属于什么异常呢?
 *      在java当中Exception被作为一个编译时异常处理,其次它还是java所有编译时异常的父类
 *      还是java所有异常的父类
 *
 * > Java设计异常体系的原则
 * - 尽量把一切错误，摒弃在程序运行之前，最好在编译时期就发现程序潜在的问题（通过编译器）
 * - 确实，Java把相当一部分异常定义为编译时异常，让程序员在编译时期就显式的处理它们
 * - 但仍然有很多问题，必须要Java程序运行起来，才可能产生，被发现，是编译器检查不到的
 *   - 这就是运行时异常
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //典型的运行时异常
        int[] arr = null;
        //System.out.println(arr.length); //空指针异常

        arr = new int[3];
        //System.out.println(arr[10]); //数组下标越界异常

        System.out.println(10/0); //ArithmeticException 算术异常,在开发中经常用它来测试异常

        //典型的编译时异常,必须在程序的编译时期去处理它,不处理会报错
        Demo d = new Demo();
        //Unhandled exception: java.lang.CloneNotSupportedException
        d.clone();
    }
}
