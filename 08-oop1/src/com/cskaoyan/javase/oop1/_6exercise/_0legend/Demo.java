package com.cskaoyan.javase.oop1._6exercise._0legend;

/**
 * @description: 面向对象基础语法练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * - 用面向对象的思想模拟LOL当中盖伦的战斗
 * 在这个案例中，我们需要什么对象？ 需要一个盖伦这个英雄的对象
 * 抽取出全体英雄的共性特征得到一个类：Legend
 * 属性：name，Q技能，W技能，E技能，R技能
 * 行为：战斗（fight）
 *
 * - 用面向对象的思想模拟植物大战僵尸
 *
 */
public class Demo {
    public static void main(String[] args) {
        //创建对象
        Legend h = new Legend("盖伦", "致残打击", "勇气", "爱的魔力转圈圈", "大宝剑", "人在塔在!");
        h.fight();
    }
}

class Legend {
    //属性
    String name;
    String skillQ;
    String skillW;
    String skillE;
    String skillR;
    String lines; //台词

    //行为
    public void fight() {
        System.out.println("名字为：" + this.name + "的英雄，正在" + this.lines);
    }

    //构造方法
    public Legend() {
    }

    public Legend(String name, String skillQ, String skillW, String skillE, String skillR, String lines) {
        this.name = name;
        this.skillQ = skillQ;
        this.skillW = skillW;
        this.skillE = skillE;
        this.skillR = skillR;
        this.lines = lines;
    }
}
