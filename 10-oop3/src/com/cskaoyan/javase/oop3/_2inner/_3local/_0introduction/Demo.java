package com.cskaoyan.javase.oop3._2inner._3local._0introduction;

/**
 * @description: 局部内部类的基本特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 *
 * 局部内部类的使用注意事项:
 *      1,局部内部类可以看成是一个方法当中的局部变量,它的作用域就限制在了方法内部
 *      2,什么情况下需要使用局部内部类?
 *          局部内部类会显著影响代码的层级结构,让代码可读性降低,所以不要滥用它.
 *          当你在方法或者一些局部位置有些需求,需要对象来完成时,这个时候需要类来创建它的对象,并且希望这个类对外界不可见,对外界隐藏,这个时候就需要借助局部内部类来完成需求
 *          局部内部类是比成员内部类更加极致的封装思想体现,它仅对方法可见,其余的包括它的外围类都不知道它的存在
 *      3,什么时候类加载,怎么创建对象?
 *      类加载--> 局部内部类的类加载和成员内部类相似,也是只能通过创建对象去触发
 *      怎么创建对象? --> 必须在方法当中创建它的对象,因为出了方法,就访问不到它了
 *
 * 局部内部类是定义在一个方法或者一个作用域里面的类
 * 它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内
 * 将局部内部类看成是局部变量即可
 * 语法:
 *      class 类名{
 *
 *      }
 * > 局部内部类自身的特点
 * > 1，访问权限修饰符
 *      局部内部类和局部变量一样,没有访问权限的概念,它已经被方法或者作用域限制死了作用范围,不需要访问权限
 *          也就没有访问权限修饰符
 *      也没有static,不能用static修饰局部内部类
 *
 * > 2，成员特点
 *      和成员内部类相似,没有static声明,包括静态变量和静态方法以及静态代码块
 *      但是可以有static final常量(指那些不会触发完整类加载的全局常量)
 *
 * > 3，定义位置
 *  定义在局部位置,所有的局部位置都可以定义
 *
 * > 4，继承和实现
 * 局部内部类去继承和实现外部的类和接口是常见操作
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
}

class Enclosed {

    {
        class A {
        }
    }

    public void test() {

        //定义局部内部类
        class A {
            int a = 10;
            private int b = 20;
            //static int c = 30;
            //static void test(){}
            void test(){}
            //static {}
            static final int D = 40;
            //static final Demo DEMO = new Demo();


            public A() {
            }

            public A(int a, int b) {
                this.a = a;
                this.b = b;
            }
            {

            }
        }


    }
}

