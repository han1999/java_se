package com.cskaoyan.javase.oop3._3anonymous._1basic;

/**
 * @description: 匿名内部类的两种使用方式
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 匿名内部类的两种使用方式:
 *      1,直接使用该对象,直接在语法大括号的后面点去调用成员
 *      2,可以使用一个引用去接收它
 *            用new后面的那个类名或者接口名去接收
 * 比较一下,它们的优缺点:
 *      方式一
 *          优点: 方便快捷,代码简单,并且该匿名内部类对象是一个没有引用指向的对象,理论上效率更高
 *          缺点: 只能用一次
 *      方式二
 *          优点: 可以多次使用
 *          缺点: 代码稍微复杂一点,不够简洁,不够高级
 *          特别的,方式二无法访问匿名内部类当中定义的子类独有的方法,并且是真的无法访问,无法强转,无法访问
 *              但是方式一是没有这个缺点的
 *    以上,正常开发中方式一还是使用更多的,用父类引用接收一个匿名内部类的子类对象是比较少见的操作
 *
 *
 * 补充:
 *      我们在使用匿名内部类语法时:
 *          new 类名或者接口名(){
 *            //重写方法
 *          };
 *       语法当中类名和接口名后面跟着有一个小括号,注意这个小括号是有用的,它可以用来给父类构造器传参
 *       但是接口没有构造器,它不能传值
 *
 */
public class Demo {
    public static void main(String[] args) {
        //这里需要调用IA的add方法
        new IA() {
            @Override
            public void add() {
                System.out.println("IA的匿名内部对象当中的add方法");
            }
        }.add();

        IA a = new IA() {
            @Override
            public void add() {
                System.out.println("hello world");
            }

            public void test(){
                System.out.println("test");
            }
        };
        //((IA) a).test();
        a.add();


        System.out.println("--------------------");

        //创建A的子类对象,使用匿名内部类
        new A(18){
            public void test(){
                System.out.println(a);
            }
        }.test();

        new B(28){
            public void test(){
                System.out.println(b);
            }
        }.test();
    }
}

interface IA {
    void add();
}

class A{
    int a;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }
}
abstract class B{
    int b;

    public B() {
    }

    public B(int b) {
        this.b = b;
    }
}