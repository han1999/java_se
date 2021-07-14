package com.cskaoyan.javase.oop2._1extends._11final._2method;

/**
 * @description: final修饰方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * final修饰方法,表示最终的方法,最后的方法
 * 语法:
 *     [访问权限修饰符] final 返回值类型 方法名(){
 *         //方法体
 *     }
 * 作用: final方法表示一个无法被重写的方法,但是它仍然可以被继承
 * 注意事项:
 *      1,什么样的方法需要声明为final?
 *          当一个方法十分重要,方法的实现已经足够完善了,重要到让子类都不能去修改它,但是仍然需要能够被继承时,
 *          可以使用final修饰它
 *          如果一个方法已经能够满足需求，并且明确知道它不应该被修改，修改会产生问题
 *
 *      2,final关键字和static关键字能不能共存在方法的修饰符列表中?
 *          语法上是可以共存的,但是这样写没有意义
 *          因为static方法本来就是无法被重写的,你不需要再加一个final声明
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        s.test();
    }
}
class Father{
    public final void test(){
        System.out.println("hello world!");
    }

    //'static' method declared 'final'
    public final static  void testStatic(){
    }
}
class Son extends Father{
    //@Override
    //public  void test(){
    //
    //}
}
class Person{
    //为了防止老八行为,所以用final修饰它,这样只要是人,就要吃饭,不能乱吃!
    public final void eat(){
        System.out.println("人吃饭!");
    }
}