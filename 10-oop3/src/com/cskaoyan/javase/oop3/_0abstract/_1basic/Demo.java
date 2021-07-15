package com.cskaoyan.javase.oop3._0abstract._1basic;

/**
 * @description: 抽象类的使用特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 抽象类的命名: 抽象类也是一个class,所以它的命名首先要遵守大驼峰命名规范,其次很多程序员都喜欢在一个抽象类的前面
 *      加上一个"Abstract",以示区分,表示它是一个抽象类
 *
 * 接下来，我们重点来研究一个抽象类的特点和使用
 * 我们从下面两个角度分析
 * 抽象类的成员:
 * 成员变量:
 *      抽象类当中可以定义普通类当中都能定义的成员变量,包括成员变量,静态成员变量,全局常量等等
 *      这一点抽象类和普通类没有区别
 *
 * 成员方法:
 *      普通成员方法: 抽象类当中是可以定义普通成员方法的
 *      抽象类无法创建自身的对象,那么它当中成员方法是无法直接自己使用的,但是可以给子类继承,并在子类中使用
 *      如果你有这样的需求:
 *          需要添加一个方法给所有子类作为一个默认实现,那么抽象类中也是可以添成员方法. 这样子类可以选择直接继承使用这个方法,还可以选择继承后重写该方法,这样选择的权利在子类手里
 *
 *
 * 构造方法
 *
 * 抽象类的子类(特点):
 *
 *
 *
 */
public class Demo {
}

abstract class AbstractStudent {
    //在抽象类当中定义成员变量
    int a;
    private int b = 10;
    static int c = 20;
    static final int D = 30;

    //定义普通成员方法
    public void testMember(){
        System.out.println("我是普通成员方法");
    }

}