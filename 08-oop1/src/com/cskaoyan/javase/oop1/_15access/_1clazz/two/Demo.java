package com.cskaoyan.javase.oop1._15access._1clazz.two;

/**
 * @description: class的访问权限修饰符
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 访问权限修饰符在修饰类时,有且仅有两种
 *      1,public 表示在该工程下,任何位置都能够访问该类
 *          如果是同包类,直接去访问该类
 *          如果是不同包类,需要先进行导包操作,然后再访问
 *      2,(缺省)什么都不写 表示在同包下,可以任意访问该类
 *          如果是不同包下,无法访问访问该类,不是因为没有导包而无法访问,而是因为没有权限
 *
 *
 * 注意事项:
 *      1,class的访问权限要比其中的成员访问权限要高
 *          如果连class都不能访问,那么其中成员的访问权限再高(比如public)也是没用的
 *
 *      2,class的访问权限有且仅有两种,public和缺省,没有私有和受保护的权限
 *          没有private和protected两种修饰符
 *
 *     引申的: 3,class只所以不能用private和protected两种修饰符修饰
 *          是因为它们没有私有和受保护的概念
 *          如果想要它们能够被这两个修饰符修饰,就必须让它们有这两个概念
 *          这时候可以考虑把一个类放进另一类的成员位置,近似看为另一个类的成员
 *          这种类称之为内部类
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {

    }
    public class A{

    }
}
class A{
    public static int a;
}