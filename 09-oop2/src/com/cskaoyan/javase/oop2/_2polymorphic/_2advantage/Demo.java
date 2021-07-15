package com.cskaoyan.javase.oop2._2polymorphic._2advantage;

/**
 * @description: 多态的优缺点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 引例
 * - 科学家要收集动物的叫声去研究
 * - 定义猫，狗实际动物类，它们都会叫
 * - 定义收集猫、狗叫声的方法
 * - 要收集猪的声音，怎么办呢
 *
 * 当方法的形参当中,写的是一个类的引用,表示可以传入它自身的对象或者子类对象
 * 引申: 当方法的返回值类型写一个类时,表示可以返回它自身类型的对象,也可以是子类对象
 *
 * 总结一下:
 *      多态的优点:
 *          1,使用多态可以简化代码
 *          2,多态可以提升程序的扩展性,可维护性
 *      多态的缺点:
 *          多态时,对象是由父类引用指向的,所以它不能访问子类独有成员
 *          如果想访问,必须强转(强转是非常危险的)
 *
 *
 * 最后,我们希望研究人类,但是让人类过来协助你研究,需要加钱,
 *      所以人类在叫之前需要加点钱,人就有额外的一个方法叫"加钱"
 *
 * 引用数据类型的强制类型转换:
 *      把一个父类类型引用转换成子类类型的引用,在继承当中属于自上而下,称之为"向下转换",也就是强制类型转换
 * 强制类型转换的条件:
 *      1,必须发生在父子关系当中,如果强转成一个没有父子关系的引用类型,就会编译报错
 *      2,可以强转成任何一个子类类型的引用(语法上不报错)
 *      3,但是想要强转真正能够成功,必须强转成该父类引用所指向的子类对象的真实类型的引用
 *
 * 引用数据类型强转失败的后果:
 *      JVM会抛出ClassCastException异常
 *      它失败的原因是,把一个对象的父类引用错误的强转成一个子类引用
 *
 * 引用数据类型强转失败后往往会抛出异常,导致程序终止,这个操作是非常危险,所以我们要在做该操作之前去判断一下,能否执行该操作
 *
 * instanceof关键字的使用:
 *      对象名(引用) instanceof 类名
 * 该表达式是一个布尔类型表达式,它的结果是true或者false
 *      instanceof会判断引用所指向的对象是否是后面类名的对象(或者子类对象)
 *      如果是,返回true,如果不是,返回false
 *      需要注意的是: null instanceof 任何类 返回值都是false
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*collectAnimalVoice(new Cat());//Animal a = new Cat();
        collectAnimalVoice(new Dog()); //Animal a = new Dog();
        collectAnimalVoice(new Pig()); //Animal a = new Pig();

        collectAnimalVoice(new Person());*/

        instanceofTest(new Cat());
        instanceofTest(new CatSon());
        instanceofTest(null);

        Cat c = new Cat();
        //if (c ){
        //
        //}
        System.out.println();
    }

    //每次研究动物叫声,都需要写一个新的方法显然太麻烦
    //思考: 能不能给方法传入一个Animal的引用指向的对象呢?
    //当然是可以的,这个时候方法就不止能传入Animal对象了,还能传入它的子类对象
    //该方法研究动物叫声
    public static void collectAnimalVoice(Animal a) {

        //研究人类要加钱,但是这时的引用是一个父类引用,它无法访问到子类独有的成员
        //为了让该引用能够访问到子类独有的方法,就需要转换该引用的类型
        //强制类型转换需要进行判断是否符合条件,需要判断a引用所指向的对象必须是Person对象 才能强转
        if (a instanceof Person){
            //true,意味着就是Person对象,所以可以强转
            Person p = (Person) a;
            p.addMoney();
        }

        //抓动物来,让它叫
        a.shout();
        //研究收集
    }

    /*//研究狗的叫声
    public static void collectDogVoice(Dog d){
        //抓一条狗来
        //让它叫
        d.shout();
        //叫完了,收集研究
    }

    //研究猫的叫声
    public static void collectCatVoice(Cat c){
        //抓一条猫来
        //让它叫
        c.shout();
        //叫完了,收集研究
    }*/

    public static void instanceofTest(Animal a){
        if (a instanceof Cat){
            System.out.println("a引用指向了Cat对象(或者子类对象)");
        }
        else {
            System.out.println("不能匹配");
        }
    }
}

class Animal {
    String name;
    int age;

    //共有的行为: 叫
    public void shout() {
        System.out.println("动物叫");
    }
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵~");
    }
}

class Dog extends Animal {
    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Pig extends Animal {
    @Override
    public void shout() {
        System.out.println("猪叫!");
    }
}
class Person extends Animal{

    //人类独有的一个方法: 加钱
    public void addMoney(){
        System.out.println("研究我得加钱!");
    }

    @Override
    public void shout() {
        System.out.println("人叫!");
    }
}
class CatSon extends Cat{}