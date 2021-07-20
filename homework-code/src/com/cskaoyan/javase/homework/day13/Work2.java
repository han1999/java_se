package com.cskaoyan.javase.homework.day13;

/**
 * @description: 深度克隆练习题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 有一个Teacher类
 * 属性：int age;String name;Student s
 * 学生类Student
 * 属性：int age；String name；Star s
 * 明星类Star
 * 属性：int age，String name
 *
 * 尝试深度克隆Teacher对象
 * 结合String的不可变性，想一想String虽然是引用数据类型，需要进行深度克隆吗？
 *
 */
public class Work2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Test
        Teacher t = new Teacher(18, "马云", new Student(10, "马化腾", new Star(99, "张三")));
        Teacher cloneTeacher = (Teacher) t.clone();
        //System.out.println(t == cloneTeacher);
        //System.out.println(t);
        //System.out.println(cloneTeacher);

        System.out.println(cloneTeacher);
        System.out.println(t);
        System.out.println("-----------------------");
        System.out.println(cloneTeacher.s);
        System.out.println(t.s);
        System.out.println("-----------------------");
        System.out.println(cloneTeacher.s.s);
        System.out.println(t.s.s);
        cloneTeacher.name = "新垣结衣";
        System.out.println(cloneTeacher.name);
        System.out.println(t.name);


    }
}

class Teacher implements Cloneable {
    int age;
    String name;
    Student s;
    public Teacher() {
    }
    public Teacher(int age, String name, Student s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        //进行深度克隆，克隆student对象
        Teacher cloneTeacher = (Teacher) super.clone();
        //拿到这个教师对象的副本
        //克隆student对象
        Student cloneStu = (Student) this.s.clone();
        //把克隆教师对象中的s引用指向克隆的stu副本
        cloneTeacher.s = cloneStu;
        return cloneTeacher;
        //return super.clone();
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //
    //    Teacher teacher = (Teacher) o;
    //
    //    if (age != teacher.age) return false;
    //    if (name != null ? !name.equals(teacher.name) : teacher.name != null) return false;
    //    return s != null ? s.equals(teacher.s) : teacher.s == null;
    //}

    //@Override
    //public int hashCode() {
    //    int result = age;
    //    result = 31 * result + (name != null ? name.hashCode() : 0);
    //    result = 31 * result + (s != null ? s.hashCode() : 0);
    //    return result;
    //}
}

class Student implements Cloneable {
    int age;
    String name;
    Star s;
    public Student() {
    }
    public Student(int age, String name, Star s) {
        this.age = age;
        this.name = name;
        this.s = s;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        Student cloneStu = (Student) super.clone();
        Star cloneStar = (Star) this.s.clone();
        //把克隆的stu对象中的star引用指向克隆的star对象
        cloneStu.s = cloneStar;
        return cloneStu;
    }
}

class Star implements Cloneable{
    int age;
    String name;
    public Star() {
    }
    public Star(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
