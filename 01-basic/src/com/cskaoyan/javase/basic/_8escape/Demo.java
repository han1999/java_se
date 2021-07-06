package com.cskaoyan.javase.basic._8escape;

/**
 * @description: 转义字符
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 什么是转义字符？
 * - 所谓转义字符，就是用反斜杠（\）加上一个特殊的字符串用来表示一个全新的字符
 * - 因为这个字符已经和原先字符串的意思大不相同，所以整体称之为转义字符
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("\123");
        System.out.println("abc\b\b");
        System.out.println();
        System.out.print("hello\n");
        System.out.print(" world!");

        System.out.println("你好\r中国!");
        System.out.println("xx\txx");

        System.out.println("\\");
        System.out.println("\'");
        System.out.println("\"");
        System.out.println("\141"); //a
        System.out.println("\u0061"); //a

        //两个特殊的字符: \000和\u0000 编码值为0的字符,绝对空的字符
        System.out.println("\000" + "a");
        System.out.println("\u0000" + "a");

    }
}
