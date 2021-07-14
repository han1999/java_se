package com.cskaoyan.javase.oop2._1extends._10override;

/**
 * @description: 方法的覆盖/重写
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 本节研究对象名点访问（普通）成员方法，它的访问范围，和调用方法的结果
 * 父子类的成员方法也是可以同名的,现在我们创建子类对象,并且用子类引用指向,去调用父子类的同名方法,它的方法调用结果是什么?
 * 显然其结果就是子类同名方法的执行结果
 *
 * 接下来研究一下,为什么会体现出这种结果?
 *      1,方法被隐藏了
 *      2,方法被覆盖了
 * 通过代码验证,我们发现方法并不是被隐藏了,我们通过父类其他方法也不能访问到该同名的方法,说明方法是被覆盖了
 *
 * 接下来研究一下方法为什么是覆盖,方法的调用机制又是什么样子的?
 * 同样用三种方式创建对象:
 *      1,父类引用指向父类对象
 *      2,父类引用指向子类对象
 *      3,子类引用指向子类对象
 * a,研究对象名点访问成员方法的范围:
 *      1,访问范围是父类类型中有的成员方法
 *      2,访问范围是父类类型和子类自身类型的成员方法
 *      3,访问范围是父类类型中有的成员方法
 * 以上: 对象名点访问成员方法的访问范围和对象名点访问成员变量的访问范围是一致的,都是根据引用的数据类型来决定的
 *  对象名点访问成员方法的编译器检索机制:
 *      先从引用的数据类型的类中开始找,找不到就去父类中找,直到找到顶层父类Object,如果都找不到就会编译报错
 *
 *  对象名点访问的成员范围实际上是一个编译概念,既然是编译概念,编译器只能通过声明去得知引用的数据类型,编译器无法了解对象的类型
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
       /* Daughter d = new Daughter();
        d.test();
        d.invokeMotherTest();*/

        Mother m = new Mother();
        //m
        Daughter d = new Daughter();
        //d.
        //d.motherMethod();
        //d.method();
        Mother md = new Daughter();
        //((Daughter) md).daughterMethod();
        //md.daughterMethod();
        //md.age
    }
}

class Mother {
    public void test() {
        System.out.println("同名的父类方法");
    }

    private void motherMethod() {
        System.out.println("父类独有的方法");
    }

    //在父类中提供访问test()方法的方法
    //public void invokeMotherTest() {
    //    this.test();
    //}
}

class Daughter extends Mother {
    public void test() {
        System.out.println("同名的子类方法");
    }

    public void daughterMethod() {
        System.out.println("子类独有的方法");
    }
}
