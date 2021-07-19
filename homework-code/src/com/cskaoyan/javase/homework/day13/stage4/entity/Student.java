package com.cskaoyan.javase.homework.day13.stage4.entity;

/**
 * @description: 学生实体类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 分包，分功能，代码应该写在哪里？
 *
 *
 */
public class Student {
    private int stuId; //学号
    private String name; //姓名
    private String gender; //性别
    private String grade; //班级
    private int age; //年龄
    private String phoneNum; //手机号

    //提供get、set方法


    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    //提供构造方法

    public Student(int stuId, String name, String gender, String grade, int age, String phoneNum) {
        this.stuId = stuId;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.phoneNum = phoneNum;
    }

    public Student() {
    }

    //打印学生信息的方法
    public void printStudent() {
        System.out.println(this.stuId + "\t\t" + this.name + "\t" + this.gender + "\t\t" + this.grade + "\t" + this.age + "\t\t\t" + this.phoneNum);

    }
}
