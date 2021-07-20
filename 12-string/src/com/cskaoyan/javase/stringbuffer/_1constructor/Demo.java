package com.cskaoyan.javase.stringbuffer._1constructor;

/**
 * @description: StringBuffer为例
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * // public StringBuffer()  无参构造方法
 * // public StringBuffer(int capacity)  指定容量的字符串缓冲区对象
 * // public StringBuffer(String str)  指定字符串内容的字符串缓冲区对象
 *
 */
public class Demo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); //无参构造,给value数组的初始长度是16
        StringBuffer sb2 = new StringBuffer(80); //手动给出value数组的长度
        StringBuffer sb3 = new StringBuffer("hello"); //字符串长度+16是value数组的初始长度
    }
}
