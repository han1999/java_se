package com.cskaoyan.javase.oop2._1extends._11final._3variable._2member;

/**
 * @description: final修饰成员变量
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * final修饰一个对象的成员变量表示该成员变量的取值不可更改,成为了一个常量,但是不影响它在内存中的位置以及使用方式
 * final修饰成员变量时,它的取值不可更改,所以必须给出一个初始值,并且这个初始值不能是默认值
 * 排除默认值,它的赋值方式还有:
 *      1,显式赋值
 *      2,构造代码块赋值
 *      3,构造器赋值
 * final修饰成员变量必须要求它的取值,在创建对象时就固定,也就是说必须用上述三种方式的其中一种,也只能用一种.
 *
 * 需要注意的是: 当你使用构造器方式赋值时,必须保证每一个构造器都能完成对该final成员变量的赋值,否者就会报错
 *
 * 当使用一个final修饰成员变量时,虽然它是一个常量,但它终究是属于对象的,这就意味着类的不同对象当中它的取值有可能是不同的
 * 也就是这个所谓的常量,实际上是某个对象的常量.而不是全体对象的一个常量
 * 这一点和我们普遍认知的常量是有不同的,我们希望不管创建多少对象,这个常量它的值都是固定的
 *
 * 以上,我们日常开发中使用的final常量,最多的是final修饰的静态常量,final修饰静态常量,该常量在整个类的全局都是一个常量
 * 都是固定的,我们称之为"全局(静态)常量"
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.age);
        //s.age = 99;

        Student s2 = new Student(88);
        System.out.println(s2.age);
        //s2.age = 99;
    }
}
class Student{
    //Variable 'age' might not have been initialized
    final int age ;
    //{
    //    age = 100;
    //}
    public Student(int age){
        this.age = age;
    }

    public Student() {
        this.age = 18;
    }
}