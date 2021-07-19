package com.cskaoyan.javase.string._0introduction;

/**
 * @description: String类的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/


/**
 * > String概述
 * - 在Java语言中，所有类似“ABC”这样用双引号引起来的字符串，都是String类的对象
 * - String类位于java.lang包下，是Java语言的绝对核心类
 * - String类提供了字符串表示、比较、查找、截取、大小写转换等各种针对字符串的操作
 *
 * String类具有两大特点: 1.不可变性 2.字符串常量池
 * 了解String这两个特点后,String的学习就剩下API的学习了
 *
 * String的构造器:
 *      String类常用的赋值方式是直接使用字面值常量赋值,构造器仅供了解
 *
 *
 */
public class Demo {
    public static void main(String[] args) {

        ////创建空字符串对象，需要注意的是null != ""
        //public String()
        String s = new String();
        System.out.println(s);
        System.out.println(s.length());

        ////把字节数组中的元素转换成字符串，字节数组中可以是字符，也可以是ASCII码值
        //public String(byte[] bytes)
        byte[] bytes = {97, 98, 99, 100};
        String s1 = new String(bytes);
        System.out.println(s1);

        ////同上，不过指定了开始下标和长度
        //public String(byte[] bytes,int offset,int length)
        //"abc" 下标是从0开始的,最大值是长度-1
        String s2 = new String(bytes, 2, 2);
        System.out.println(s2);


        char[] chars = {'1', '2', '3'};
        ////同字节数组
        //public String(char[] value)
        ////同上，不过指定了开始下标和长度
        String s3 = new String(chars);
        System.out.println(s3);
        //public String(char[] value,int offset,int count)
        String s4 = new String(chars, 0, 1);
        System.out.println(s4);

        //套娃
        //public String(String original)
        String s5 = new String("hello world");
        String s6 = "hello world";
    }
}
