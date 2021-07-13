package com.cskaoyan.javase.oop2._1extends._1basic;

/**
 * @description: 继承中两个类的关系
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 从从属关系上,
 * 子类和父类表现为“is-a”的关系，仔细来说是“子类is-a父类”，也就是说子类可以看成是一个父类
 * 为什么说子类可以看成一个父类?怎么理解"子类is-a父类"?
 * 从以下三个角度理解该问题:
 *      1,从代码角度
 *      既然子类可以看成是一个父类,在代码角度上来说,子类对象可以用一个父类引用接收
 *
 *      2,从数据类型的定义角度
 *      数据类型: 一组数据和基于这组数据合法操作的集合
 *      引用数据类型: 成员变量的集合 + 成员方法的集合
 *      既然继承中,子类得到了父类的所有成员,显然肯定得到了父类的成员变量和方法,那么从数据类型的定义角度来说
 *          子类就可以看成是一个父类
 *
 *      3,最直观的角度,逻辑/直觉/生活习惯等角度
 *          Person
 *              -Student
 *              -Teacher
 *          Animal
 *              -Cat
 *              -Dog
 *      在日常的开发中,角度3有时候不是那么好用,需要结合自身的业务去理解继承中父子类关系
 *
 * 思考: 子类可以看成是一个父类,那么反过来成立吗?
 *      显然是不成立的,子类可以在继承父类的成员的基础上去扩展父类,所以子类的功能往往比父类强大
 *      父类在多数情况下都是不能作为子类使用,父类不能看成是一个子类
 *
 * 扩展:
 *      引用数据类型的类型转换
 *          1,引用数据类型的类型转换,想要完成,必须依赖于继承
 *              换句话说,引用数据类型想要完成类型转换,必须存在父子关系,没有父子关系的两个类无法进行类型转换
 *          2,引用数据类型进行类型转换,转换的是什么东西?
 *              在Java当中不能直接改变一个对象的类型,但是可以转换指向对象的引用的类型
 *              所以引用数据类型的类型转换,转换的是引用的类型
 *              比如从 人引用---> 猪引用
 *          3,引用数据类型的类型转换也有两种
 *              a,自动类型转换: 不需要写任何额外代码,编译器自动完成类型转换
 *              b,强制类型转换: 需要写额外代码,强制完成类型转换
 *
 *          4,什么情况下发生自动类型转换?
 *              父类引用指向子类对象(子类"is-a"父类)实质上是发生类引用数据类型的类型转换
 *                  从子类的引用自动转换成了父类的引用
 *              因为子类引用 ---> 父类引用 在继承中属于向上,所以引用数据类型的自动类型转换也称之为向上转型
 *
 *          5,什么情况下发生强制类型转换?
 *              把父类引用转换成子类引用,在继承当中属于向下的,被称之为向下转型,它属于强制类型转换
 *              关于强制类型转换,目前大家知道它属于向下就可以了,具体的知识点等到多态再详谈
 *
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        //父类引用可以指向子类对象
        //这里相当于把Son对象的引用类型从Son类型转换成了Father类型
        Father f2 = s;
        Father f = new Son();

        /*Demo d = new Demo();
        ((Father) d)*/
    }
}

//父类
class Father {
    int a;
}

//子类
class Son extends Father {
    int b;
}
