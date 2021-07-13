package com.cskaoyan.javase.oop2._1extends._6initialization;

/**
 * @description: 子类对象的初始化问题
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 什么是子类对象的初始化问题?
 *   回顾一下,我们认识引用数据类型的过程:
 *      1,我们通过数组了解了引用数据类型,知道了引用数据类型是由两部分组成的:
 *          a,栈上创建引用
 *          b,堆上创建对象
 *      我们只能通过栈上的引用间接的访问堆上的对象,但是堆上的对象才是引用数据类型的本质
 *
 *      2,接下来我们通过对象的初始化,重新认识了引用数据类型:
 *          引用数据类型是一种自定义的数据类型,是成员变量和方法的集合
 *          这种自定义数据类型是JVM没有预先定义的,它是不了解的
 *          所以我们想要创建对象,必须先让jvm了解认识该类型,这个过程被称之为"类加载"
 *
 *      3,今天我们学习了继承,知道子类要继承父类所有的成员,父类的成员变量子类都可以去访问(权限允许)
 *          这些父类的成员显然不是凭空去产生的,它们肯定有一个创建的过程
 *          所以子类对象初始化问题,就是研究它们的创建: 怎么创建?何时创建?顺序是什么样的?
 *
 * 练习
 * - 创建一个Person类，有name属性和eat方法
 * - 创建一个Star类，有stageName属性和sing方法
 * - Star类要继承Person类
 * - 创建Star类对象，画出这个过程的内存图
 *
 *
 * 通过画子类对象初始化的内存图，作以下总结：
 *      1，类加载，父类要类加载，类加载是先父后子的
 *      2，子类对象初始化时，只创建了子类对象一个对象
 *      3，子类对象当中存在一片独立的空间存放那些父类中的成员变量
 *      4，父子类成员变量的赋值顺序是先父后子
 *
 * 以上就是子类对象的初始化的过程，在这个过程当中，存在两个“先父后子”
 * 类加载过程中的先父后子，是由JVM的设计去保证
 * 但是请思考： 父子类成员变量赋值的先父后子又是怎么保证的呢？
 *  我们通过父子类的构造代码块的执行顺序，发现构造代码块是先父后子执行的 ---> 它们的构造器也是先父后子执行的
 *
 * 我并没有在子类的任何地方写代码去调用父类的构造方法，为什么父类的构造方法被调用，并且先父后子？
 * 子类对象初始化的两种形式：
 *
 *      1，隐式的子类对象初始化：
 *      在java当中,一个构造方法的第一行如果没有this或者super去直接的调用某个构造器,那么它的第一行会自动的隐含super()表示调用父类的无参构造方法
 *      这样在子类对象初始化时,就能保证父类的成员变量先完成赋值,实现"先父后子"
 *
 *      2，显式的子类对象初始化：
 *      隐式的子类对象初始化虽然能够保证“先父后子”,但是它有一个非常明显的缺点: 在创建子类对象时,无法完成父类对象成员变量的赋值,所以如果想要给父类成员变量赋值,需要显式的子类对象初始化
 *      所谓显式,指的是在子类构造器的第一行,显式用super(形参列表)去调用父类的某个构造器,完成父类成员变量的赋值
 *
 *      注意事项:
 *          1,super在子类构造器中表示去调用父类的构造器时,和this调用构造器一样,也必须在第一行
 *          2,super和this在表示调用构造器时,是不能共存,因为它们都想争第一行
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //Star s = new Star();
        //System.out.println(s.stageName);
        Star s = new Star("张三", "路边的张三");
        System.out.println(s.stageName); //路边的张三
        System.out.println(s.name); // 张三
    }
}

class Person {
    //static {
    //    System.out.println("Person类类加载完毕！");
    //}
    {
        System.out.println("Person类的构造代码块执行了");
    }

    String name = "长风";

    public void eat() {
        System.out.println("人要吃饭!");
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}

class Star extends Person {
    {
        System.out.println("Star类的构造代码块执行了");
    }

    //static {
    //    System.out.println("Star类类加载完毕！");
    //}
    String stageName = name + "的爸爸"; //花名 艺名

    public void sing() {
        System.out.println("我会唱歌1");
    }

    //默认无参构造方法
    public Star() {
        //如果第一行隐含了super()表示调用父类的无参构造方法,符不符合代码现象?
    }

    public Star(String name, String stageName) {
        //显式子类对象初始化,需要使用super去调用父类构造方法
        super(name);
        this.stageName = stageName;

    }
}
