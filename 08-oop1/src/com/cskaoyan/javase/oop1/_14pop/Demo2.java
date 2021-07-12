package com.cskaoyan.javase.oop1._14pop;

/**
 * @description: 面向对象实现把大象放进冰箱
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 面向对象实现把大象放进冰箱
 * 这里需要几个对象?
 * 仅需要两个,大象会自己走进去冰箱,冰箱会自己开关门
 *
 * 通过这个程序,总结一下面向对象程序的优缺点:
 *      1,优点:
 *       面向对象的程序不是按照方法调用来书写程序,而是写一个个的类,创建一个个的对象来实现功能的
 *       面向对象的程序是按照功能去划分不同的模块的,不同的模块之间往往不需要互相了解
 *       这就有利于把复杂的问题简单化,划分给不同程序员去开发,有利于程序员之间合作开发一个大型项目
 *
 *       除此之外,划分模块开发,互相隐藏实现细节,也有利于程序的修改,程序的修改被缩小在了小范围内
 *       程序的可维护性大大提升了
 *
 *       2,缺点:
 *          面向对象的程序往往十分复杂,同样的功能,如果用面向过程去写,可能会更加简洁
 *          面向对象的程序往往逻辑性会更加强,更加让程序员抓狂,代码会非常长,对象的关系维护管理很复杂
 *
 *          创建对象十分占用性能,企业当中一般都会使用性能强,内存大的服务器去运行java程序
 *
 *   总结以上,面向对象的程序更适合于复杂的,难度比较大的,多人合作的,大型的企业级应用
 *      比如操作系统内核OS,多数代码都是用C语言去编写的,少数用C++或者其它的一些语言编写的
 *      操作系统OS内核虽然是C语言编写的,但实际上它的编写是用面向对象的思想去写的
 *
 *   请问你怎么理解面向对象?
 *      面向对象让程序的可维护性大大增加,划分功能模块,减少不同模块之间耦合,让多人配合完成程序开发成为现实
 *      只有面向对象的程序才能应付商业中的软件移植,需求更改等场景
 *
 */
public class Demo2 {
    public static void main(String[] args) {
        Elephant e = new Elephant();
        Fridge f = new Fridge();
        e.eFridge = f;

        //面向对象的程序由对象之间交互,共同实现程序的功能
        e.into();
        f.open();
        e.into();
        f.close();
    }
}

//大象类
class Elephant {
    //为了交互方便,把冰箱对象引用放入
    Fridge eFridge;

    //行为: 走进冰箱,需要知道冰箱的状态,知道冰箱门开还是关
    public void into() {
        if (eFridge.state) {
            //门开着,我就进去
            System.out.println("我进冰箱了,冰箱快关门");
        } else {
            System.out.println("赶紧开门,我要进去了!");
        }
    }
}

//冰箱类
class Fridge {
    //状态属性,用来指示冰箱门的开关
    //默认false是关闭的,true是开着的
    boolean state = false;

    //行为: 开门,关门
    public void open() {
        this.state = true;
        System.out.println("快进来,我要等着关门!");
    }

    public void close() {
        this.state = false;
        System.out.println("大象进来了,门关上,完成任务");
    }
}
