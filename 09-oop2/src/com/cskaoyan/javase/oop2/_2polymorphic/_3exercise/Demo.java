package com.cskaoyan.javase.oop2._2polymorphic._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.a); //10
        System.out.println(f.b); //100
        System.out.println(f.c); //1000
        System.out.println(Father.c); //推荐使用
        //System.out.println(f.aa); //父类中没有aa
        System.out.println("----------------");
        Son s = new Son();
        System.out.println(s.a); //20
        System.out.println(s.b);//200
        System.out.println(s.c); //10000
        System.out.println(s.aa); //20
        System.out.println("----------------");
        if (f instanceof Son){
            //Cast may be removed by changing the type of 'f' to 'Son'
            ((Son) f).testSon();
        }
        //f.testSon(); //父类中没有该方法
        f.test();  //Son
        f.testFather(); //Only Father
        System.out.println("----------------");
        s.test(); //Son
        s.testSon(); //Only Son
        s.testFather(); //Only Father
    }
}

class Father {
    int a = 10;
    final int b = 100;
    static final int c = 1000;

    public void test() {
        System.out.println("Father");
    }

    public void testFather() {
        System.out.println("Only Father");
    }
}

class Son extends Father {
    int a = 20;
    final int b = 200;
    static final int c = 10000;
    int aa = 20;

    @Override
    public void test() {
        System.out.println("Son");
    }

    public void testSon() {
        System.out.println("Only Son");
    }
}