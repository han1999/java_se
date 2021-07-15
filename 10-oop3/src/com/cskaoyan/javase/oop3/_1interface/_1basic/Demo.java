package com.cskaoyan.javase.oop3._1interface._1basic;

/**
 * @description: 接口的成员特点和子类特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 1,接口的声明特点:
 *      a,接口默认就是用abstract修饰的,接口就是抽象的概念
 *      b,接口声明出来就是为了实现的,不实现的接口没有太大意义,所以接口的访问权限推荐使用public
 * 2,接口的成员特点:
 * - 成员变量
 *    和类完全不同,接口当中的所有成员变量默认都是public static final修饰的
 *    也就意味着接口当中的成员变量全部都是公共的全局常量
 *   注意事项:
 *      1,访问权限权限不可修改,必须是public,如果不写,默认就是public
 *      2,接口当中的成员变量虽然是静态全局常量,但是不能用静态代码块赋值,换句话说,接口当中没有静态代码块
 *      3,成员变量默认都是public static final修饰,这些修饰符不建议写出来
 *
 * - 成员方法
 *      JDK8之前,接口当中的所有方法默认都是public abstract修饰的,都是抽象方法
 *      普遍来说,接口的定义都是非常简洁的,接口当中不会定义成员变量,接口当中都是光秃秃的抽象方法
 *
 *      JDK8引入了新的接口中的方法:
 *          1,默认实现方法
 *          2,静态方法
 *     以上两种方法都不是抽象方法,而是具体实现的方法
 *     默认实现方法:
 *          语法: default 返回值类型 方法名(形参列表){
 *              //方法体
 *          }
 *       默认方法是一个实现方法,需要对象去调用,这个方法不可能是接口使用的,可以用接口的实现类去调用它
 *
 * - 构造方法
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(IA.A);
        System.out.println(ASon.A);
    }
}

//声明一个接口IA
//Modifier 'abstract' is redundant for interfaces
interface IA {
    /*//接口中声明成员变量
    //Variable 'a' might not have been initialized
    int a = 10;
    //Variable 'b' might not have been initialized
    static int b = 20;
     public static final int c = 30;
     static {
         //没有静态代码块
     }*/

    //建议定义成员变量的方式
    int A = 10;

    /*//定义接口当中的抽象方法
    public abstract void test();*/

    //建议定义方法的样式
    void test();

    //定义默认实现方法
    default void testDefault(){
        System.out.println("我是接口中的默认实现方法");
    }

}
class ASon implements IA{
    @Override
    public void test() {
        System.out.println("ASon");
    }
}
