package com.cskaoyan.javase.oop1._9static._0introduction;

/**
 * @description: static关键字的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 练习：
 * 	创建一个学生类，用来描述我们班全体同学，要求
 * 		属性：姓名，性别，年龄，学号，学校信息
 * 		行为：吃饭，学习
 *
 * 其中学校应该是一致的,对于每个对象来说都是这样的
 * 我们仍然每次都需要赋值一次,显然有点麻烦
 * 怎么解决?
 *      可以直接显式赋值
 *      也可以直接写死构造方法
 * 以上两种方式都可行,但是是有缺点的
 *      1,成员变量是独属于某个对象的,我们每创建一个对象,都有一个学校信息的属性,但实际上这个属性没必要每个对象都一个,浪费空间
 *      2,学校信息这个属性应该不是专属于某个对象的,而是被全体该类对象所共有,所共享
 *      也就是说从设计角度来讲,学校信息这个属性不应该是一个普通的成员变量
 *
 * 所以,为了解决以上两个缺点,引入了static关键字
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建学生对象
        WangDaoStudent s1 = new WangDaoStudent("张三", "王道训练营");
        WangDaoStudent s2 = new WangDaoStudent("李四", "王道训练营");
        WangDaoStudent s3 = new WangDaoStudent("马云", "王道训练营");
    }
}
class WangDaoStudent{
    String name;
    String gender;
    //boolean isMale; //isFemale 这种方式表示性别理论上是可行的,但是不推荐这种方式
    int age;
    int stuId;
    String schoolName = "王道训练营";


    public void eat(){
        System.out.println("民以食为天");
    }
    public void sleep(){
        System.out.println("学累了睡觉!");
    }

    //构造方法
    public WangDaoStudent(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

    public WangDaoStudent(String name) {
        this.name = name;
        this.schoolName = "王道训练营";
    }

    public WangDaoStudent() {
    }
}