package com.cskaoyan.javase.oop3._2inner._4advantage;

/**
 * @description: 用内部类实现多继承
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        new Demo().new ASon().test();
        new Demo().new BSon().test();
    }
    class ASon extends A{}
    class BSon extends B{}
    class CSon extends C{}
}
class A{
    public void test(){}
}
class B{
    public void test(){}

}
class C{
    public void test3(){}

}
