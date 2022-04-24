package com.cskaoyan.javase.oop3._4lambda._0introduction;

/**
 * @description: lambda表达式的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 匿名内部类仍然简化了局部内部类,但是它仍然带着讨厌的大括号,仍有复杂的层级结构,所以我们希望它能够进一步简化,这就是lambda表达式
 * 仅做参考与了解：lambda表达式
 * Lambda 表达式是 JDK8 的一个新特性，可以取代接口的匿名内部类，写出更优雅的 Java 代码
 * 匿名内部类实际上是局部内部类的更进一步，简化了局部内部类
 * 那么lambda就是匿名内部类更进一步，语法上更简洁了，代码更优雅了，是高端的玩法
 * 是人上人的玩法
 * 以上总结:
 *          1,lambda表达式是用来替代,简化接口的匿名内部类,对于类的匿名内部类是无法简化的
 *          2,lambda表达式始终是一个局部内部类,它定义在局部位置,它如果访问方法的局部变量,也是一个常量
 *
 * lambda表达式的使用:
 *      1,要想lambda表达式,首先你需要一个接口,并且这个接口是有严格要求的
 *          lambda表达式要求接口必须有且仅有一个必须要实现的抽象方法
 *          这种接口,在java中称之为"功能接口",
 *          使用@FunctionalInterface注解去标记它(如果该接口是功能接口,就不会报错,否者就会报错)
 *          注意事项:
 *              a,功能接口就只能有一个方法吗?
 *              不是,还可以有jdk8之后的默认方法和静态方法
 *              b,功能接口中就只能有一个抽象方法吗?
 *              不是,有些方法虽然是抽象方法,但是不需要子类去实现它
 *                  比如Object类当中的方法,任何类都会继承它,那么这个抽象方法就不需要子类实现
 *              c,当然,一般情况下,多数功能接口当中都是只有一个抽象方法的
 *      2,功能接口有了以后,就可以使用lambda表达式创建该功能接口的子类对象
 *          lambda表达式得到的仍然是一个子类对象,不是一个类
 *          语法:
 *              (形参列表) -> {
 *                  //要重写方法的方法体
 *              }
 *      解释一下:
 *          1,形参列表是功能接口中那个要被实现的唯一的一个抽象方法的形参列表
 *          2, -> 读作"goes to",它是lambda表达式运算符
 *          3, {
 *              //方法体
 *          }表示功能接口中那个要被实现的唯一的一个抽象方法的实现方法体
 *          为什么lambda表达式要求接口中只能有一个要被实现的抽象方法呢?
 *          因为语法结构限制了它,它无法重写两个抽象方法,并且也不能自己添加独有的成员方法
 *
 *    3,当你直接使用lambda表达式语法创建功能接口的子类对象时,实际上编译器是无法得知你创建的到底是哪个接口的子类对象,但是java是强类型语言,任何变量都有它的类型,所以这个时候,如果直接写一个lambda表达式是会报错的
 *    所以使用lambda表达式有一个非常重要的过程,该过程用来告诉编译器,你所写的lambda表达式到底是哪个功能接口的子类对象,这个过程称之为"lambda表达式的类型推断"
 *    该类型推断是需要上下文代码去协助的,有以下几种方式:
 *    1,最直接的,用父类接口名去接收它
 *    2,告诉编译器lambda表达式的类型,但是不接收它
 *      语法:
 *          ((父类接口名)lambda表达式).抽象方法名()
 *    3,借助方法的形参列表完成推断
 *    4,借助方法的返回值类型完成推断
 *
 *  以上,就是lambda表达式的基本使用,接下来需要简化它
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //main方法属于局部位置,可以使用lambda表达式
        IA i = () -> {
            System.out.println("hello world");
        };
        i.test();
        System.out.println("--------------");
        ((IB) () -> {
            System.out.println("hello kitty");
        }).method();
        System.out.println("---------------");
        way(() -> {
            System.out.println("hello 钱啊");
        });
        System.out.println("-------------------");
        way().method();

    }

    public static void way(IA a) {
        a.test();
    }

    public static IB way(){
        return () -> {
            System.out.println("hello 🐴");
        };
    }
}

@FunctionalInterface
interface IB {
    void method();
}

@FunctionalInterface
interface IA {
    void test();
    //默认方法
    default void method(){}
    //静态方法
    static void method2(){
    }
    //equals方法
    boolean equals(Object o);
}