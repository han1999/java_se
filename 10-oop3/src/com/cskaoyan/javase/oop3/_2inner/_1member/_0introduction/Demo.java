package com.cskaoyan.javase.oop3._2inner._1member._0introduction;

/**
 * @description: 成员内部类的基本特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在研究成员内部类的成员特点之前，我们要明确两个问题：
 *      1，成员内部类的类加载问题
 *          成员内部类的类加载触发方式只有一种： 创建它的对象
 *      2，如何创建成员内部类对象？
 *          成员内部类的最大特点是，创建成员内部类对象，要依赖于外围类对象
 *          这就意味着先要有一个外围类对象，才能在它的基础上创建成员内部类对象
 *
 *      综上：类加载一定是外围类先，成员内部类后的
 *
 *
 * ## 成员内部类
 * > 成员内部类概述
 * - 成员内部类是最普通的内部类，它定义在另一个类的成员位置，可以看成该类的一个成员
 * - 语法
 *   [访问权限修饰符] class EnclosedClazz{ //外围（普通）类的访问权限修饰符，只有两个，public和缺省
 *   	[访问权限修饰符] class InnerClazz{//内部类访问权限修饰符，有四个，和普通成员一样
 *       }
 *   }
 *
 * 成员内部类自身的特点
 *
 * 1，访问权限修饰符
 *      和类的成员一样，它们具有四种访问权限修饰符 --> public、protected、（缺省）、private
 *      这四种访问权限在修饰内部类时，和修饰普通成员是一样
 *
 * 2，成员特点
 *      成员变量
 *          可以定义普通成员变量，没有静态成员变量
 *          可以定义全局常量（只能定义那些不会触发完整类加载的全局常量）
 *      成员方法
 *          可以定义普通成员方法,不可以定义静态成员方法
 *      构造器
 *          有构造器,用来创建对象和给成员变量赋值
 *      代码块
 *          有构造代码块,没有静态代码块
 *
 *  以上,成员内部类和普通类相比,没有static声明(只能声明全局常量)
 *
 * 3，继承和实现
 *      成员内部类只不过是一个类放到另一个类当中的,受了一些限制,但是它终究是一个类
 *      所以它仍然可以继承可以实现
 *      这里作为了解内容
 *      思考:
 *          能不能让一个外部类去继承一个成员内部类(作为今晚的思考题)
 *
 *
 */
public class Demo {
}
class EnclosedClazz{ //外围类

    //定义成员内部类
    class MemberInnerClazz implements IA{
        //定义成员变量
        int a;
        private int b = 10;
        //没有静态成员 变量
        //Inner classes cannot have static declarations
        //static int c = 20;
        static final int C = 20;
        static final String D = "str";
        //static final Demo DEMO = new Demo();

        //定义普通成员方法
        public void test(){
            System.out.println("hello world");
        }
        //public static void testStatic(){
        //
        //}

        public MemberInnerClazz() {
        }

        public MemberInnerClazz(int a, int b) {
            this.a = a;
            this.b = b;
        }
        //定义构造代码块
        {}
        //static {}
    }
   abstract class A{}
   interface  IA{}


}