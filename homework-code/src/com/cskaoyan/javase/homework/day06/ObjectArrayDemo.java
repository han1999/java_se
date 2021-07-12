package com.cskaoyan.javase.homework.day06;

/**
 * @description: 对象数组练习题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class ObjectArrayDemo {
    public static void main(String[] args) {
        JavaStudent s1 = new JavaStudent(1, "张三", "女", 18, 90);
        JavaStudent s2 = new JavaStudent(2, "李四", "男", 27, 30);
        JavaStudent s3 = new JavaStudent(3, "王二", "男", 48, 48);
        JavaStudent s4 = new JavaStudent(4, "麻子", "女", 30, 60);
        JavaStudent s5 = new JavaStudent(5, "蔡徐坤", "女", 18, 86);
        //动态初始化创建一个JavaStudent对象数组
        JavaStudent[] js = new JavaStudent[5];
        js[0] = s1;
        js[1] = s2;
        js[2] = s3;
        js[3] = s4;
        js[4] = s5;
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("第" + (i + 1) + "个学生信息为:");
            js[i].print();
            sum += (js[i].java);
        }
        System.out.println("平均成绩是:" + (sum / 5));

        for (JavaStudent j : js) {
            j.print();
        }
    }
}

class JavaStudent {
    int id;
    String name;
    String gender;
    int age;
    double java;

    public JavaStudent() {
    }

    public JavaStudent(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public JavaStudent(int id, String name, String gender, int age, double java) {
        this(id, name, gender, age);
        this.java = java;
    }

    public void print() {
        System.out.println("该学生姓名为:" + this.name + "学号为" + id + "性别为" + gender + "年龄为" + age + "java成绩为" + java);
    }
}