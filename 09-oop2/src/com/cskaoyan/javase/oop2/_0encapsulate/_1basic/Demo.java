package com.cskaoyan.javase.oop2._0encapsulate._1basic;

/**
 * @description: 快速生成getter/setter方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 快捷键 alt + insert
 */
public class Demo {

}
class A{
    private int anInt;
    private static int b;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public static int getB() {
        return b;
    }

    public static void setB(int b) {
        A.b = b;
    }
}
