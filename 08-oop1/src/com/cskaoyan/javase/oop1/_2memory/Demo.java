package com.cskaoyan.javase.oop1._2memory;

/**
 * @description: 对象内存图
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 练习：
 * 	1个对象的内存图，一个对象的基本初始化过程
 * 	3个对象的内存图，其中有两个引用指向同一个对象
 *
 * 	我们在定义一个类的成员变量时,实际上可以显式的给出它的初始值
 * 	这样我们用Animal a = new Animal();方式创建对象时,它的成员变量就无需再赋值了,而是直接就是初始值
 *
 * 	但是在内存中创建该对象时,仍然是先进行默认初始化具有默认值,然后再去进行显式赋值
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        Animal a = new Animal();
        /*System.out.println(a);
        System.out.println(a.breed); //null
        System.out.println(a.price); //0.0
        a.breed = "大熊猫";
        a.price = 1000;

        System.out.println(a.breed); //大熊猫
        System.out.println(a.price); //1000
        a.eat();
        a.fly();*/
        System.out.println(a.price); //1000
        System.out.println(a.breed); //猫
        System.out.println(a.name); //张三
    }
}

class Animal {
    //属性: 名字,breed品种,价格
    String name = "张三";
    String breed = "猫";
    double price = 1000;

    //行为: 飞,吃
    public void fly() {
        System.out.println("我要飞得更高!");
    }

    public void eat() {
        System.out.println("我要吃得更多!");
    }
}