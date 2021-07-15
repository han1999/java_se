package com.cskaoyan.javase.oop2._2polymorphic._0introduction;

/**
 * @description: 多态的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 现实生活中的多态: 同一种事物,在不同的情况下,具有不同的状态
 * java当中的多态:
 *      同一种事物: 同一个(父类)引用
 *      不同情况: 父类引用指向不同的子类对象
 *      不同的状态: 调用同名方法,体现出不同的行为(方法调用的结果不同)
 *
 * 多态:
 *      当使用父类引用指向不同的子类对象时,如果子类当中存在重写了父类的同名成员方法,那么不同的子类对象,调用该同名成员方法的结果就不同
 *
 * 多态的要素:
 *      1,必须要有继承,这是多态的前提条件
 *      2,必须要有方法的重写
 *      3,还要有父类引用指向不同的子类对象
 *
 * 思考: 什么情况下不能发生多态?
 *      1,不能发生继承的 ---> final类
 *      2,不能重写的方法 ---> static、private、final关键字修饰的方法，构造方法不能继承，更不能重写
 *      3，写代码保证
 *
 */
public class Demo {
    public static void main(String[] args) {
        Phone p;
        //同一个父类引用 指向不同子类对象
        p = new ApplePhone();
        p.call();
        p = new SamsungPhone();
        p.call();
        p = new HuaweiPhone();
        p.call();
    }
}

//手机类
class Phone {
    double price;

    public void call() {
        System.out.println("手机打电话");
    }
}

class SamsungPhone extends Phone {
    String boom;

    @Override
    public void call() {
        System.out.println("炸了");
    }
}

class ApplePhone extends Phone {
    String color;

    @Override
    public void call() {
        System.out.println("用Siri打电话");
    }
}

class HuaweiPhone extends Phone {
    String patriotic;

    @Override
    public void call() {
        System.out.println("华为手机通话质量好");
    }
}
