package com.cskaoyan.javase.method._2notice;

/**
 * @description: 方法的使用注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 方法不调用，不执行，各个方法之间是平行关系
 * - 方法要定义在类体中，方法不能嵌套，方法在类体中定义的顺序对方法调用没有影响
 * - 对于修饰符列表中有static的方法，在同一个class的main方法中的调用方式是：方法名(实际参数列表)
 * - 调用一个有返回值的方法，实际上就是操作返回值，void方法不能做任何操作。
 *
 *
 * 补充:
 *      详解一下main()方法
 * 修饰符列表: public static 公共的,静态的
 * 返回值类型: void 它表示main方法没有返回值,main方法是给jvm调用的,作为程序的入口,对于jvm而言,它不需要一个返回值
 * 方法名: main ,它本身不是一个关键字,但是它是约定俗成的一个规范,默认将它作为程序入口,所以main是不能改的
 * 形参列表: String[] args, String[]表示一个数组,是一个字符串数组,args是这个数组的名字
 *
 * 在以上main方法的声明当中,几乎都是固定写实的,改动任意位置都是不行,但是有一个地方是可以改的
 *      就是数组的名字,就是形式参数的名字
 *
 * 以上,我们发现在形参当中,形参最重要的是数据类型,它决定了实参能够传入什么数据
 * 但是形参的名字是不重要的,它不直接影响方法执行
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("hello world!");
        //System.out.println(a);
    }
}
