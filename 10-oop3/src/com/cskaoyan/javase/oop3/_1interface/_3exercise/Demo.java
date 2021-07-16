package com.cskaoyan.javase.oop3._1interface._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 小试牛刀
 * > 请用所学知识分析：
 * > 这个案例中有哪些抽象类，哪些接口，哪些具体类。
 * - 教练（Coach）和运动员（Sportsman）案例
 *   - 乒乓球（TableTennis）运动员和篮球（basketball）运动员
 *   - 乒乓球教练和篮球教练
 *   - 为了出国交流，跟乒乓球相关的人员都需要学习英语
 *
 *  提取出抽象类,接口,普通类
 *  抽象类: 抽象的教练,抽象的运动员
 *  普通类: 乒乓球教练,运动员还有篮球教练,运动员
 *  接口: 学习的接口
 *
 *
 * - 做一个高中学生管理系统，高一，高二，高三
 *   - 需要做一个抽象的学生类，具体类：高一学生
 *   - 并且要对学生信息进行增删改查，这就是接口里面的功能，crud工程师
 *
 */
public class Demo {
    public static void main(String[] args) {
        ILearning il = new TableTennisCoach();
    }
}
abstract class AbstractCoach{
    String name;
    int age;
    double salary;
    public abstract void teach();
}
abstract class AbstractSportsman{
    String name;
    int age;
    double bonus;
    public abstract void exercise();
}
interface ILearning{
    void learningEnglish();
}
class TableTennisCoach extends AbstractCoach implements ILearning{
    @Override
    public void teach() {
        System.out.println("我教乒乓球");
    }

    @Override
    public void learningEnglish() {
        System.out.println("我出国所以我学习英语");
    }
}
class BasketballSportsman extends AbstractSportsman{
    @Override
    public void exercise() {
        System.out.println("我打篮球!");
    }
}
