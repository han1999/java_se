package com.cskaoyan.javase.oop3._0abstract._3exercise;

/**
 * @description: 小练习
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 小试牛刀
 * 我们正在开发一套员工管理系统，需要对公司内部存在的员工进行管理
 * 公司将员工分为三类，普通员工负责杂项工作，程序员负责技术开发，经理负责统筹规划
 * 普通员工包含3个属性：姓名、工号以及工资，行为是工作
 * 程序员包含3个属性：姓名、工号以及工资，行为是工作和加班（overtime work）
 * 经理包含4个属性：姓名、工号、工资以及奖金（bonus），行为是工作
 *
 * 请使用所学的知识设计该员工系统
 * 要求类中提供必要的方法进行属性访问（description）
 *
 * 这个员工系统体系如何设计？
 *      我们可以将普通员工作为父类，然后让程序员，经理去继承它，这样是可以实现功能的，但是有缺陷：
 *          1， 现在系统中仍然存在普通员工对象，他不是抽象概念，仍然是一个具体需要的对象
 *              这样如果系统中，普通员工增删了成员，就会影响到后面的员工，这显然是不合适的
 *          2，普通类当中是没有抽象方法的，抽象方法是占位用的，可以起到规范和约束的作用
 *              但是普通类做不到这一点
 *
 * 以上： 普通员工是不能做父类的，并且我们希望顶层父类是一个抽象类
 *
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*AbstractStaff as;
        as = new GeneralStaff();
        as.work();
        as = new Coder();
        as.work();
        if (as instanceof Coder) {
            Coder c = (Coder) as;
            c.overtimeWork();
        }
        as = new Manager();
        as.work();*/

        GeneralStaff gs = new GeneralStaff("张三", 10, 10000);
        gs.getDescription();
        Coder c = new Coder("李四", 18, 50000);
        c.getDescription();

        Manager m = new Manager("麻子", 27, 50000, 100000);
        m.getDescription();
    }
}

//顶层抽象员工类
abstract class AbstractStaff {
    //属性
    String name;
    int id;
    double salary;

    //行为（抽象）
    public abstract void work();

    //定义getDescription成员方法，作为子类的默认实现
    public void getDescription() {
        System.out.println("名字是：" + this.name + "的员工,ID是:" + this.id + "他的工资是: " + this.salary);
    }

    public AbstractStaff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public AbstractStaff() {
    }
}

class GeneralStaff extends AbstractStaff {
    @Override
    public void work() {
        System.out.println("杂项工作");
    }

    public GeneralStaff(String name, int id, double salary) {
        super(name, id, salary);
    }

    public GeneralStaff() {
    }
}

class Coder extends AbstractStaff {
    @Override
    public void work() {
        System.out.println("技术工作");
    }

    public void overtimeWork() {
        System.out.println("996");
    }

    public Coder(String name, int id, double salary) {
        super(name, id, salary);
    }

    public Coder() {
    }
}

class Manager extends AbstractStaff {
    double bonus;

    @Override
    public void work() {
        System.out.println("统筹规划");
    }

    @Override
    public void getDescription() {
        System.out.println("名字是：" + this.name + "的员工,ID是:" + this.id + "他的工资是: " + (this.salary + this.bonus));
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager() {
    }
}