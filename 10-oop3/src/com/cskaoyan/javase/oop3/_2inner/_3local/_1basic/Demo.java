package com.cskaoyan.javase.oop3._2inner._3local._1basic;

/**
 * @description: 局部内部类的访问特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import org.omg.CORBA.PUBLIC_MEMBER;

import java.lang.reflect.Method;

/**
 * 局部内部类的访问特点:
 *      1,局部内部类和外围类仍然是好兄弟,但是情况不同了
 *          局部内部类当中仍然可以随意访问外围类,并且不受访问权限限制
 *          但是局部内部类仅在方法内部或者作用域内生效,出了方法就失效了,所以外围类当中除了那个装局部内部类的方法
 *              其余方法访问不到该内部类
 *      2,装有局部内部类的方法中如何创建它的对象?
 *          必须在方法体中,局部内部类定义的下面创建它的对象
 *
 * 1,在局部内部类当中访问外围类成员
 *      a,局部内部类在成员方法中
 *          因为该局部内部类在成员方法中,隐含了this指向外围类对象
 *          所以可以直接访问外围类成员,并且不受权限控制
 *          如果出现同名,解决方案和成员内部类一样
 *          用this指向局部内部类对象,用外围类类名.this指向外围类对象
 *
 *
 *      b,局部内部类在静态方法中
 *          需要创建外围类对象才能访问外围类成员
 *
 * 2,在外围类其他方法中访问内部类成员
 *      访问不到
 * 3,在外部类当中访问
 *      访问不到
 * 3,在内部类当中访问外部类
 *      可以访问的,但是受权限限制
 *
 */
public class Demo {
    public static void main(String[] args) {
        Enclosed e = new Enclosed();
        e.test();
    }
}
class Enclosed{
    int a;
    private int b = 10;
    static int c = 20;
    static final int D = 30;

    public void test(){
        //定义成员方法的局部内部类
        class Inner{
            int a;
            private int b = 100;
            //static int c = 20;
            static final int D = 300;
            //定义成员方法来访问外围类成员
            public void testInner(int a){
                System.out.println(a);
                System.out.println(b);
                System.out.println(this.a);
                System.out.println(Enclosed.this.a);
                System.out.println(Enclosed.this.b);
                System.out.println(Enclosed.c);
                System.out.println(Enclosed.D);
            }
        }
        Inner i = new Inner();
        i.testInner(999);
    }
    public static void testStatic(){
        //定义局部内部类
        class Inner{
            int a;
            public void test(){
                //创建外围类对象
                Enclosed e = new Enclosed();
                System.out.println(a);
                //System.out.println(Enclosed.this.a);
                //Demo d = new Demo();
            }
        }
    }
}
