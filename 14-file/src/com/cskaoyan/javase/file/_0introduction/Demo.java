package com.cskaoyan.javase.file._0introduction;

/**
 * @description: File类的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import java.io.File;

/**
 * > File类概述
 *
 * > 什么是file类？为什么要学习file类
 * - 在操作系统中，数据都是以文件的形式，永久保存在外部储存设备上的
 * - 做开发的时候，难免需要对文件进行操作，比如检查作业，上传作业
 * - 根据Java当中一切皆对象的思想，这个时候我们需要一个对象用来操作文件
 * - 于是Java引入了File类用来描述文件或者文件夹（目录）
 * - File类位于java.io包下，是Java进行IO操作的核心类
 * - File是文件和目录（文件夹）路径名的抽象表达形式
 *
 * 以上:
 *      1,File类是为了在Java当中操作文件对象诞生的
 *      2,既然,File是文件和目录（文件夹）路径名的抽象表达形式,所以File对象在创建对象时,并不关心你写的字符串路径是否是一个正确的合法的路径名,只要是一个字符串都能正常创建File对象
 *      说极端一点,你可以认为File对象就是存了路径名字符串的一个对象
 *      3,File类不仅是描述文件(夹)的类,还包括常见的文件操作的方法
 *
 */
public class Demo {
    public static void main(String[] args) {
        //File
        //获取当前相对路径
        System.out.println(System.getProperty("user.dir"));
    }
}
