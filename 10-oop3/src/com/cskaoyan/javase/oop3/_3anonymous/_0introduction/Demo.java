package com.cskaoyan.javase.oop3._3anonymous._0introduction;

/**
 * @description: 匿名内部类的使用
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 匿名内部类是特殊的局部内部类,我们在使用局部内部类的同时会发现局部内部类的语法过于复杂,实际上没有简化什么代码
 *      所以我们需要更简洁的方式,也就是匿名内部类
 *
 * 我们在局部内部类的语法基础上简化,得到匿名内部类的语法:
 *      new 类名或者接口名(){
 *          //重写方法
 *      };
 * 解释一下:
 *      1,该语法在方法或者其他局部位置中使用,因为它本身就是局部内部类
 *      2,new关键字是用来创建对象的,后面直接跟一个接口名或者类名表示直接创建它们的子类对象
 *          匿名内部类实际上不是一个类,而是一个对象
 *          什么对象?
 *          new后面跟的类名或者接口名的子类对象
 *      3,匿名内部类指什么匿名了?
 *          实际上这个匿名是双层的,首先该子类类型的名字被省略的,其次该对象的名字也被省略的
 *          所以匿名内部类实际上也可以叫匿名内部类对象
 *          (或者叫匿名的匿名内部类对象)
 * 接下来创建匿名内部类对象:
 *      1,创建一个普通类的匿名内部类对象(很少见)
 *          得到的是该普通类的子类对象
 *      2,创建一个抽象类的匿名内部类对象
 *          得到的是该抽象类的子类对象
 *      3,创建一个接口的匿名内部类对象
 *          得到的是该接口的子类对象
 *
 *
 */
public class Demo {
    public static void main(String[] args) {
        //test().method();
        //局部内部类,低端的做法
        //class A extends AbstractPerson{
        //    @Override
        //    void eat() {
        //
        //    }
        //}
        /*test(new AbstractPerson(){
            @Override
            void eat() {
                System.out.println("我是匿名内部类比较高端!");
            }
        });*/

        test2().method();
    }

    public static A test(){
        //思考一下它哪些地方是可以简化的?
        /*
        局部内部类比较朴素的做法
        class ASon extends A{
        }
        return new ASon();*/
        return new A(){
            @Override
            public void method() {
                System.out.println("我是匿名内部类,我比较高级");
            }
        };
    }

    public static void test(AbstractPerson ap){
        ap.eat();
    }

    public static IA test2(){
        return new IA(){
            @Override
            public void method() {
                System.out.println("我是接口的匿名内部类对象,我也很高级");
            }
        };
    }
}
class A{
    public void method(){
        System.out.println("我是A的方法");
    }
}
abstract class AbstractPerson{
    abstract void eat();
}
interface IA{
    void method();
}
