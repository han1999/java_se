package com.cskaoyan.javase.oop2._1extends._5notice;

/**
 * @description: 继承的注意事项
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 1,父类的私有成员能否继承?
 *      我们直接创建子类对象去访问父类私有成员,发现确实没法访问,这可能的原因有两个:
 *          1,确实没继承
 *          2,继承了,但是没权限访问
 *      通过代码测试,我们发现,父类的私有成员是可以被继承的,但是创建子类对象去访问它,没有访问权限
 *
 * 2,父类的构造方法有没有被子类继承?
 *      首先明确一点,构造方法不算成员,构造方法也不会给子类,子类也不需要父类的构造方法
 *      子类创建自身对象就使用自身的构造器,不会去使用父类构造器(意味着不会创建父类对象),所以不需要继承
 *
 * 3,父类的静态成员会不会被子类继承?
 *      父类的静态成员也会被子类继承,但是我们讨论的继承一般不带静态成员,静态成员的继承和普通成员也不一样
 *
 * 4,某些情况可能不适合去使用继承，不要盲目使用继承
 *      比如单单为了复用几个成员去使用继承,这是不合适的
 *      比如狗和人都有名字,都有年龄,于是让狗做父类,人继承狗
 *      使用继承不仅仅需要考虑复用成员,最重要的是考虑两个类(父子类)之间的关系,考虑它们是否具有is-a的关系
 *
 *      两个类是否具有is-a的关系,可能不是那么明显,这个时候就需要参考需求文档,开发者文档,去完成类的设计
 *      云主机
 *      弹性伸缩
 *      裸金属
 *
 */
public class Demo {
    public static void main(String[] args) {
        Son s = new Son();
        System.out.println(s.getPrivateVar());
        System.out.println(Son.a);
        //System.out.println(s.a);
        Son.a = 100;
        System.out.println(Father.a);
    }
}
class Father{

    static int a = 10;
    private int privateVar = 100;

    //父类中提供get方法,get方法的权限是public 这样这个方法就会被子类继承 然后去访问该成员
    public int getPrivateVar(){
        return privateVar;
    }

}
class Son extends Father{

}