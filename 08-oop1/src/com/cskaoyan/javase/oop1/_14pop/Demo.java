package com.cskaoyan.javase.oop1._14pop;

/**
 * @description: 面向过程 vs 面向对象
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * - 把大象放进冰箱
 * 如果用面向过程的思想去完成这个功能,就只需要按照以下步骤写出方法即可:
 *      1,打开冰箱门
 *      2,把大象放进去
 *      3,关闭冰箱门
 * 于是按照面向过程的思想,就需要三个方法完成三个步骤,实现功能
 *
 * 通过这个案例,分析一下面向过程程序的优缺点:
 *      1,优点:
 *         逻辑清晰,代码简洁
 *         和面向对象的程序相比较,无需创建对象的过程,就避免了创建对象的时空的损耗,避免了管理对象的复杂问题
 *         所以面向过程的程序执行效率比较高,占用内存空间比较少
 *
 *      2,缺点:
 *          面向过程的程序,环环相扣,每一个环节对程序的最终执行都有非常大的影响,一旦某个环节出现问题
 *          对整个程序都是很致命的
 *          一旦某个地方需要修改,这种修改往往是牵一发而动全身
 *
 *          面向过程的程序,可维护性比较差,面对需求的修改需要很大的精力去修改很多地方
 *          面向过程的程序,每个环节结合的很紧密,对程序员的要求很高,不利于程序员之间协同合作
 *
 *      所以结合它的优缺点,面向过程的程序,往往用于应对那些不复杂,比较简单,但同时又很在乎性能的场合
 *          比如你自己写一个小程序,用来实现一些小功能
 *          再比如算法题
 *          实际上面向过程在实际的开发应用中是比较少见的
 *
 */
public class Demo {
    public static void main(String[] args) {
        //在main方法当中按照顺序去调用这些方法,完成实现程序功能
        openFridgeDoor();
        elephantInto();
        closeFridgeDoor();
    }

    //1,打开冰箱门
    public static void openFridgeDoor(){
        System.out.println("我把冰箱门打开了,大象可以放进来了!");
    }

    //2,把大象放进去
    public static void elephantInto(){
        System.out.println("大象进冰箱了,请把冰箱门关上");
    }

    //3,关闭冰箱门
    public static void closeFridgeDoor(){
        System.out.println("大象进来了,我把门关上了");
    }
}
