package com.cskaoyan.javase.oop2._1extends._6initialization;

/**
 * @description: 为什么this和super在表示调用构造器时都争第一行
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在java当中,任何一个构造器的第一行如果没有this或者super去直接调用别的构造器,都会隐含存在super()
 * 在这个前提下,如果还允许后面继续存在super或者this去调用别的构造器
 *      就存在重复多次调用构造器的情况,这显然是没有必要的
 * 所以this或者super在调用构造器时,必须在第一行
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    int a;

    public A(int a) {
        //super()
        this.a = a;
    }

    public A() {
        //super()
        System.out.println();
        //super()
        //this(3)
    }
}
