package com.cskaoyan.javase.oop2._1extends._0introduction._1new;

/**
 * @description: 用继承改进代码 全新版本
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 根据我们刚刚学过的知识，完成如下练习：
 * - 分别定义一个表示人和学生的类
 *   - 人类：有姓名属性，以及吃饭这个行为
 *   - 学生类：有姓名，学号两个属性，同时有吃饭，学习两种行为
 *   - 教师类：有姓名，教师号两个属性，同时有吃饭，教学两种行为
 * - 代码有什么问题？
 *      1,类的成员代码是有冗余的,比如eat方法,name属性等
 *      2,代码重复没有被复用,导致程序的可维护性下降
 *
 * 为了解决上述两个问题,我们就引入了继承的概念
 *
 * 继承的语法:
 * 继承是在类的定义时使用的,可以在定义一个类时,让它继承一个类
 *   [访问权限修饰符] class 类名 extends 被继承的类{}
 *
 * 注意事项:
 *    1,我们把被继承的类称之为父类,把继承父类的类称之为子类
 *    2,子类继承父类后,就得到了父类的所有成员(普通成员)
 *    3,子类在继承一个父类后,除了能够继承父类的成员,还可以新增自己的成员,这体现继承后子类可以新增一些成员
 *    4,子类在继承父类时,父类中没有的成员是继承不到的
 *
 */
public class NewDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name); //null
        s.eat();
        System.out.println(s.stuId); //0
        s.study();
        //s.age
    }

}

class Person{
    String name;
    //int age;
    public void eat(){
        System.out.println("我要吃饭!");
    }
}

class Student extends Person{
    int stuId;

    public void study(){
        System.out.println("我要学习!");
    }
}

class Teacher extends Person{
    int teacherId;

    public void teach(){
        System.out.println("我能上课!");
    }
}
