package com.cskaoyan.javase.oop1._9static._1basic;

/**
 * @description: static内存模型
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

import com.cskaoyan.javase.oop1._9static._0introduction.NewDemo;

/**
 *
 * 宠物公司新进了一批同样颜色的宠物，创建一个类描述这批宠物
 * - 属性：颜色，性别
 * - 行为：（static）跑，吃
 *
 * static成员称之为静态成员，包括静态成员变量和静态成员方法，都是可以直接使用类名点去访问
 *
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Pet.color);
        Pet.run();
        //NewDemo.main(null);
    }
}

class Pet {

    static String color = "白色";
    String gender;

    public static void run(){
        System.out.println("宠物能动");
    }
    public void eat(){
        System.out.println("宠物能吃");
    }
}