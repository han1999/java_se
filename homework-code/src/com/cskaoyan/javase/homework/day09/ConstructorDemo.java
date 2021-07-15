package com.cskaoyan.javase.homework.day09;

/**
 * @description: 构造器练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class ConstructorDemo {
}
class Grandfather{
    int gA = 1;
    int a = 1;

    public void testGrand(){
        System.out.println("Grand独有");
    }
    public void test(){
        System.out.println("testGrand");
    }
}
class Father extends Grandfather{
    int fA = 2;
    int a = 2;
    public void testFather(){
        System.out.println("Father独有");
    }
    public void test(){
        System.out.println("testFather");
    }
}
class Son extends Father{
    int sA = 3;
    int a = 3;
    public void testSon(){
        System.out.println("Son独有");
    }
    public void test(){
        System.out.println("testSon");
    }


}
