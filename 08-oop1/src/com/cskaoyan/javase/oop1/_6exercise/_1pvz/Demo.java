package com.cskaoyan.javase.oop1._6exercise._1pvz;

/**
 * @description: 用面向对象的思想模拟植物大战僵尸
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 肯定需要两个对象,僵尸对象和植物对象
 * 需要两个类:
 *      1,僵尸类
 *          属性: 血量,攻击力,名字
 *          行为: 移动,吃(脑子),攻击(植物),被攻击
 *
 *      2,植物类
 *          属性: 血量,攻击力,名字
 *          行为: 攻击(僵尸),被攻击
 *
 * 后面会有框架帮助我们创建和管理对象,使用框架就不存在谁先创建对象,谁后创建对象的问题
 *
 */
public class Demo {
    public static void main(String[] args) {

        Plant p = new Plant(1000, 300, "豌豆射手");
        Zombie z = new Zombie(2000, 100, "铁桶僵尸");
        //互相持有对方对象的引用
        p.pZombie = z;
        z.zPlant = p;


        //测试一下: 植物大战僵尸开始了
        System.out.println("Game Start");
        z.move();
        p.attack();
        z.beAttack();
        z.attack();
        p.beAttacked();

        z.eat();
    }
}
