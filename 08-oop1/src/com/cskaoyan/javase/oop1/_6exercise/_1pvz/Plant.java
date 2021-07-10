package com.cskaoyan.javase.oop1._6exercise._1pvz;

/**
 * @description: 植物类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Plant {
    //植物类
    //  属性: 血量,攻击力,名字
    //  行为: 攻击(僵尸),被攻击
    int hp;
    int attackValue;
    String name;

    //将僵尸对象的引用加入植物类的成员列表
    Zombie pZombie;

    public void attack() {
        System.out.println(this.name + "开始攻击" + pZombie.name + "了!");
    }

    public void beAttacked() {
        System.out.println(this.name + "被" + pZombie.name + "攻击了,还剩下" + (this.hp - pZombie.attackValue) + " 点血量!");
    }

    //构造方法

    public Plant() {
    }

    public Plant(int hp, int attackValue, String name) {
        this.hp = hp;
        this.attackValue = attackValue;
        this.name = name;
        //this.pZombie = pZombie;
    }
}
