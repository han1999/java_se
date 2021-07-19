package com.cskaoyan.javase.string._2constant;

/**
 * @description: 字符串常量池
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 这两种方式创建String对象有啥区别?
 * String s1 = "我是猪";
 * String s = new String("我是猪");
 *
 * 思考:
 *      "Hello World"它是一个什么东西?
 *          1,字面值常量
 *          2,它本身就是一个字符串对象
 * 字符串常量池:
 *          对于String的字面值常量,编译器在编译时期就能够确定它的值,
 *          在程序的编译时期编译器就会把它加入静态常量池(二进制的字节码文件)
 *          然后等到程序运行,在类加载时期,jvm会优先从静态常量池当中获取这些对象,然后加入运行时常量池
 *          字符串就是典型代表之一
 * 所以像"hello"这种字面值常量的String对象在类加载时期就作为一个对象加入了字符串常量池
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //String s = "Hello";
        //System.out.println("hello".length());

        String s1 = "我是猪";
        String s2 = new String("我是猪");
        String s3 = "我是猪";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

    }
}
