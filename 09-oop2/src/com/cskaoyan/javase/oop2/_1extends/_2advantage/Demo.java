package com.cskaoyan.javase.oop2._1extends._2advantage;
/**
 * @description: 继承的优缺点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 练习
 * - 在一款游戏中，我们有很三种类型的鸭子，这些鸭子都有共同属性，都可以叫（cry），都可以游泳（swim）
 * - 应该怎么编写这些鸭子类？
 * - 需求更改了，这些鸭子不能游泳了，但是都会飞（fly）
 * - 最后我添加了一种鸭子，第四种鸭子，这个鸭子不会飞
 *
 * 继承的优点:
 *      1,复用代码
 *      2,继承后,对父类的修改会体现到每一个子类中,提升了代码的维护性
 *
 * 继承的缺点:
 *      继承就一定会获取父类中的成员,这些成员是否获取不是子类自身能决定的
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        ThirdTypeDuck tyd = new ThirdTypeDuck();
        System.out.println(tyd.name);
        tyd.shout();
        //tyd.swim
        tyd.fly();

        ForthTypeDuck ftd = new ForthTypeDuck();
        ftd.fly();
    }
}

class DuckFather {
    //属性
    String name;
    int age;

    //行为
    public void shout(){
        System.out.println("嘎嘎嘎");
    }
    /*public void swim(){
        System.out.println("白毛浮绿水,红掌拨清波!");
    }*/

    public void fly(){
        System.out.println("我要飞得更高!");
    }
}
class FirstTypeDuck extends DuckFather{}
class SecondTypeDuck extends DuckFather{}
class ThirdTypeDuck extends DuckFather{}
class ForthTypeDuck extends DuckFather{
    //这个鸭子不能飞
    //后面会学习一种机制,叫方法的覆盖/重写,可以一定程度弥补这个问题
    @Override
    public void fly() {
        System.out.println("我不会飞!");
    }
}