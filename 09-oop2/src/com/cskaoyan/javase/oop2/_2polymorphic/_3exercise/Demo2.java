package com.cskaoyan.javase.oop2._2polymorphic._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo2 {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new B();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println("1--" + a1.show(b)); //AA
        System.out.println("2--" + a1.show(c)); //AA
        System.out.println("3--" + a1.show(d)); //AD
        System.out.println("4--" + a2.show(b)); //BA
        System.out.println("5--" + a2.show(c)); //BA
        System.out.println("6--" + a2.show(d)); //AD
        System.out.println("7--" + b.show(b)); //BB
        System.out.println("8--" + b.show(c)); //BB
        System.out.println("9--" + b.show(d)); //AD
    }
}

class A {
    public String show(D obj) {
        return ("A and D");
    }

    public String show(A obj) {
        return ("A and A");
    }
}

class B extends A {
    public String show(B obj) {
        return ("B and B");
    }

    @Override
    public String show(A obj) {
        return ("B and A");
    }
}

class C extends B {
}

class D extends B {
}
