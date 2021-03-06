package com.cskaoyan.javase.oop2._1extends._9fieldhidden;

/**
 * @description: 属性的隐藏
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 父子类当中的属性(成员变量)能否出现同名的情况?
 *  当然可以
 * 如果父子类当中存在同名的成员变量,这时候如果创建子类对象,直接对象名点访问该成员变量,结果是什么?
 *  结果体现出子类中的赋值
 * 为什么体现出子类的赋值,为什么不是父类的赋值?
 *  猜测1: 子类中的同名成员变量把父类中的同名成员变量覆盖了
 *  猜测2: 因为某种机制的原因,父类的同名成员没有被覆盖,而是被隐藏了
 * 显然通过父类中提供get方法,子类对象仍然可以访问该成员,所以父子类同名成员变量,父类中成员变量是被隐藏,而不是覆盖
 *
 * 接下来我们重点研究属性隐藏过程中的,对象名点访问成员变量的机制
 *  这里首先要明确,我们现在创建对象有三种形式:
 *      1,创建父类对象,用父类引用指向
 *      2,创建子类对象,用子类引用指向
 *      3,创建子类对象,用父类引用指向
 *
 *  接下来,首先研究它们对象名点访问成员变量的范围(权限允许的情况下):
 *      1,可以访问父类中成员变量,但是访问不到子类独有的成员变量
 *      2,可以访问父子类中所有的成员变量
 *      3,可以访问父类中的成员变量,但是访问不到子类独有的成员变量(想要访问需要强转)
 *
 * 以上总结: 当你使用对象名点访问成员变量时,它的访问范围是根据引用的数据类型决定的，换句话说，编译器是根据引用的数据类型来查看该引用能够访问的成员变量的范围
 *
 * java当中通过对象名点访问成员变量,存在这样的检索机制(编译器的检索机制):
 *      首先从引用的类中去找该成员变量,如果找不到就去父类的类中去找该成员变量,如果所有的父类直到Object,都找不到该成员变量,就意味着该成员变量无法访问,于是就会编译报错
 *     在java当中一个类是明确直到它是有几个父类,但是一个父类是无法感知到自己到底有多少子类的,父类感知不到子类,子类可以感知到父类
 *
 * 接下来，还需要研究对象名点访问成员变量的结果：
 *      1，其结果是引用的类型中结果
 *      2，其结果也是引用的类型中的结果
 *      3，其结果也是引用的类型中的结果
 *
 * 以上总结： 当使用对象名点访问成员变量时，在能够访问到的情况下，其结果是由引用的类型来决定的
 *
 * 以上全部总结一下：
 *      对象名点访问成员变量，其访问范围和访问结果（合起来称访问）不需要程序执行起来，在程序的编译时期就能够确定
 *
 *  注意事项：
 *     1，父类中被隐藏的属性可以使用父类的get方法去访问，还可以使用super关键字去访问它（这两种访问方式都可以，但是它们都受访问权限限制）
 *     2，在日产开发中，多数情况下，成员变量都是私有
 *     所以对象名点访问或者super点访问，实际开发很少使用
 *     3，static静态的成员变量也是可以被子类继承的，但是如果它们同名了，会出现什么现象呢？
 *      静态成员变量属于类，我们一般不考虑静态成员的继承，它们也不是覆盖或者隐藏，而是两个独立的成员
 *
 */
public class Demo {
    public static void main(String[] args) {
        /*Son s = new Son();
        System.out.println(s.a); //200
        System.out.println(s.getFatherA()); //100*/

        //三种方式创建对象
        Father f = new Father();
        System.out.println(f.a);  //100
        Son s = new Son();
        System.out.println(s.a); //200
        Father fs = new Son();
        System.out.println(fs.a); //100


        s.printFatherA();


    }
}

class Father {
    int a = 100;
    int fatherVar = 10;

    //给a一个get方法
    /*public int getFatherA(){
        return a;
    }*/
}

class Son extends Father {
    int a = 200;
    int sonVar = 20;

    //使用super访问父类的a
    public void printFatherA() {
        System.out.println(super.a); //100
        System.out.println(this.a); //200
    }
}
