package com.cskaoyan.javase.homework.day09;

/**
 * @description: 读程序题2
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Obj3 extends Obj1 {
    static {
        System.out.println("Obj3类加载");
    }

    Obj2 ob2 = new Obj2();
    public Obj3() {
        //super()
        System.out.println("obj3");
    }

    public static void main(String[] args) {
        Obj3 obj3 = new Obj3();
    }
}

class Obj1 {
    static {
        System.out.println("Obj1类加载");
    }

    Obj2 ob2 = new Obj2();

    public Obj1() {
        //super()
        System.out.println("Obj1");
    }
}

class Obj2 {
    static {
        System.out.println("Obj2类加载");
    }

    public Obj2() {
        System.out.println("obj2");
    }
}
