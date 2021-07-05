package com.cskaoyan.javase.basic._4conversion;

/**
 * @description: 基本数据类型的类型转换
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 该Demo类探究如何进行基本数据类型的类型转换
 *
 * 类型转换的分类:
 *      1,自动类型转换
 *          所谓自动指的是程序员无需手写额外代码进行的数据类型转换,这意味着编译器帮助我们完成了类型转换
 *      2,强制类型转换
 *          指的是必须由程序员强制写代码进行的类型转换,称之为强制类型转换,强制类型转换编译器不会帮助我们完成
 *
 * 基本数据类型的类型转换:
 *      指的是不包括boolean外的所有基本数据类型之间的类型转换
 *      1,自动类型转换:
 *       指的是从小范围的数据类型转换到大范围的数据类型,这个过程由编译器自动完成
 *       比如int --> long
 *       long --> float
 *       注意事项: 自动类型转换一定是安全的吗?一定不会丢失精度吗?
 *       比如int可以表示一个10位的整数,但是如果自动提升到float,由于float有效位数是7~8位,会有精度问题
 *
 *       2,强制类型转换
 *       指的是从大取值范围的数据类型到小取值范围的数据类型,这个过程过程必须由程序员显式的写代码完成
 *       大转小很容易导致数值溢出,出现精度问题,会导致数据失真,是很危险的事情,这个事情编译器不会帮你做的
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*long a = 100;
        byte b = 10;
        int c = b;

        float d = a;*/


       /* //自动类型转换中的精度问题
        int a = 999999999;
        float b = a;
        double c = a;
        System.out.println(b);
        System.out.println(c);*/

        /*//强制类型转换
        //long --> int
        long a = 100L;
        //Incompatible types. Found: 'long', required: 'int'
        //强制类型转换的语法,在被强转变量的前面加
        // (要强转的数据类型)
        //快捷键 alt+回车  变量的后面写.cast
        int b = ((int) a);
        System.out.println(b);*/

        /*//强制类型转换当中的精度问题
        byte c = ((byte) 128);
        System.out.println(c);*/

        //基本数据类型的强制类型转换的主要使用场合
        //取一个浮点数的整数位 1.01 ---> 1
        double a = 100.1231;
        int b = ((int) a);
        System.out.println(b);
    }
}
