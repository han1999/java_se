package com.cskaoyan.javase.oop3._1interface._1basic;

/**
 * @description: 接口的子类特点
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 接口的子类允许是什么?
 * 1,普通类,但是必须要实现接口当中所有抽象方法
 * 2,抽象类,可以不实现任何接口中的抽象方法,也可以选择实现某几个
 * 3,接口,接口可以继承一个接口,一个接口继承另一个接口后,就得到了接口的所有抽象方法
 *      接口允许多继承
 *
 * 以上总结:
 *      1,继承这种关系是不能跨越"种族",类和类继承,接口和接口继承,不同的是,类是单继承,接口是多继承
 *      2,接口和类之间可以发生实现的关系,类可以实现多个接口,这个类可以是普通类,也可以是抽象类
 *             区别在于抽象类无需实现接口中的抽象方法
 *      3,接口不能和类发生关系,接口既不能继承类,也不能实现类
 *
 */
public class Demo2 {
}
interface ITest{
    void test();
    void test2();
}
interface ITest2{
    void test3();
}

interface I extends ITest,ITest2{

}

interface ID {}
class IImpl implements I{

    @Override
    public void test() {

    }

    @Override
    public void test2() {

    }

    @Override
    public void test3() {

    }
}
class ITestImpl implements ITest{
    @Override
    public void test() {
    }
    @Override
    public void test2() {
    }
}
abstract class AbstractTest implements ITest{
    @Override
    public void test() {
    }
}