package com.cskaoyan.javase.method._1basic;

/**
 * @description: 方法是可以没有返回值的, 那么它的数据类型是什么?
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法如果没有返回值,但是它的返回值类型仍然需要填入一个类型
 * 它就是void类型
 *
 * void本身就是一种返回值类型,它表示这个方法没有返回值
 * 没有返回值的方法调用就只能光秃秃的写在那里,因为没有返回值,所以不存在操作
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        test();
        //System.out.println(test());
    }
    public static void test(){
    }
}
