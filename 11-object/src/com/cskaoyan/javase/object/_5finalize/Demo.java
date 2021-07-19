package com.cskaoyan.javase.object._5finalize;

/**
 * @description: finalize方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 方法的声明和它的方法体:
 *       protected void finalize() throws Throwable { }
 * 首先关注它的访问权限是protected,并且它的方法体是空的,这种设计可以学习一下:
 *      这种设计的目的是为了让子类自己去重写该方法的实现,这种方法比起抽象方法的强制子类实现,要更加灵活
 *
 * throws Throwable 这是一个异常的声明,后面再讲
 * 作用:
 *      finalize方法是沿用C++中的析构函数的设计
 *      C++当中负责对象生命周期的两个函数:
 *          1,构造函数,用来在对象出生时,给成员变量赋值,Java当中也有构造器
 *          2,析构函数,用来在对象销毁时,给对象的死亡做善后工作
 *      对象死亡的"善后"工作:
 *          对象在内存中存在,本身就是要占用内存的,这个内存在对象销毁时就会随之释放,这个释放的过程在不同的语言当中它的方式是不同的,比如C++是手动,Java是GC自动的,不管是什么方式,这些对象所占用的内存都是可以准确释放的
 *          对象在存在时,很多时候不仅自身要占用内存,还可以需要去使用一些系统资源,占用一些系统资源
 *          这些资源的释放和对象本身内存资源释放不是同时进行,需要额外的操作去释放系统资源
 *
 *          C++当中的析构函数就是在对象死亡时,释放系统资源的
 *          finalize方法实际上也在做析构函数的事情,也是在对象被销毁时,自动的去调用,然后释放系统资源
 *              我们java程序员只需要在finalize方法中手动的加上释放系统资源的代码,然后在对象销毁时,就会自动调用该方法释放系统资源
 *
 *          这个想法是很好的,但是却实现不了,java当中的对象销毁依赖于GC不是手动的,依赖finalize方法释放系统资源是不稳定的,不准时,没有时效性
 *          java因为GC的自动垃圾回收,程序员获得了释放对象资源的便利性,但是也失去了对系统资源释放的便利性
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        new Student();
        //通知GC进行垃圾回收
        System.gc();
    }
}
class Student{

    @Override
    protected void finalize() throws Throwable {
        System.out.println("模拟释放资源的语句");
    }
}
