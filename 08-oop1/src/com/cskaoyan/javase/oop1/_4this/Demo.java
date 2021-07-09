package com.cskaoyan.javase.oop1._4this;

/**
 * @description: this关键字
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * > 按照下述说明写代码，研究问题
 * - 创建一个汽车类，有颜色和速度两个属性，行为是可以跑
 *   - 然后在成员方法中访问该属性，创建对象后调用该方法并查看结果
 *   - 然后在成员方法的形参列表中，定义和属性同名的局部变量，不修改方法体再次调用该方法
 *
 *   我们会发现这个时候,方法的结果是方法实参中给的变量
 *   1,因为Java当中存在就近原则,所以如果方法的形参和类中的成员变量同名,那么会优先选择较近的形参局部变量
 *   2,如果想要在上述情况下去访问同名的成员变量,那么就不能直接写变量名了,需要使用this关键字
 *      this关键字: 在Java当中,一个类的普通成员方法的形参列表中具有隐含的传参this,this是一个引用,this引用指向当前对象
 *      当前对象: 哪个对象在调用该成员方法,它就是当前对象
 *  3,在成员方法中,使用this关键字去区分同名的局部变量和成员变量
 *  语法: this.同名的成员变量
 *
 * 以上,我们知道了普通成员方法中隐含了this传参,所以可以解释以下问题
 *
 * 1,为什么普通成员方法能够直接访问成员变量?
 *  是因为隐含了传参this,指向当前对象
 *  并且也可以调用类中的其他成员方法
 *  正常情况下,this点都是可以省略的
 *  只有当需要区分同名的局部变量和成员变量时,才需要显式的给出this点
 *
 *  2,为什么加了static的方法不能访问成员变量?
 *   是因为加了static的方法没有this传参
 *
 *   总结: 加了static的方法可以互相调用
 *         普通的成员方法也可以互相调用
 *
 *this很重要的用途是：
 * - 用来指示一个变量到底是成员变量还是局部变量
 * - **在代码比较复杂的情况下，可以显著增加代码可读性**
 *
 * 关于this关键字,它是贯穿java面向对象学习的,它的功能还有很多
 *
 * 补充:
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        Car c = new Car();
        /*c.color = '白';
        System.out.println(c.color); // \u0000 绝对空字符
        c.run();*/
        c.run('黄');
        System.out.println("c地址:" + c);

        Car c2 = new Car();
        c2.color = '绿';
        System.out.println("c2地址:" + c2);
        c2.run('黄');

        c2.print();

    }
}

class Car {
    char color = '黑';
    double speed;

    public void run(char color) {
        System.out.println(this.color + "的小汽车嘟嘟嘟的跑~");
        System.out.println("this地址:" + this);
    }

    public void test() {
        System.out.println(color);
        System.out.println(speed);
        run('黄');
    }

    //该方法打印属性值
    public void print() {
        System.out.println("color = " + this.color + "\nspeed = " + this.speed);
    }
}
