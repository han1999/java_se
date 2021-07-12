package com.cskaoyan.javase.oop1._9static._3usecase;

/**
 * @description: static关键字的使用场景
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * static无非就是就是静态的成员变量和成员方法
 * 1,static静态成员变量
 *      用于那些被全体对象所共享的成员变量
 *      比如说,全体中国人的国籍
 *      统计创建对象的次数
 *
 * 2,static静态成员方法
 *      用于工具类中,因为它的调用无需创建对象,调用起来十分方便
 *
 *      实际上静态成员方法还经常用于给静态成员变量赋值
 *      虽然普通成员方法也能用于赋值,但是依赖于创建对象,是比较少用的
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Person.age); //18
        Person.setAgeValueStatic(28);
        System.out.println(Person.age); //28

        Person p = new Person();
        p.setAgeMember(77);
        System.out.println(Person.age);

    }
}

class Person{
    static int age = 18;

    public static void setAgeValueStatic(int age){
        //给静态成员变量age赋值
        Person.age = age;
    }

    public void setAgeMember(int age){
        Person.age = age;
        //不推荐的方式
        //this.age = age;
    }

}
