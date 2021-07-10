package com.cskaoyan.javase.oop1._6exercise._2callby;

/**
 * @description: 值传递
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.sun.xml.internal.ws.api.pipe.ServerTubeAssemblerContext;

/**
 * 练习：
 * 定义一个学生类，该类具有一个int属性age
 *  -在测试类中写一个方法，交换两个Student对象的age属性
 *  -请问能够交换成功吗？原因是什么？
 *
 *  -在测试类中写一个方法，交换两个Student对象的引用（地址）
 *  -请问能够交换成功吗？原因是什么？
 *
 */
public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student(18);
        Student s2 = new Student(81);
        swapAge(s1, s2);
        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println("交换前" + s1);
        System.out.println("交换前" + s2);
        swapStudentReference(s1, s2);
        System.out.println("交换后" + s1);
        System.out.println("交换后" + s2);
    }

    public static void swapAge(Student s1, Student s2) {
        int temp = s1.age;
        s1.age = s2.age;
        s2.age = temp;
    }

    public static void swapStudentReference(Student s1, Student s2) {
        Student temp = s1;
        s1 = s2;
        s2 = temp;
    }
}

class Student {
    int age;

    public Student() {
    }

    public Student(int age) {
        this.age = age;
    }
}
