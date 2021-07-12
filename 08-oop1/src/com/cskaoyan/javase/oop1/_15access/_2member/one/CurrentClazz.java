package com.cskaoyan.javase.oop1._15access._2member.one;

/**
 * @description: 访问权限修饰符修饰类的成员
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 访问权限修饰符修饰类的成员时都可以使用:
 *  1，public：任意类均访问，实际就是没有限制访问权限
 * ​	2，protected：同包中的其他类，和不同包的(可见)子类均可见，一部分类可以访问到，一部分不行。
 * ​	3，(default)(默认权限，隐式定义，不写任何关键字)，同包中的其他类可见，不关心是不是子类
 * ​	4，private，仅对同类中的其他成员可见
 *
 */
public class CurrentClazz {
    private static int a;
    static int b = 10;
    public static int c = 20;

    public static void main(String[] args) {
        System.out.println(CurrentClazz.a);
        System.out.println(CurrentClazz.b);
    }
}
