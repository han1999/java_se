package com.cskaoyan.javase.oop3._1interface._1basic;

/**
 * @description: 接口Demo
 * @author: wuguidong@cskaoyan.onaliyun.com
 **/

/**
 * 以后常见的接口样式
 * 接口的实现类样式,很多程序员喜欢在接口所在的包下直接新建一个包叫"impl"
 * 然后在这个包下,写接口的实现类,并命名为"接口名+Impl"
 *
 */
public interface IDemo {

    public static void main(String[] args) {
        A a = new A();
        a.test3();
        System.out.println("hello world");
    }
    void add();

    int delete();

    boolean retrieve();

    default void test(){
        System.out.println("IDemo");
    }
}
interface IB{
    default void test3(){
        System.out.println("IB");
    }
}
interface IC{
    default void test2(){
        System.out.println("IC");
    }
}
//com.cskaoyan.javase.oop3._1interface._1basic.A inherits unrelated defaults for test() from types com.cskaoyan.javase.oop3._1interface._1basic.IDemo and com.cskaoyan.javase.oop3._1interface._1basic.IB
class A implements IDemo,IC,IB{
    @Override
    public void add() {
    }

    @Override
    public int delete() {
        return 0;
    }

    @Override
    public boolean retrieve() {
        return false;
    }
}
