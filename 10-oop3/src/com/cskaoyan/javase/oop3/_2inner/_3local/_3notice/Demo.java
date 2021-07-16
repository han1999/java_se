package com.cskaoyan.javase.oop3._2inner._3local._3notice;

/**
 * @description: 使用局部内部类的注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

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
 *
 *
 *
 *
 *
 *
 */
public class Demo {
}
class Enclosed{
    public void test(){
        int a = 10; //方法的局部变量
        class Inner{  //方法的局部内部类
            //int a = 100;
            public void testInner(){
                //如果想要在局部内部类当中,去访问方法的局部变量,那么该局部变量要么就是final修饰的常量,要么它实际上就是一个常量(你不能在局部内部类当中修改它的取值)
                //Variable 'a' is accessed from within inner class, needs to be final or effectively final
                //a = 100;
                //a++;
                System.out.println(a + 1);
            }
        }
    }
}