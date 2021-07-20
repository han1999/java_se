package com.cskaoyan.javase.exception._5throw;

/**
 * @description: 空接口的作用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Demo3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        try {
            judge(b);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("代码继续执行");
    }

    public static void judge(Object o) throws CloneNotSupportedException {
        if (o instanceof Cloneable) {
            //true,表示实现了空接口Cloneable,可以做克隆操作
            System.out.println("正常进行克隆!");
        } else {
            //false,没有实现空接口,抛出异常CloneNotSupportException
            throw new CloneNotSupportedException("没有实现接口Cloneable");
        }
    }

}

interface Cloneable {
}

class A implements Cloneable {
}
class B{}