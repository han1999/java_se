package com.cskaoyan.javase.oop2._0encapsulate._2question;

/**
 * @description: 为什么不建议性别声明为isMale
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * boolean类型的成员变量的getter方法有特殊的形式: isXxx
 * 如果刚好该成员变量就叫isXxx,那么getter方法的名字就会和成员变量的名字冲突
 * 这个时候就不容易区分成员变量的名字了
 *
 * 后面有些框架会根据一个成员变量的getter方法去获取该成员变量,如果出现上述问题,就会导致bug
 *
 */
public class Demo {
}
class Student{
    private boolean isMale;
    private boolean flag;
    private int age;

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
