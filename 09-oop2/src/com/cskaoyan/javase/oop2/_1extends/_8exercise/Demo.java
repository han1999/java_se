package com.cskaoyan.javase.oop2._1extends._8exercise;

/**
 * @description: 牛刀小试
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 总结目前为止类加载的时机:
 *      1,执行main方法,触发包含main方法的类的类加载
 *      2,创建对象,触发创建对象类的类加载
 *      3,访问静态成员,触发该静态成员所属类的类加载
 *      4,只要触发子类的类加载,那么就会先类加载父类(不论子类是何种方式触发类加载)
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("main方法开始执行了!");
        PrimaryStudent primaryStudent = new PrimaryStudent(666,888,"hello");
        System.out.println(primaryStudent.psVar);
    }
}
class Person {
    static {
        System.out.println("Person类加载");
    }
    {
        System.out.println("Person构造代码块");
    }
    public Person() {
        //隐含了super()
        System.out.println("Person类的无参构造");
    }
}
class Student extends Person {
    static {
        System.out.println("Student类加载");
    }
    {
        System.out.println("Student构造代码块");
    }
    int sVar;
    String sVarString;
    public Student() {
        System.out.println("Student类无参构造");
    }
    public Student(int sVar) {
        //隐含了super()
        System.out.println("Student int构造方法");
        this.sVar = sVar; //sVar = 888
    }
    public Student(int sVar, String sVarString) {
        this(sVar);
        System.out.println("Student int String构造方法");
        this.sVarString = sVarString; //sVarString = hello
    }
}
class PrimaryStudent extends Student {
    static {
        System.out.println("PrimaryStudent类加载");
    }
    {
        System.out.println("PrimaryStudent构造代码块");
    }
    int psVar = 10;
    public PrimaryStudent(int psVar, int sVar, String sVarString) {
        super(sVar, sVarString);
        System.out.println("PrimaryStudent类的三参构造");
        this.psVar = psVar = 10; //非标准格式构造器 666
    }
}