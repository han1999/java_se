package com.cskaoyan.javase.oop2._1extends._4hierarchy;

/**
 * @description: Java的继承层次
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 在Java当中，一个类没有两个直接父类，一个类只能直接继承一个类，这种现象就是常说的“单继承”或者“单重继承”
 * 与单继承相对应的就是多继承，C++当中是多继承的
 * 如果支持多继承，会有什么优缺点：
 *      优点：如果支持多继承，就允许一个类获取多个类的成员，这样在有些时候能够极大的简化代码，极大的提升程序扩展性
 *          可维护性
 *      缺点： 支持多继承后，会让继承的情况变得复杂，比如说多个类有同名的成员
 *  反正Java是不支持多继承的，Java在这种复杂性和不确定性上选择了更简单的单继承
 *  注意：
 *      1，虽然Java是不支持语法上的多继承，但是Java支持实际意义上的多继承
 *          比如 Java1.2引入的内部类
 *              Java8之后的接口引入默认实现方法，也可以实现真正意义上的多继承
 *          但是不管咋样，Java不支持多继承是根深蒂固的思想，如果不是特别有必要，你也不要偷偷实现多继承
 *
 *      2，在Java当中，每一个类都有它的直接父类，如果用extends关键字直接声明了它的父类，那么extends后就是它的直接父类
 *          如果没有该声明，每一个类都直接继承Object类
 *
 *      3，Java当中一个类只有一个直接父类，但是可以有很多的间接父类，子类，父类，间接父类共同组成了继承的层次
 *
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Grandson gd = new Grandson();
        Grandfather gf = new Grandson();
        Father f = new Grandson();
        Son s = new Grandson();

        //Grandson2 gs2 = new Grandson();

    }
}

//Cyclic inheritance involving 'com.cskaoyan.javase.oop2._1extends._4hierarchy.Grandfather'
//“爷爷”类
class Grandfather {
    int a;
}

//"爸爸类"
class Father extends Grandfather {
    int b;
}

//Class cannot extend multiple classes
//class Son extends Father,Father2{}
//"儿子类"
class Son extends Father {
    int c;
}

//"孙子类"
class Grandson extends Son {
    int d;
}

class Grandson2 extends Son {
    //int e;
    //public
}
