package com.cskaoyan.javase.oop1._9static._0introduction;

/**
 * @description: static关键字的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import javax.xml.transform.sax.SAXTransformerFactory;

/**
 * 练习：
 * 	创建一个学生类，用来描述我们班全体同学，要求
 * 		属性：姓名，性别，年龄，学号，学校信息
 * 		行为：吃饭，学习
 *
 * 使用static关键字修饰学校信息这个属性,使它成为全体学生对象所共享的属性
 *      这样做:
 *      1,节省空间
 *      2,符合设计思想
 * 语法:
 *      [访问权限修饰符] static 数据类型 变量名;
 * 以上语法表示正在声明一个static修饰的静态成员变量,静态成员变量不属于某个对象,而是被全体对象所共享
 *
 * 静态成员变量的特点:
 *      1,也具有默认初始化,具有默认值,默认值和成员变量是一样的
 *      2,不推荐使用对象名点访问,推荐使用类名点访问
 *      3,它是全体对象所共享的,无论是用对象名点修改还是类名点修改,都会跟着一起改变
 *      4,static修饰的静态成员变量的访问不依赖于对象,换句话说即使对象不存在,静态成员变量仍然存在
 *            static修饰的静态成员变量的初始化过程是在类加载的时候进行的
 *
 *
 *
 */
public class NewDemo {
    public static void main(String[] args) {
       /* //创建学生对象
        WangDaoJavaStudent s1 = new WangDaoJavaStudent("张三");
        //Static member 'com.cskaoyan.javase.oop1._9static._0introduction.WangDaoJavaStudent.schoolName' accessed via instance reference
        //警告你: 一个静态的成员变量被对象的引用所访问了 这种方式是不推荐的
        //静态成员变量不属于对象,而属于全体对象,换句话说属于类,所以推荐使用类名点访问
        //System.out.println(s1.schoolName);
        System.out.println(WangDaoJavaStudent.schoolName);
        System.out.println(s1.schoolName);
        WangDaoJavaStudent s2 = new WangDaoJavaStudent("马明");
        s1.schoolName = "王道Java训练营";
        System.out.println(s1.schoolName);
        System.out.println(WangDaoJavaStudent.schoolName);*/

       //static关键字修饰的最主要特点
        System.out.println(WangDaoJavaStudent.schoolName);

        test();
    }

    public static void test(){

    }
}

class WangDaoJavaStudent {
    String name;
    String gender;
    //boolean isMale; //isFemale 这种方式表示性别理论上是可行的,但是不推荐这种方式
    int age;
    int stuId;
    static String schoolName = "王道训练营";


    public void eat() {
        System.out.println("民以食为天");
    }

    public void sleep() {
        System.out.println("学累了睡觉!");
    }

    //构造方法

    public WangDaoJavaStudent() {
    }

    public WangDaoJavaStudent(String name) {
        this.name = name;
    }
}