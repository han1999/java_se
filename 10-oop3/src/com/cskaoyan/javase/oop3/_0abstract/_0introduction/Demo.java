package com.cskaoyan.javase.oop3._0abstract._0introduction;

/**
 * @description: 抽象类的引入
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 思考
 * Animal类的继承体系，有什么问题？
 * - 从代码角度上，有没有冗余代码？
 * 在Animal类当中,实际上我们没有调用它的shout()方法
 * 理想情况下,它的方法体是多余的,我们希望这个方法没有方法体,就是用来被继承的,被重写的
 *
 * - 从设计角度上，在这个案例中，会存在一个“动物”对象吗？
 * 没有,我们在整个案例当中创建的都是具体的某种动物的对象,我们不会创建Animal对象
 * 所以在我们这个案例中,Animal是一种抽象的概念,它仅仅表示一个动物的概念,它不是一个具体存在动物
 * ---> 既然是抽象的动物概念,那么你不能描述一个抽象的东西的叫声,shout方法不应该有方法体
 * ---> 抽象的概念不存在它的实体,于是它就不应该能够创建对象
 *
 * 以上总结:
 *      1,Animal类不应该创建对象
 *      2,Animal当中的shout方法,不应该有方法体
 *
 * 于是立刻去掉shout方法的方法体,然后加一个分号,但是这个时候方法报错了:
 * Missing method body, or declare abstract
 * 一个方法要么就有方法体,要么应该声明为抽象(方法)
 *
 * 如何声明一个抽象方法?
 * 语法:
 *      [修饰符列表] abstract 返回值类型 方法名(形参列表);
 *  上述语法表示声明一个抽象方法,它没有方法体(没有大括号),但是不要忘记分号
 *
 * 给shout方法声明为抽象方法后,又报错了:
 *  Abstract method in non-abstract class
 *  Class 'Animal' must either be declared abstract or implement abstract method 'shout()' in 'Animal'
 *  以上说明:  一个抽象方法必须在一个抽象类中
 *
 *  如何声明一个抽象类?
 *  语法:
 *      [访问权限修饰符] abstract class 类名{
 *
 *      }
 *  以上语法表示声明了一个抽象类,抽象类当中允许使用抽象方法,抽象类无法创建对象
 *
 *  以上,我们声明了抽象类Animal,并且在其中声明了一个抽象方法shout();
 *  现在Animal继承体系改造完成了,两个需求都实现了,接下来我们测试一下代码,测试一下多态调用
 *
 *  首先要明确,抽象类也是类,它的子类也是子类,所以仍然可以使用父类引用指向子类对象
 *  经过测试,代码改造后,仍然能够正常使用多态,改造没有问题
 *
 */
public class Demo {
    public static void main(String[] args) {
        //'Animal' is abstract; cannot be instantiated
        //Animal a = new Animal();
        Animal a = new Cat();
        a.shout();
        a = new Dog();
        a.shout();
    }
}

abstract class Animal {
    //'{' or ';' expected
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