package com.cskaoyan.javase.oop3._2inner._0introduction;

/**
 * @description: 内部类的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 引入
 * > 我们现在做一个应用程序，需要描述一台电脑（Computer）中的CPU，对于电脑而言
 * > 该怎么去描述这个CPU呢？
 * - 它有存储设备，IO设备等等很多硬件资源组件
 * - CPU是电脑中最重要的组件
 *
 * 于是我们把CPU定义成一个类,然后作为一个私有的成员变量放入Computer类的成员列表中,但是这种方法不足以描述CPU的重要性:
 *      1,CPU不应脱离计算机,脱离计算机没有任何意义 ---> CPU类不应该在Computer类之外的地方创建对象
 *      2,CPU是整个计算机的控制核心,所以它应该能够访问计算机当中任何硬件 ---> CPU类对象可以访问Computer类的所有成员
 * 以上两个问题,显然定义一个普通的类CPU是无法解决的,我们需要引入新的概念:
 *      1,普通定义的class没有私有的概念,所以我们考虑把CPU类放入Computer类内部,近似的看成一个Computer类的成员
 *          这样它就有了私有的概念
 *          私有化该类,外界无法访问,外界不能创建对象
 *      2,现在CPU类和Computer类成为了"好兄弟",它们之间的访问就不受访问权限限制
 *
 * 以上,我们把一个类定义在了另一个类的内部,称之为"内部类"
 *      首先根据上述的特点,说两点内部类都有的特点:
 *      1,内部类把自己隐藏在一个类的内部,这是一种极致的封装思想体现
 *      2,内部类和外部类是好兄弟,互相访问不受访问权限限制
 *
 * > 内部类的定义
 *  - 在Java语言中类可以嵌套定义，内部类（inner class）是定义在另一类当中的类
 *
 * > 内部类的概述
 *
 * - 按照内部类在类中定义的位置不同：
 *   - 定义在成员位置的内部类，称之为成员内部类，普通成员内部类，静态内部类
 *   - 定义在局部位置的内部类，局部内部类，匿名内部类，lambda表达式
 *
 *
 * - 内部类是典型的，Java从C++中拿过来但是没有经过简化的特性
 *   - 也就是说Java几乎照搬了C++中的内部类
 *   - 通过内部类可以稍微感受一下C++的语法复杂性
 *
 *
 * - 为了上课方便，我们需要统一口径，在内部类课程当中，我们统一规定
 *   - 像CPU这种类我们称之为内部类（inner class）
 *   - Computer这种类我们称之为外围类（enclosed class）
 *   - Demo这种类我们称之为外部类（outside class）
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //CPU c = new CPU();
    }
}
class Computer{
    //计算机中CPU,放入成员列表
    private CPU c = new CPU();

    //在内部定义一个类,有了私有的概念
    private class CPU{

    }
}
//class CPU{
//
//}