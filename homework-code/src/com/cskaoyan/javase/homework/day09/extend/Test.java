package com.cskaoyan.javase.homework.day09.extend;

/**
 * @description: 扩展2
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Test{
    public static void main(String[] args){
        Father f1 = new Son(1000);
        Father f2 = new Father();
        Son s = new Son(1000);
    }
}
class Father {
    int i = 10;
    public Father() {
        System.out.println(getI());
    }
    public int getI() {
        return i;
    }
}

class Son extends Father {
    int i = 100;
    public Son(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
}