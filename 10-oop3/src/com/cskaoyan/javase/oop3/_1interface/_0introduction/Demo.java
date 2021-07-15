package com.cskaoyan.javase.oop3._1interface._0introduction;

/**
 * @description: 接口的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 引例
 * > 回想Animal继承体系的案例，现在我们把Animal设计成抽象类
 * > 产品经理给了新需求
 * - 现在有一部分猫和狗，经过了特殊训练
 *   - 都可以直立行走（Walk Upright）和骑自行车（Ride Bike）
 * - 那么该怎么去描述这群特殊的猫狗呢？
 *
 * 我们考虑定义一个新的类,SuperCat,SuperDog来继承Cat,Dog然后增加新功能:直立行走（Walk Upright）和骑自行车（Ride Bike）
 * 以上方案实现功能是可以的,但是有一定的缺陷:
 *      1,很明显,两个类当中有同名的成员方法,可以复用它们
 *      2,如果还有一些动物也经过了训练,也能够直立行走,用这种方式无法提供一种规范,也不能强制它去写这些方法
 *
 *  以上,我们考虑改进一下:
 *      抽取两个方法作为两个抽象方法,然后放进一个抽象类当中,最后让Super动物去继承这个抽象类
 *      但是理想很丰满,现实很骨感,实际上这是做不到的
 *      1,首先java不支持多继承,无法直接继承多个类
 *      2,使用继承不应该单单考虑复用成员,更重要的是考虑父子关系,是否具有"is-a"的关系
 *      显然狗,猫等动物和这些特殊技能是没有"is-a"关系的
 *
 * 于是我们需要引入新的技术,来完成需求,这个新的技术至少有两个要求:
 *      1,要求它不受多继承限制
 *      2,要不受继承的"is-a"限制
 * 这种新技术就是接口
 * 如何定义一个接口,接口的语法:
 *      接口是一种和类class同等级别的数据类型,同属于引用数据类型,用关键字interface标注该引用数据类型
 *      [访问权限修饰符,其它修饰符] interface 接口名{
 *          //接口体
 *      }
 * 接口的命名: 命名要遵循"大驼峰式命名"规范,其次有一部分程序员喜欢在接口之前加"I"表示定义了一个接口
 *
 * 接口中的方法:
 *      接口中的方法默认都是抽象方法,接口当中不能定义普通实现方法(JDK8之前)
 *
 * 接口是不受Java多继承限制的,一个类可以在继承一个类的同时再实现一个接口,我们一般把接口的"继承"称之为实现(implements)
 * 接口可以和抽象类中有抽象方法一样,同样也可以作为一种规范,约束
 * 接口可以多实现,一个类可以实现很多个接口
 *
 * 接口和继承实现它的子类之间的关系也不是"is-a"的关系,我们常常用"like-a"去描述这种关系
 * 接口和继承不同,接口更注重对功能的扩展,它不关系父子类是否是"is-a"
 *
 * 接口也是它的实现类的父类,接口的实现类就是接口的子类,所以接口也可以发生多态现象
 * 需要注意多态使用的缺点
 *
 */
public class Demo {
    public static void main(String[] args) {
        SuperPig sp = new SuperPig();
        //sp什么成员都可以访问
        Pig p = new SuperPig();
        //p引用只能访问Pig类中有的成员
        p.shout();
        //p.rideBike();
        ISpecialSkills is = new SuperPig();
        is.rideBike();
        is.walkUpright();
        //is.shout();

        A a = new SuperPig();
        //a.

        //'A' is abstract; cannot be instantiated
        //A a1 = new A();
    }
}
abstract class Animal {
    public abstract void shout();
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("猫叫");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("狗叫");
    }
}
class SuperCat extends Cat implements ISpecialSkills{
    //增加新功能
    public void walkUpright(){
        System.out.println("我是超威蓝猫,我可以直立行走");
    }
    public void rideBike(){
        System.out.println("我可以骑自行车!");
    }
}
class SuperDog extends Dog implements ISpecialSkills{
    //新增功能
    public void walkUpright(){
        System.out.println("我是超级狗,我可以直立行走");
    }
    public void rideBike(){
        System.out.println("我可以骑自行车!");
    }
}

class Pig extends Animal{
    @Override
    public void shout() {
        System.out.println("笑出了猪叫");
    }
}
class SuperPig extends Pig implements ISpecialSkills,A{

    @Override
    public void walkUpright() {
        System.out.println("直立行走");
    }

    @Override
    public void rideBike() {
        System.out.println("骑自行车");
    }
}
abstract class AbstractSkills{
    abstract void walkUpright();
    abstract void rideBike();
}
//定义一个接口
interface ISpecialSkills{
    //定义抽象方法
    abstract void walkUpright();
    abstract void rideBike();
}
interface A{

}