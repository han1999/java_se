package com.cskaoyan.javase.oop2._1extends._11final._1clazz;

/**
 * @description: final修饰class
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * final修饰class表示最终的class,最后的类
 * 语法:
 *  [访问权限修饰符] final class 类名{
 *
 *  }
 * 以上表示定义一个final修饰的类,定义了一个最终的类,表示该类无法被继承(没有子类了)
 *
 * 注意:
 * 1,什么样的类需要使用final修饰?
 *      ---> 什么样的类不需要被继承?
 *      a,当一个类的成员不需要被复用时
 *      b,当一个类的功能和设计足够强大时,不需要使用子类继承和扩展它
 *      当满足以上两点时,我们就可以把一个类声明为final修饰,这样它就没有子类了,这样它的成员就不会有子类去使用
 *          更不会被子类修改,这样保证决定的安全性
 *      在我们实际开发中,很少见会把一个类声明为final,意义不大
 *      final主要在jdk源码当中常见,比如String、System还有四类八种基本数据类型的包装类Void
 *
 * 2，final修饰一个类表示该类无法被继承，除此之外，和普通类的使用是一样的
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        student.test();
    }
}
final class Student{
    public void test(){
        System.out.println("hello world!");
    }
}
//Cannot inherit from final 'com.cskaoyan.javase.oop2._1extends._11final._1clazz.Student'
//无法继承一个final修饰的类
//class StudentSon extends Student{}