package com.cskaoyan.javase.oop1._6exercise._1pvz;

/**
 * @description: 僵尸类
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

public class Zombie {
    //僵尸类
    //  属性: 血量,攻击力,名字
    //  行为: 移动,吃(脑子),攻击(植物),被攻击
    int hp;
    int attackValue;
    String name;

    //在成员列表中,持有需要交互对象的引用(对象)
    Plant zPlant;

    public void move() {
        System.out.println(this.name + "要接近你的脑子了!");
    }

    public void eat() {
        System.out.println("唉呀妈呀真香!");
    }

    public void attack() {
        System.out.println(this.name + "正在攻击" + zPlant.name);
    }

    public void beAttack() {
        System.out.println(this.name + "被" + zPlant.name + "攻击了,还剩下" + (this.hp - zPlant.attackValue) + " 点血量!");
    }

    //构造方法

    public Zombie() {
    }

    public Zombie(int hp, int attackValue, String name) {
        this.hp = hp;
        this.attackValue = attackValue;
        this.name = name;
        this.zPlant = zPlant;
    }
}
