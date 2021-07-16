package com.cskaoyan.javase.homework.day10;

/**
 * @description: 接口与抽象类的练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

/**
 * 学生和老师都有共同的属性: name、gender、age
 * 共同的行为：eat() sleep()
 * 老师和学生都需要（额外地）学习知识（这里定义一个接口）
 * 请定义抽象类和接口，描述以上体系
 *
 * 然后进行测试：
 * 测试以下方式:
 * 	1，用不同的父类指向不同的子类对象，理解“编译看左边”
 * 	2，用这些引用调用方法，理解“运行时看右边”
 *
 */
public class Work4 {
    public static void main(String[] args) {
        IStudy is;
        is = new Student();
        is = new Teacher();

        Student s = new Student();
        s.test();
    }
}
abstract class AbstractPerson{
    String name;
    String gender;
    int age;
    public abstract void eat();
    public abstract void sleep();
}
class Student extends AbstractPerson implements IStudy{
    @Override
    public void eat() {
        System.out.println("学生吃了学习,学习完了就吃");
    }

    @Override
    public void sleep() {
        System.out.println("你怎么睡得着的?");
    }

    @Override
    public void learningEnglish() {
        System.out.println("学习英语考研");
    }

    @Override
    public void test() {
        System.out.println("你好中国!");
    }
}
class Teacher extends AbstractPerson implements IStudy{
    @Override
    public void eat() {
        System.out.println("上完课就去吃饭!");
    }

    @Override
    public void sleep() {
        System.out.println("每天睡几个小时!");
    }

    @Override
    public void learningEnglish() {
        System.out.println("学习英语授课");
    }
}
interface IStudy{
    void learningEnglish();
    default void test(){
        System.out.println("hello");
    }
}
