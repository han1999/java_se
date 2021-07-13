package com.cskaoyan.javase.oop2._1extends._9fieldhidden;

/**
 * @description: 属性的隐藏
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 父子类当中的属性(成员变量)能否出现同名的情况?
 *  当然可以
 * 如果父子类当中存在同名的成员变量,这时候如果创建子类对象,直接对象名点访问该成员变量,结果是什么?
 *  结果体现出子类中的赋值
 * 为什么体现出子类的赋值,为什么不是父类的赋值?
 *  猜测1: 子类中的同名成员变量把父类中的同名成员变量覆盖了
 *  猜测2: 因为某种机制的原因,父类的同名成员没有被覆盖,而是被隐藏了
 * 显然通过父类中提供get方法,子类对象仍然可以访问该成员,所以父子类同名成员变量,父类中成员变量是被隐藏,而不是覆盖
 *
 * 接下来我们重点研究属性隐藏过程中的,对象名点访问成员变量的机制
 *  这里首先要明确,我们现在创建对象有三种形式:
 *      1,创建父类对象,用父类引用指向
 *      2,创建子类对象,用子类引用指向
 *      3,创建子类对象,用父类引用指向
 *
 *  接下来,首先研究它们对象名点访问成员变量的范围(权限允许的情况下):
 *      1,可以访问父类中成员变量,但是访问不到子类独有的成员变量
 *      2,可以访问父子类中所有的成员变量
 *      3,可以访问父类中的成员变量,但是访问不到子类独有的成员变量(想要访问需要强转)
 *
 * 以上总结: 当你使用对象名点访问成员变量时,它的访问范围是根据引用的数据类型决定的
 * java当中通过对象名点访问成员变量,存在这样的检索机制(编译器的检索机制):
 *      首先从引用的类中去找该成员变量,如果找不到就去父类的类中去找该成员变量,如果所有的父类直到Object,都找不到该成员变量,就意味着该成员变量无法访问,于是就会编译报错
 *     在java当中一个类是明确直到它是有几个父类,但是一个父类是无法感知到自己到底有多少子类的,父类感知不到子类,子类可以感知到父类
 *
 *
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*Son s = new Son();
        System.out.println(s.a); //200
        System.out.println(s.getFatherA()); //100*/

        //三种方式创建对象
        Father f = new Father();
        //f.b
        //f.sonVar
        Son s = new Son();
        //s.fatherVar
        Father fs = new Son();
        System.out.println(fs.a);
        System.out.println(fs.fatherVar);
        //((Son) fs).sonVar
        //fs.sonVar


    }
}

class Father {
    int a = 100;
     int fatherVar = 10;

    //给a一个get方法
    /*public int getFatherA(){
        return a;
    }*/
}

class Son extends Father {
    int a = 200;
    int sonVar = 20;
}
