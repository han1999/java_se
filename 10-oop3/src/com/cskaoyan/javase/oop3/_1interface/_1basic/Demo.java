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
 *          接口的实现子类可以选择直接使用这个方法,也可以选择重写它,所以这个方法仍然可以看成是一个默认实现
 *
 *       默认实现方法在开发中是比较罕见使用的,Java8开发者引入该种方法,主要还是为了兼容性考虑的,不建议你在开发中使用
 *       注意事项:
 *           1,默认实现方法的访问权限修饰符默认是public,并且不可修改
 *           2,接口中的默认方法可以用来实现真正意义上的多继承
 *              但是不建议在开发中使用
 *
 *      静态方法:
 *          语法: static 返回值类型 方法名(){
 *              //方法体
 *          }
 *          注意:
 *              1,可以通过接口名去调用它
 *              2,接口的静态方法不能给子类使用,无法通过子类类名去调用
 *              3,访问权限修饰符默认是public,不可修改
 *              4,接口当中甚至可以利用static方法实现main方法的功能
 *         接口中的实现方法综合来说都是很罕见的,接口在目前的开发当中建议不要使用实现方法
 *
 * - 构造方法
 *      思考: 接口有没有构造方法?
 *      首先接口不能创建对象,其次它也没有成员变量需要赋值(因为接口中都是全局常量)
 *      所以接口不需要构造方法
 *      接口没有构造器
 *      补充: 接口的实现子类的构造方法的super指向它的直接父类(Object或者其他直接父类)
 *
 * 思考:
 *      接口没有静态代码,接口有没有构造代码块?
 *      都没有,包括构造代码块
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(IA.A);
        System.out.println(ASon.A);
        IA.testStatic();
        //ASon.testStatic();
    }
}

//声明一个接口IA
//Modifier 'abstract' is redundant for interfaces
interface IA {
    /*static {

    }
    {

    }*/
    //public IA(){}

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
    default void testDefault() {
        System.out.println("我是接口中的默认实现方法");
    }

    //定义接口中的static方法
    static void testStatic() {
        System.out.println("我是接口中的静态方法");
    }

}

class ASon implements IA {
    @Override
    public void test() {
        System.out.println("ASon");
    }
}
