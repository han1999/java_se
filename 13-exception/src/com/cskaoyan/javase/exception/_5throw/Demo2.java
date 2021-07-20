package com.cskaoyan.javase.exception._5throw;

/**
 * @description: throw使用案例
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * throw使用案例:
 *      结合成员变量的封装和set方法
 *      判断输入的参数是否合法（IllegalArgumentException）
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.setAge(70);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("请修改年龄信息");
        }
        System.out.println("数据正常,存入数据库");
        System.out.println("仍然继续正常执行!");
    }
}

class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("你不能穿越回去");
        } else if (age > 150) {
            throw new IllegalArgumentException("您修仙成功了吗?");
        }
        this.age = age;
    }
}
