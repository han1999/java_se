package com.cskaoyan.javase.oop3._2inner._2static._0introduction;

/**
 * @description: 静态内部类的基本特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.cskaoyan.javase.oop1._13import._2static.Test;

import javax.print.attribute.standard.PrinterURI;
import java.time.format.TextStyle;

/**
 *
 * 在学习静态内部类的成员特点之前，先明确一个事情：
 *
 *      - 静态内部类和成员内部类的最大区别就是static关键字
 * - Oracle公司官网有一段文字解释静态内部类和成员内部类的区别
 *     Nested classes that are declared static are called static nested classes. Non-static nested classes are called inner classes.
 *     一个嵌套类被声明静态就叫做静态嵌套类（静态内部类）
 *     非静态的嵌套类被称之为内部类（成员内部类）
 *     这句话最主要的需要理解两个单词“nested”，“inner”
 *     nested嵌套指的是两个类之间的关系是，直接把一个类放进另一个类的内部，两个类实际上没有任何关系，这种关系称之为nested。相当于“寄居蟹”和它的壳，啃老族和他的家人，这个时候内部类和外围类实质上没有关系，只不过是借助外围类的外壳保护自己
 *     隐藏自己，这种就是静态内部类
 *
 *     inner指的是两个类之间具有依赖的关系，内部类不仅仅是借助外围类隐藏和保护自己，更重要的是依赖关系
 *     比如成员内部类对象，它必须依赖外围类对象才能存在
 *     比如心脏和人体，CPU和计算机
 *
 *     以上静态内部类就是一个独立的类，直接放进了外围类当中，和外围类没有任何依赖关系
 *     静态内部类就是一个普通的类
 *
 *
 *
 * > 思考：怎么把一个普通成员变成一个静态成员？
 * - 静态内部类也是处在外围类成员位置的内部类，不同的是它需要使用static修饰
 *
 * - 语法：
 *   [访问权限修饰符] class EnclosedClazz{ //外围（普通）类的访问权限修饰符，只有两个，public和缺省
 *   	[访问权限修饰符] static class InnerClazz{//内部类访问权限修饰符，有四个，和普通成员一样
 *       }
 *   }
 *
 *
 * > 静态内部类自身的特点
 * > 1，访问权限修饰符
 *  和成员内部类一样，静态内部类也有四种访问权限修饰符，访问权限修饰符的使用和普通成员没有区别
 *
 * > 2，成员特点
 * 静态内部类就是一个独立的类，普通的类，放进来外围类当中，所以它的成员和普通类一模一样，没有任何区别
 * >
 * > 3，继承和实现（了解）
 * 静态内部类和成员内部类的使用几乎一样
 * 区别在于静态内部类只能继承一个静态内部类，不能继承成员内部类
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        new EncloseClazz.StaticClazz().test1();
        new EncloseClazz.StaticClazz().showB();
    }
}
class EncloseClazz{

    //定义静态内部类
    public static class StaticClazz extends B implements IA{
        int a = 10;
        private static int b = 20;
        static final String C = new String("str");

        static void test(){}
        void test2(){}

        {}
        static {}

        public StaticClazz() {
        }

        public StaticClazz(int a) {
            this.a = a;
        }

        @Override
        public void test1() {
            System.out.println("实现外部接口的方法tes1");
        }
    }
    static class A{}
    //Modifier 'static' is redundant for inner interfaces
//    static interface IA{}
}
class B{
    public void showB(){
        System.out.println("B类的showB方法");
    }
}
interface IA{
    void test1();
}
//static interface IA{}