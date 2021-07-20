package com.cskaoyan.javase.stringbuffer._2api;

/**
 * @description: 核心方法append
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * append是追加的意思,表示在可变字符串的后面加上一个新的字符串
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append("hello");
        System.out.println(sb2);
        StringBuffer sb3 = sb2.append(" world");
        System.out.println(sb3);
       /* System.out.println(sb == sb2);
        System.out.println(sb3 == sb2);*/

       sb3.append("特别长的字符串..................");
    }
}
