package com.cskaoyan.javase.stringbuffer._0introduction;

/**
 * @description: 可变字符串的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 什么时候需要使用可变字符串?
 * 当你在做大量的,频繁的字符串拼接时,如果使用String,会浪费大量的时间和空间,不能够使用它
 *      原因在于String是不可变的,一旦拼接就会创建新的对象
 * 所以需要使用可变字符串去做大量拼接字符串的工作
 * 当需要对字符串频繁修改时，需要使用**StringBuffer**和 **StringBuilder** 类。
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //String s = "";
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            //s += "你好";
            sb.append("你好");
        }
        System.out.println(sb);
    }
}
