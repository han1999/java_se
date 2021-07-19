package com.cskaoyan.javase.object._6clone;

/**
 * @description: 标记接口/空接口的作用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 思考:
 *      一个类实现了一个空接口,它没有得到任何成员,那么它发生了什么变化呢?
 *      它原本和该接口没有任何关系,但是一旦实现它,就会成为该接口的子类
 *
 * instanceof关键字:
 *      引用 instanceof 类名/接口名
 * 判断该引用所指向的对象是否是后面类名/接口名的对象或者子类对象,当后面写的是抽象类或者接口名时,左边引用判断的就是
 *      接口或者抽象类的子类对象
 *
 * 以上: 我们可以使用instanceof关键字来判断一个类是否实现空接口,实现了空接口才能做其他操作,没有实现,就给它报错,抛出异常等等操作
 *      所以空接口也常被称之为标记接口
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        judgeObjectImplEmpty(a);
        B b = new B();
        judgeObjectImplEmpty(b);
    }

    public static void judgeObjectImplEmpty(Object o){
        if (o instanceof  EmptyInterface){
            //返回true,表示该对象是空接口的子类对象
            System.out.println("你实现了空接口,你通过了检查,你可以去做克隆操作了");
        }else {
            System.out.println("你没有实现空接口,你不能做克隆操作,抛出异常");
        }
    }
}
interface EmptyInterface{}
class A implements EmptyInterface{}
class B{}