package com.cskaoyan.javase.oop2._1extends._3protected._0onepackage;

/**
 * @description: 当前类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * (缺省)默认的访问权限,在同包下可以随意访问,不论是否是子类
 *      如果是非同包的类,是无法访问该成员的
 *
 *  protected访问权限:
 *      1,包含默认权限,所以同包下可以任意访问
 *      2,不同包下,子类当中可以访问,非子类无法访问
 *          a,如果该成员是静态成员,可以直接用父类类名点访问,那么在不同包下,可以在子类中直接访问
 *          b,如果该成员是普通成员,就必须创建对象去访问,那么在子类中,它有几种访问形式?
 *          1,直接创建父类对象,然后用父类对象名访问该protected成员
 *          2,直接创建子类自身对象,然后用子类引用访问该protected成员
 *          3,创建该子类"兄弟类"的对象,然后访问该protected成员
 *
 *
 */
public class CurrentClazz {
    static int anInt = 10;
    protected static int protectedVar = 20;
    protected int protectedVarMember;
}
