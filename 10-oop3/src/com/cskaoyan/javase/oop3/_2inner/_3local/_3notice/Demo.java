package com.cskaoyan.javase.oop3._2inner._3local._3notice;

/**
 * @description: 使用局部内部类的注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import org.junit.Test;

/**
 * 匿名内部类和lambda表达式都是特殊的局部内部类,所以该注意事项对他两个仍然生效
 *
 * 局部内部类的成员方法中,是可以来访问方法的局部变量的
 * 注意事项:
 *      如果想要在局部内部类当中,去访问方法的局部变量,那么该局部变量要么就是final修饰的常量,要么它实际上就是一个常量(你不能在局部内部类当中修改它的取值)
 *
 * 为什么有这种机制呢?
 *      这是因为对象的生命周期和方法的生命周期不对等造成的
 *
 *  如果对象在方法出栈后，仍可被使用，那么该局部变量就访问不到了
 *  于是JVM在创建局部内部类对象时，把该局部变量作为对象的成员变量放入对象当中了
 *  这样解决了生命周期的冲突问题
 *
 *  接下来，虽然解决生命周期的冲突问题，仍然存在同步的问题：
 *      修改我自身“成员变量”的取值，需要把它同步给方法的局部变量
 *      如果不同步就会造成逻辑问题
 *
 *    最终Java的开发者没有选择同步方案，而是直接让方法的局部变量成为了一个常量
 *    这样就无法在局部内部类的方法中修改它的取值了，于是就不存在同步问题了
 *
 * 注意：
 *      在Java7和Java7之前，只要在局部内部类当中访问方法的局部变量，那么该变量就必须声明为final
 *      但是在Java8之后，不需要这么做了，但是原理是不变的，它仍然是一个常量
 *      它实质上是一种“语法糖”
 *
 */
public class Demo {
}

class Enclosed {
    public void test() {
        int a = 10; //方法的局部变量
        class Inner {  //方法的局部内部类
            //int a = 100;
            public void testInner() {
                //如果想要在局部内部类当中,去访问方法的局部变量,那么该局部变量要么就是final修饰的常量,要么它实际上就是一个常量(你不能在局部内部类当中修改它的取值)
                //Variable 'a' is accessed from within inner class, needs to be final or effectively final
                //a = 100;
                //a++;
                System.out.println(a + 1);
            }
        }
    }
}


