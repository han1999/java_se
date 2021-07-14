package com.cskaoyan.javase.oop2._1extends._9fieldhidden;

/**
 * @description: 父子类同名的static成员变量
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 类的静态成员是被全体对象共享的，独属于某个类，而不是对象
 * 所以父子类当中，如果出现同名静态成员变量，这就意味着它们是两个独立的
 *      静态成员变量，只不过是恰好同名了
 *
 * 如果父类中有静态成员变量，而子类没有，那么这个父类的静态成员就会被子类继承
 *      并且父子类（两个类）共享一个静态成员
 *
 * 最后，静态成员不要考虑它的继承，如果一个静态成员属于父类，那么就用父类类名去访问它，没有必要去使用子类类名访问
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        /*System.out.println(Person.age);
        System.out.println(Student.age);

        Person.age = 20;
        System.out.println(Student.age);*/

        System.out.println(Person.name);
        System.out.println(Student.name);
        Student.name = "李四";
        System.out.println(Person.name);
    }
}
class Person{
    static int age = 10;
    static String name = "张三";
}
class Student extends Person{
    static int age = 100;
}
