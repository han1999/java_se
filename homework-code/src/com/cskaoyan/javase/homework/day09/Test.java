package com.cskaoyan.javase.homework.day09;

/**
 * @description:
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Test {
    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
class Base{
    static {
        System.out.println("base 静态代码块");
    }
    {
        System.out.println("base 构造代码块");
    }
    public Base(){
        System.out.println("base无参构造");
    }
}
class Sub extends Base{
    static {
        System.out.println("sub 静态代码块");
    }
    {
        System.out.println("sub 构造代码块");
    }
    public Sub(){
        System.out.println("sub 无参构造");
    }
}