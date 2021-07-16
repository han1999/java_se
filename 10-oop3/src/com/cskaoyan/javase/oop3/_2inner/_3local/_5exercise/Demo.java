package com.cskaoyan.javase.oop3._2inner._3local._5exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/


public class Demo {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}
class Outer {
    public int num = 10;

    class Inner {
        public int num = 20;

        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }
    }
}
