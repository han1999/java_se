package com.cskaoyan.javase.homework.day09;

/**
 * @description: 构造器练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class ConstructorDemo {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.a); //3
        Father f = new Son();
        System.out.println(f.a); //2
        Grandfather gf = new Son();
        System.out.println(gf.a); //1

        s.test(); //testSon
        f.test();  //testSon
        gf.test(); //testSon

        //f.testSon();
        //gf.testFather();
    }
}

class Grandfather {
    int gA = 1;
    int a = 1;
    public void testGrand() {
        System.out.println("Grand独有");
    }
    public void test() {
        System.out.println("testGrand");
    }
    public Grandfather(int gA, int a) {
        this.gA = gA;
        this.a = a;
    }
    public Grandfather() {
    }
}

class Father extends Grandfather {
    int fA = 2;
    int a = 2;
    public void testFather() {
        System.out.println("Father独有");
    }
    public void test() {
        System.out.println("testFather");
    }
    public Father(int fA, int a) {
        this.fA = fA;
        this.a = a;
    }
    public Father() {
    }
    public Father(int gA, int a, int fA, int a1) {
        super(gA, a);
        this.fA = fA;
        this.a = a1;
    }
}

class Son extends Father {
    int sA = 3;
    int a = 3;

    public void testSon() {
        System.out.println("Son独有");
    }

    public void test() {
        System.out.println("testSon");
    }

    public Son() {
    }

    public Son(int gA, int a, int fA, int a1, int sA, int a2) {
        super(gA, a, fA, a1);
        this.sA = sA;
        this.a = a2;
    }
}
