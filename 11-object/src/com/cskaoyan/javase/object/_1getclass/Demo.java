package com.cskaoyan.javase.object._1getclass;

/**
 * @description: getClass()方法
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Constructor;

/**
 * Object类当中的getClass()方法
 * 方法的声明:
 *      public final native Class<?> getClass();
 * 方法的访问权限是public
 * final修饰了该方法,表示它不能被重写
 * native表示该方法是一个本地方法,它的调用需要使用本地方法栈内存,本地方法指的是那些用C/C++语言实现的方法
 *      这些方法只是java调用的,而是不java语言写的,java程序员不应该关注它的具体实现,只需要了解作用即可
 * Class<?> 表示该方法的返回值是一个Class对象 <?>表示泛型
 *
 * 什么是Class对象?
 *  Class对象是此对象运行时类的对象
 *  通过运行时Class对象，程序员可以了解该类的类型信息
 *
 *  思考：
 *      1，同一个类的Class对象有几个？
 *          类加载只有一次，Class对象也只有一个
 *      2，不同类的运行时Class对象肯定不相同
 *          所以经常根据这个特性，判断两个对象是否是同一个类的对象
 *      3，Class类对象是反射的基础
 *          反射实质就是Class类的API使用
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        Teacher t = new Teacher();
        Class stuClazz = s.getClass();
        Class stuClazz2 = s2.getClass();
        Class teacherClazz = t.getClass();


        System.out.println(stuClazz == stuClazz2); //true
        System.out.println(stuClazz == teacherClazz); //false

        //> Class类的常用API
        //
        //- getName()
        //  - 获取类的全限定类名
        //- getSimpleName()
        //  - 获取类名

        System.out.println(stuClazz.getName());
        System.out.println(stuClazz.getSimpleName());
        Constructor[] constructors = stuClazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
    }
}

class Student {
    int age;

    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }
}
class Teacher{}