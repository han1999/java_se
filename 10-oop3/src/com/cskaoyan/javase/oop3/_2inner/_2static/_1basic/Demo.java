package com.cskaoyan.javase.oop3._2inner._2static._1basic;

/**
 * @description: 静态内部类的访问特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 静态内部类需要了解的东西:
 *      1,它仍然是内部类,和外围类还是好兄弟,所以互相访问仍然不受权限限制
 *      2,静态内部类的类加载问题:
 *          静态内部类和外围类没有依赖关系,创建对象也不会互相影响,类加载仍然不会互相影响
 *          所以:
 *          在静态内部类当中访问外围类成员或者在外围类当中访问内部类成员,都需要先创建对象
 *          并且是直接创建对象
 *
 * 静态内部类的访问特点
 * - 静态内部类内部访问外围类
 *      1,成员方法中
 *      2,静态方法中
 *      没有任何区别,反正都没有,都需要创建对象,都是直接创建对象,并且不受权限限制
 *
 * - 外围类访问静态内部类成员
 *      1,成员方法
 *      2,静态方法
 *      没有任何区别,反正都没有,都需要创建对象,都是直接创建对象,并且不受权限限制
 *
 * - 外部类访问静态内部类成员（了解）
 *      1,成员方法
 *      2,静态方法
 *      没有任何区别,反正都没有,都需要创建对象,都是直接创建对象,但是受权限限制
 *      不同点在于:
 *          需要指出该内部类属于哪个外围类
 *          语法:
 *          外围类.内部类 对象名  = new 外围类.内部类 ();
 *
 * - 静态内部类访问外部类成员（了解）
 *      需要创建对象,但是受权限限制,如果没有权限,做不了
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Enclosed.Inner ei =  new Enclosed.Inner();
        //System.out.println(ei.b);
    }
}

class Enclosed {
    int a = 100;
    private int b = 200;
    static int c = 300;
    static final int D = 400;

    public void test(){
        Inner i = new Inner();
    }
    public static void testStatic(){
        Inner i = new Inner();
    }

     static class Inner {
        int a = 10;
        private int b = 20;
        static int c = 30;
        static final int D = 40;

        public void testInner(int a) {
            Enclosed e = new Enclosed();
            System.out.println(e.a);
            System.out.println(e.b);
            System.out.println(Enclosed.c);
            System.out.println(Enclosed.D);
            System.out.println(this.a);
            System.out.println(b);
        }

        public static void testStaticInner(){
            Enclosed e = new Enclosed();
            Inner i = new Inner();

        }

    }
}
