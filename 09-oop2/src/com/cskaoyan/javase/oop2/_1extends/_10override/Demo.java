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
 * b,研究对象名点调用成员方法的结果:
 *      1,调用结果是父类的方法执行结果
 *      2,调用结果是子类的方法执行结果
 *      3,调用结果是子类的方法执行结果
 * 以上: 对象名点访问成员方法的结果是根据对象的具体类型来决定的,即便引用的类型是父类类型,但是只要对象是子类类型,那么方法的执行结果一定就是子类的结果
 *
 * 以上对象名点成员方法的访问(范围和结果)做一个总结:
 *   访问范围是编译概念,编译时期就能确定,这一点和成员变量的访问范围没有区别
 *   调用结果是根据对象的具体类型来决定的,必须等到程序执行,创建对象,明确引用所指向的对象的具体类型,才能够决定它的调用结果
 *
 * 正是因为方法的调用结果是根据对象的实际类型来决定的,所以子类对象在调用父子类同名方法时,体现为方法的覆盖
 * 注意事项:
 *      方法的覆盖不是物理意义上的覆盖,而是由于访问机制的特殊,导致无法访问到
 *      既然不是物理意义上的覆盖,那么它仍然是可以访问到的,使用super关键字即可访问(受访问权限限制)
 *
 * 方法的覆盖的语法及其特点:
 *      (普通成员)方法的定义:
 *      [修饰符列表] 返回值类型 方法名(形参列表){
 *          //方法体
 *      }
 *      一提到方法的覆盖/重写,我们就会想到方法的重载,这里我们做一下比较:
 *          方法重载的条件/定义: 在同一个类当中,存在多个方法名相同,但是形参列表不同的方法,其余的外界条件没有影响
 *          方法的重写:
 *              方法的重写依赖于父子类关系,所以它一定不在同一个类当中,而是发生在具有父子关系的两个类当中
 *              其次,方法的重写也要求方法名相同(这是相同的地方)
 *              除此之外:
 *                  1,访问权限修饰符对方法重载没有影响,但是对于方法重写来说是有要求的:
 *                      重写后子类方法的访问权限必须不能比父类方法要严格,可以一致,也可以更宽松
 *                  2,返回值类型对于方法重载没有影响,但是对于方法重写来说是有要求的:
 *                      重写后的子类方法的返回值类型必须和父类方法的返回值类型"兼容"(今天的作业,测试一下什么叫兼容?)
 *                  3,形参列表在方法重载时必须要求保持不一致,但是方法的重写必须要求形参列表完全一样
 *                  4,方法体在方法重载和方法重写时,都是没有要求的,可以完全一样
 *
 *  补充一下: 一个注解 @Override,该注解用来检验父子类当中的两个同名方法是否构成方法的重写
 *        说一个要求: 在子类方法重写方法的头上加上该注解可以标注出它是一个重写的方法
 *                      可以显著的增加代码可读性
 *                      并且还可以帮助你检查重写语法的正确性
 *                      所以请大家重写方法时,务必加上该注解
 *  细节: 如何快速使用快捷键重写重写父类方法?
 *      1,如果明确知道重写的父类方法的名字,可以直接在子类中空白处打出该名字,然后回车,即可重写
 *      2,如果不知道重写哪个父类方法,需要先看看哪些方法能够重写,使用快捷键alt+insert,然后查看重写方法列表,回车重写方法
 *
 *
 * 方法的重写的注意事项:
 *      1,当我们需要在子类中，修改父类方法的实现的时候,可以使用方法的重写,但是一定要遵守语法
 *          建议使用@Override注解标注子类中重写的方法,增加代码可读性,检验语法
 *      2,哪些方法不能被重写?
 *          1,private方法虽然能继承,但是不能访问,也不能被重写
 *          2,static方法不谈继承,也不能被重写
 *          3,构造方法不能被继承,更不能被重写
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
       /* Daughter d = new Daughter();
        d.test();
        d.invokeMotherTest();*/

        /*Mother m = new Mother();
        m.test(); //同名的父类方法
        Daughter d = new Daughter();
        d.test(); //同名的子类方法
        Mother md = new Daughter();
        md.test(); //同名的子类方法*/
        Daughter d = new Daughter();
        d.invokeMotherTest();
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

    public static void testStatic(){}

    public void method(){
        System.out.println("hello world!");
    }
}

class Daughter extends Mother {

    //@Override
    public static void testStatic(){}

    //'子类test()'父类test()' ; attempting to assign weaker access privileges ('private'); was 'public'
    //Method does not override method from its superclass
    @Override
    public void test() {
        System.out.println("同名的子类方法");
    }

    @Override
    public void method() {
        System.out.println("hello world!");
    }

    public void daughterMethod() {
        System.out.println("子类独有的方法");
    }

    public void invokeMotherTest() {
        super.test();
    }
}